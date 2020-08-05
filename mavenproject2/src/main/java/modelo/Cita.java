package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import vista.mostrarCita;
import java.util.*;

public class Cita implements Serializable {

    private Alarma alarma = null;
    private String asunto, nota, musica = "";
    private Date fechaHora = null;
    private int duracion, anticipacion = 0;
    private boolean TieneAlarma = false;
    private int indiceMin, indiceMus, indHoras, indMinutos, indAmPm, indDuracion = 0;

    public Cita(String asunto, int duracion, Alarma alarma) {
        this.alarma = alarma;
        this.asunto = asunto;
        this.duracion = duracion;

    }
    public void Imprimir(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        if(alarma != null){
            System.out.println("La cita : Tiene Alarma");
        }else{
            System.out.println("La cita : No tiene Alarma");
        }
        System.out.println("Asunto de la cita : "+ asunto);
        System.out.println("Nota de la cita : "+ nota);
        System.out.println("Musica de la Alarma de la cita : "+musica);
        if(fechaHora != null){
            System.out.println("Fecha de la Cita : "+sdf.format(fechaHora));
        }else{
            System.out.println("Fecha de la cita : No tiene");
        }
        System.out.println("Duracion de la cita : "+duracion);
        System.out.println("Tiempo de anticipacion de la cita : "+anticipacion);
        System.out.println("Su variable que indica si tiene una alarma : "+TieneAlarma);
        System.out.println("Indices de InterfazAlarma/EditarAlarma : Indice de los minutos "+indiceMin+" Indice de la musica : "+indiceMus);
        System.out.println("Indices de EditarCita : Indice de horas "+indHoras+" Indice de minutos "+indMinutos+" Indice de Am Pm "+indAmPm+" Indice de duracion "+indDuracion);
    }

    public Cita clone() {
        Cita res = new Cita(asunto, duracion,null);
        if(alarma != null){
            res.setAlarma(new Alarma()); 
        }
        res.setNota(nota);
        res.setMusica(musica);
        res.setFechaHora(fechaHora);
        res.setTieneAlarma(TieneAlarma);
        res.setIndiceMin(indiceMin);
        res.setIndiceMus(indiceMus);
        res.setIndHoras(indHoras);
        res.setIndMinutos(indMinutos);
        res.setIndAmPm(indAmPm);
        res.setIndDuracion(indDuracion);
        res.setAnticipacion(anticipacion);
        return res;
    }

    public void setHora(int hora, int minuto) {
        fechaHora.setHours(hora);
        fechaHora.setMinutes(minuto);
    }

    public int getIndiceMin() {
        return indiceMin;
    }

    public int getIndiceMus() {
        return indiceMus;
    }

    public int getIndMinutos() {
        return indMinutos;
    }

    public int getIndHoras() {
        return indHoras;
    }

    public int getIndAmPm() {
        return indAmPm;
    }

    public int getIndDuracion() {
        return indDuracion;
    }

    public void setIndiceMin(int indiceMin) {
        this.indiceMin = indiceMin;
    }

    public void setIndiceMus(int indiceMus) {
        this.indiceMus = indiceMus;
    }

    public void setIndMinutos(int indMinutos) {
        this.indMinutos = indMinutos;
    }

    public void setIndHoras(int indHoras) {
        this.indHoras = indHoras;
    }

    public void setIndAmPm(int indAmPm) {
        this.indAmPm = indAmPm;
    }

    public void setIndDuracion(int indDuracion) {
        this.indDuracion = indDuracion;
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

    /*public String getHora(){
        String res;
        int h= fechaHora.getHours();
        int m= fechaHora.getMinutes();
        if(h>12){
            h=h-12;
            res= ""+h+" : "+m+" pm";
        }else{
            res= ""+h+" : "+m+" am";
        }
        System.out.println(res);
        System.out.println(fechaHora);
        return res;
        
    }*/
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

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void apagarAlarma() {
        alarma.desactivar();
    }

    public void activarAlarma() {
        alarma.activar();
    }

    public boolean getTieneAlarma() {
        return TieneAlarma;
    }

    public void setTieneAlarma(boolean tieneAlarma) {
        this.TieneAlarma = tieneAlarma;
    }

    public int getAnticipacion() {
        return anticipacion;
    }

    public void setAnticipacion(int anticipacion) {
        this.anticipacion = anticipacion;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
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

    /*public String toStringHora() {
        calendario.setTime(fechaHora);
        return "" + calendario.get(calendario.DAY_OF_MONTH) + "/" + calendario.get(calendario.MONTH) + 1 + "/" + calendario.get(calendario.YEAR) + "";
    }*/   
}
