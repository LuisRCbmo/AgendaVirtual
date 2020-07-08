package modelo;
import edl.*;
import javax.swing.JOptionPane;
/**
 *
 * @author luis
 */
public class Contactos {
    private ListaSE<Contacto> contactos;
    
    public Contactos(){
        this.contactos = new ListaSE<>();
    }
    
    public void Eliminar(){
        String id = JOptionPane.showInputDialog(null,"ingresar id de contacto","Eliminar",JOptionPane.OK_OPTION);
       // contactos.eliminar(Integer.parseInt(id)-1);
    }
    
    public void AddContacto(Contacto contacto){
        contactos.insertar(contacto);
        
    }
    
    public void MostrarContactos(){
        
        JOptionPane.showMessageDialog(null,contactos.toString(),"contacto ", 0);
    }
    
    public ListaSE getContactos(){
    return contactos;
    }
}
    
    
