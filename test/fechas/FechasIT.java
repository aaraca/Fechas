/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ainhoaarandacaro
 */
public class FechasIT {
    
    public FechasIT() {
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    //Caso1: Se comprueba que la fecha introducida se encuentra en el día de hoy o en el pasado.
    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2001-01-02";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    //Caso2: Se comprueba que la fecha introducida se encuentra en el futuro.
    @Test
    public void testNoEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("NoesFacturaCorrectaEnFecha");
        String fechaFactura = "2050-01-02";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
