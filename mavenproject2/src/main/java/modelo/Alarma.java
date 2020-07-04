
package AlarmaMusica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Alarma {

    private Date fechaActual;
    private Timer timer;
    private Timer timerPlay;
    private TimerTask tarea;
    private TimerTask replay;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private String asunto;
    private boolean cancel;
    private String [] botones ={"Apagar Alarma","Posponer"};
    private String[] sonds = {"TelefonoAntiguo.wav","TITITI.wav","Gallo.wav","AlarmaLoud.wav","AlarmaDeGuerra.wav","AlarmaDeCoche.wav"};
    private Calendar calendar;
    private Clip clip;
    private String cancion = "TelefonoAntiguo.wav";
    private boolean play;
    public Alarma() {
        
        calendar = Calendar.getInstance();
        fechaActual = new Date();
        cancel = true;
        play = true;
        timer = new Timer();
        timerPlay = new Timer();
        tarea = new TimerTask() {
            @Override
            public void run() {
                if(cancel){
                    timerPlay.schedule(replay,0,establecerRepeticion());                   
                    JOptionPane.showMessageDialog(null, asunto+" A las: "+dateAStringFormat(fechaActual));                                       
                    int com = JOptionPane.showOptionDialog(null,"Apagar Alarma","Alarma",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones, botones[0]);                    
                    if(com == 0){
                        play = false;
                        clip.stop();
                        timer.cancel();
                        
                    }else{                                                         
                        play = false;
                        clip.stop();
                        Posponer(fechaActual);
                        timer.cancel();
                    }
                }else{
                   timer.cancel(); 
                }
                
            }
        };       
        replay = new TimerTask() {
            @Override
            public void run() {
                if(play){
                    reproducir();
                }else{
                    replay.cancel();
                }
                
            }
        };
    }
    public long establecerRepeticion(){
        long res = 0;
        if(cancion.equals(sonds[0])){
            res = 5000;
        }else if(cancion.equals(sonds[1])){
            res = 45000;
        }else if(cancion.equals(sonds[2])){
            res = 3000;
        }else if(cancion.equals(sonds[3])|| cancion.equals(sonds[5])){
            res = 29000;
        }else if(cancion.equals(sonds[4])){
            res = 99000;
        }
        return res;
    }
    public void setCancion(String cancion){
        this.cancion = cancion;
    } 
    public void reproducir(){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/audios/"+cancion)));
            clip.start();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    } 
    private void Posponer(Date t){
        calendar.setTime(t);
        calendar.add(Calendar.MINUTE, 10);
        fechaActual = calendar.getTime();
        Alarma am = new Alarma();
        am.setCancion(cancion);
        am.ProgramarAlarma(calendar.getTime(), asunto);
        
    }
            
    public void desativar(){
        cancel = false;
    }
     public void activar(){
        cancel = true;
    }
    
    public Date getFechaActual() {
        return fechaActual;
    }

    public void ProgramarAlarma(Date t, String asunto) {
        this.asunto = asunto;
        Date aux = new Date();
        if(t.getTime()<aux.getTime()){
            calendar.setTime(t);
            calendar.add(Calendar.DATE,1);
            fechaActual = calendar.getTime();
            timer.schedule(tarea,calendar.getTime());
        }else{
            fechaActual = t;
            timer.schedule(tarea, t);
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
