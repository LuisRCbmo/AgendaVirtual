package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String celular;
    private String fijo;
    private String correo;
    private String direccion;
    private int id = 0;
    
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
    
    public String toString(){
        return "contacto " + id + " Nombre: " + nombre +" " +apellido;
    }
    
    public void setID(int id){
        this.id = id;
    }
}
