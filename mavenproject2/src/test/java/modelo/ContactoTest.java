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
    
    @Test
    public void testNombre() {
        System.out.println("get y set nombre");
        Contacto instance =new Contacto("","","","","","");
        instance.setNombre("nombre");
        String expResult = "nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testApellido() {
        System.out.println("get y set apellido");
        Contacto instance =new Contacto("","","","","","");
        instance.setApellido("apellido");
        String expResult = "apellido";
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testfijo() {
        System.out.println("get y set fijo");
        Contacto instance =new Contacto("","","","","","");
        instance.setFijo("123");
        String expResult = "123";
        String result = instance.getFijo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testcelular() {
        System.out.println("get y set celular");
        Contacto instance =new Contacto("","","","","","");
        instance.setCelular("celular");
        String expResult = "celular";
        String result = instance.getCelular();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testcorreo() {
        System.out.println("get y set correo");
        Contacto instance =new Contacto("","","","","","");
        instance.setCorreo("correo");
        String expResult = "correo";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDireccion() {
        System.out.println("get y set nombre");
        Contacto instance =new Contacto("","","","","","");
        instance.setDireccion("direccion");
        String expResult = "direccion";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        Contacto instance =new Contacto("nombre","apellido","","","","");
        String expResult = "Contacto: nombre apellido";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
