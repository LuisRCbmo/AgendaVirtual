package modelo;

import Notificaciones.Notificacion;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * autor emerson
 *
 */
/**
 * El boolean activo play sirve para controlar los timers. El calendar sirve
 * para trabajar con las fechas. El clip para el sonido. fechaActual es para
 * ejecutar el timer. sounds es una contenedora de musicas a disposicion del
 * usuario asunto, texto que se mostrara al sonar la alarma cancion para
 * reproducir una cancion en especifico sdf Otorga formato a las fechas
 * timer,timerPlay son cronometros tarea,replay son las tareas de los timers.
 */
public class Alarma implements java.io.Serializable {

    private boolean activo, play;
    private Calendar calendar;
    transient private Clip clip;
    private Date fechaActual;
    private String[] sonds = {"TelefonoAntiguo.wav", "TITITI.wav", "Gallo.wav", "AlarmaLoud.wav", "AlarmaDeGuerra.wav", "AlarmaDeCoche.wav"};
    private String asunto;
    private String cancion = "TelefonoAntiguo.wav";
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    transient private Timer timer, timerPlay;
    transient private TimerTask tarea, replay;
    private Notificacion notificacion;

    /**
     * Asigna valores a los atributos y aqui es donde se ejecuta la alarma segun
     * el tiempo dado por el usuario.
     */
    public Alarma() {
        notificacion = new Notificacion();
        Object[] botones = {"APAGAR"};
        calendar = Calendar.getInstance();
        fechaActual = new Date();
        Date comparable = new Date();
        activo = true;
        play = true;

        timer = new Timer();
        timerPlay = new Timer();
        tarea = new TimerTask() {
            @Override
            public void run() {
                if (activo) {
                    activo = false;
                    timerPlay.schedule(replay, 0, establecerRepeticion());
                    int com = notificacion.notificacionBotones(asunto + " A las: " + dateAStringFormat(fechaActual), "¡ Alarma !", botones, "/Iconos/Alarma.jpg");
                    if (com == 0) {
                        play = false;
                        clip.stop();
                        clip.close();
                        timer.cancel();
                    }
                } else {
                    timer.cancel();
                }

            }
        };
        replay = new TimerTask() {
            @Override
            public void run() {
                if (play) {
                    reproducir();
                } else {
                    replay.cancel();
                }

            }
        };
    }

    /**
     * sirve para reproductir una y otra vez las canciones que son muy cortas al
     * momento de sonar la alarma.
     */
    private long establecerRepeticion() {
        long res = 0;
        if (cancion.equals(sonds[0])) {
            res = 5000;
        } else if (cancion.equals(sonds[1])) {
            res = 45000;
        } else if (cancion.equals(sonds[2])) {
            res = 3000;
        } else if (cancion.equals(sonds[3]) || cancion.equals(sonds[5])) {
            res = 29000;
        } else if (cancion.equals(sonds[4])) {
            res = 99000;
        }
        return res;
    }

    /**
     * Cambia que cancion o sonido
     */
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    /**
     * Devuelve la cancion.
     */
    public String getCancion() {
        return cancion;
    }

    /**
     * Reproduce el sonido de la cancion que el usuario seleccionó al momento de
     * ejecutarse la alarma.
     */
    private void reproducir() {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/audios/" + cancion)));
            clip.start();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    /**
     * Devuelve si es que la alarma se encuentra activada o desactivada.
     */
    public boolean getActivo() {
        return activo;
    }

    /**
     * Desactiva la alarma.
     */
    public void desactivar() {
        activo = false;
        System.out.println("Alarma Desactivada");
    }

    /**
     * Activa la alarma.
     */
    public void activar() {
        activo = true;
        System.out.println("Alarma Activada");
    }

    /**
     * Retorna la fecha con la que se ejecutará la alarma
     */
    public Date getFechaActual() {
        return fechaActual;
    }

    /**
     * Aqui controlo que la fecha dada sea mayor a la fecha actual - 60 mimutos
     * . para que se pueda activar. Si es menor, la alarma no sonará.
     */
    public void ProgramarAlarma(Date fechaC, String asunto) {
        this.asunto = asunto;
        fechaActual = fechaC;
        Date aux = new Date();
        if ((fechaC.getTime() - 60000) < aux.getTime()) {
            activo = false;
            System.out.println("Esta alarma no sonara");
        } else if ((fechaC.getTime() - 60000) >= aux.getTime()) {
            timer.schedule(tarea, fechaC);
            System.out.println("Esta alarma si sonara");
        }
    }

    /**
     * Cambia el formato de la fecha (Date a String)
     */
    private String dateAStringFormat(Date t) {
        SimpleDateFormat sdff = new SimpleDateFormat("HH:mm");
        return sdff.format(t);
    }

    /**
     * Cambia el formato de la fecha devolviendo una cadena.
     */
    public String dateAString(Date t) {
        return sdf.format(t);
    }
}
