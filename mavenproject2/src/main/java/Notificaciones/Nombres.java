package Notificaciones;

import java.util.Enumeration;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
 
public class Nombres {
 
    public static void main(String[] args) {
 
        UIDefaults defaults = UIManager.getDefaults();
        String[] colName = {"Clave", "Valor"};
        String[][] rowData = new String[defaults.size()][2];
        int i = 0;
        for(Enumeration e = defaults.keys(); e.hasMoreElements(); i++){
            Object key = e.nextElement();
            rowData[i][0] = key.toString();
            rowData[i][1] = "" + defaults.get(key);
        }
        JFrame frame = new JFrame("Propiedades UIManager valores por defecto");
        JTable table = new JTable(rowData, colName);
        frame.setContentPane(new JScrollPane(table));
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}