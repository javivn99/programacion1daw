/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class MatriculaTest {
    
    public MatriculaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Letras_Correcta method, of class Matricula.
     */
    @org.junit.Test
    public void testLetras_Correcta() {
        System.out.println("Letras_Correcta");
        String mat = "JHG";
        boolean expResult = true;
        boolean result = Matricula.Letras_Correcta(mat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Numeros_Correctos method, of class Matricula.
     */
    @org.junit.Test
    public void testNumeros_Correctos() {
        System.out.println("Numeros_Correctos");
        String mat = "8585";
        boolean expResult = true;
        boolean result = Matricula.Numeros_Correctos(mat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
