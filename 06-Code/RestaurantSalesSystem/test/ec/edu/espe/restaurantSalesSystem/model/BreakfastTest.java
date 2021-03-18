/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

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
public class BreakfastTest {
    
    public BreakfastTest() {
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
     * Test of getContinental method, of class Breakfast.
     */
    @Test
    public void testGetContinental() {
        System.out.println("getContinental");
        Breakfast instance = null;
        String expResult = "";
        String result = instance.getContinental();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContinental method, of class Breakfast.
     */
    @Test
    public void testSetContinental() {
        System.out.println("setContinental");
        String continental = "";
        Breakfast instance = null;
        instance.setContinental(continental);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFull method, of class Breakfast.
     */
    @Test
    public void testGetFull() {
        System.out.println("getFull");
        Breakfast instance = null;
        String expResult = "";
        String result = instance.getFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFull method, of class Breakfast.
     */
    @Test
    public void testSetFull() {
        System.out.println("setFull");
        String full = "";
        Breakfast instance = null;
        instance.setFull(full);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceContinental method, of class Breakfast.
     */
    @Test
    public void testGetPriceContinental() {
        System.out.println("getPriceContinental");
        Breakfast instance = null;
        float expResult = 0.0F;
        float result = instance.getPriceContinental();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceContinental method, of class Breakfast.
     */
    @Test
    public void testSetPriceContinental() {
        System.out.println("setPriceContinental");
        float priceContinental = 0.0F;
        Breakfast instance = null;
        instance.setPriceContinental(priceContinental);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceFull method, of class Breakfast.
     */
    @Test
    public void testGetPriceFull() {
        System.out.println("getPriceFull");
        Breakfast instance = null;
        float expResult = 0.0F;
        float result = instance.getPriceFull();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceFull method, of class Breakfast.
     */
    @Test
    public void testSetPriceFull() {
        System.out.println("setPriceFull");
        float priceFull = 0.0F;
        Breakfast instance = null;
        instance.setPriceFull(priceFull);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
