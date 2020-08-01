package controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
import vista.VistaAgendaVirtual;

/**
 *
 * @author Sergio Garcia
 */
public class Main {

    public static void main(String[] args) {
        SerializarProyecto serialProyect = new SerializarProyecto();
        AgendaVirtual agendaVirtual = serialProyect.recuperarProyecto();
        VistaAgendaVirtual vistaAgendaVirtual = new VistaAgendaVirtual(agendaVirtual);
        vistaAgendaVirtual.setVisible(true); 
        
    }
    
    /*
    recuperacion de citas con alarmas :3 
        public void recuperar(){
            for(int i = 0 ; i < listaCitas ; i++){
                if(cita(i).getTieneAlarma()){            
                    cita(i).setAlarma(new Alarma());
                    cita(i).getAlarma().setCancion(cita(i).getMusica())
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(cita(i).getFechaHora);
                    calendar.add(calendar.MINUTE,cita(i).getAnticipacion);
                    cita(i).getAlarma().programarAlarma(calendar.getTime(),cita(i).getAsunto);
                }
        }
    
        
    */
}
