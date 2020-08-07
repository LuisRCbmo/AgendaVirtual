/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Nath
 */
public class CitaTest {
            
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
    
    @Test
    public void testAsunto() {
        System.out.println("get y set asunto");
        Cita instance =new Cita("",0,new Alarma());
        instance.setAsunto("asunto");
        String expResult = "asunto";
        String result = instance.getAsunto();
        assertEquals(expResult, result);
    }
    @Test
    public void testNota() {
        System.out.println("get y set asunto");
        Cita instance =new Cita("",0,new Alarma());
        instance.setNota("nota");
        String expResult = "nota";
        String result = instance.getNota();
        assertEquals(expResult, result);
    }    
        @Test
    public void testDuracion() {
        System.out.println("get y set duracion");
        Cita instance =new Cita("",0,new Alarma());
        instance.setDuracion(5);
        int expResult = 5;
        int result = instance.getDuracion();
        assertEquals(expResult, result);
    }
}
