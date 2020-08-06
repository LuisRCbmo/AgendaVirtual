package modelo;

import edl.ListaSE;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Agenda implements Serializable {

    private ListaSE<Cita> citas;

    public Agenda() {
        citas = new ListaSE();
    }

    public void aniadirCita(Cita cita) {
        citas.insertar(cita);
    }

    public Cita cancelarCita(Cita cita) {
        int pos = citas.indexOf(cita);
        return citas.eliminar(pos);
    }

    public ListaSE getListaCitas() {
        return citas;
    }

}
