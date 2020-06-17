package vista;

import modelo.Agenda;
import modelo.Cita;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
public class VistaAgenda extends JFrame{
    private JPanel panel;
    private Agenda agenda;
    public VistaAgenda(){
        agenda = new Agenda();
        panel = new JPanel();
        this.setSize(500, 350);
        setTitle("Agenda");
        setLocationRelativeTo(null);
        crearComponentes();
        this.setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void crearComponentes(){
        panel.setLayout(null);
        this.getContentPane().add(panel);
        //Etiqueta1
        JLabel etiqueta1 = new JLabel("Fecha");
        etiqueta1.setBounds(10,10,90,15);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(30,30,150,25);
        panel.add(cajaTexto1);
        panel.add(etiqueta1);
        //Etiqueta2
        JLabel etiqueta2 = new JLabel("Crear Alarma");
        etiqueta2.setBounds(220, 10, 150,15);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        //botonAlarma
        JButton botonAlarma = new JButton("Crear");
        botonAlarma.setBounds(250, 30, 100 ,25);
        panel.add(botonAlarma);
        panel.add(etiqueta2);
        //Etiqueta3
        JLabel etiqueta3 = new JLabel("Asunto");
        etiqueta3.setBounds(10, 60, 75, 15);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField cajaTexto3 = new JTextField();
        cajaTexto3.setBounds(30,80,150,25);
        panel.add(cajaTexto3);
        panel.add(etiqueta3);
        //Etiqueta4
        JLabel etiqueta4 = new JLabel("Hora");
        etiqueta4.setBounds(10, 115, 77, 15);
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField cajaTexto4 = new JTextField();
        cajaTexto4.setBounds(30,135 ,150,25);
        panel.add(cajaTexto4);
        panel.add(etiqueta4);
        //Etiqueta5
        JLabel etiqueta5 = new JLabel("Duracion");
        etiqueta5.setBounds(250, 115, 75, 15);
        etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField cajaTexto5 = new JTextField();
        cajaTexto5.setBounds(250,135,150,25);
        panel.add(cajaTexto5);
        panel.add(etiqueta5);
        //Etiqueta6
        JLabel etiqueta6 = new JLabel("Nota");
        etiqueta6.setBounds(10 , 175, 75, 15);
        etiqueta6.setHorizontalAlignment(SwingConstants.CENTER);
        JTextArea areaTexto6 = new JTextArea();
        areaTexto6.setBounds(30,200,400,60 );
        panel.add(areaTexto6);
        panel.add(etiqueta6);
        //BotonGuardar
        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.setBounds(195, 270, 80 ,40);
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int duracion = Integer.parseInt(cajaTexto5.getText());
                Cita nueva = new Cita(cajaTexto3.getText(),duracion);
                nueva.setNota(areaTexto6.getText());
                agenda.aniadirCita(nueva);
            }
        };
        botonGuardar.addActionListener(oyenteDeAccion);
        panel.add(botonGuardar);
    }
    public static void main(String[] args) {
        VistaAgenda agenda = new VistaAgenda();
    }
}