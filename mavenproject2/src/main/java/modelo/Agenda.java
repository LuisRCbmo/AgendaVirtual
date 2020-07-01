package modelo;
import edl.ListaSE;
public class Agenda{
    private ListaSE<Cita> citas;
    
    public Agenda(){
        citas = new ListaSE();
    }
    
    public boolean vacio(){
        return citas == null;
    }
    
    public void aniadirCita(Cita cita){
        citas.insertar(cita);
    }
    
    public Cita cancelarCita(Cita cita){
        int pos = citas.indexOf(cita);
        return citas.eliminar(pos);
    }
    
    public void mostrarCitas(){
        int i = 0;
        Cita aux = citas.acceder(i);
        while(!citas.vacia() && i < citas.tamanio()){
            System.out.println(i+".-"+"Cita:");
            System.out.println("  Asunto: "+ aux.getAsunto());
            System.out.println("  Nota: "+aux.getNota());
            System.out.println("  Duracion cita; "+aux.getDuracion());
            //System.out.print("  Fecha: "+ aux.getFecha().toString());
            i = i+1;
            aux = citas.acceder(i);
        }
        if(citas.vacia()){
            System.out.println("No tiene citas programadas.");
        }
    }
}