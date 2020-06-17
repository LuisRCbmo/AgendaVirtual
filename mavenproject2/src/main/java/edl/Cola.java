/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edl;

/**
 *
 * @author luis
 */
public class Cola<T>{
    private NodoSE<T> frente;
    private NodoSE<T> fin;
    public Cola(){
        frente=fin=null;
    }
    public boolean vacia(){
        return frente==null;
    }
    public void encolar(T dato){
        NodoSE<T> p = new NodoSE<T>(dato);
        if(vacia()){
            frente=fin=p;
        }else{
            fin.setSig(p);
            fin=p;
        }
    }
    public T  decolar(){
        T dato;
        if(vacia()){
            dato=null;
        }else{
            dato=frente.getDato();
            frente=frente.getSig();
            if(frente==null){
                fin=null;
            }
        }
        return dato;
    }
    public T ver(){
        T dato=null;
        if(!vacia()){
            dato=frente.getDato();
        }
        return dato;
    }
    public int tamanio(){
        int tam = 0;
        NodoSE<T> aux = frente;
        while(aux != null){
            tam++;
            aux = aux.getSig();
        }
        return tam;
    }
}
