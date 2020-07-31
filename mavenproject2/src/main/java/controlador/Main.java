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
}
