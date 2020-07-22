package vista;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Sergio Garcia
 */
public class CrearCita extends javax.swing.JFrame {

    private Agenda agenda;

    public CrearCita(Agenda agenda) {
        initComponents();
        this.agenda = agenda;
        aniadirItemsHoras();
        aniadirItemsHorario();
        aniadirItemsDuracion();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        asunto = new javax.swing.JTextField();
        duracion = new javax.swing.JComboBox<>();
        horario = new javax.swing.JComboBox<>();
        horas = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextNota = new javax.swing.JTextArea();
        BotonGuardar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        botonAtras1 = new javax.swing.JButton();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        minutosHora = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jLabel8.setText("jLabel8");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(80, 83, 98));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(80, 83, 98));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Crear Cita");
        jPanel1.add(jLabel10, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 550, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 34, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Asunto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Duracion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Nota");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Hora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("minutos.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        asunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asuntoActionPerformed(evt);
            }
        });
        getContentPane().add(asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 113, 240, 30));

        duracion.setBackground(new java.awt.Color(172, 96, 100));
        duracion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        duracion.setForeground(new java.awt.Color(255, 255, 255));
        duracion.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                duracionComponentAdded(evt);
            }
        });
        duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionActionPerformed(evt);
            }
        });
        getContentPane().add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 75, 25));

        horario.setBackground(new java.awt.Color(172, 96, 100));
        horario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        horario.setForeground(new java.awt.Color(255, 255, 255));
        horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioActionPerformed(evt);
            }
        });
        getContentPane().add(horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 75, 25));

        horas.setBackground(new java.awt.Color(172, 96, 100));
        horas.setForeground(new java.awt.Color(255, 255, 255));
        horas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                horasItemStateChanged(evt);
            }
        });
        horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasActionPerformed(evt);
            }
        });
        getContentPane().add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 75, 25));

        jTextNota.setColumns(20);
        jTextNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextNota.setRows(5);
        jScrollPane3.setViewportView(jTextNota);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 450, -1));

        BotonGuardar.setBackground(new java.awt.Color(172, 96, 100));
        BotonGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 150, 50));

        botonAtras.setBackground(new java.awt.Color(149, 173, 177));
        botonAtras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAtras.setText("<");
        botonAtras.setPreferredSize(new java.awt.Dimension(43, 22));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 400));

        botonAtras1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAtras1.setText("<");
        botonAtras1.setPreferredSize(new java.awt.Dimension(43, 22));
        botonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        rSDateChooser1.setColorBackground(new java.awt.Color(0, 0, 0));
        rSDateChooser1.setColorButtonHover(new java.awt.Color(0, 0, 0));
        rSDateChooser1.setColorDiaActual(new java.awt.Color(0, 0, 0));
        rSDateChooser1.setColorForeground(new java.awt.Color(102, 102, 102));
        rSDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        getContentPane().add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 280, 30));

        minutosHora.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(minutosHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 75, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(":");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 20, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionActionPerformed

    }//GEN-LAST:event_duracionActionPerformed
    private void horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasActionPerformed

    }//GEN-LAST:event_horasActionPerformed
    private void horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActionPerformed

    }//GEN-LAST:event_horarioActionPerformed

    private void asuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asuntoActionPerformed

    private void horasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_horasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_horasItemStateChanged

    private void duracionComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_duracionComponentAdded

    }//GEN-LAST:event_duracionComponentAdded

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        int num = JOptionPane.showConfirmDialog(null, "¿Quisiera crear una alarma?");
        if (num == 0) {

            InterfazAlarma alarma = new InterfazAlarma();
            alarma.setVisible(true);
            Date fecha = rSDateChooser1.getDatoFecha();
            Alarma alarma1 = new Alarma();
            alarma1.ProgramarAlarma(fecha, "");
            Cita nueva = new Cita(asunto.getText(), Integer.parseInt(duracion.getItemAt(0)), alarma1);
            nueva.setFechaHora(fecha);
            agenda.aniadirCita(nueva);

        } else {

            //Alarma a = new Alarma();
            String p = (String) duracion.getSelectedItem();
            int dur = Integer.parseInt(p);
            Cita nueva = new Cita(asunto.getText(), dur);
            Date fecha = rSDateChooser1.getDatoFecha();
            nueva.setFechaHora(fecha);
            nueva.setNota(jTextNota.getText());
            agenda.aniadirCita(nueva);

        }
        /*VistaAgenda va = new VistaAgenda();
    va.setVisible(true);*/
        this.dispose();
    }//GEN-LAST:event_BotonGuardarActionPerformed
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        //VistaAgenda va = new VistaAgenda(agenda);
        //va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed
    private void botonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtras1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAtras1ActionPerformed
    /**
     * @param args the command line arguments
     */

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CrearCita().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JTextField asunto;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonAtras1;
    private javax.swing.JComboBox<String> duracion;
    private javax.swing.JComboBox<String> horario;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea jTextNota;
    private javax.swing.JComboBox<String> minutosHora;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    // End of variables declaration//GEN-END:variables
    private void aniadirItemsHoras() {
        //horas
        this.horas.addItem("01");
        this.horas.addItem("02");
        this.horas.addItem("03");
        this.horas.addItem("04");
        this.horas.addItem("05");
        this.horas.addItem("06");
        this.horas.addItem("07");
        this.horas.addItem("08");
        this.horas.addItem("09");
        this.horas.addItem("10");
        this.horas.addItem("11");
        this.horas.addItem("12");
        //minutos
        this.minutosHora.addItem("00");
        this.minutosHora.addItem("15");
        this.minutosHora.addItem("30");
        this.minutosHora.addItem("45");
    }

    private void aniadirItemsHorario() {
        this.horario.addItem("am");
        this.horario.addItem("pm");
    }

    private void aniadirItemsDuracion() {
        this.duracion.addItem("15");
        this.duracion.addItem("20");
        this.duracion.addItem("25");
        this.duracion.addItem("30");
        this.duracion.addItem("35");
        this.duracion.addItem("40");
        this.duracion.addItem("45");
        this.duracion.addItem("50");
        this.duracion.addItem("55");
        this.duracion.addItem("60");
    }
}
