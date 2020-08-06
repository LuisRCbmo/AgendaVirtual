package VisualUsuario;

import Usuario.User;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Notificaciones.Notificacion;
/**
 * @author emerson
 */

/**
 * usuario es para guardar el icono seleccionado.
 * iamgenes para asignar todas las imagendes disponibles en los jLabels de esta ventana.
 * venUsuario es para actualizar informacion de esta ventana(imagen). 
 */
public class Perfiles extends javax.swing.JFrame {
    
    private User usuario;
    private Icon[] imagenes = new Icon[10];
    private usuario ventUsuario;
    private Notificacion notificacion;
    /**
     * Se otorga valores a los atributos
     * Y se ejecuta el metodo iniciar()
     */
    public Perfiles(User usuario,usuario ventUsuario) {             
        initComponents();
        this.usuario = usuario;
        this.ventUsuario = ventUsuario;
        notificacion = new Notificacion();
        setLocationRelativeTo(null);
        iniciar();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    } 
    /**
     * Coloca todas las imagenes en los JLabels con las dimensiones apropiadas.
     */
    public void iniciar(){
        for(int i =0;i<10;i++){
            imagenes[i]= new ImageIcon(new ImageIcon(getClass().getResource("/ImagenesPerfil/img"+i+".jpg")).getImage().getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH));        
        }
        img0.setIcon(imagenes[0]);
        img1.setIcon(imagenes[1]); 
        img2.setIcon(imagenes[2]); 
        img3.setIcon(imagenes[3]); 
        img4.setIcon(imagenes[4]); 
        img5.setIcon(imagenes[5]); 
        img6.setIcon(imagenes[6]); 
        img7.setIcon(imagenes[7]); 
        img8.setIcon(imagenes[8]); 
        img9.setIcon(imagenes[9]); 
    }
    /**
     * Este metodo guarda la imagen en el usuario.
     * Y la actualiza en la ventana usuario.
     */
    public void asignarImagen(int pos){
        Object [] botones = {" SI "," NO "};
        int res = notificacion.notificacionBotones("¿Seleccionar Foto de Perfil?","Seleccionar",botones,"/Iconos/Interrogacion.png");
        if(res == 0){    
            usuario.setImgPerfil(imagenes[pos]);
            ventUsuario.asignarImagen();
            this.dispose();
        }
    }   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        img0 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        img3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        img4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        img2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        img5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        img6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        img7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        img8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        img9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        panel = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoP.jpg"))); // NOI18N
        fondo.getAccessibleContext().setAccessibleName("fondo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 378));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(new javax.swing.border.MatteBorder(null));
        panel1.setLayout(new java.awt.BorderLayout());

        img0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img0MouseClicked(evt);
            }
        });
        panel1.add(img0, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 125, 125));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new java.awt.BorderLayout());

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        jPanel3.add(img1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 125, 125));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new java.awt.BorderLayout());

        img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img3MouseClicked(evt);
            }
        });
        jPanel4.add(img3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 125, 125));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setLayout(new java.awt.BorderLayout());

        img4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img4MouseClicked(evt);
            }
        });
        jPanel5.add(img4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 125, 125));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setLayout(new java.awt.BorderLayout());

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
        });
        jPanel6.add(img2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 125, 125));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setLayout(new java.awt.BorderLayout());

        img5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img5MouseClicked(evt);
            }
        });
        jPanel7.add(img5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 125, 125));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setLayout(new java.awt.BorderLayout());

        img6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img6MouseClicked(evt);
            }
        });
        jPanel8.add(img6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 125, 125));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setLayout(new java.awt.BorderLayout());

        img7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img7MouseClicked(evt);
            }
        });
        jPanel9.add(img7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 125, 125));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel10.setLayout(new java.awt.BorderLayout());

        img8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img8MouseClicked(evt);
            }
        });
        jPanel10.add(img8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 125, 125));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel11.setLayout(new java.awt.BorderLayout());

        img9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img9MouseClicked(evt);
            }
        });
        jPanel11.add(img9, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 125, 125));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONE LA FOTO DE PERFIL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 250, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 710, 50));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoP.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * Se cierra la ventan.
    */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed
    /**
     * Los siguientes metodos son para que el usuario peuda seleccionar una imagen y agregarla a su perfil.
     */
    private void img0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img0MouseClicked
        asignarImagen(0);
    }//GEN-LAST:event_img0MouseClicked

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        asignarImagen(1);
    }//GEN-LAST:event_img1MouseClicked

    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
        asignarImagen(2);
    }//GEN-LAST:event_img2MouseClicked

    private void img3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseClicked
        asignarImagen(3);
    }//GEN-LAST:event_img3MouseClicked

    private void img4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseClicked
        asignarImagen(4);
    }//GEN-LAST:event_img4MouseClicked

    private void img5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseClicked
        asignarImagen(5);
    }//GEN-LAST:event_img5MouseClicked

    private void img6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MouseClicked
        asignarImagen(6);
    }//GEN-LAST:event_img6MouseClicked

    private void img7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MouseClicked
        asignarImagen(7);
    }//GEN-LAST:event_img7MouseClicked

    private void img8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseClicked
        asignarImagen(8);
    }//GEN-LAST:event_img8MouseClicked

    private void img9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MouseClicked
        asignarImagen(9);
    }//GEN-LAST:event_img9MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel img0;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel panel;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
