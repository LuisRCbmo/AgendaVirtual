package vista;
//import javax.swing.JDialog;
//import javax.swing.JOptionPane;
import modelo.Memo;
import Notificaciones.Notificacion;
/**
 *
 * @author Sergio Garcia
 */
public class EditarMemo extends javax.swing.JFrame {
    private Memo memo;
    private Notificacion notificacion;
    public EditarMemo(Memo memo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.memo = memo;
        txtAsunto.setText(memo.getAsunto());
        txtAreaNota.setText(memo.getNota());
        notificacion = new Notificacion();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editButton = new javax.swing.JButton();
        nota = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaNota = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editButton.setBackground(new java.awt.Color(255, 255, 255));
        editButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editButton.setText("Guardar");
        editButton.setBorder(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 150, 50));

        nota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nota.setText("Nota");
        getContentPane().add(nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 57, 26));
        getContentPane().add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 340, 28));

        backButton.setBackground(new java.awt.Color(149, 173, 177));
        backButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDITAR MEMO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 310, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel1.setText("Editar Memo");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Asunto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        txtAreaNota.setColumns(20);
        txtAreaNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAreaNota.setRows(5);
        jScrollPane1.setViewportView(txtAreaNota);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 340, 134));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        Object [] botones = {"  SI  ","  NO  "};
        //int res=JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere editar el memo?", "Editar memo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        int res = notificacion.notificacionBotones("¿ Esta seguro que quiere editar el memo ?", "Editar Memo", botones,"/Iconos/Advertencia.png");
        if(res==0){
            memo.setAsunto(txtAsunto.getText());
            memo.setNota(txtAreaNota.getText());
            this.dispose();
            //JOptionPane.showMessageDialog(null,"¡Se editó el memo exitosamente!");
            notificacion.NotificacionEscrita("EDITADO","¡ Se editó el memo exitosamente !","/Iconos/Aprobacion.png");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nota;
    private javax.swing.JTextArea txtAreaNota;
    private javax.swing.JTextField txtAsunto;
    // End of variables declaration//GEN-END:variables
}

