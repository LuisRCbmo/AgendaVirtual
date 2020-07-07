/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import vista.mostrarCita;
import java.util.*;
public class Cita{
    private Alarma alarma;
    private String asunto;
    private String nota;
    private Date fechaHora;
    private int duracion;
    private boolean alarm;
    Calendar calendario;
    public Cita(String asunto, int duracion, boolean alarmar){
        if(alarmar){
            alarma= new Alarma();
        }
        alarm= alarmar;
        this.asunto=asunto;
        this.duracion=duracion;
    }
    //Aca nos falta un costructor con parametro de tipo Alarma :'v (para que pueda crear una cita ya incorporado con una alarma)
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
    
     public void setHora(Date horaFecha){
        fechaHora=horaFecha;
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
    //podrias hacermelo un toString() sin parametros porfavor? :3 Es para que se muestre en la lista de Agenda como se vera el contacto :c 
    public String toString(int numero){
        return ""+numero+"";
            
    }
    
    public void muestra(){
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
    System.out.println(muestra.getComponentAt(duracion, duracion));
    }
}

