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
public class ListaDE<T> implements Lista<T>{
    private NodoDE<T> ini;
    public ListaDE(){
        ini = null;
    }
    public ListaDE(T dato){
        ini = new NodoDE(dato);
    }
    public boolean vacia(){
        return ini == null;
    }
    public void insertar(T dato){
        if(vacia()){
            ini = new NodoDE(dato);
        }else{
            NodoDE<T> ult = ini;
            NodoDE<T> nuevo = new NodoDE(dato);
            while(ult.getSig() != null){
                ult = ult.getSig();
            }
            ult.setSig(nuevo);
            nuevo.setAnt(ult);
        }
    }
    public T eliminar(int pos){
        T res;
        if(vacia() || pos >= tamanio())
            res = null;
        else{
            NodoDE<T> aux = ini;
            while(pos-- > 0)
                aux = aux.getSig();
                
            NodoDE<T> ant = aux.getAnt();
            NodoDE<T> sig = aux.getSig();
            if(ant != null)
                ant.setSig(sig);
            if(sig != null)
                sig.setAnt(ant);
            if(aux == ini)
                ini = sig;
            aux.setAnt(null);
            aux.setSig(null);
            res = aux.getDato();
        }
        return res;
    }
    public T acceder(int pos){
        T res;
        if(vacia() || pos >= tamanio())
            res = null;
        else{
            NodoDE<T> nodo = ini;
            while(pos > 0){
                pos--;
                nodo = nodo.getSig();
            }
            res = nodo.getDato();
        }
        return res;
    }
    public int tamanio(){
        int tam = 0;
        NodoDE<T> aux = ini;
        while(aux != null){
            tam++;
            aux = aux.getSig();
        }
        return tam;
    }
    public void reemplazar(int pos, T dato){
        if(!vacia() && pos < tamanio()){
            NodoDE<T> nodo = ini;
            while(pos > 0){
                pos--;
                nodo = nodo.getSig();
            }
            nodo.setDato(dato);
        }
    }
    public void insertar(int pos, T dato){
        if(!vacia()&& pos >= 0)
            if(pos < tamanio()){
                NodoDE<T> nuevo = new NodoDE(dato);
                NodoDE<T> nodo = ini;
                while(pos > 0){
                    nodo = nodo.getSig();
                    pos--;
                }
                NodoDE<T> ant = nodo.getAnt();
                if(ant != null){
                    ant.setSig(nuevo);
                    nuevo.setAnt(ant);
                }else
                    ini = nuevo;
                    nuevo.setSig(nodo);
                    nodo.setAnt(nuevo);
            }else
                insertar(dato);
    }
    public void intercambiar(int pos1, int pos2){
        if(pos1 < tamanio() && pos2 < tamanio()){
            T dato1 = acceder(pos1);
            T dato2 = acceder(pos2);
            reemplazar(pos1, dato2);
            reemplazar(pos2, dato1);
        }
    }
    
    public void cancion(int pos){
        if(pos < this.tamanio()){
            NodoDE<T> aux = ini;
            int i = 0;
            while(i != pos){
                aux = aux.getSig();
                i++;
            }
            while(aux.getAnt() != null){
                System.out.println();
                System.out.print("la " + aux.getDato() + " a la " + aux.getAnt().getDato());
                aux = aux.getAnt();
            }
            if(pos > 0)
                System.out.println(",");
            System.out.println("la " + this.ini.getDato() + " que estaba sentada cantando debajo del agua, agua;");
            aux = ini;
            i = 0;
            while(i < pos){
                aux = aux.getSig();
                i++;
            }
            System.out.print("cuando la " + aux.getDato() + " salio");
            if(aux.getSig() != null){
                System.out.println(" a cantar vino la " + aux.getSig().getDato() + " y la hizo callar");
                aux = aux.getSig();
            }else
                System.out.println(" ni el mismo diablo la hizo callar");
        }
    }
}
