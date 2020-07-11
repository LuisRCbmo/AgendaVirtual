package modelo;
import modelo.*;
import edl.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author hp
 */

public class AgendaVirtual {
    
    private Agenda agenda;
    private ListaSE<Contacto> listaContactos;
    private Date calendario;
    private ListaSE<Memo> listamemo;
    
    public AgendaVirtual(Agenda a) {
        agenda = a;
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



public  void guardarCitas(){
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("Memosguardados"));
            escribir.writeObject(listamemo);
            escribir.close();
        }
        catch(Exception eGLD){}
    }






}














