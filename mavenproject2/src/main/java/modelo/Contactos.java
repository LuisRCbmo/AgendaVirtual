package modelo;
import edl.*;
import javax.swing.JOptionPane;
/**
 *
 * @author luis
 */
public class Contactos {
    private ListaSE<Contacto> contactos;
    
    Contactos(){
        this.contactos = new ListaSE<>();
    }
    
    public void Añadir()
    {
        String nombre = JOptionPane.showInputDialog("ingresa el nombre");
        String apellido = JOptionPane.showInputDialog("ingresa el apellido");
        String celular = JOptionPane.showInputDialog("ingresa el telefono celular");
        String telefono = JOptionPane.showInputDialog("ingresa el telefono fijo");
        String correo = JOptionPane.showInputDialog("ingresa el correo electronico");
        String direccion = JOptionPane.showInputDialog("ingresa la direccion");
        Contacto p = new Contacto(nombre,apellido,celular,telefono,direccion,correo);
        int res = JOptionPane.showConfirmDialog(null, "agregar el contaco " + nombre + " " 
                + apellido + " Cel: "+celular+" fijo: "+telefono+", correo: " + correo + 
                " direccion: " + direccion, "añadir?",JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION){
            p.setId(contactos.tamanio() + 1);
            AddContacto(p);
        }
        else{
            JOptionPane.showMessageDialog(null, "no se agrego el contaco", "agregar", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public void Eliminar(){
        String id = JOptionPane.showInputDialog(null,"ingresar id de contacto","Eliminar",JOptionPane.OK_OPTION);
       // contactos.eliminar(Integer.parseInt(id)-1);
    }
    
    private void AddContacto(Contacto persona){
        contactos.insertar(persona);
    }
    
    public void MostrarContactos(){
        
        JOptionPane.showMessageDialog(null,contactos.toString(),"contacto ", 0);
    }
}
    
    
