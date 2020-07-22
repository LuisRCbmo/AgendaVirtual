/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edl;
import java.io.Serializable;
/**
 *
 * @author luis
 */
public class ColaPrioridad<T extends Comparable<T>> implements Serializable{
    private NodoSE<T> frente;
    private NodoSE<T> fin;
    public ColaPrioridad(){
        frente=fin=null;
    }
    public boolean vacia(){
        return frente==null;
    }
    public void encolar(T dato){
        NodoSE<T> p = new NodoSE(dato);
        if(vacia()){
            frente=fin=p;
        }else{
            if(frente.getDato().compareTo(dato)>0){//<
                NodoSE<T> aux= new NodoSE(frente.getDato());
                aux.setSig(frente.getSig());
                frente.setSig(aux);
                frente.setDato(dato);
                if(aux.getSig() == null)
                    fin = aux;
            }else{
                encolar(frente.getSig(),dato);
            }
        }
    }
    private void encolar(NodoSE<T> actual, T dato){
        NodoSE<T> p = new NodoSE(dato);
        if(actual!=null){
            if(actual.getDato().compareTo(dato)>0){//<
                NodoSE<T> aux= new NodoSE(actual.getDato());
                aux.setSig(actual.getSig());
                actual.setSig(aux);
                actual.setDato(dato);
                if(actual == fin){
                    fin = actual.getSig();
                }
            }else{
                encolar(actual.getSig(),dato);
            }
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
}
