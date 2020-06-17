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
public class ListaCDE<T> implements Lista<T>{
    private NodoDE<T> ini, fin;
    public ListaCDE(){
        ini = null;
        fin = null;
    }
    public boolean vacia(){
        return ini == null;
    }
    public void insertar(T dato){
        NodoDE<T> nuevo = new NodoDE(dato);
        if(vacia()){
            ini = nuevo;
            fin = nuevo;
            ini.setAnt(fin);    //el antecesor del 1er nodo
                                //es el nodo final
            fin.setSig(ini);    //el sucesor del nodo final
                                //es el primer nodo
        }else{
            //Conectamos los enlaces del nodo final
            //con el nuevo nodo
            fin.setSig(nuevo);
            nuevo.setAnt(fin);
            //el nuevo nodo pasa a ser el nodo final
            fin = nuevo;
            //conectamos el nodo final con el inicial
            ini.setAnt(fin);
            fin.setSig(ini);
        }
    }
    public int tamanio(){
        int cant = 0;
        if(!vacia()){
            NodoDE<T> aux = ini;
            do{
                cant++;
                aux = aux.getSig();
            }while(aux != ini);
        }
        return cant;
    }
    public void insertar(int pos, T dato){
        if(pos >= 0 && pos <= tamanio()){
            NodoDE<T> nuevo = new NodoDE(dato);
            if(pos == 0){
                nuevo.setSig(ini);
                ini = nuevo;
                if(vacia())
                    fin = nuevo;
                ini.setAnt(fin);
                fin.setSig(ini);
            }else if(pos == tamanio()){
                //conectamos el nuevo nodo con el
                //final de la lista
                fin.setSig(nuevo);
                nuevo.setAnt(fin);
                //el nuevo nodo pasa a ser el final de la lista
                fin = nuevo;
                //conectamos el final de la lista
                //con el inicio
                fin.setSig(ini);
                ini.setAnt(fin);
            }else{
                NodoDE<T> act = ini;
                //avanzamos hasta llegar a la posicion
                while(pos-- > 0)
                    act = act.getSig();
                //guardamos el nodo anterior para reconectar
                NodoDE<T> ant = act.getAnt();
                //conectamos ant con nuevo
                ant.setSig(nuevo);
                nuevo.setAnt(ant);
                //conectamos nuevo con act
                nuevo.setSig(act);
                act.setAnt(nuevo);
            }
        }
    }
    public T eliminar(int pos){
        T res = null;
        if(pos >= 0 && pos < tamanio()){
            NodoDE<T> aux;
            if(pos == 0){
                //guardamos el nodo que ocupara su lugar
                aux = ini.getSig();
                //rompemos los enlaces
                ini.setSig(null);
                ini.setAnt(null);
                res = ini.getDato();
                //aux pasa a ser el nuevo nodo inicial
                ini = aux;
                //reconectamos el nodo inicial con
                //el final de la lista
                ini.setAnt(fin);
                fin.setSig(ini);
            }else if(pos == tamanio() - 1){
                //guardamos el nodo que ocupara su lugar
                aux = fin.getAnt();
                //rompemos los enlaces
                fin.setAnt(null);
                fin.setSig(null);
                res = fin.getDato();
                //aux pasa a ser el nuevo nodo final
                fin = aux;
                //reconectamos el nodo final con
                //el inicio de la lista
                ini.setAnt(fin);
                fin.setSig(ini);
            }else{
                aux = ini;
                //avanzamos hasta la posicion
                while(pos-- > 0)
                    aux = aux.getSig();
                //guardamos el antecesor y sucesor
                //del nodo que sera eliminado
                NodoDE<T> ant = aux.getAnt();
                NodoDE<T> sig = aux.getSig();
                //rompemos los enlaces
                aux.setAnt(null);
                aux.setSig(null);
                res = aux.getDato();
                //reconectamos la lista
                ant.setSig(sig);
                sig.setAnt(ant);
            }
        }
        return res;
    }
    public T acceder(int pos){
        T res = null;
        if(pos >= 0 && pos < tamanio()){
            NodoDE<T> aux = ini;
            while(pos-- > 0)
                aux = aux.getSig();
            res = aux.getDato();
        }
        return res;
    }
    public void intercambiar(int p1, int p2){}
    public void reemplazar(int pos, T dato){} 
}
