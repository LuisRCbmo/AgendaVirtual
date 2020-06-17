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
public class ListaCSE<T> implements Lista<T>{
     NodoSE<T> ini, fin;
    public ListaCSE(){
        ini = null;
        fin = null;
    }
    public boolean vacia(){
        return ini == null;
    }
    public void insertar(T dato){
        NodoSE<T> nuevo = new NodoSE(dato);
        if(vacia()){
            ini = nuevo;
            fin = nuevo;
            fin.setSig(ini);
        }else{
            fin.setSig(nuevo); //conectamos el ultimo nodo
                               //con el nuevo nodo
            fin = nuevo;       //ahora el ultimo nodo sera
                               //el que acabamos de agregar
            fin.setSig(ini);   //conectamos el ultimo nodo
                               //con el primero
        }
    }
    public int tamanio(){
        int cant = 0;
        if(!vacia()){
            NodoSE<T> aux = ini;
            do{
                cant++;
                aux = aux.getSig();
            }while(aux != ini);
        }
        return cant;
    }
    public void insertar(int pos, T dato){
        if(pos >= 0 && pos <= tamanio()){
            NodoSE<T> nuevo = new NodoSE(dato);
            if(pos == 0){
                nuevo.setSig(ini);
                ini = nuevo;
                if(fin == null) //caso en el que la lista haya estado vacia
                    fin = nuevo;
                fin.setSig(ini);
            }else if(pos == tamanio()){
                fin.setSig(nuevo);
                fin = nuevo;
                fin.setSig(ini);
            }else{
                NodoSE<T> ant = null;
                NodoSE<T> act = ini;
                while(pos-- > 0){
                    ant = act;
                    act = act.getSig();
                }
                ant.setSig(nuevo);
                nuevo.setSig(act);
            }
        }
    }
    public T eliminar(int pos){
        T res = null;
        NodoSE<T> aux;
        if(pos >= 0 && pos < tamanio()){
            if(pos == 0){
                res = ini.getDato();
                aux = ini.getSig(); //guardamos el nodo siguiente
                                    //que sera el nuevo inicio
                ini.setSig(null);   //rompemos el enlace para desconectar
                                    //el nodo de la lista
                ini = aux;          //fijamos el nuevo inicio de la lista
            }else if(pos == tamanio()-1){
                res = fin.getDato();
                aux = ini;
                while(aux.getSig() != fin){
                    //mientras no hayamos llegado al nodo
                    //anterio a fin, seguimos avanzando
                    aux = aux.getSig();
                }
                //al terminar el ciclo, aux contiene
                //el nodo anterior a fin
                fin.setSig(null);   //rompemos el enlace al 1er nodo
                aux.setSig(ini);    //aux se conecta con el inicio
                fin = aux;          //aux se vuelve el ultimo nodo
            }else{
                aux = ini;
                NodoSE<T> ant = null;
                NodoSE<T> sig = aux.getSig();
                while(pos-- > 0){
                    //ciclo con el que avanzamos hasta la posicion
                    //actualizando los valores de ant, aux y sig
                    ant = aux;
                    aux = sig;
                    sig = sig.getSig();
                }
                aux.setSig(null);   //rompemos el enlace
                ant.setSig(sig);    //conectamos el resto de la lista
                res = aux.getDato();
            }
        }
        return res;
    }
    public T acceder(int pos){
        T res = null;
        if(pos >= 0 && pos < tamanio()){
            NodoSE<T> aux = ini;
            while(pos-- > 0){
                aux = aux.getSig();
            }
            res = aux.getDato();
        }
        return res;
    }
    public void intercambiar(int p1, int p2){}
    public void reemplazar(int pos, T dato){}    
}
