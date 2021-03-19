/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group 3
 */
public class BreakfastTest {

    public BreakfastTest() {
    }

    /**
     * Test of getContinental method, of class Breakfast.
     */
    @Test
    public void testGetContinental() {
        System.out.println("getContinental");
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        String expResult = "coffee" + ", bread " + "and Fruits";
        String result = instance.getContinental();
        assertEquals(expResult, result, result);

    }

    /**
     * Test of setContinental method, of class Breakfast.
     */
    @Test
    public void testSetContinental() {
        System.out.println("setContinental");
        String continental = "coffee, bread and Fruits";
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        instance.setContinental(continental);

    }

    /**
     * Test of getFull method, of class Breakfast.
     */
    @Test
    public void testGetFull() {
        System.out.println("getFull");
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        String expResult = "Rice with chicken, coffee and Bolon";
        String result = instance.getFull();
        assertEquals(expResult, result, result);

    }

    /**
     * Test of setFull method, of class Breakfast.
     */
    @Test
    public void testSetFull() {
        System.out.println("setFull");
        String full = "Rice with chicken, coffee and Bolon";
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        instance.setFull(full);

    }

    /**
     * Test of getPriceContinental method, of class Breakfast.
     */
    @Test
    public void testGetPriceContinental() {
        System.out.println("getPriceContinental");
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        float expResult = 2.5F;
        float result = instance.getPriceContinental();
        assertEquals(expResult, result, 2.5);
        
    }

    /**
     * Test of setPriceContinental method, of class Breakfast.
     */
    @Test
    public void testSetPriceContinental() {
        System.out.println("setPriceContinental");
        float priceContinental = 2.5F;
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        instance.setPriceContinental(priceContinental);
        
    }

    /**
     * Test of getPriceFull method, of class Breakfast.
     */
    @Test
    public void testGetPriceFull() {
        System.out.println("getPriceFull");
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        float expResult = 5.5F;
        float result = instance.getPriceFull();
        assertEquals(expResult, result, 5.5);

    }

    /**
     * Test of setPriceFull method, of class Breakfast.
     */
    @Test
    public void testSetPriceFull() {
        System.out.println("setPriceFull");
        float priceFull = 5.5F;
        Breakfast instance = new Breakfast("", "", 0, 0, "", 0, 0);
        instance.setPriceFull(priceFull);
    }

}
