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
public class NodoDE<T>{
    private NodoDE<T> ant;
    private T dato;
    private NodoDE<T> sig;
    public NodoDE(T d){
        dato=d;
        ant=null;
        sig=null;
    }
    public NodoDE<T> getAnt(){
        return ant;
    }
    public NodoDE<T> getSig(){
        return sig;
    }
    public T getDato(){
        return dato;
    }
    public void setDato(T d){
        dato=d;
    }
    public void setAnt(NodoDE<T> n){
        ant=n;
    }
    public void setSig(NodoDE<T> n){
        sig=n;
    }
}
