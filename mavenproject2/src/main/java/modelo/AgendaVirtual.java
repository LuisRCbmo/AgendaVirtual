package modelo;

import modelo.*;
import edl.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.io.Serializable;

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

   

}
