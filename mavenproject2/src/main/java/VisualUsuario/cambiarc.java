/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisualUsuario;
import Usuario.User;
import Notificaciones.Notificacion;
/**
 *
 * @author Luis
 */
public class cambiarc extends javax.swing.JFrame {

    /**
     * Creates new form cambiarc
     */
    private User usuario;
    public cambiarc(User user) {
        initComponents();
        usuario = user;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bttnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtContrasenaActual = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtContrasenaNueva = new javax.swing.JPasswordField();
        txtcontrasenaConfirmar = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAMBIAR CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 360, 30));

        jButton1.setBackground(new java.awt.Color(149, 173, 177));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Confirmar contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, -1));

        bttnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        bttnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bttnGuardar.setText("Guardar");
        bttnGuardar.setBorderPainted(false);
        bttnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(bttnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 150, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña actual");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, -1));

        txtContrasenaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActualActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasenaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nueva contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, -1));
        getContentPane().add(txtContrasenaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 170, -1));
        getContentPane().add(txtcontrasenaConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bttnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGuardarActionPerformed
        Notificacion notificacion = new Notificacion();
        if(usuario.getPassword().equals(txtContrasenaActual.getText())){
            if(txtContrasenaNueva.getText().equals(txtcontrasenaConfirmar.getText())){
                usuario.setPassword(txtContrasenaNueva.getText());
                notificacion.NotificacionEscrita("Exito", "Se cambio la contraseña","/Iconos/Aprobacion.png");
                this.dispose();
            }else{
                notificacion.NotificacionEscrita("No valido", "Las contraseñas de confirmacion no son iguales", "/Iconos/Advertencia.png");
            }
        }else{
            notificacion.NotificacionEscrita("No valido", "La contraseña ingresada no es la misma", "/Iconos/Advertencia.png");
        }
    }//GEN-LAST:event_bttnGuardarActionPerformed

    private void txtContrasenaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActualActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txtContrasenaActual;
    private javax.swing.JPasswordField txtContrasenaNueva;
    private javax.swing.JPasswordField txtcontrasenaConfirmar;
    // End of variables declaration//GEN-END:variables
}
