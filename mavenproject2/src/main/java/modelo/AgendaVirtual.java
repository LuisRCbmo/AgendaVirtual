package modelo;
import modelo.*;
import edl.*;
import java.util.Date;

/**
 *
 * @author hp
 */
public class AgendaVirtual {
    
    private Agenda agenda;
    private Contactos contactos;
    private Date calendario;
    private ListaSE<Memo> listamemo;
    
    public AgendaVirtual(Agenda a, Contactos c) {
        agenda = a;
        contactos = c;
        listamemo = new ListaSE();
    }

    public ListaSE<Memo> getlistamemo() {
        return listamemo;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public Contactos getContactos() {
        return contactos;
    }

    public void agregarmemo(Memo m) {
        listamemo.insertar(m);
    }

    public void mostrarcontancto() {
        contactos.MostrarContactos();

    }

    public void mostrarcita() {
        agenda.mostrarCitas();
    }

    public Memo elimimarmemo(Memo memo) {
        int posicion = listamemo.indexOf(memo);
        return listamemo.eliminar(posicion);
    }

}














