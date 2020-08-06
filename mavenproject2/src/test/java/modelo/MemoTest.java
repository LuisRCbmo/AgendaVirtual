package modelo;

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
public class MemoTest {
    
    public MemoTest() {
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
     * Test of getAsunto method "Mismo asunto (true)"
     */
    @Test
    public void testGetAsunto() {
        Memo instance = new Memo("Memo asunto", "Memo nota");
        String expResult = "Memo asunto";
        String result = instance.getAsunto();
        assertEquals(expResult, result);
        assertFalse(expResult.equals("Memo1"));
        assertFalse(expResult.equals("Hola"));
        assertFalse(expResult.equals("Agenda"));
        assertFalse(expResult.equals("Asunto Memo"));
        assertFalse(expResult.equals("Memo Nota"));
        assertFalse(expResult.equals("Nota Memo"));
        assertFalse(expResult.equals("instance"));
    }

    /**
     * Test of getNota method, of class Memo.
     */
    @Test
    public void testGetNota() {
        Memo instance = new Memo("Memo asunto", "Memo nota");
        String expResult = "Memo nota";
        String result = instance.getNota();
        assertEquals(expResult, result);
        assertFalse(expResult.equals("Memo1"));
        assertFalse(expResult.equals("Hola"));
        assertFalse(expResult.equals("Agenda"));
        assertFalse(expResult.equals("Asunto Memo"));
        assertFalse(expResult.equals("Memo Nota"));
        assertFalse(expResult.equals("Nota Memo"));
        assertFalse(expResult.equals("instance"));
    }

    /**
     * Test of setAsunto method, of class Memo.
     */
    @Test
    public void testSetAsunto() {
        Memo instance = new Memo("Memo asunto", "Memo Nota");
        instance.setAsunto("Asunto");
        assertTrue(instance.getAsunto().equals("Asunto"));
        assertFalse(instance.getAsunto().equals("sunato"));
        instance.setAsunto("Hello");
        assertTrue(instance.getAsunto().equals("Hello"));
        assertFalse(instance.getAsunto().equals("Holi"));
        instance.setAsunto("Memo");
        assertTrue(instance.getAsunto().equals("Memo"));
        assertFalse(instance.getAsunto().equals("Nemo"));
        instance.setAsunto("Nota");
        assertTrue(instance.getAsunto().equals("Nota"));
        assertFalse(instance.getAsunto().equals("Note"));
    }

    /**
     * Test of setNota method, of class Memo.
     */
    @Test
    public void testSetNota() {
        Memo instance = new Memo("Memo asunto", "Memo Nota");
        instance.setNota("Asunto");
        assertTrue(instance.getNota().equals("Asunto"));
        assertFalse(instance.getNota().equals("sunato"));
        instance.setNota("Hello");
        assertTrue(instance.getNota().equals("Hello"));
        assertFalse(instance.getNota().equals("Holi"));
        instance.setNota("Memo");
        assertTrue(instance.getNota().equals("Memo"));
        assertFalse(instance.getNota().equals("Nemo"));
        instance.setNota("Nota");
        assertTrue(instance.getNota().equals("Nota"));
        assertFalse(instance.getNota().equals("Note"));
    }

    /**
     * Test of toString method, of class Memo.
     */
    @Test
    public void testToString() {
        Memo memo = new Memo("Memo asunto", "Memo nota");
        String res =memo.toString();
        assertEquals("Asunto: Memo asunto Nota: Memo nota", res);
        assertFalse("Asunto: Memo asunto Nota: Memo nota".equals("Asunto:MemoasuntoNota:Memonota"));
    }
    
}
