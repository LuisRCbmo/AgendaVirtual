package VisualUsuario;

import Usuario.Users;
import Usuario.User;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Notificaciones.Notificacion;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio Garcia
 */
public class JFrameNewUser extends javax.swing.JFrame {
    //Necesita de la lista de usuarios para posteriormente al crearse un nuevo usuario, agregarse a esta.
    private Users users;
    private Notificacion notificacion;
    public JFrameNewUser(Users users) {
        initComponents();
        this.users = users;
        notificacion = new Notificacion();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        bttnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        fondo2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear cuenta");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nombre ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 180, -1));

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, 20));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 180, -1));

        txtPasswordConfirm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPasswordConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordConfirmActionPerformed(evt);
            }
        });
        txtPasswordConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordConfirmKeyTyped(evt);
            }
        });
        getContentPane().add(txtPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 180, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Confirmar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 20));

        bttnRegister.setBackground(new java.awt.Color(255, 255, 255));
        bttnRegister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bttnRegister.setText("Registrar");
        bttnRegister.setBorder(null);
        bttnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(bttnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CREAR CUENTA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 210, 34));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 110, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Correo ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Apellido ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Celular ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Direccion");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 20));

        txtApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, -1));

        txtCelular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 180, -1));

        txtDireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 180, -1));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        fondo2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordConfirmActionPerformed

    }//GEN-LAST:event_txtPasswordConfirmActionPerformed
    //Cierra la ventana de "Crear nuevo Usuario"
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    //Registra y verifica si existe un usuario ya registrado con las mismas credenciales, para tener usuarios de inicio unicos.
    private void bttnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegisterActionPerformed
        if(txtName.getText().equals("") || txtPassword.getText().equals("") || txtUser.getText().equals("") || txtPasswordConfirm.getText().equals("") || txtApellido.getText().equals("")  || txtCelular.getText().equals("")  || txtCorreo.getText().equals("")  || txtDireccion.getText().equals("")){
            notificacion.NotificacionEscrita("Incompleto","Porfavor ingrese sus datos al crear una nueva cuenta","/Iconos/Advertencia.png");
        }else{
            if(users.addUser(new User(txtUser.getText(), txtPassword.getText(),txtName.getText(),txtApellido.getText(), txtCelular.getText(),txtCorreo.getText(),txtDireccion.getText()))){
                notificacion.NotificacionEscrita("!Exito¡","¡Se guardaron los datos correctamente!","/Iconos/Aprobacion.png");
                this.dispose();
            }else{
                notificacion.NotificacionEscrita("Ya existe","Ya existe ese nombre de usuario, porfavor elija otro.","/Iconos/Negacion.png");
            }
        }
    }//GEN-LAST:event_bttnRegisterActionPerformed
    /**
     * Verifica que no se ingresen caracteres diferentes a numeros y letras
     */
    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char word = evt.getKeyChar();
        if ((word < '0' || word > '9') && (word < 'a' || word > 'z') && (word < 'A' || word > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped
    /**
     * Verifica que no se ingresen caracteres diferentes a numeros y letras
     */
    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        char word = evt.getKeyChar();
        if ((word < '0' || word > '9') && (word < 'a' || word > 'z') && (word < 'A' || word > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserKeyTyped
    /**
     * Verifica que no se ingresen caracteres diferentes a numeros y letras
     */
    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        char word = evt.getKeyChar();
        if ((word < '0' || word > '9') && (word < 'a' || word > 'z') && (word < 'A' || word > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped
    /**
     * Verifica que no se ingresen caracteres diferentes a numeros y letras
     */
    private void txtPasswordConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordConfirmKeyTyped
        char word = evt.getKeyChar();
        if ((word < '0' || word > '9') && (word < 'a' || word > 'z') && (word < 'A' || word > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordConfirmKeyTyped
    /**
     * Se lo dejó en blanco porque se puede escribir una direccion con caracteres como ser "#,°.*,",","."
     */
    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        
    }//GEN-LAST:event_txtDireccionActionPerformed
    /**
     * Verifica que no se ingresen caracteres diferentes a numeros y letras
     */
    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char word = evt.getKeyChar();
        if ((word < '0' || word > '9') && (word < 'a' || word > 'z') && (word < 'A' || word > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped
    /**
     * Verifica que no se ingresen caracteres diferentes a numeros
     */
    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char word = evt.getKeyChar();
        if (word < '0' || word > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped

    }//GEN-LAST:event_txtCorreoKeyTyped
    /**
     * Verifica que no se ingresen caracteres diferentes a numeros y letras
     */
    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char word = evt.getKeyChar();
        if ((word < '0' || word > '9') && (word < 'a' || word > 'z') && (word < 'A' || word > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnRegister;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo2;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
