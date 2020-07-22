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
public interface Lista<T extends Serializable> extends Serializable{
    public boolean vacia();
    public void insertar(T dato);
    public T eliminar(int pos);
    public T acceder(int pos);
    public int tamanio();
    public void reemplazar(int pos, T dato);
    public void insertar(int pos, T dato);
    public void intercambiar(int pos1, int pos2);
}
