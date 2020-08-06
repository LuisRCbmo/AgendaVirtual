package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
/**
 *
 * @author luis
 */
public class Contacto implements Serializable{
    private String nombre;
    private String apellido;
    private String celular;
    private String fijo;
    private String correo;
    private String direccion;
    /*Constructor de la clase objeto, requiere de 6 parametros de tipo string*/
    public Contacto(String nombre, String apellido, String celular, String fijo, String correo, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fijo = fijo;
        this.correo = correo;
        this.direccion = direccion;
    }
    /*metodo para regresar el dato alojado en la variable nombre*/
    public String getNombre(){
        return nombre;
    }
    /*metodo para regresar el dato alojado en la variable aoellido*/
    public String getApellido(){
        return apellido;
    }
    /*metodo para regresar el dato alojado en la variable celular*/
    public String getCelular(){
        return celular;
    }
    /*metodo para regresar el dato alojado en la variable fijo*/
    public String getFijo(){
        return fijo;
    }
    /*metodo para regresar el dato alojado en la variable correo*/
    public String getCorreo(){
        return correo;
    }
    /*metodo para regresar el dato alojado en la variable direccion*/
    public String getDireccion(){
        return direccion;
    }
    /*metodo para sobreescribir el dato alojado en la variable nombre usando un dato de entrada*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*metodo para sobreescribir el dato alojado en la variable apellido usando un dato de entrada*/
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /*metodo para sobreescribir el dato alojado en la variable celular usando un dato de entrada*/
    public void setCelular(String celular) {
        this.celular = celular;
    }
    /*metodo para sobreescribir el dato alojado en la variable fijo usando un dato de entrada*/
    public void setFijo(String fijo) {
        this.fijo = fijo;
    }
    /*metodo para sobreescribir el dato alojado en la variable correo usando un dato de entrada*/
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /*metodo para sobreescribir el dato alojado en la variable direccion usando un dato de entrada*/
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /*metodo para regresar 1 o mas datos del objeto en forma de string*/
    public String toString(){
        return " Contacto: " + nombre +" " +apellido;
    }
}
