package edl;
public class NodoSE<T>{
    private T dato;
    private NodoSE<T> sig;
    public NodoSE(){
        dato = null;
        sig = null;
    }
    public NodoSE(T d){
        dato = d;
        sig = null;
    }
    public void setDato(T d){
        dato = d;
    }
    public void setSig(NodoSE<T> s){
        sig = s;
    }
    public T getDato(){
        return dato;
    }
    public NodoSE<T> getSig(){
        return sig;
    }
    
}