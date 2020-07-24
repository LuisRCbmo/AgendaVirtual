
package Notificaciones;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Notificacion {
    
    
    private int Ancho = 53;
    private int Alto = 53;
    
    public Icon icono(String url) {       
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(url)).getImage()
                .getScaledInstance(Ancho, Alto, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    
    /*private void AsignarTamanio(String URL){
        if(URL.equals("/Iconos/Alarma.jpg")){
            Ancho = Alto =53;           
        }else if(URL.equals("/Iconos/Interrogacion.png")){
            Ancho =53;
            Alto = 53;
        }else if(URL.equals("/Iconos/Negacion.png")){
            Ancho = 53;
            Alto = 53;           
        }else if (URL.equals("/Iconos/Aprobacion.png")){
            Ancho = 53;
            Alto = 53;
        }else if (URL.equals("/Iconos/Advertencia.png")){
            Ancho = 53;
            Alto = 53;
        }
    }*/
    private void DarFormatoJOP(){                
        UIManager.put("Button.background", Color.WHITE);            
        UIManager.put("OptionPane.background", new Color(123,188,218));
        UIManager.put("Panel.background", new Color(123,188,218));        
        UIManager.put("OptionPane.yesButtonText","Si");
        UIManager.put("OptionPane.noButtonText","No");
        UIManager.put("OptionPane.cancelButtonText","Cancelar");
        UIManager.put("OptionPane.okButtonText","Aceptar");       
       //Font fuente = new Font(Font.DIALOG_INPUT,Font.PLAIN,14);
       // UIManager.put("OptionPane.messageFont",fuente);
       // UIManager.put("OptionPane.buttonFont", fuente);       
        //UIManager.put("OptionPane.minimumSize", new Dimension(300, 120));//tamaño del joptionpane
        //UIManager.put("OptionPane.messageForeground", Color.WHITE);// color de las letras
    }
    
    public int notificacionBotones(String mensaje,String titulo,Object [] botones,String URL){
        int res = 0; 
        //AsignarTamanio(URL);
        DarFormatoJOP();         
        res = JOptionPane.showOptionDialog(null,mensaje,titulo,
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icono(URL), botones,botones[0]);        
        return res;
    }   
    public void NotificacionEscrita(String titulo,String mensaje,String URL){
        //AsignarTamanio(URL);                 
        DarFormatoJOP();
        JOptionPane.showMessageDialog(null, mensaje ,titulo,JOptionPane.PLAIN_MESSAGE,icono(URL));                   
    }
    public String NotificacionInteraccion(String mensage,String titulo,String URL){      
        //AsignarTamanio(URL);
        DarFormatoJOP();
         String respuesta = JOptionPane.showInputDialog(null, new JLabel(mensage,icono(URL), JLabel.HEIGHT)
                ,titulo, JOptionPane.PLAIN_MESSAGE);
        return respuesta ;
    }
    public String NotificacionListaDesplegable(String mensage,String titulo,String URL,Object[] lista){      
        //AsignarTamanio(URL);
        DarFormatoJOP();
        String respuesta = (String)JOptionPane.showInputDialog(null,new JLabel(mensage,JLabel.LEFT),titulo, JOptionPane.PLAIN_MESSAGE,icono(URL),lista,lista[0]);
        return respuesta ;
    }
}



