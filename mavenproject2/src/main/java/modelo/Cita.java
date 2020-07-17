
package modelo;
import java.io.Serializable;
import vista.mostrarCita;
import java.util.*;
public class Cita implements Serializable{
    private Alarma alarma;
    private String asunto;
    private String nota;
    private Date fechaHora;
    private int duracion;
    private boolean alarm;
    Calendar calendario;
    public Cita(String asunto, int duracion, Alarma alarma){        
        alarm = alarma.getActivo();
        this.asunto=asunto;
        this.duracion=duracion;
    }
    
    public Cita(String asunto, int duracion){

        this.asunto=asunto;
        this.duracion=duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    public void setFechaHora(Date fecha) {
       fechaHora=fecha;
    }
    
    public Date getHoraFecha(){
        return fechaHora;
    }
    
    public void setAsunto(String asunto){
        this.asunto=asunto;
    }
    
     public String getAsunto(){
        return asunto;
    }
   
    
    public void setNota(String nota){
    this.nota=nota;
    }
    
    public String getNota(){
        return nota;
    }
    
    public void apagarAlarma(){
        alarma.desactivar();
    }
    
    public String toString(){
        String fechita=this.toStringFecha();
    return "Asunto: "+asunto+" fecha: "+fechita+" Duracion: "+duracion+"";
    }
    
   
    public String toString(int numero){
        return ""+numero+"";            
    }
    public String toStringFecha(){
        int anio=fechaHora.getYear()+1900;
        int mes=fechaHora.getMonth()+1;
        return ""+fechaHora.getDate()+"/"+mes+"/"+anio+"";       
    }
    public String toStringHora(){
       calendario.setTime(fechaHora);
        return ""+calendario.get(calendario.DAY_OF_MONTH)+"/"+calendario.get(calendario.MONTH)+1+"/"+calendario.get(calendario.YEAR)+"";
    }    
    
   /* public void muestra(){
    mostrarCita muestra= new mostrarCita(this);
    if(asunto!=null){
    muestra.setAsunto(asunto);
    }
    if(nota!=null){
    muestra.setNota(nota);
    }
    if(duracion!=0){
    muestra.setDuracion(""+duracion+"");
    }
   if(fechaHora!=null){
    calendario.setTime(fechaHora);
    muestra.setFecha(""+calendario.get(Calendar.DAY_OF_MONTH)+"/"+calendario.get(Calendar.MONTH)+1+"/"+calendario.get(Calendar.YEAR)+"");
    calendario.setTime(fechaHora);
    muestra.setHora(""+calendario.get(Calendar.HOUR)+":"+calendario.get(Calendar.MINUTE)+"");
    }
    
    if(alarm){
        
    }
    muestra.setVisible(true);

    }


    //public int  compareTo(Cita otra){
      //<  return fechaHora.compareTo(otra.fechaHora);
    //}*/



}

