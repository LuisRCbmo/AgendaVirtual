package VisualUsuario;

import vista.VistaAgendaVirtual;
import Usuario.User;
import Usuario.Users;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import Notificaciones.Notificacion;
import javax.swing.ImageIcon;
/**
 *
 * @author Sergio Garcia
 */
public class JFrameLoginUser extends javax.swing.JFrame {
    /**
     * Requiere de lista de usuarios para luego poder comprobarla al momento de ingresarse
     */
    private Users users;
    private Notificacion notificacion;
    //Se inicia el Jframe
    public JFrameLoginUser(Users users) {
        initComponents();
        this.users = users;
        this.setLocationRelativeTo(null);
        notificacion = new Notificacion();
        //this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        bttnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        bttnExit = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 70, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 70, 20));

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
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 190, -1));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 190, -1));

        bttnLogin.setBackground(new java.awt.Color(255, 255, 255));
        bttnLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bttnLogin.setText("Ingresar");
        bttnLogin.setBorder(null);
        bttnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bttnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 90, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡Bienvenido a su Agenda Virtual!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Crear nueva cuenta.");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredCreateAccount(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moseExitedCreatedAccount(evt);
            }
        });
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil_Image.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        fondo2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        bttnExit.setBackground(new java.awt.Color(255, 255, 255));
        bttnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bttnExit.setText("Salir");
        bttnExit.setBorder(null);
        bttnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExitActionPerformed(evt);
            }
        });
        getContentPane().add(bttnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 90, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 310, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed

    }//GEN-LAST:event_jLabel5KeyPressed
    //Al pasar por el jLabel5 "Crear cuenta nueva" se abre la nueva ventana para poder crear un nuevo usuario
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JFrameNewUser crearCuenta = new JFrameNewUser(users);
        crearCuenta.setVisible(true);
        JFrameLoginUser padre = this;
        crearCuenta.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed
    //Comprueba si el usuario ingresado fue anteriormente creado para posteriormente ingresar a su Agenda Virtual
    //Caso contrario, no le dejará ingresar porque no es un usuario valido.
    private void bttnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLoginActionPerformed
        boolean flag = false;
        for(int i = 0 ; i < users.getUsers().size() && !flag; i++){
            if(users.getUsers().get(i).getUser().equals(txtUser.getText()) && users.getUsers().get(i).getPassword().equals(txtPassword.getText())){
                notificacion.NotificacionEscrita("!Bienvenido¡","Bienvenido a tu Agenda virtual "+ users.getUsers().get(i).getName(),"/Iconos/Bienvenido.png"); 
                flag = true;
                this.dispose();
                VistaAgendaVirtual agendaVirtualVista = new VistaAgendaVirtual(users , users.getUsers().get(i));
                agendaVirtualVista.setVisible(true);
            }
        }
        if(!flag){
            notificacion.NotificacionEscrita("Incorrecto","Usuario no valido, porfavor revise su usuario.","/Iconos/Advertencia.png");
        }
    }//GEN-LAST:event_bttnLoginActionPerformed
    //Ayuda visual del jLabel5
    private void mouseEnteredCreateAccount(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnteredCreateAccount
        Font font = jLabel5.getFont();
        jLabel5.setFont(new Font(font.getName(), Font.BOLD, font.getSize()));
        jLabel5.setForeground(Color.red);
        jLabel5.repaint();        
    }//GEN-LAST:event_mouseEnteredCreateAccount
    //Ayuda visual del jLabel5
    private void moseExitedCreatedAccount(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moseExitedCreatedAccount
        Font font = jLabel5.getFont();
        jLabel5.setFont(new Font(font.getName(), Font.PLAIN, font.getSize()));
        jLabel5.setForeground(null);
        jLabel5.repaint();
    }//GEN-LAST:event_moseExitedCreatedAccount
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

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed
    //Cierra toda ejecucion del Login, al igual que de la Agenda Virtual
    private void bttnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnExit;
    private javax.swing.JButton bttnLogin;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
