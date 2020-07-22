package modelo;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class Memo implements Comparable<Memo>, Serializable {

    private String asunto;
    private String nota;

    public Memo(String asunto, String nota) {
        this.asunto = asunto;
        this.nota = nota;
    }

    public void mostrarMemo() {
        System.out.println("Asunto: " + asunto);
        System.out.println();
        System.out.println("Nota: " + nota);
    }

    public String getAsunto() {
        return asunto;
    }

    public String getNota() {
        return nota;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String toString() {
        return "Asunto: " + asunto + " Nota: " + nota;
    }

    @Override
    public int compareTo(Memo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
