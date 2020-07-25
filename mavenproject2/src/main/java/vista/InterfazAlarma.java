package vista;

import modelo.Alarma;
import modelo.ListaAlarma;
import modelo.Cita;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import Notificaciones.Notificacion;
/* 
    autor emerson
*/

public class InterfazAlarma extends javax.swing.JFrame implements Runnable {

    private Notificacion notificacion;
    private Calendar calendario;
    private String hora, minuto, segundo, ampm;
    private Thread h1;
    private Clip clip;
    private String cancion = "TelefonoAntiguo.wav";
    private String[] sonds = {"TelefonoAntiguo.wav", "TITITI.wav", "Gallo.wav", "AlarmaLoud.wav", "AlarmaDeGuerra.wav", "AlarmaDeCoche.wav"};
    private Cita cita;
    
    public InterfazAlarma(Cita cita) {
        initComponents();
        this.cita = cita;
        h1 = new Thread(this);
        h1.start();        
        setLocationRelativeTo(null);       
        notificacion = new Notificacion();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbReloj = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbMinutos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        jcbMusicas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoA.jpeg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(560, 260));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Minutos.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 71, 30));

        jlbReloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 446, 50));

        crear.setBackground(new java.awt.Color(255, 255, 255));
        crear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        crear.setText("Crear");
        crear.setBorder(null);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 90, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tiempo de Anticipacion :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 30));

        jcbMinutos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        jcbMinutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMinutosActionPerformed(evt);
            }
        });
        getContentPane().add(jcbMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 50, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Musica de Alarma :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 30));

        seleccionar.setBackground(new java.awt.Color(255, 255, 255));
        seleccionar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seleccionar.setText("Seleccionar");
        seleccionar.setBorder(null);
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 90, 30));

        jcbMusicas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbMusicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefono Antiguo", "TI TI TI ", "Gallo", "Alarma Loud", "Alarma de Guerra", "Alarma De Coche" }));
        jcbMusicas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbMusicas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbMusicasItemStateChanged(evt);
            }
        });
        jcbMusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbMusicasMouseClicked(evt);
            }
        });
        jcbMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMusicasActionPerformed(evt);
            }
        });
        getContentPane().add(jcbMusicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 150, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CREAR ALARMA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 340, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 530, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(cita.getHoraFecha());
        int minutos = Integer.parseInt((String)jcbMinutos.getSelectedItem());
        fecha.add(Calendar.MINUTE,(minutos*-1));       
        Date fechaA = fecha.getTime();
        cita.getAlarma().setCancion(cancion);
        cita.getAlarma().ProgramarAlarma(fechaA,cita.getAsunto());
        cita.setIndiceMin(jcbMinutos.getSelectedIndex());
        cita.setIndiceMus(jcbMusicas.getSelectedIndex()); 
        notificacion.NotificacionEscrita("Añadido","! Alarma añadida exitosamente ¡","/Iconos/Aprobacion.png");
        this.dispose();
    }//GEN-LAST:event_crearActionPerformed


    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        int i = jcbMusicas.getSelectedIndex();
        if (clip != null) {
            clip.stop();
        }
        cancion = sonds[i];
        notificacion.NotificacionEscrita("Seleccionado","! Musica seleccionada exitosamente ¡","/Iconos/Aprobacion.png");
        
    }//GEN-LAST:event_seleccionarActionPerformed

    private void jcbMusicasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbMusicasItemStateChanged
       
        int i = jcbMusicas.getSelectedIndex();
        if (clip != null) {
            clip.stop();
        }      
            reproducir(sonds[i]);       
        
    }//GEN-LAST:event_jcbMusicasItemStateChanged

    private void jcbMusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMusicasMouseClicked

    }//GEN-LAST:event_jcbMusicasMouseClicked

    private void jcbMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMusicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMusicasActionPerformed

    private void jcbMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMinutosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (clip != null) {
            clip.stop();
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcbMinutos;
    private javax.swing.JComboBox<String> jcbMusicas;
    private javax.swing.JLabel jlbReloj;
    private javax.swing.JButton seleccionar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            jlbReloj.setText(hora + ":" + minuto + ":" + segundo + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private void calcula() {
        calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY);//-12
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
    
    public void reproducir(String cancion) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/audios/" + cancion))); //alarma
            clip.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
