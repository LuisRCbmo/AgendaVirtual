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

    public boolean vacio() {
        return citas == null;
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

    public void mostrarCitas() {
        int i = 0;
        Cita aux = citas.acceder(i);
        while (!citas.vacia() && i < citas.tamanio()) {
            System.out.println(i + ".-" + "Cita:");
            System.out.println("  Asunto: " + aux.getAsunto());
            System.out.println("  Nota: " + aux.getNota());
            System.out.println("  Duracion cita; " + aux.getDuracion());
            //System.out.print("  Fecha: "+ aux.getFecha().toString());
            i = i + 1;
            aux = citas.acceder(i);
        }
        if (citas.vacia()) {
            System.out.println("No tiene citas programadas.");
        }
    }

    public void guardarCitas() {
        try {
            ObjectOutputStream escribirfichero = new ObjectOutputStream(new FileOutputStream("listacitas"));
            escribirfichero.writeObject(citas);
            escribirfichero.close();
        } catch (Exception eGLD) {
        }
    }

    public ListaSE<Cita> recuperarListaCitas() {
        ListaSE<Cita> listaRecuperada = new ListaSE();
        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("listaCita"));
            listaRecuperada = (ListaSE<Cita>) leerFichero.readObject();
            leerFichero.close();
        } catch (Exception eRLC) {

        }
        return listaRecuperada;
    }

}
