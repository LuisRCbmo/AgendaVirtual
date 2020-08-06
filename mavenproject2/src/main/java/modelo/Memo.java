package modelo;

import java.io.Serializable;

/**
 *
 * @author Sergio
 */

public class Memo implements Serializable {
    //Atributos de Asunto y nota para un Memo
    private String asunto;
    private String nota;
    //Creacion de un memo 
    public Memo(String asunto, String nota) {
        this.asunto = asunto;
        this.nota = nota;
    }
    //Devuelve el asunto
    public String getAsunto() {
        return asunto;
    }
    //Devuelve la nota
    public String getNota() {
        return nota;
    }
    //Se cambia el asunto
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    //Se cambia la nota
    public void setNota(String nota) {
        this.nota = nota;
    }
    //Estilo de vista al mostrarse en lista de memos(JList) en clase visual vcs
    public String toString() {
        return "Asunto: " + asunto + " Nota: " + nota;
    }

}
