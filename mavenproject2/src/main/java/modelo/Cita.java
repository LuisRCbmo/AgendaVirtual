package modelo;

import java.io.Serializable;
import vista.mostrarCita;
import java.util.*;

public class Cita implements Serializable {

    private Alarma alarma;
    private String asunto;
    private String nota;
    private Date fechaHora;
    private int duracion;
    private boolean alarm;
    Calendar calendario;
    private int indiceMin = 0;
    private int indiceMus = 0;

    public Cita(String asunto, int duracion, Alarma alarma) {
        this.alarma = alarma;
        //alarm = alarma.getActivo();
        this.asunto = asunto;
        this.duracion = duracion;
    }
    public void setHora(int hora,int minuto){
        fechaHora.setHours(hora); 
        fechaHora.setMinutes(minuto); 
    }
    public int getIndiceMin(){
        return indiceMin;
    }
    public int getIndiceMus(){
        return indiceMus;
    }
    public void setIndiceMin(int indiceMin){
        this.indiceMin = indiceMin;
    }
    public void setIndiceMus(int indiceMus){
        this.indiceMus = indiceMus;
    }
    public Cita(String asunto, int duracion) {
        this.asunto = asunto;
        this.duracion = duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setFechaHora(Date fecha) {
        fechaHora = fecha;
    }

    public Date getHoraFecha() {
        return fechaHora;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }
    
    public void setAlarma(Alarma alarma){
        this.alarma = alarma;
    }
    
    public Alarma getAlarma(){
        return alarma;
    }

    public void apagarAlarma(){
        alarma.desactivar();
    }

    public String toString() {
        String fechita = this.toStringFecha();
        return "Asunto: " + asunto + " fecha: " + fechita + " Duracion: " + duracion + "";
    }
    public String toStringFormat() {
        String fechita = this.toStringFechaFormat();
        return "Asunto: " + asunto + " fecha: " + fechita + " Duracion: " + duracion + "";
    }

    public String toString(int numero) {
        return "" + numero + "";
    }

    public String toStringFecha() {
        int anio = fechaHora.getYear() + 1900;
        int mes = fechaHora.getMonth() + 1;
        return "" + fechaHora.getDate() + "/" + mes + "/" + anio + "";
    }
    public String toStringFechaFormat() {
        Alarma aux = new Alarma();
        return aux.dateAString(fechaHora);
    }
 
    public String toStringHora() {
        calendario.setTime(fechaHora);
        return "" + calendario.get(calendario.DAY_OF_MONTH) + "/" + calendario.get(calendario.MONTH) + 1 + "/" + calendario.get(calendario.YEAR) + "";
    }
}
