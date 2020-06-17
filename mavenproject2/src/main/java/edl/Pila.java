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
public class Pila<T>{
    private NodoSE<T> cima;
    private int tamanio;
    public Pila(){
        cima = null;
        tamanio = 0;
    }
    public Pila(T dato){
        cima = new NodoSE(dato);
        tamanio = 1;
    }
    public boolean vacia(){
        return cima == null;
    }
    public void push(T dato){
        NodoSE<T> aux = new NodoSE<T>(dato);
        aux.setSig(cima);
        cima = aux;
        tamanio++;
    }
    public T pop(){
        tamanio--;
        T res = cima.getDato();
        cima = cima.getSig();
        return res;
    }
    public T peek(){
        return cima.getDato();
    }
    public int getTamanio(){
        return tamanio;
    }
}
