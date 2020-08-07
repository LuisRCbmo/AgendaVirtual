package vista;
import Notificaciones.Notificacion;
import modelo.*;
import edl.*;
import javax.swing.ImageIcon;
/**
 *
 * @author Sergio Garcia
 */

public class CrearMemo extends javax.swing.JFrame {
    //Requiere una lista de memos para asi poder agregarse al crearse un nuevo memo
    private ListaSE listaMemo;
    //Constructor De CrearMemo
    public CrearMemo(ListaSE listaMemo) {
        initComponents();
        this.listaMemo = listaMemo;
        this.setTitle("Crear memo");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        txtAsunto = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaNota = new javax.swing.JTextArea();
        asunto = new javax.swing.JLabel();
        nota = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAsunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 340, 30));
        txtAsunto.getAccessibleContext().setAccessibleName("");

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(null);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 150, 50));

        txtAreaNota.setColumns(20);
        txtAreaNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAreaNota.setRows(5);
        jScrollPane1.setViewportView(txtAreaNota);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 340, 134));

        asunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        asunto.setText("Asunto");
        getContentPane().add(asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 57, 26));

        nota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nota.setText("Nota");
        getContentPane().add(nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 57, 26));

        jButton2.setBackground(new java.awt.Color(149, 173, 177));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR MEMO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 300, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    //Guarda la informacion del memo para luego agregarse a la lista de memos.
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Notificacion n = new Notificacion();
        if(txtAsunto.getText().equals("") && txtAreaNota.getText().equals("")){
            n.NotificacionEscrita("Faltan datos", "Porfavor ingrese los datos.", "/Iconos/Advertencia.png");
        }else{
            Memo nuevo = new Memo(txtAsunto.getText(), txtAreaNota.getText());
            listaMemo.insertar(nuevo);
            this.dispose();
            n.NotificacionEscrita("Exito", "Se guardaron los datos exitosamente", "/Iconos/Aprobacion.png");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asunto;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel nota;
    private javax.swing.JTextArea txtAreaNota;
    private javax.swing.JTextField txtAsunto;
    // End of variables declaration//GEN-END:variables
}
