package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Agenda;
import modelo.AgendaVirtual;
import modelo.Alarma;
import modelo.Cita;
import modelo.Memo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class JtestAgendaVirtual {
    
    public JtestAgendaVirtual() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testListaMemo(){
        AgendaVirtual agenda= new AgendaVirtual();
        System.out.println(agenda.getlistamemo());
        
    }

   
@Test
    public void testListaContacto(){
        AgendaVirtual agenda = new AgendaVirtual();
        System.out.println(agenda.getContactos());
        

    }

@Test
    public void testAñadirMemo(){
        AgendaVirtual agenda = new AgendaVirtual();
        agenda.agregarmemo(new Memo("reunion ","notas del primer parcial"));
        agenda.agregarmemo(new Memo("hablar","canchas"));
        System.out.println(agenda.getlistamemo());
         
    
    }
    @Test
    public void testeliminarmemo(){
        AgendaVirtual agenda = new AgendaVirtual();
        agenda.agregarmemo(new Memo("reunion ","notas del primer parcial"));
        agenda.agregarmemo(new Memo("hablar","canchas"));
        agenda.elimimarmemo(new Memo("hablar","canchas"));
            System.out.println(agenda.getlistamemo());
         
    
    }

   @Test 
   public void testmotrascitas(){
    
   
    
   Agenda agenda=new Agenda();
   agenda.aniadirCita( new Cita("notas",15,new Alarma()));
   agenda.aniadirCita( new Cita("cita",30,new Alarma()));
   System.out.println(agenda.getListaCitas());
   
   }



}
