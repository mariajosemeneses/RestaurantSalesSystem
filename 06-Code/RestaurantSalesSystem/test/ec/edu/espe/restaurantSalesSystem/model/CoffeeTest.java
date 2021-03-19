/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maria José Meneses
 */
public class CoffeeTest {
    
    public CoffeeTest() {
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
     * Test of getCoffees method, of class Coffee.
     */
    @Test
    public void testGetCoffees() {
        System.out.println("getCoffees");
        Coffee instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCoffees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoffees method, of class Coffee.
     */
    @Test
    public void testSetCoffees() {
        System.out.println("setCoffees");
        ArrayList<String> coffees = null;
        Coffee instance = null;
        instance.setCoffees(coffees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
