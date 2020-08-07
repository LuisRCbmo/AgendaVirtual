package modelo;

import edl.*;
import java.util.Date;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author hp
 */

/**
 * Agenda almacenadora de citas.
 * ListaSE<Contacto> es una lista que sirve para almacenar contactos que aora esta vacia la lista
 * el date es un calendario para seleccionar fechas
 * ListaSE<Memo>es una lista que sirve para almacenar Memos que aora esta vacia la lista
 */
public class AgendaVirtual implements Serializable {

    private Agenda agenda;
    private ListaSE<Contacto> listaContactos;
    private Date calendario;
    private ListaSE<Memo> listamemo;
  /**
     * Metodo costructos
     */
    public AgendaVirtual() {
        agenda = new Agenda();
        listaContactos = new ListaSE();
        listamemo = new ListaSE();
    }
    /*
     * una lista de memo
     */
    public ListaSE<Memo> getlistamemo() {
        return listamemo;
    }
  /**
     * Agenda con todas las citas
     */
    public Agenda getAgenda() {
        return agenda;
    }
/**
     * una lista de contactos
     */
    public ListaSE<Contacto> getContactos() {
        return listaContactos;
    }
/**
     * es para añadir un memo a la lista
     */
    public void agregarmemo(Memo m) {
        listamemo.insertar(m);
    }
/**
     * es para eliminar un memo de la posicion que le das
     */
    public Memo elimimarmemo(Memo memo) {
        int posicion = listamemo.indexOf(memo);
        return listamemo.eliminar(posicion);
    }
    /*
    reactiva las alarma que las citas tenian despues de cerrar el proyecto si es que tuvieran 
    */
    public void reactivarAlarmas(){
        for(int i = 0 ; i < agenda.getListaCitas().tamanio() ; i++){
            Cita cita = (Cita)agenda.getListaCitas().acceder(i);           
            try{                           
                if(cita.getTieneAlarma()){
                cita.setAlarma(new Alarma());
                cita.getAlarma().setCancion(cita.getMusica());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(cita.getHoraFecha());
                calendar.add(calendar.MINUTE,cita.getAnticipacion());
                cita.getAlarma().ProgramarAlarma(calendar.getTime(),cita.getAsunto());
                }
            }catch(Exception e){
                System.out.println("Salio mal C':");
            }
        }   
    }

   
}
