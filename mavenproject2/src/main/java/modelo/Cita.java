package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
/*
    La variable alarma es la que almacena la alarma cuando es creada
    La variable asunto es usasda para almacenar el nombre de asunto que llevara la cita.
    La variable nota almacena un texto en la cita.
    La variable duracion es usada para almacenar el tiempo que durara la cita.
    la variable musica la uso para guardar la musica que el usuario haya escogido al momento de guardar
    fechaHora la uso para la fecha de la cita y activar su alarma si es que tuviera
    anticipacion se usa para activar la alarma una vez el proyecto se cierre y es el tiempo de anticipacion que el usuario haya escojido
    tiene alarma se usa para verificar si al momento de volver a abrir el proyecto esta cita tenia una alarma
    indiceMin, indiceMus, indHoras, indMinutos, indAmPm, indDuracion se usan para que al momento de abrir una ventana de edicion aparezcan los datos en el orden que 
    el usuario haya escogido previamente
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
/*
    Realiza un cambio dentro de la variable fechaHora
*/
    public void setHora(int hora, int minuto) {
        fechaHora.setHours(hora);
        fechaHora.setMinutes(minuto);
    }
/*
    Devuelve la variable indiceMin
*/
    public int getIndiceMin() {
        return indiceMin;
    }
/*
    Devuelve el indiceMus
*/
    public int getIndiceMus() {
        return indiceMus;
    }
/*
    Devuelve la variable indMinutos
*/
    public int getIndMinutos() {
        return indMinutos;
    }
/*
    Devuelve la variable indHoras
*/
    public int getIndHoras() {
        return indHoras;
    }
/*
    Devuelve la variable indAmPm
*/
    public int getIndAmPm() {
        return indAmPm;
    }
/*
    Devuelve la variable indDuracion
*/
    public int getIndDuracion() {
        return indDuracion;
    }
/*
    Realiza un set sobre la variable indiceMin
*/
    public void setIndiceMin(int indiceMin) {
        this.indiceMin = indiceMin;
    }
/*
    Realiza un set sobre la variable indiceMus
*/
    public void setIndiceMus(int indiceMus) {
        this.indiceMus = indiceMus;
    }
/*
    Realiza un set sobre la variable indMinutos
*/
    public void setIndMinutos(int indMinutos) {
        this.indMinutos = indMinutos;
    }
/*
    Realiza un set sobre la variable indHoras
*/
    public void setIndHoras(int indHoras) {
        this.indHoras = indHoras;
    }
/*
    Realiza un set sobre la variable indAmPm
*/
    public void setIndAmPm(int indAmPm) {
        this.indAmPm = indAmPm;
    }
/*
    Realiza un set sobre la variable indDuracion
*/
    public void setIndDuracion(int indDuracion) {
        this.indDuracion = indDuracion;
    }
/*
    Realiza un set sobre la variable duracion
*/
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
/*
    Devuelve la variable duracion
*/
    public int getDuracion() {
        return duracion;
    }
/*
    Realiza un set sobre la variable fechaHora
*/
    public void setFechaHora(Date fecha) {
        fechaHora = fecha;
    }
/*
    Devuelve la variable fechaHora
*/
    public Date getHoraFecha() {
        return fechaHora;
    }
/*
    Realiza un set sobre la variable asunto
*/
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
/*
    Devuelva la variable de asunto 
*/
    public String getAsunto() {
        return asunto;
    }
/*
    Realiza un set sobre la variable nota
*/
    public void setNota(String nota) {
        this.nota = nota;
    }
/*
    Devuelve la variable de nota
*/
    public String getNota() {
        return nota;
    }
/*
    Realiza un set sobre la variable alarma
*/
    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
/*
    Devuelve la variable de alarma
*/
    public Alarma getAlarma() {
        return alarma;
    }
/*
    Delega la tarea de desactivar a la variable de alarma
*/
    public void apagarAlarma() {
        alarma.desactivar();
    }
/*
    Delega la tarea de activar a la variable de alarma
*/
    public void activarAlarma() {
        alarma.activar();
    }
/*
    Devuelve la variable de TieneAlarma
*/
    public boolean getTieneAlarma() {
        return TieneAlarma;
    }
/*
    Realiza un set sobre la variable TieneAlarma
*/
    public void setTieneAlarma(boolean tieneAlarma) {
        this.TieneAlarma = tieneAlarma;
    }
/*
    Devuelve la variable de anticipacion
*/
    public int getAnticipacion() {
        return anticipacion;
    }
/*
    Realiza un set sobre la variable anticipacion
*/
    public void setAnticipacion(int anticipacion) {
        this.anticipacion = anticipacion;
    }
/*
    Devuelve la variable de musica
*/
    public String getMusica() {
        return musica;
    }
/*
    Realiza un set sobre la variable musica
*/
    public void setMusica(String musica) {
        this.musica = musica;
    }
/*
    Realiza un String el cual contiene los datos de asunto, fecha y duracion de la cita
*/
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
/*
    La parte de fecha que se encuentra dentro de un Date lo convierte a un String
*/
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
