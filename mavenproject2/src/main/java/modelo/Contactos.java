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
        int pos = contactos.tamanio();
        contactos.acceder(pos - 1).setID(pos);
        
    }
    
    public void MostrarContactos(){
        
        JOptionPane.showMessageDialog(null,contactos.toString(),"contacto ", 0);
    }
    
    public ListaSE getContactos(){
    return contactos;
    }
    
    public String[] toArray(){
        String[] s;
        if (contactos.tamanio() != 0){
                s = new String[contactos.tamanio()];
                for(int i = 0; i < contactos.tamanio();i++){
                    s[i] = contactos.acceder(i).toString();
            }
        }
        else{
            s =  null;
        }
        return s;
    }
}
    
    
