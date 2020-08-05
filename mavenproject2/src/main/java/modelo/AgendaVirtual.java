package modelo;

import edl.*;
import java.util.Date;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author hp
 */
public class AgendaVirtual implements Serializable {

    private Agenda agenda;
    private ListaSE<Contacto> listaContactos;
    private Date calendario;
    private ListaSE<Memo> listamemo;

    public AgendaVirtual() {
        agenda = new Agenda();
        listaContactos = new ListaSE();
        listamemo = new ListaSE();
    }

    public ListaSE<Memo> getlistamemo() {
        return listamemo;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public ListaSE<Contacto> getContactos() {
        return listaContactos;
    }

    public void agregarmemo(Memo m) {
        listamemo.insertar(m);
    }

    public void mostrarcita() {
        agenda.mostrarCitas();
    }

    public Memo elimimarmemo(Memo memo) {
        int posicion = listamemo.indexOf(memo);
        return listamemo.eliminar(posicion);
    }
    
    public void reactivarAlarmas(){
        for(int i = 0 ; i < agenda.getListaCitas().tamanio() ; i++){
            Cita cita = (Cita)agenda.getListaCitas().acceder(i);
            cita.Imprimir();
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
