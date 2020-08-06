
package Notificaciones;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.Serializable;
/**
 * @author Emerson Vera.
 */

/**
 * Ancho y alto son las dimensiones de los iconos.
 */

public class Notificacion implements Serializable{    
    private int Ancho = 53;
    private int Alto = 53;
    /**
     * Este metodo Icon te retorna un icono con las dimensiones de alto y ancho.
     */
    public Icon icono(String url) {       
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(url)).getImage()
                .getScaledInstance(Ancho, Alto, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    /**
     * Este le da formato a las notificaciones del JOptionPane
     */
    private void DarFormatoJOP(){                
        UIManager.put("Button.background", Color.WHITE);            
        UIManager.put("OptionPane.background", new Color(123,188,218));
        UIManager.put("Panel.background", new Color(123,188,218));        
        UIManager.put("OptionPane.yesButtonText","Si");
        UIManager.put("OptionPane.noButtonText","No");
        UIManager.put("OptionPane.cancelButtonText","Cancelar");
        UIManager.put("OptionPane.okButtonText","Aceptar");
    }
    /**
     * Este es una notificacion de JOPtionPane adaptado para solo recibir un mensaje, titutlo, una lista de los botones("si","no","cancelar", etc.)
     * y la direccion del icono 
     */
    public int notificacionBotones(String mensaje,String titulo,Object [] botones,String URL){
        int res = 0; 
        DarFormatoJOP();         
        res = JOptionPane.showOptionDialog(null,mensaje,titulo,
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icono(URL), botones,botones[0]);        
        return res;
    }   
    /**
     * Los mismo del anterior solo que esta no recibe botones.
     */
    public void NotificacionEscrita(String titulo,String mensaje,String URL){                
        DarFormatoJOP();
        JOptionPane.showMessageDialog(null, mensaje ,titulo,JOptionPane.PLAIN_MESSAGE,icono(URL));
    }
    /**
     * Estos metodos no se utilizan pero se crearon un porsiacaso.
     */
    public String NotificacionInteraccion(String mensage,String titulo,String URL){
        DarFormatoJOP();
         String respuesta = JOptionPane.showInputDialog(null, new JLabel(mensage,icono(URL), JLabel.HEIGHT)
                ,titulo, JOptionPane.PLAIN_MESSAGE);
        return respuesta ;
    }
    public String NotificacionListaDesplegable(String mensage,String titulo,String URL,Object[] lista){
        DarFormatoJOP();
        String respuesta = (String)JOptionPane.showInputDialog(null,new JLabel(mensage,JLabel.LEFT),titulo, JOptionPane.PLAIN_MESSAGE,icono(URL),lista,lista[0]);
        return respuesta ;
    }
}

/**
 * Iconos y sus direcciones(URL).
 */
    /*         
       "/Iconos/Interrogacion.png" 
       "/Iconos/Negacion.png"         
       "/Iconos/Aprobacion.png"
       "/Iconos/Advertencia.png"
       "/Iconos/Bienvenido.png"
    */