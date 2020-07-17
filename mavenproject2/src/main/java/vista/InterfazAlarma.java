package vista;
import modelo.Alarma;
import modelo.ListaAlarma;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class InterfazAlarma extends javax.swing.JFrame implements Runnable {
    
    private ListaAlarma LIAL;
    private Calendar calendario;
    private String hora,minuto,segundo,ampm;
    private Thread h1;
    private Clip clip;
    private String cancion="TelefonoAntiguo.wav";
    private String[] sonds = {"TelefonoAntiguo.wav","TITITI.wav","Gallo.wav","AlarmaLoud.wav","AlarmaDeGuerra.wav","AlarmaDeCoche.wav"};
    private String[] sondsFormat = {"Telefono Antiguo","TI TI TI","Gallo","Alarma Loud","Alarma De Guerra","Alarma De Coche"};
    
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
        jLabel2 = new javax.swing.JLabel();
        jlbReloj = new javax.swing.JLabel();
        jbAnadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbMinutos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcbMusicas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Minutos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 71, -1));

        jlbReloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 446, 50));

        jbAnadir.setText("Añadir");
        jbAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnadirActionPerformed(evt);
            }
        });
        getContentPane().add(jbAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tiempo de Anticipacion ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 168, 20));

        jcbMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        getContentPane().add(jcbMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Musica de Alarma");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 150, 30));

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jcbMusicas.setBackground(new java.awt.Color(153, 204, 255));
        jcbMusicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefono Antiguo", "TI TI TI ", "Gallo", "Alarma Loud", "Alarma de Guerra", "Alarma De Coche" }));
        jcbMusicas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbMusicasItemStateChanged(evt);
            }
        });
        jcbMusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbMusicasMouseClicked(evt);
            }
        });
        getContentPane().add(jcbMusicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 137, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 540, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnadirActionPerformed
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.SECOND, 3);
        Date fechaA = fecha.getTime();
        Alarma al = new Alarma();                       
        al.setCancion(cancion);        
        al.ProgramarAlarma(fechaA,"");
        JOptionPane.showMessageDialog(null,"Añadido con exito");        
        
    }//GEN-LAST:event_jbAnadirActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i =jcbMusicas.getSelectedIndex();
        if(clip != null){
            clip.stop();
        }       
        cancion = sonds[i];
        JOptionPane.showMessageDialog(null,sondsFormat[i]);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbMusicasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbMusicasItemStateChanged
        int i =jcbMusicas.getSelectedIndex();
        if(clip !=null){
            clip.stop();
        }       
         reproducir(sonds[i]);
        
    }//GEN-LAST:event_jcbMusicasItemStateChanged

    private void jcbMusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMusicasMouseClicked
     
    }//GEN-LAST:event_jcbMusicasMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAnadir;
    private javax.swing.JComboBox<String> jcbMinutos;
    private javax.swing.JComboBox<String> jcbMusicas;
    private javax.swing.JLabel jlbReloj;
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
      public Alarma getAlarmaCreada(){
        Alarma res = LIAL.returnAlarma(0);
        LIAL.eliminarAlarma(res);
        return res;
    }
      public void reproducir(String cancion){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/audios/"+cancion)));
            clip.start();
        }catch(Exception e){
            System.out.println(e);
        }
    } 
   
}
