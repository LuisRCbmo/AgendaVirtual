/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author hp
 */

    

public class Memo{
    private String asunto;
    private String nota;
    public Memo(String asunto, String nota){
        this.asunto = asunto;
        this.nota = nota;
    }
    
    public void mostrarMemo(){
        System.out.println("Asunto: "+ asunto);
        System.out.println();
        System.out.println("Nota: "+nota);
    }
    
    public void setAsunto(String asunto){
        this.asunto = asunto;
    }
    
    public void setNnota(String nota){
        this.nota = nota;
    }
}




