package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Alarma {

    private Date fechaActual;
    private Timer timer;
    private TimerTask tarea;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private String asunto;
    private String [] botones ={"Apagar Alarma","Posponer"};
    public Alarma() {
        fechaActual = new Date();
        timer = new Timer();
        tarea = new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, asunto+" A las : "+dateAString(fechaActual));
                desactivarAlarma();
                int com = JOptionPane.showOptionDialog(null,"Apagar Alarma","Alarma",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones, botones[0]);
                if(com == 0){
                    desactivarAlarma();
                }else{                   
                    desactivarAlarma();
                    ProgramarAlarma(SumarDiez(fechaActual),asunto);
                    
                }
            }
        };
    }
    private Date SumarDiez(Date t){
        String aux = dateAString(t);
        int min = Integer.parseInt(" "+aux.charAt(14)+aux.charAt(15));
        min = min + 10;
        t.setMinutes(min);
        return t;
    }
    public Date getFechaActual() {
        return fechaActual;
    }
    public void ProgramarAlarma(Date t, String asunto) {
        this.asunto = asunto;
        fechaActual = t;
        timer.schedule(tarea, t);
    }
    public void desactivarAlarma() {
        timer.cancel();
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
    public String obtenerFechaActual() {
        Date FA = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        return SDF.format(FA);
    }
    public boolean equals(Object o) {
        Alarma am = (Alarma) o;
        return fechaActual.getTime() == am.getFechaActual().getTime();
    }
}
