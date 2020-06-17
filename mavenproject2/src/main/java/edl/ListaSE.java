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
public class ListaSE<T> implements Lista<T>{
    private NodoSE<T> ini;
    public ListaSE(){
        ini = null;
    }
    public NodoSE getIni(){
        return ini;
    }
    
    public ListaSE(T dato){
        ini = new NodoSE(dato);
    }
    public boolean vacia(){
        return ini == null;
    }
    public String toString(){
        String res = "";
        NodoSE<T> aux = ini;
        if(vacia())
            res = "[]";
        while(aux != null){
            res += "[" + aux.getDato().toString() + "]->";
            aux = aux.getSig();
        }
        return res;
    }
    public void insertar(T dato){
        if(vacia()){
            ini = new NodoSE(dato);
        }else{
            NodoSE<T> aux = ini;
            while(aux.getSig() != null){
                aux = aux.getSig();
            }
            aux.setSig(new NodoSE(dato));
        }
    }
    public void insertar(int pos, T dato){
        if(pos == tamanio()){
            insertar(dato);
        }else if(pos == 0){
            NodoSE<T> nuevo = new NodoSE(dato);
            nuevo.setSig(ini);
            ini = nuevo;
        }else if(pos < tamanio()){
            NodoSE<T> ant = null;
            NodoSE<T> act = ini;
            while(pos-- > 0){
                ant = act;
                act = act.getSig();
            }
            NodoSE<T> nuevo = new NodoSE();
            nuevo.setDato(dato);
            if(ant != null)
                ant.setSig(nuevo);
            if(act == ini)
                ini = nuevo;
            nuevo.setSig(act);
        }
    }
    public T eliminar(int pos){
        T res = null;
        if(pos >= 0 && pos < tamanio()){
            NodoSE<T> ant = null;
            NodoSE<T> act = ini;
            NodoSE<T> sig = ini.getSig();
            while(pos-- > 0){
                ant = act;
                act = sig;
                sig = sig.getSig();
            }
            if(ant != null)
                ant.setSig(sig);
            if(act == ini)
                ini = sig;
            act.setSig(null);
            res = act.getDato();
        }
        return res;
    }
    public T acceder(int pos){
        T res = null;
        if(pos >= 0 && pos < tamanio()){
            NodoSE<T> aux = ini;
            while(pos-- > 0)
                aux = aux.getSig();
            res = aux.getDato();
        }
        return res;
    }
    public boolean contiene(T dato){
        boolean encontro = false;
        NodoSE<T> aux = ini;
        while(aux != null && encontro == false){
            if(aux.getDato().equals(dato))
                encontro = true;
            aux = aux.getSig();
        }
        return encontro;
    }
    public int indexOf(T o){
        int pos = -1;
        boolean encontro = false;
        NodoSE<T> aux = ini;
        while(aux != null && encontro == false){
            pos++;
            if(aux.getDato().equals(o)){
                encontro = true;
            }
            aux = aux.getSig();
        }
        if(encontro == false)
            pos = -1;
        return pos;
    }
    public int tamanio(){
        int tam = 0;
        NodoSE<T> aux = ini;
        while(aux != null){
            tam++;
            aux = aux.getSig();
        }
        return tam;
    }
    public ListaSE<T> clone(){
        ListaSE<T> res = new ListaSE();
        /*NodoSE<T> aux = ini;
        while(aux != null){
            res.insertar(aux.getDato());
            aux = aux.getSig();
        }*/
        if(!vacia()){
            res.insertar(this.ini.getDato());
            NodoSE<T> aux1 = ini;
            NodoSE<T> aux2 = res.ini;
            while(aux1.getSig() != null){
                T datoOri = ini.getSig().getDato();
                NodoSE<T> nuevo = new NodoSE(datoOri);
                aux2.setSig(nuevo);
                
                aux1 = aux1.getSig();
                aux2 = aux2.getSig();
            }
        }
        return res;
    }
    public void reemplazar(int p, T d){
        if(p >= 0 && p < tamanio()){
            NodoSE<T> aux = ini;
            while(p-- > 0)
                aux = aux.getSig();
            aux.setDato(d);
        }
    }
    public void intercambiar(int pos1, int pos2){
        if(pos1 != pos2 && pos1 >= 0 && pos2 >= 0 && pos1 < tamanio() && pos2 < tamanio()){
            T d1 = acceder(pos1);
            T d2 = acceder(pos2);
            reemplazar(pos1, d2);
            reemplazar(pos2, d1);
        }
    }
    public ListaSE<T> interseccion(ListaSE<T> b){
        ListaSE<T> c = new ListaSE();
        NodoSE<T> act = ini;
        while(act != null){
            if(b.contiene(act.getDato()))
                c.insertar(act.getDato());
            act = act.getSig();
        }
        return c;
    }
    public ListaSE<T> diferencia(ListaSE<T> b){
        ListaSE<T> c = new ListaSE();
        NodoSE<T> act = ini;
        while(act != null){
            if(!b.contiene(act.getDato()))
                c.insertar(act.getDato());
            act = act.getSig();
        }
        return c;
    }
}
