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
 * @author ronal
 */
public class ContactoTest {
    
    public ContactoTest() {
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
     * Test of getNombre method, of class Contacto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Contacto instance = new Contacto("Sergio","Garcia","","","","");
        String expResult = "Sergio";
        String result = instance.getNombre();
        assertEquals(expResult,result);
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getApellido method, of class Contacto.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Contacto instance = new Contacto("Sergio","Garcia","71418129","4377447","vera@gmail","av.cap.ustariz");
        String expResult = "Garcia";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getCelular method, of class Contacto.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        Contacto instance = new Contacto("Sergio","Garcia","71418129","4377447","vera@gmail","av.cap.ustariz");;
        String expResult = "";
        String result = instance.getCelular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFijo method, of class Contacto.
     */
    @Test
    public void testGetFijo() {
        System.out.println("getFijo");
        Contacto instance = null;
        String expResult = "";
        String result = instance.getFijo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Contacto.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Contacto instance = null;
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Contacto.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Contacto instance = null;
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Contacto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Contacto instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Contacto.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Contacto instance = null;
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCelular method, of class Contacto.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        String celular = "";
        Contacto instance = null;
        instance.setCelular(celular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFijo method, of class Contacto.
     */
    @Test
    public void testSetFijo() {
        System.out.println("setFijo");
        String fijo = "";
        Contacto instance = null;
        instance.setFijo(fijo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Contacto.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Contacto instance = null;
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Contacto.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Contacto instance = null;
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Contacto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Contacto instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
