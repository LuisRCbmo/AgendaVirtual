/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import java.awt.Dimension;
import Notificaciones.Notificacion;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Nath
 */

public class editarCita extends javax.swing.JFrame {

    /**
     * Creates new form editarCita
     */
    /*
    Requiere mostrarCita que sera la ventana padre
    Requiere una Cita la cual sera la cita que se editara
    */
    private mostrarCita mostrar;
    private Cita cita, citaAuxiliar;
    private Notificacion notificacion;

    public editarCita(mostrarCita mostrar, Cita cita) {
        /*
        inicializamos todos los componentes y dentro de ello se llenan todos los textAreas con datos de la cita, los cuales se podran editar
        */
        initComponents();
        this.cita = cita;
        this.mostrar = mostrar;
        citaAuxiliar = cita.clone();
        recuperarDatos();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        notificacion = new Notificacion();
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }
    /* 
        actualiza la informacion de esta ventana con la informacion de la cita
    */
    public void recuperarDatos() {
        contHora.setSelectedIndex(cita.getIndHoras());
        contMinuto.setSelectedIndex(cita.getIndMinutos());
        amPm.setSelectedIndex(cita.getIndAmPm());
        contDuracion.setSelectedIndex(cita.getIndDuracion());
        contFecha.setDatoFecha(cita.getHoraFecha());
        contAsunto.setText(cita.getAsunto());
        contNota.setText(cita.getNota());
        if (cita.getAlarma() == null) {
            setBotonA("Crear Alarma");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contNota = new javax.swing.JTextArea();
        contDuracion = new javax.swing.JComboBox<>();
        contHora = new javax.swing.JComboBox<>();
        contMinuto = new javax.swing.JComboBox<>();
        amPm = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        contFecha = new rojeru_san.componentes.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        EditarAlarma = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 580, 326));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras.setBackground(new java.awt.Color(149, 173, 177));
        botonAtras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        botonAtras.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        botonAtras.setPreferredSize(new java.awt.Dimension(43, 22));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Asunto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nota:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Duracion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("minutos.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 60, 30));

        contAsunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(contAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 430, 22));

        contNota.setColumns(20);
        contNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contNota.setRows(5);
        jScrollPane1.setViewportView(contNota);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 430, 50));

        contDuracion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contDuracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        contDuracion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        contHora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        contHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contHoraActionPerformed(evt);
            }
        });
        getContentPane().add(contHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        contMinuto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        contMinuto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contMinutoActionPerformed(evt);
            }
        });
        getContentPane().add(contMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        amPm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));
        amPm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        amPm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amPmActionPerformed(evt);
            }
        });
        getContentPane().add(amPm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText(":");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(null);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, 50));

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(null);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 150, 50));

        contFecha.setColorBackground(new java.awt.Color(0, 0, 0));
        contFecha.setColorButtonHover(new java.awt.Color(0, 0, 0));
        contFecha.setColorDiaActual(new java.awt.Color(123, 188, 218));
        contFecha.setColorForeground(new java.awt.Color(102, 102, 102));
        contFecha.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        getContentPane().add(contFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 280, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR CITA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 260, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 570, 50));

        EditarAlarma.setBackground(new java.awt.Color(255, 255, 255));
        EditarAlarma.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EditarAlarma.setText("Editar Alarma");
        EditarAlarma.setBorder(null);
        EditarAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarAlarmaActionPerformed(evt);
            }
        });
        getContentPane().add(EditarAlarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 100, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    vuelve a la ventana anterior
*/
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed
/*
   cancela toda edicion de la cita y esta mantiene la informacion que antes tenia 
*/
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        Object[] botones = {"  SI  ", "  NO  "};
        int res = notificacion.notificacionBotones("¿ Esta seguro que quiere descartar los cambios ?", "Descartar cambios", botones, "/Iconos/Advertencia.png");
        if (res == 0) {           
            this.dispose();
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void contHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contHoraActionPerformed

    }//GEN-LAST:event_contHoraActionPerformed
/*
    guarda toda la informacion que el usuario haya cambiado
*/
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Object[] botones = {" SI ", " NO "};
        int num = notificacion.notificacionBotones("¿Quiere guardar los cambios?","Guardar", botones, "/Iconos/Advertencia.png");
        if (num == 0) {
            mostrar.setAsunto(contAsunto.getText());
            mostrar.setNota(contNota.getText());
            mostrar.setDuracion((String) contDuracion.getSelectedItem());
            Date fecha = contFecha.getDatoFecha();
            String aux = (String) amPm.getSelectedItem();
            int hora = 0;
            if (aux.equals("pm")) {
                hora = (Integer.parseInt((String) contHora.getSelectedItem())) + 12;
            } else {
                hora = (Integer.parseInt((String) contHora.getSelectedItem()));
            }
            int minuto = Integer.parseInt((String) contMinuto.getSelectedItem());
            Date res = establecerFecha(fecha, hora, minuto);
            mostrar.setFechaHora(res); 
            cita.setIndHoras(contHora.getSelectedIndex());
            cita.setIndMinutos(contMinuto.getSelectedIndex());
            cita.setIndDuracion(contDuracion.getSelectedIndex());
            cita.setIndAmPm(amPm.getSelectedIndex());
            if (citaAuxiliar.getAlarma() == null) {
                if (cita.getAlarma() != null) {
                    cita.apagarAlarma();
                }               
                cita.setIndiceMin(0);
                cita.setIndiceMus(0);
                cita.setAlarma(null);
                cita.setTieneAlarma(false);
                mostrar.setTextoBotonAlarma(); 
            } else {
                cita.setIndiceMin(citaAuxiliar.getIndiceMin());
                cita.setIndiceMus(citaAuxiliar.getIndiceMus());                
                if(cita.getAlarma() != null){
                    cita.apagarAlarma();
                }
                Calendar fechaRestada = Calendar.getInstance();
                fechaRestada.setTime(cita.getHoraFecha()); 
                fechaRestada.add(Calendar.MINUTE,citaAuxiliar.getAnticipacion());             
                Alarma nueva = new Alarma();               
                nueva.setCancion(citaAuxiliar.getMusica()); 
                nueva.ProgramarAlarma(fechaRestada.getTime(),cita.getAsunto());
                cita.setAlarma(nueva); 
                cita.setAnticipacion(citaAuxiliar.getAnticipacion()); 
                cita.setMusica(citaAuxiliar.getMusica()); 
                cita.setTieneAlarma(true);
                mostrar.setTextoBotonAlarma(); 
            }
            this.dispose();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void contMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contMinutoActionPerformed
/*
   manda a editar la alarma cita utilizando una cita auxiliar si es que el usuario cancela 
*/
    private void EditarAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarAlarmaActionPerformed
       
        editarCita padre = this;
        citaAuxiliar.setAsunto(contAsunto.getText());
        citaAuxiliar.setDuracion(Integer.parseInt((String) contDuracion.getSelectedItem()));
        Date fecha = contFecha.getDatoFecha();
        String aux = (String) amPm.getSelectedItem();
        int hora = 0;
        if (aux.equals("pm")) {
            hora = (Integer.parseInt((String) contHora.getSelectedItem())) + 12;
        } else {
            hora = (Integer.parseInt((String) contHora.getSelectedItem()));
        }
        int minuto = Integer.parseInt((String) contMinuto.getSelectedItem());
        Date res = establecerFecha(fecha, hora, minuto);
        citaAuxiliar.setFechaHora(res);
        if (citaAuxiliar.getAlarma() == null) {
            CrearAlarma ia = new CrearAlarma(citaAuxiliar, this);
            ia.setVisible(true);
            ia.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    padre.setVisible(true);
                }
            });
            padre.setVisible(false);
        } else {
            EditarAlarma EA = new EditarAlarma(citaAuxiliar, this);
            EA.setVisible(true);
            EA.setVisible(true);
            EA.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    padre.setVisible(true);                   
                }
            });
            padre.setVisible(false);
        }       
        
    }//GEN-LAST:event_EditarAlarmaActionPerformed

    private void amPmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amPmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amPmActionPerformed
    /*
    cambia el texto del boton editar alarma
    */
    public void setBotonA(String TF) {
        EditarAlarma.setText(TF);
    }
    /*
    Realiza un set sobre el textArea de contHora y contMinuto.
    */
    public void setHora(String h, String m) {
        contHora.setSelectedItem(h);
        contMinuto.setSelectedItem(m);

    }
 /*
    Realiza un set sobre el textArea de contAsunto
*/
    public void setAsunto(String p) {
        contAsunto.setText(p);
    }
     /*
    Realiza un set sobre el textArea de contNotas
    */
    public void setNota(String p) {
        contNota.setText(p);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarAlarma;
    private javax.swing.JComboBox<String> amPm;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField contAsunto;
    private javax.swing.JComboBox<String> contDuracion;
    private rojeru_san.componentes.RSDateChooser contFecha;
    private javax.swing.JComboBox<String> contHora;
    private javax.swing.JComboBox<String> contMinuto;
    private javax.swing.JTextArea contNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
/*
   retorna la fecha seleccionada por el usuaio en formato de Date 
*/
    private Date establecerFecha(Date fecha, int hora, int minutos) {
        int anio = fecha.getYear() + 1900;
        int mes = fecha.getMonth();
        int dia = fecha.getDate();
        Calendar aux = Calendar.getInstance();
        aux.set(anio, mes, dia, hora, minutos, 00);
        return aux.getTime();
    }
}
