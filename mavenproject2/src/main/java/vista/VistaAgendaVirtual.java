package vista;

import controlador.SerializarProyecto;
import edl.ListaSE;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import modelo.*;
import java.util.*;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import Usuario.User;
import Usuario.Users;
import VisualUsuario.*;
import Notificaciones.Notificacion;
import controlador.Main;
import VisualUsuario.JFrameLoginUser;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author hp
 */
public class VistaAgendaVirtual extends javax.swing.JFrame implements Runnable {

    //Atributos contenedores
    private AgendaVirtual agendaVirtual;
    private User usuario;
    private Users users;
    //otros atributos
    private Calendar calendario;
    private String hora, minuto, segundo, ampm;
    private Thread h1;

    public VistaAgendaVirtual(Users users, User usuario) {
        initComponents();
        this.usuario = usuario;
        this.users = users;
        this.agendaVirtual = usuario.getAgendaVirtual();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        h1 = new Thread((Runnable) this);
        h1.start();
        actualizarCitas();
        agendaVirtual.reactivarAlarmas();
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jlbReloj = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        calendar = new rojeru_san.componentes.RSCalendar();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbReloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 220, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");

        jScrollPane1.setViewportView(Lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 220, 280));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 120, 40));

        calendar.setColorDiaActual(new java.awt.Color(123, 188, 218));
        getContentPane().add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("VerCitas");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar5.setBackground(new java.awt.Color(123, 188, 218));
        jMenuBar5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jMenuBar5.setToolTipText("");
        jMenuBar5.setRequestFocusEnabled(false);

        jMenu16.setBackground(new java.awt.Color(255, 196, 190));
        jMenu16.setText("             Menu                                                                               ");
        jMenu16.setBorderPainted(true);
        jMenu16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuItem6.setText("Perfil");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem6);

        jMenuItem2.setText("Contactos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem2);

        jMenuItem1.setText("Agenda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem1);

        jMenuItem4.setText("Memo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem4);

        jMenuItem3.setText("Cerrar sesion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem3);

        jMenuBar5.add(jMenu16);

        setJMenuBar(jMenuBar5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        vcs vcs = new vcs(agendaVirtual.getContactos());
        vcs.setVisible(true);
        VistaAgendaVirtual padre = this;
        vcs.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VistaAgenda va  = new VistaAgenda(agendaVirtual.getAgenda());
        va.setVisible(true);
        VistaAgendaVirtual padre = this;
        va.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VerMemos vm = new VerMemos(agendaVirtual.getlistamemo());
        vm.setVisible(true);
        VistaAgendaVirtual padre = this;
        vm.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SerializarProyecto serialProyecto = new SerializarProyecto();
        serialProyecto.guardarProyecto(users);
        System.out.println("guardando!!!");
        System.exit(0); //Cierra todo el proceso desde el boton "Salir"
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actualizarCitas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        usuario perfil = new usuario(usuario);
        perfil.setVisible(true);
        VistaAgendaVirtual padre = this;
        perfil.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
            }
        });
        padre.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Notificacion notificacion = new Notificacion();
        Object[] botones = {"  SI  ", "  NO  "};
        int num = notificacion.notificacionBotones("¿Esta seguro de cerrar la sesion actual?", "Cerrar sesion", botones, "/Iconos/Advertencia.png");
        if (num == 0) {
            SerializarProyecto serialProyecto = new SerializarProyecto();
            serialProyecto.guardarProyecto(users);
            new JFrameLoginUser(users).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Lista;
    private rojeru_san.componentes.RSCalendar calendar;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbReloj;
    // End of variables declaration//GEN-END:variables
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

    private ListaSE<Cita> citasDia(ListaSE<Cita> citas) {
        ListaSE<Cita> citasDelDia = new ListaSE();
        Date hoy = new Date();
        for (int i = 0; i < citas.tamanio(); i++) {
            Cita citaActual = citas.acceder(i);
            /**
             * Compara la fecha marcada en el calendario visual, y si hay citas en esa fecha, las guarda y las muestra.
             * El objeto calendario(RSCalendar) no podia retornar la fecha actual del sistema, por lo tanto, se aplicó una Excepcion 
             * que al ingresar, agrega las citas de la fecha actual del sistema y las muestra. 
             */
            try{
                Date aux = calendar.getDatoFecha();
                if (aux.getDay() == citaActual.getHoraFecha().getDay() && aux.getMonth() == citaActual.getHoraFecha().getMonth() && aux.getYear() == citaActual.getHoraFecha().getYear())  {
                    citasDelDia.insertar(citaActual);
                }
                
            } catch (NullPointerException e) {
                if (hoy.getDay() == citaActual.getHoraFecha().getDay() && hoy.getMonth() == citaActual.getHoraFecha().getMonth() && hoy.getYear() == citaActual.getHoraFecha().getYear()) {
                    citasDelDia.insertar(citaActual);
                }
            }
        }
        return citasDelDia;
    }

    private void actualizarCitas() {
        ListaSE<Cita> citas = citasDia(agendaVirtual.getAgenda().getListaCitas());
        DefaultListModel modeloLista = new DefaultListModel();
        for (int i = 0; i < citas.tamanio(); i++) {
            Cita nueva = (Cita) citas.acceder(i);
            modeloLista.addElement(nueva);
        }
        Lista.setModel(modeloLista);
        Lista.updateUI();
    }
}
