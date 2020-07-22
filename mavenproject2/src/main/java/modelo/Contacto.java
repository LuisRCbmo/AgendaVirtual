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
    
    public Contacto(String nombre, String apellido, String celular, String fijo, String correo, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fijo = fijo;
        this.correo = correo;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getCelular(){
        return celular;
    }
    
    public String getFijo(){
        return fijo;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getDireccion(){
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString(){
        return " Contacto: " + nombre +" " +apellido;
    }
}
