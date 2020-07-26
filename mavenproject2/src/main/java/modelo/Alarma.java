package modelo;

import Notificaciones.Notificacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/*
    autor emerson
*/

public class Alarma implements java.io.Serializable {

    private boolean activo, play;
    private Calendar calendar;
    private Clip clip;
    private Date fechaActual;
    private String[] sonds = {"TelefonoAntiguo.wav", "TITITI.wav", "Gallo.wav", "AlarmaLoud.wav", "AlarmaDeGuerra.wav", "AlarmaDeCoche.wav"};
    private String asunto;
    private String cancion = "TelefonoAntiguo.wav";
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    transient private Timer timer, timerPlay; //transient hace que no se guarde esta clase.
    transient private TimerTask tarea, replay; //transient hace que no se guarde esta clase.
    private Notificacion notificacion;

    public Alarma() {
        notificacion = new Notificacion();
        Object[] botones = {"APAGAR", "POSPONER"};
        calendar = Calendar.getInstance();
        fechaActual = new Date();
        activo = true;
        play = true;
        timer = new Timer();
        timerPlay = new Timer();
        tarea = new TimerTask() {
            @Override
            public void run() {
                if (activo) {
                    timerPlay.schedule(replay, 0, establecerRepeticion());
                    notificacion.NotificacionEscrita("¡ Alarma !",asunto + " A las: " + dateAStringFormat(fechaActual), "/Iconos/Alarma.jpg");
                    int com = notificacion.notificacionBotones("¿Que hacer con la alarma?", "Alarma", botones, "/Iconos/Interrogacion.png");
                    if (com == 0) {
                        play = false;
                        clip.stop();
                        timer.cancel();

                    } else {
                        play = false;
                        clip.stop();
                        Posponer(fechaActual);
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

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    public String getCancion(){
        return cancion;
    }
    private void reproducir() {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/audios/" + cancion)));
            clip.start();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    private void Posponer(Date t) {
        calendar.setTime(t);
        calendar.add(Calendar.MINUTE, 10);
        fechaActual = calendar.getTime();
        Alarma am = new Alarma();
        am.setCancion(cancion);
        am.ProgramarAlarma(calendar.getTime(), asunto);
    }

    public boolean getActivo() {
        return activo;
    }

    public void desactivar() {
        activo = false;
        System.out.println("Alarma Desactivada");
    }

    public void activar() {
        activo = true;
        System.out.println("Alarma Activada");
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void ProgramarAlarma(Date t, String asunto) {
        this.asunto = asunto;
        Date aux = new Date();
        if ((t.getTime()-60000) < aux.getTime()) {
            System.out.println("Esta alarma no sonara");
        } else if ((t.getTime()-60000) >= aux.getTime()){           
            fechaActual = t;
            timer.schedule(tarea, t);
            System.out.println("Esta alarma si sonara");
        }
    }

    private String dateAStringFormat(Date t) {
        SimpleDateFormat sdff = new SimpleDateFormat("HH:mm");
        return sdff.format(t);
    }

    public String dateAString(Date t) {
        return sdf.format(t);
    }

    public Date stringADate(String fechaCadena) {
        Date fecha = null;
        try {
            fecha = sdf.parse(fechaCadena);
        } catch (ParseException e) {
            System.out.println("error en la conversion");
        }
        return fecha;
    }

    public boolean equals(Object o) {
        Alarma am = (Alarma) o;
        return fechaActual.getTime() == am.getFechaActual().getTime();
    }
}
