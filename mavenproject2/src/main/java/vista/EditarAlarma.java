
package vista;

import Notificaciones.Notificacion;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import modelo.Alarma;
import modelo.Cita;

/*
    autor emerson
*/
public class EditarAlarma extends javax.swing.JFrame implements Runnable{
    private Notificacion notificacion;
    private Calendar calendario;
    private String hora, minuto, segundo, ampm;
    private Thread h1;
    private Clip clip;
    private String cancion = "TelefonoAntiguo.wav";
    private String[] sonds = {"TelefonoAntiguo.wav", "TITITI.wav", "Gallo.wav", "AlarmaLoud.wav", "AlarmaDeGuerra.wav", "AlarmaDeCoche.wav"};
    private boolean inicio = false;
    private Cita cita;
    public EditarAlarma(Cita cita) {
        initComponents();
        h1 = new Thread(this);
        h1.start();        
        setLocationRelativeTo(null); 
        notificacion = new Notificacion();
        this.cita = cita;
        ordenar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        minutos = new javax.swing.JComboBox<>();
        musicas = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        seleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbReloj = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(560, 260));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("EDITAR ALARMA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 310, 30));

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 530, 50));

        minutos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        minutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 30));

        musicas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        musicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefono Antiguo", "TI TI TI ", "Gallo", "Alarma Loud", "Alarma de Guerra", "Alarma De Coche" }));
        musicas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        musicas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                musicasItemStateChanged(evt);
            }
        });
        getContentPane().add(musicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 30));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(null);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 90, 30));

        seleccionar.setBackground(new java.awt.Color(255, 255, 255));
        seleccionar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seleccionar.setText("Seleccionar");
        seleccionar.setBorder(null);
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 90, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tiempo de Anticipacion :");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Musica de la Alarma :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Minutos.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 60, 30));

        jlbReloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 446, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordenar(){
        minutos.setSelectedIndex(cita.getIndiceMin()); 
        musicas.setSelectedIndex(cita.getIndiceMus());
        inicio = true;
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (clip != null) {
            clip.stop();
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        int i = musicas.getSelectedIndex();
        if (clip != null) {
            clip.stop();
        }
        cancion = sonds[i];
        notificacion.NotificacionEscrita("Seleccionado","! Musica seleccionada exitosamente ¡","/Iconos/Aprobacion.png");
    }//GEN-LAST:event_seleccionarActionPerformed

    private void musicasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_musicasItemStateChanged
        int i = musicas.getSelectedIndex();
        if (clip != null) {
            clip.stop();
        }
        if(inicio){
            reproducir(sonds[i]);
        }
    }//GEN-LAST:event_musicasItemStateChanged

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Object [] botones = {"  SI  ","  NO  "};
        int res = notificacion.notificacionBotones("¿ Esta seguro que quiere guardar los cambios ?","Editar Alarma",botones,"/Iconos/Interrogacion.png");
        if (res == 0){
            int resta = (cita.getIndiceMin() + 1)*5;
            Calendar anticipacion = Calendar.getInstance();
            anticipacion.setTime(cita.getHoraFecha()); 
            anticipacion.add(Calendar.MINUTE,resta);           
            int aumento =Integer.parseInt((String)minutos.getSelectedItem());
            anticipacion.add(Calendar.MINUTE,(aumento * -1));
            cita.setIndiceMin(minutos.getSelectedIndex()); 
            cita.setIndiceMus(musicas.getSelectedIndex());
            cita.apagarAlarma();
            Alarma nueva = new Alarma();
            nueva.setCancion(cancion); 
            nueva.ProgramarAlarma(anticipacion.getTime(),cita.getAsunto()); 
            cita.setAlarma(nueva); 
            this.dispose();
        }
    }//GEN-LAST:event_guardarActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAlarma().setVisible(true);
            }
        });*/
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlbReloj;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JComboBox<String> musicas;
    private javax.swing.JLabel panel;
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
