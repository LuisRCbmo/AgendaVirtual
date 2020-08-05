
package vista;

import Notificaciones.Notificacion;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import modelo.Alarma;
import modelo.Cita;
/**
 * @author Emerson Vera
 */

/**
 * Calendario es para trabajar con fechas.
 * hora, minuto, segundo, ampm es para trabajar con el reloj.
 * el Trread es para trabajar con el reloj.
 * el Clip es para el sonido.
 * Cancion es para reproducir una cancion en especifico.
 * Sounds es el arreglo de todas las canciones disponibles.
 * Cita, se la usa para guardar informacion de este frame para posterirmente editarse si el usuario lo prefiere.
 * editarCita cambiar la informacion de esta ventana en tiempo de ejecucion.
 */
public class EditarAlarma extends javax.swing.JFrame implements Runnable{
    private Notificacion notificacion;
    private Calendar calendario;
    private String hora, minuto, segundo, ampm;
    private Thread h1;
    private Clip clip;
    private String cancion = "TelefonoAntiguo.wav";
    private String[] sonds = {"TelefonoAntiguo.wav", "TITITI.wav", "Gallo.wav", "AlarmaLoud.wav", "AlarmaDeGuerra.wav", "AlarmaDeCoche.wav"};
    private boolean inicio = false;
    private Cita cita;
    private editarCita eCita;
    /**
     * Les da valores iniciales a los atributos y lanza un metodo llamado ordenar().
     */
    public EditarAlarma(Cita cita,editarCita eCita) {
        initComponents();
        h1 = new Thread(this);
        h1.start();        
        setLocationRelativeTo(null); 
        notificacion = new Notificacion();
        this.cita = cita;
        this.eCita = eCita;
        ordenar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        minutos = new javax.swing.JComboBox<>();
        musicas = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbReloj = new javax.swing.JLabel();
        fechaActual = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(560, 260));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("EDITAR ALARMA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 310, 30));

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 530, 50));

        minutos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        minutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 60, 30));

        musicas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        musicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefono Antiguo", "TI TI TI ", "Gallo", "Alarma Loud", "Alarma de Guerra", "Alarma De Coche" }));
        musicas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        musicas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                musicasItemStateChanged(evt);
            }
        });
        getContentPane().add(musicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 150, 30));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(null);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 90, 30));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 90, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tiempo de Anticipacion :");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Musica de la Alarma :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Minutos.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 30));

        jlbReloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 446, 50));

        fechaActual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(fechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 490, 30));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorder(null);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 90, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * Hace que los comboBox aparezca con los valores previamente seleccionados por el usuario. 
    * Las de minutos y musicas.
    */
    private void ordenar(){
        minutos.setSelectedIndex(cita.getIndiceMin()); 
        musicas.setSelectedIndex(cita.getIndiceMus());
        fechaActual.setText(cita.toStringFormat()); 
        inicio = true;
    } 
    /**
     * Cierra la ventana actual, pone pausa al sonido para que no este sonando en la otra ventana.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (clip != null) {
            clip.stop();
            clip.close();
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * A la cita,se le asigna su alarma null
     * A la ventana editarCita actualiza informacion en tiempo de ejecucion
     * Tambien se le asigna la cita a su atributo si tiene alarma, un false(Eliminando alarma de esta cita).
     */
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Object [] botones = {" SI "," NO "};
        int res = notificacion.notificacionBotones("Quiere eliminar la Alarma","¿ Eliminar ?", botones,"/Iconos/Negacion.png");
        if(res == 0){
            eCita.setBotonA("Crear Alarma");
            cita.setAlarma(null); 
            cita.setTieneAlarma(false); 
            notificacion.NotificacionEscrita("Eliminado","Alarma Eliminada","/Iconos/Aprobacion.png");
            this.dispose();
        }
    }//GEN-LAST:event_eliminarActionPerformed
    /**
     * Reproduce los sonidos seleccionados en el comboBox
     * Se le puso una condicional, porque al momento de ordenar(), este sonido se escuchaba, con esta condicional ya no sucede eso.
     */
    private void musicasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_musicasItemStateChanged
        int i = musicas.getSelectedIndex();
        if (clip != null) {
            clip.stop();
            clip.close();
        }
        if(inicio){
            reproducir(sonds[i]);
        }
    }//GEN-LAST:event_musicasItemStateChanged
    
    /**
     * A la cita se le asignan 5 valores:
     * *Se le asigna una alarma.
     * *Se le asigna el indice de los minutos de anticipacion que el usuario ingrese al momento de crear una alarma.
     * *Se le asigna el indice de la musica que sonará, siendo de eleccion del usuario.
     * *Se le asigna el tiempo de anticipacion y se le asigna la musica.
     */
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (clip != null) {
            clip.stop();
            clip.close();
        }
        Object [] botones = {"  SI  ","  NO  "};
        int res = notificacion.notificacionBotones("¿ Esta seguro que quiere guardar los cambios ?","Editar Alarma",botones,"/Iconos/Interrogacion.png");
        if (res == 0){           
            int i = musicas.getSelectedIndex();
            cancion = sonds[i];
            Calendar tiempoCita = Calendar.getInstance();
            tiempoCita.setTime(cita.getHoraFecha());    
            int decremento =(Integer.parseInt((String)minutos.getSelectedItem()))*-1;
            tiempoCita.add(Calendar.MINUTE,(decremento));                
            cita.setIndiceMin(minutos.getSelectedIndex()); 
            cita.setIndiceMus(musicas.getSelectedIndex());                     
            Alarma nueva = new Alarma();            
            cita.setAlarma(nueva); 
            cita.setMusica(cancion);
            cita.setAnticipacion(decremento);
            eCita.setBotonA("Editar Alarma");
            notificacion.NotificacionEscrita("Alarma añadida","Alarma programada para las " +nueva.dateAString(tiempoCita.getTime()),"/Iconos/Advertencia.png");  
            this.dispose();
        }
    }//GEN-LAST:event_guardarActionPerformed
    /**
     *  Cancela todo lo hecho en alarma sin que le ocurran cambios a la cita.
     *  Luego la ventana actual se cierra.Poniendo pausa a todas las musicas.
     */
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if (clip != null) {
            clip.stop();
            clip.close();
        }
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fechaActual;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlbReloj;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JComboBox<String> musicas;
    private javax.swing.JLabel panel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    /**
     * Para el reloj
     */
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            jlbReloj.setText(hora + ":" + minuto + ":" + segundo + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    /**
     * Para el reloj
     */
    private void calcula() {
        calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY);//-12
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
    /**
     * Reproduce el sonido de la cancion seleccionada.
     */
    public void reproducir(String cancion) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/audios/" + cancion)));
            clip.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
