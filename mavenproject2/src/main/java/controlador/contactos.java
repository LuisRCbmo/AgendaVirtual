/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.*;
import vista.*;
/**
 *
 * @author Luis
 */
public class contactos {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contactos contactos = new Contactos();
        AgendaVirtual agendaVirtual = new AgendaVirtual(agenda,contactos);
        VistaAgendaVirtual vistaAgendaVirtual = new VistaAgendaVirtual(agendaVirtual);
        vistaAgendaVirtual.setVisible(true);
    }
}
