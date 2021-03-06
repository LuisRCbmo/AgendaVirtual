package vista;

import java.util.Date;
import modelo.*;
import Notificaciones.Notificacion;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio Garcia
 */
public class CrearCita extends javax.swing.JFrame {
    /**
     * Requiere de agenda para poder acceder a la cita y poder modificarla posteriormente.
    */
    private Agenda agenda;
    private Notificacion notificacion;
    private Cita citaAuxiliar;
    //Constructor de CrearCita
    public CrearCita(Agenda agenda) {
        initComponents();
        this.agenda = agenda;
        this.setLocationRelativeTo(null);
        notificacion = new Notificacion();
        citaAuxiliar = new Cita("", 0, null);
        rSDateChooser1.setDatoFecha(new Date());
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        asunto = new javax.swing.JTextField();
        duracion = new javax.swing.JComboBox<>();
        ampm = new javax.swing.JComboBox<>();
        horas = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextNota = new javax.swing.JTextArea();
        BotonGuardar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        botonAtras1 = new javax.swing.JButton();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        minutos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jLabel8.setText("jLabel8");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 34, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Asunto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Duracion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Nota");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Hora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("minutos.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        asunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asuntoActionPerformed(evt);
            }
        });
        asunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                asuntoKeyTyped(evt);
            }
        });
        getContentPane().add(asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 113, 240, 30));

        duracion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        duracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        duracion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        duracion.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                duracionComponentAdded(evt);
            }
        });
        duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionActionPerformed(evt);
            }
        });
        getContentPane().add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 75, 25));

        ampm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));
        ampm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ampm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampmActionPerformed(evt);
            }
        });
        getContentPane().add(ampm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 75, 25));

        horas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        horas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        horas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                horasItemStateChanged(evt);
            }
        });
        horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasActionPerformed(evt);
            }
        });
        getContentPane().add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 75, 25));

        jTextNota.setColumns(20);
        jTextNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextNota.setRows(5);
        jScrollPane3.setViewportView(jTextNota);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 450, -1));

        BotonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(null);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 150, 50));

        botonAtras.setBackground(new java.awt.Color(149, 173, 177));
        botonAtras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        botonAtras.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        botonAtras.setPreferredSize(new java.awt.Dimension(43, 22));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        botonAtras1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAtras1.setText("<");
        botonAtras1.setPreferredSize(new java.awt.Dimension(43, 22));
        botonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        rSDateChooser1.setColorBackground(new java.awt.Color(51, 51, 51));
        rSDateChooser1.setColorButtonHover(new java.awt.Color(0, 0, 0));
        rSDateChooser1.setColorDiaActual(new java.awt.Color(123, 188, 218));
        rSDateChooser1.setColorForeground(new java.awt.Color(0, 0, 0));
        rSDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 280, 30));

        minutos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        minutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 75, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(":");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 20, 40));

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CREAR CITA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 300, 30));

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        fondo.setText("jLabel9");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionActionPerformed

    }//GEN-LAST:event_duracionActionPerformed
    private void horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasActionPerformed

    }//GEN-LAST:event_horasActionPerformed
    private void ampmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampmActionPerformed

    }//GEN-LAST:event_ampmActionPerformed

    private void asuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asuntoActionPerformed

    private void horasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_horasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_horasItemStateChanged

    private void duracionComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_duracionComponentAdded

    }//GEN-LAST:event_duracionComponentAdded
    //Crea una nueva cita segun los datos que ingreso el usuario.
    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if (!(rSDateChooser1.getDatoFecha() == null && asunto.getText().equals("") && jTextNota.getText().equals(""))) {
            if (!verificarCitas(Integer.parseInt((String) horas.getSelectedItem()), Integer.parseInt((String) minutos.getSelectedItem()), (String) ampm.getSelectedItem(), rSDateChooser1.getDatoFecha())) {
                Object[] botones = {"  SI  ", "  NO  "};
                int num = notificacion.notificacionBotones("¿ Quisiera crear una alarma ?", "Crear Alarma", botones, "/Iconos/Interrogacion.png");
                if (num == 0) {
                    Cita nueva = new Cita(asunto.getText(), Integer.parseInt((String) duracion.getSelectedItem()), null);
                    Date fecha = rSDateChooser1.getDatoFecha();
                    String aux = (String) ampm.getSelectedItem();
                    int hora = 0;
                    if (aux.equals("pm")) {
                        hora = (Integer.parseInt((String) horas.getSelectedItem())) + 12;
                    } else {
                        hora = (Integer.parseInt((String) horas.getSelectedItem()));
                    }
                    int minuto = Integer.parseInt((String) minutos.getSelectedItem());
                    Date res = establecerFecha(fecha, hora, minuto);
                    nueva.setIndHoras(horas.getSelectedIndex());
                    nueva.setIndMinutos(minutos.getSelectedIndex());
                    nueva.setIndAmPm(ampm.getSelectedIndex());
                    nueva.setIndDuracion(duracion.getSelectedIndex());
                    nueva.setNota(jTextNota.getText());
                    nueva.setFechaHora(res);
                    citaAuxiliar.setFechaHora(nueva.getHoraFecha());
                    CrearCita padree = this;
                    CrearAlarma alarma = new CrearAlarma(citaAuxiliar, null);
                    alarma.setVisible(true);
                    alarma.addWindowListener(new WindowAdapter() {
                        public void windowClosed(WindowEvent e) {
                            padree.setVisible(true);
                            if (citaAuxiliar.getAlarma() != null) {
                                Calendar fechaA = Calendar.getInstance();
                                fechaA.setTime(nueva.getHoraFecha());
                                fechaA.add(Calendar.MINUTE, citaAuxiliar.getAnticipacion());
                                Alarma alarm = new Alarma();
                                alarm.setCancion(citaAuxiliar.getMusica());
                                alarm.ProgramarAlarma(fechaA.getTime(), nueva.getAsunto());
                                nueva.setAlarma(alarm);
                                nueva.setMusica(citaAuxiliar.getMusica());
                                nueva.setIndiceMus(citaAuxiliar.getIndiceMus());
                                nueva.setAnticipacion(citaAuxiliar.getAnticipacion());
                                nueva.setIndiceMin(citaAuxiliar.getIndiceMin());
                                nueva.setTieneAlarma(true);
                            }
                            alarma.dispose();
                            padree.dispose();
                        }
                    });
                    padree.setVisible(false);
                    agenda.aniadirCita(nueva);
                } else if (num == 1) {
                    String p = (String) duracion.getSelectedItem();
                    int dur = Integer.parseInt(p);
                    Cita nueva = new Cita(asunto.getText(), dur, null);
                    Date fecha = rSDateChooser1.getDatoFecha();
                    String aux = (String) ampm.getSelectedItem();
                    int hora = 0;
                    if (aux.equals("pm")) {
                        hora = (Integer.parseInt((String) horas.getSelectedItem())) + 12;
                    } else {
                        hora = (Integer.parseInt((String) horas.getSelectedItem()));
                    }
                    int minuto = Integer.parseInt((String) minutos.getSelectedItem());
                    Date res = establecerFecha(fecha, hora, minuto);
                    nueva.setFechaHora(res);
                    nueva.setNota(jTextNota.getText());
                    nueva.setIndHoras(horas.getSelectedIndex());
                    nueva.setIndMinutos(minutos.getSelectedIndex());
                    nueva.setIndAmPm(ampm.getSelectedIndex());
                    nueva.setIndDuracion(duracion.getSelectedIndex());
                    agenda.aniadirCita(nueva);
                    this.dispose();
                }
            } else {
                notificacion.NotificacionEscrita("Ya existe", "Ya existe una cita con la hora ingresada", "/Iconos/Negacion.png");
            }
        } else {
            notificacion.NotificacionEscrita("No se puede guardar cita", "Porfavor ingrese los datos.", "/Iconos/Negacion.png");
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed
    //Cierra la ventana de CrearCia
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed
    private void botonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtras1ActionPerformed

    }//GEN-LAST:event_botonAtras1ActionPerformed
    /*
    *Pone restricciones de caracteres ingresantes al jTextField()
     */
    private void asuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asuntoKeyTyped
        char word = evt.getKeyChar();
        if ((word < '0' || word > '9') && (word < 'a' || word > 'z') && (word < 'A' || word > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_asuntoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JComboBox<String> ampm;
    private javax.swing.JTextField asunto;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonAtras1;
    private javax.swing.JComboBox<String> duracion;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea jTextNota;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JLabel panel;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    //metodo auxiliar para fecha que el usuario ingresó
    private Date establecerFecha(Date fecha, int hora, int minutos) {
        int anio = fecha.getYear() + 1900;
        int mes = fecha.getMonth();
        int dia = fecha.getDate();
        Calendar aux = Calendar.getInstance();
        aux.set(anio, mes, dia, hora, minutos, 00);
        return aux.getTime();
    }
    //Verifica si existen horas en la misma hora, si existe, no puede crearse esa cita con la misma hora.
    private boolean verificarCitas(int hora, int minuto, String amPm, Date calendar) {
        boolean res = false;
        for (int i = 0; i < agenda.getListaCitas().tamanio() && !res; i++) {
            Cita citaActual = (Cita) agenda.getListaCitas().acceder(i);
            if (amPm.equals("pm")) {
                if (hora + 12 == citaActual.getHoraFecha().getHours() && minuto == citaActual.getHoraFecha().getMinutes() && (calendar.getDay() == citaActual.getHoraFecha().getDay()) && (calendar.getMonth() == citaActual.getHoraFecha().getMonth()) && (calendar.getYear() == citaActual.getHoraFecha().getYear())) {
                    res = true;
                }
            } else {
                if (hora == citaActual.getHoraFecha().getHours() && minuto == citaActual.getHoraFecha().getMinutes() && (calendar.getDay() == citaActual.getHoraFecha().getDay()) && (calendar.getMonth() == citaActual.getHoraFecha().getMonth()) && (calendar.getYear() == citaActual.getHoraFecha().getYear())) {
                    res = true;
                }
            }
        }
        return res;
    }
}
