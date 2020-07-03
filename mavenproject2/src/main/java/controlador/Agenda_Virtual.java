package controlador;
import modelo.*;
import vista.*;

/**
 *
 * @author Luis
 */
public class Agenda_Virtual {
    private Contactos cs;
    
    public Agenda_Virtual(){
    }
    
    public void VentanaContactos(){
        //cs.AddContacto(new Contacto("a","b","c","d","0","1"));
        vcs vcs = new vcs(cs.toArray());
        vcs.setVisible(true);
    }
    
    
    public static void main(String[] args){
        /*
        VistaAgendaVirtual v1 = new VistaAgendaVirtual();
        v1.setVisible(true);
        */
        ///*
        Contacto c1 = new Contacto("a","b","c","d","0","1");
        Contacto c2 = new Contacto("a","b","c","d","0","1");
        Contacto c3 = new Contacto("a","b","c","d","0","1");
        Contactos cs = new Contactos();
        cs.AddContacto(c1);
        cs.AddContacto(c2);
        cs.AddContacto(c3);
        vcs vcs = new vcs(cs.toArray());
        vcs.setVisible(true);
        //*/
    }
}
