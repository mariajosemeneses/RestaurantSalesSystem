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
public class DessertTest {
    
    public DessertTest() {
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
     * Test of getDesserts method, of class Dessert.
     */
    @Test
    public void testGetDesserts() {
        System.out.println("getDesserts");
        Dessert instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getDesserts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesserts method, of class Dessert.
     */
    @Test
    public void testSetDesserts() {
        System.out.println("setDesserts");
        ArrayList<String> desserts = null;
        Dessert instance = null;
        instance.setDesserts(desserts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
