/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import vista.mostrarCita;
import java.time.LocalDate;
import java.time.LocalTime;
public class Cita{
    private Alarma alarma;
    private String asunto;
    private String nota;
    private LocalDate fecha;
    private LocalTime hora;
    private int duracion;
    private boolean alarm;
    
    public Cita(String asunto, int duracion, boolean alarmar){
        if(alarmar){
            alarma= new Alarma();
        }
        alarm= alarmar;
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
    
     public void setHora(LocalTime hora){
        this.hora=hora;
    }
    
    public LocalTime getHora(){
        return hora;
    }
    
    public void setAsunto(String asunto){
        this.asunto=asunto;
    }
    
     public String getAsunto(){
        return asunto;
    }
    
    public void setFecha(LocalDate fecha){//Date
        this.fecha=fecha;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    
    public void setNota(String nota){
    this.nota=nota;
    }
    
    public String getNota(){
        return nota;
    }
    
    public void apagarAlarma(){
        alarma.desactivarAlarma();
    }
    public String toString(){
    return "Asunto: " + asunto +" "+ "Nota:" + nota+" "+"Duracion:"+duracion;
            
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
    if(fecha!=null){
    muestra.setFecha(""+fecha.getDayOfMonth()+"/"+fecha.getMonth()+"/"+fecha.getYear()+"");
    }
    if(hora!=null){
    muestra.setHora(""+ hora.getHour()+":"+hora.getMinute()+"");
    }
    if(alarm){
        
    }
    muestra.setVisible(true);
    System.out.println(muestra.getComponentAt(duracion, duracion));
    }
}

