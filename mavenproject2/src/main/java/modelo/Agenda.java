package modelo;

import edl.ListaSE;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * @author Sergio Garcia
 */

public class Agenda implements Serializable {
    //Atributos contenedora de citas
    private ListaSE<Cita> citas;
    //Inicialicacion de lista de citas
    public Agenda() {
        citas = new ListaSE();
    }
    //Agrega una nueva cita a la lista.
    public void aniadirCita(Cita cita) {
        citas.insertar(cita);
    }
    //Cancela la cita buscandola en la lista de citas.
    public Cita cancelarCita(Cita cita) {
        int pos = citas.indexOf(cita);
        return citas.eliminar(pos);
    }
    //Devuelve las citas en la agenda
    public ListaSE getListaCitas() {
        return citas;
    }

}
