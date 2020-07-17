
package Notificaciones;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Notificacion {
    
    
    private int Ancho ;
    private int Alto ;
    
    public Icon icono(String url) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(url)).getImage()
                .getScaledInstance(Ancho, Alto, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    
    private void AsignarTamanio(String URL){
        if(URL.equals("/Iconos/Alarma.jpg")){
            Ancho = Alto = 55;
        }else if(URL.equals("/Iconos/Interrogacion.png")){
            Ancho = 60;
            Alto = 50;
        }
    }
    
    public int notificacionBotones(String mensaje,String titulo,Object [] botones,String URL){
        int res = 0; 
        AsignarTamanio(URL);
        UIManager.put("Button.background", Color.WHITE);            
        UIManager.put("OptionPane.background", new Color(123, 188, 218));
        UIManager.put("Panel.background", new Color(123, 188, 218));          
        res = JOptionPane.showOptionDialog(null,mensaje,titulo,
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icono(URL), botones,botones[0]);        
        return res;
    }   
    public void NotificacionEscrita(String mensaje,String URL){
        AsignarTamanio(URL);
        Font fuente = new Font(Font.DIALOG,Font.BOLD,12);
        UIManager.put("OptionPane.messageFont",fuente);//fuente de las letras de joptionpane
        UIManager.put("OptionPane.buttonFont", fuente);//la fuente de los botones
        UIManager.put("OptionPane.minimumSize", new Dimension(300, 120));//tamaño del joptionpane
        UIManager.put("OptionPane.MessageDialog.titlePane.background",Color.BLACK);
        UIManager.put("Button.background", Color.WHITE);//color de los botones      
        UIManager.put("OptionPane.background", new Color(123, 188, 218));//borde del joptionpane
        UIManager.put("Panel.background", new Color(123, 188, 218)); // color interno del joptinopane
        UIManager.put("OptionPane.messageForeground", Color.BLACK);// color de las letras
        UIManager.put("OptionPane.okButtonText","Aceptar");//el boton por defecto ok lo cambias por lo que quieres en el otro string
        JOptionPane.showMessageDialog(null, mensaje ,"AVISO",JOptionPane.PLAIN_MESSAGE,icono(URL));
        //UIManager.put("OptionPane.yesButtonText","S\u00ED");
        //UIManager.put("OptionPane.noButtonText","No");
        //UIManager.put("OptionPane.cancelButtonText","Cancelar");
        //UIManager.put("OptionPane.okButtonText","Aceptar");
        
        
    }
}


