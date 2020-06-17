package vista;

import Modelo.Memo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaMemo extends JFrame{
    private JPanel panel;
    public VistaMemo(){
        panel = new JPanel();
        setTitle("Memo");
        setSize(400, 300);
        this.setResizable(false);
        setLocationRelativeTo(null);
        this.setContentPane(panel);
        panel.setLayout(null);
        insertarComponentes();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public void insertarComponentes(){
        
        //Etiqueta1
        JLabel etiqueta1 = new JLabel("Asunto");
        etiqueta1.setBounds(10, 10, 50, 30);
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(60, 10, 300, 30);
        panel.add(cajaTexto);
        panel.add(etiqueta1);
        //Etiqueta2
        JLabel etiqueta2 = new JLabel("Nota");
        etiqueta2.setBounds(10, 50, 30, 60);
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(60, 50, 300, 150);
        panel.add(areaTexto);
        panel.add(etiqueta2);
        //Boton guardar
        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.setBounds(150, 210, 80 ,40);
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Memo memo = new Memo(cajaTexto.getText(),areaTexto.getText());
            }
        };
        botonGuardar.addActionListener(oyenteDeAccion);
        panel.add(botonGuardar);
        
    }
    
    public static void main(String[] args) {
        VistaMemo memo = new VistaMemo();
    }
}