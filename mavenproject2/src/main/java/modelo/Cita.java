package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
/*
    la variable musica la uso para guardar la musica que el usuario haya escojido al momento de guardar
    fechaHora la uso para la fecha de la cita y activar su alarma si es que tubiera
    anticipacion se usa para activar la alarma una vez el proyecto se cierre y es el tiempo de anticipacion que el usuario haya escojido
    tiene alarma se usa para verificar si al momento de volver a abrir el proyecto esta cita tenia una alarma
    indiceMin, indiceMus, indHoras, indMinutos, indAmPm, indDuracion se usan para que al momento de abrir una ventana de edicion aparezcan los datos en el orden que 
    el usuario haya escojido previamente
*/
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
/*
   clona la cita actual y te manda una nueva con distanta alarma 
*/
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
    /*
    retorna la informacion primordial de la cita
    */
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
    /*
    retorna la fecha de la cita en un formato simple
    */
    public String toStringFechaFormat() {
        Alarma aux = new Alarma();
        return aux.dateAString(fechaHora);
    }
     
}
