/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ainhoaarandacaro
 */
public class FechasACBCIT {
    
    public FechasACBCIT() {
    }
    
    @BeforeClass
    public static void BeforeClass() {
        System.out.println("@BeforeClass");
    }
    
    @AfterClass
    public static void AfterClass() {
        System.out.println("@AfterClass");
    }
    
    @Before
    public void Before() {
        System.out.println("@Before");
        Fechas instance = new Fechas();
    }
    
    @After
    public void After() {
        System.out.println("@After");
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     * @throws java.lang.Exception
     */
    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testNoEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("NoesFacturaCorrectaEnFecha");
        String fechaFactura = "";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
