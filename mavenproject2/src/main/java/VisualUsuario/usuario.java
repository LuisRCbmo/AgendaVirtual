/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisualUsuario;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import Usuario.User;
import javax.swing.ImageIcon;

/*
 *
 * @author Luis
 */
public class usuario extends javax.swing.JFrame {
    
    private User usuario;

    public usuario(User usuario) {
        initComponents();
        this.usuario = usuario;
        mostrarUsuario();
        asignarImagen();
        this.setLocationRelativeTo(null);
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }
    /*
        asigan la imagen que tenga el usuario a el label imagenPerfil
    */
    public void asignarImagen(){
        ImagenPerfil.setIcon(usuario.getImgPerfil()); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImagenPerfil = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtnombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JLabel();
        txtapellido = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        cambiarc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JLabel();
        EditarImagen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 360, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        ImagenPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ImagenPerfil, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 150));

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

        txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnombre.setText("\"nombre\"");
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 150, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 150, -1));

        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreo.setText("Correo:");
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, -1));

        txtcorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcorreo.setText("Correo:");
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, -1));

        txtapellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtapellido.setText("\"apellido\"");
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 150, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Celular:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 150, -1));

        txtcelular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcelular.setText("\"celular\"");
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 150, -1));

        editar.setBackground(new java.awt.Color(255, 255, 255));
        editar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editar.setText("Editar");
        editar.setBorderPainted(false);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 150, 50));

        cambiarc.setBackground(new java.awt.Color(255, 255, 255));
        cambiarc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cambiarc.setText("Cambiar Contraseña");
        cambiarc.setBorderPainted(false);
        cambiarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarcActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 150, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 150, -1));

        txtdireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdireccion.setText("\"direccion\"");
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 150, -1));

        EditarImagen.setBackground(new java.awt.Color(255, 255, 255));
        EditarImagen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EditarImagen.setText("Editar Imagen");
        EditarImagen.setBorder(null);
        EditarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(EditarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*boton "cerrar" para cerrar la ventana actual*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /*boton "editar" sirve para cerrar la ventana actual y abrir una ventana 
    para añadir editar el usuario*/
    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        editaruser eu = new editaruser(usuario);
        eu.setVisible(true);
        usuario padre = this;
        eu.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_editarActionPerformed
/*boton "cambiar contraseña" sirve para cerrar la ventana actual y abrir una ventana 
    para añadir editar el la contraseña del usuario*/
    private void cambiarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarcActionPerformed
        cambiarc eu = new cambiarc(usuario);
        eu.setVisible(true);
        usuario padre = this;
        eu.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_cambiarcActionPerformed

    private void EditarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarImagenActionPerformed
        Perfiles imgPerfil = new Perfiles(usuario,this);
        imgPerfil.setVisible(true); 
    }//GEN-LAST:event_EditarImagenActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarImagen;
    private javax.swing.JLabel ImagenPerfil;
    private javax.swing.JButton cambiarc;
    private javax.swing.JButton editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JLabel txtcelular;
    private javax.swing.JLabel txtcorreo;
    private javax.swing.JLabel txtdireccion;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables

    private void mostrarUsuario() {
        txtnombre.setText(usuario.getName());
        txtapellido.setText(usuario.getLastName());
        txtcelular.setText(usuario.getCellPhone());
        txtCorreo.setText(usuario.getEmail());
        txtdireccion.setText(usuario.getDirection());
    }
}
