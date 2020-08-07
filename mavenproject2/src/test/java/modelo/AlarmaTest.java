/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ronal
 */
public class AlarmaTest {
    
    public AlarmaTest() {
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
     * Test of setCancion method, of class Alarma.
     */
    @Test
    public void testSetCancion() {
        System.out.println("setCancion");       
        Alarma instance = new Alarma();
        instance.setCancion("TelefonoAntiguo.wav");
        String resultadoE = "TelefonoAntiguo.wav";
        assertEquals(resultadoE,instance.getCancion());
    }

    /**
     * Test of getCancion method, of class Alarma.
     */
    @Test
    public void testGetCancion() {
        System.out.println("getCancion");
        Alarma alarma = new Alarma();
        String expResult = "Gallo.wav";
        String result = alarma.getCancion();
        assertNotEquals(expResult, result);
        alarma.setCancion(expResult);
        result = alarma.getCancion();
        assertEquals(expResult,result); 
    }

    /**
     * Test of getActivo method, of class Alarma.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        Alarma alarma = new Alarma();
        boolean expResult = false;
        boolean result = alarma.getActivo();
        assertNotEquals(expResult, result);
        alarma.desactivar();
        result = alarma.getActivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of desactivar method, of class Alarma.
     */
    @Test
    public void testDesactivar() {
        System.out.println("desactivar");
        Alarma alarma = new Alarma();
        alarma.desactivar();
        boolean resultado = alarma.getActivo();
        assertEquals(false,resultado); 
        alarma.activar();
        resultado = alarma.getActivo();
        assertNotEquals(false,resultado);
    }   

    /**
     * Test of activar method, of class Alarma.
     */
    @Test
    public void testActivar() {
        System.out.println("activar");
        Alarma alarma = new Alarma();
        alarma.activar();
        boolean resultado = alarma.getActivo();        
        assertEquals(true,resultado); 
    }

    /**
     * Test of getFechaActual method, of class Alarma.
     */
    @Test
    public void testGetFechaActual() {
        System.out.println("getFechaActual");
        Alarma alarma = new Alarma();
        Date expResult = alarma.getFechaActual();      
        Date result = alarma.getFechaActual();
        assertEquals(expResult, result);
    }
    /* 
        Test al setear una fecha
    */
    @Test
    public void testSetFechaActual(){
        System.out.println("setFechaActual");
        Alarma alarma = new Alarma();
        Date expResult = new Date();
        alarma.setFechaActual(expResult); 
        Date result = alarma.getFechaActual();
        assertEquals(expResult, result);
    }
    /**
     * Test of ProgramarAlarma method, of class Alarma.
     */
    @Test
    public void testProgramarAlarma() {
        System.out.println("ProgramarAlarma");
        Date fechaC = new Date(120,7,5); // 5 de agosto 2020
        String asunto = "hola";
        Alarma alarma = new Alarma();
        alarma.ProgramarAlarma(fechaC, asunto);
        boolean resultado = alarma.getActivo();
        assertEquals(false,resultado);
        fechaC = new Date(120,7,10); // 10 de agosto 2020   si la fecha actual es superior al 10 de agosto este test fallara    
        Alarma alarma1 = new Alarma();
        alarma1.ProgramarAlarma(fechaC, asunto);
        resultado = alarma1.getActivo();
        assertEquals(true,resultado);
        
    }

    /**
     * Test of dateAString method, of class Alarma.
     */
    @Test
    public void testDateAString() {
        System.out.println("dateAString");
        Date t = new Date(120,7,6,20,00);
        Alarma alarma = new Alarma();
        alarma.setFechaActual(t); 
        String expResult = "06/08/2020 20:00";
        String result = alarma.dateAString(t);
        assertEquals(expResult, result);
    }
    
}
