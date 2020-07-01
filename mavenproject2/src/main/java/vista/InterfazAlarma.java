package vista;
import modelo.*;
import java.util.*;
import javax.swing.JOptionPane;


public class InterfazAlarma extends javax.swing.JFrame implements Runnable {
    
    private ListaAlarma LIAL;
    private Calendar calendario;
    private String hora,minuto,segundo,ampm;
    private Thread h1;
   
    public InterfazAlarma() {
        initComponents();      
        h1 = new Thread(this);
        h1.start();
        LIAL = new ListaAlarma();
        setLocationRelativeTo(null);
        setTitle("Alarma");       
   }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        horas = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        minutos = new javax.swing.JSpinner();
        txtAsunto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlbReloj = new javax.swing.JLabel();
        jbAnadir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        horas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        getContentPane().add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText(" HORAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 52, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("MINUTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 70, -1));

        minutos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        minutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        minutos.setToolTipText("");
        getContentPane().add(minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtAsunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 340, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE DE ALARMA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 23));

        jlbReloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 456, 43));

        jbAnadir.setBackground(new java.awt.Color(172, 96, 100));
        jbAnadir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbAnadir.setText("Añadir");
        jbAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnadirActionPerformed(evt);
            }
        });
        getContentPane().add(jbAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 150, 50));

        jButton2.setBackground(new java.awt.Color(149, 173, 177));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel1.setBackground(new java.awt.Color(80, 83, 98));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Crear Alarma");
        jPanel1.add(jLabel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 510, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\59165\\Desktop\\Taller\\Agenda\\imagenes\\fondo.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 570, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnadirActionPerformed
        Alarma al = new Alarma();
        int hor = (int)horas.getValue();
        int min = (int)minutos.getValue();
        String FA= al.obtenerFechaActual();
        al.ProgramarAlarma(al.stringADate(FA+" "+hor+":"+min),txtAsunto.getText());
        JOptionPane.showMessageDialog(null,"Añadido con exito");        
        txtAsunto.setText("");
    }//GEN-LAST:event_jbAnadirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    CrearCita cc = new CrearCita();
    cc.setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAlarma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner horas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAnadir;
    private javax.swing.JLabel jlbReloj;
    private javax.swing.JSpinner minutos;
    private javax.swing.JTextField txtAsunto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while(ct==h1){
            calcula();
            jlbReloj.setText(hora+":"+minuto+":"+segundo+" "+ampm);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }

    private void calcula() {
        calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM? "AM":"PM";
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY);//-12
            hora = h>9?""+h:"0"+h;
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        minuto = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
