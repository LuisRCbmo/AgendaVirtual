package modelo;

import edl.ListaSE;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sergio Garcia
 */
public class AgendaTest {
    
    public AgendaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of aniadirCita method "Sin alarma"
     */
    @Test
    public void testAniadirCita1() {
        Cita cita = new Cita("Cita", 0, null);
        Agenda agenda = new Agenda();
        agenda.aniadirCita(cita);
        assertEquals(agenda.getListaCitas().tamanio(), 1);  
        assertEquals(cita.getAlarma(), null);
    }
    
    /**
     * Test of aniadirCita method "Con alarma"
     */
    @Test
    public void testAniadirCita2() {
        Cita cita = new Cita("Cita", 0, new Alarma());
        Agenda agenda = new Agenda();
        agenda.aniadirCita(cita);
        assertEquals(1, agenda.getListaCitas().tamanio());
        assertTrue(cita.getAlarma()instanceof Alarma);
        assertFalse(cita.getAlarma().equals(null));
    }

    /**
     * Test of aniadirCita method "Dos citas"
     */
    @Test
    public void testAniadirCita3() {
        Cita cita = new Cita("Cita", 0, new Alarma());
        Cita cita1 = new Cita("Cita", 0, new Alarma());
        Agenda agenda = new Agenda();
        agenda.aniadirCita(cita);
        agenda.aniadirCita(cita1);
        assertEquals(2, agenda.getListaCitas().tamanio());
        assertTrue(cita.getAlarma()instanceof Alarma);
        assertTrue(cita1.getAlarma()instanceof Alarma);
        assertFalse(cita.getAlarma().equals(null));
        assertFalse(cita1.getAlarma().equals(null));
    }
    
    /**
     * Test of cancelarCita method "Cancelada"
     */
    @Test
    public void testCancelarCita() {
        Cita cita1 = new Cita("Cita1", 0, null);
        Cita cita2 = new Cita("Cita2", 0, null);
        Cita cita3 = new Cita("Cita3", 0, null);
        Cita cita4 = new Cita("Cita4", 0, null);
        Cita cita5 = new Cita("Cita5", 0, null);
        Agenda agenda = new Agenda();
        agenda.aniadirCita(cita1);
        agenda.aniadirCita(cita2);
        agenda.aniadirCita(cita3);
        agenda.aniadirCita(cita4);
        agenda.aniadirCita(cita5);
        Cita citaCancelada = agenda.cancelarCita(cita3);
        assertEquals(cita3, citaCancelada);
    }
    
    /**
     * Test of cancelarCita method "No cancelada"
     */
    @Test
    public void testCancelarCita1() {
        Agenda agenda = new Agenda();
        Cita citaCancelada = agenda.cancelarCita(new Cita("Null", 0, null));
        assertEquals(null, citaCancelada);
    }

    /**
     * Test of getListaCitas method "Lista vacia (Null)"
     */
    @Test
    public void testGetListaCitas() {
        Agenda agenda = new Agenda();
        ListaSE<Cita> listaCitas = agenda.getListaCitas();
        assertEquals(null, listaCitas.getIni());
    }
    
    /**
     * Test of getListaCitas method "Lista con una cita"
     */
    @Test
    public void testGetListaCitas1() {
        Agenda agenda = new Agenda();
        Cita cita = new Cita("Cita", 0, null);
        agenda.aniadirCita(cita);
        ListaSE<Cita> listaCitas = agenda.getListaCitas();
        assertEquals(cita, listaCitas.getIni().getDato());
    }
}
