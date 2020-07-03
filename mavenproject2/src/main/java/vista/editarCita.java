/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.*;


import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.*;
/**
 *
 * @author Nath
 */

public class editarCita extends javax.swing.JFrame {

    /**
     * Creates new form editarCita
     */
    private mostrarCita mostrar;
    private String[]meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    private Cita cita;
    public editarCita(mostrarCita mostrar, Cita cita) {
        this.cita=cita;
        this.mostrar=mostrar;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contNota = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        contHora = new javax.swing.JComboBox<>();
        contMinuto = new javax.swing.JComboBox<>();
        amPm = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        listaDia = new javax.swing.JComboBox<>();
        listaMes = new javax.swing.JComboBox<>();
        listaAnio = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 580, 326));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(606, 366));
        setSize(new java.awt.Dimension(580, 326));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(80, 83, 98));
        jPanel1.setPreferredSize(new java.awt.Dimension(256, 22));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR CITA");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 550, 50));

        botonAtras.setBackground(new java.awt.Color(149, 173, 177));
        botonAtras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("<");
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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Activar alarma:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nota:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Duracion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("hrs.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        contAsunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(contAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 430, 22));

        contNota.setColumns(20);
        contNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contNota.setRows(5);
        jScrollPane1.setViewportView(contNota);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 430, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        contHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        contHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contHoraActionPerformed(evt);
            }
        });
        getContentPane().add(contHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        contMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        contMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contMinutoActionPerformed(evt);
            }
        });
        getContentPane().add(contMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        amPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));
        getContentPane().add(amPm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText(":");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        listaDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(listaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        listaMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(listaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        listaAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAnioActionPerformed(evt);
            }
        });
        getContentPane().add(listaAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        botonCancelar.setBackground(new java.awt.Color(172, 96, 100));
        botonCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, 50));

        botonGuardar.setBackground(new java.awt.Color(172, 96, 100));
        botonGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 150, 50));

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        mostrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarActionPerformed
 
    private void listaAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAnioActionPerformed

    private void contHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contHoraActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        mostrar.cita.setAsunto(contAsunto.getText());
         mostrar.cita.setNota(contNota.getText());
         mostrar.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void contMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contMinutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setHora(String h, String m){
    contHora.setSelectedItem(h);
    contMinuto.setSelectedItem(m);
    
    }
    
    public void setAsunto(String p){
    contAsunto.setText(p);
    }
    
    public void setNota(String p){
    contNota.setText(p);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> amPm;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField contAsunto;
    private javax.swing.JComboBox<String> contHora;
    private javax.swing.JComboBox<String> contMinuto;
    private javax.swing.JTextArea contNota;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JComboBox<String> listaAnio;
    private javax.swing.JComboBox<String> listaDia;
    private javax.swing.JComboBox<String> listaMes;
    // End of variables declaration//GEN-END:variables
}
