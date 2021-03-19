/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
        
         ArrayList<String> desserts = new ArrayList<>();
        Assert.assertEquals(0, desserts.size());
        desserts.add("dessert    price");
        Assert.assertEquals(1, desserts.size());
  
    }

     @Test
    public void testGetDesserts2() {
        System.out.println("getDesserts");
        
         ArrayList<String> desserts = new ArrayList<>();
        Assert.assertEquals(0, desserts.size());
        desserts.add("apple    1.50");
         desserts.add("pay the Blackberry     2.20");
        Assert.assertEquals(2, desserts.size());
  
    }
    
     @Test
    public void testGetDessert3() {
        System.out.println("getDesserts");
        
         ArrayList<String> desserts = new ArrayList<>();
        Assert.assertEquals(0, desserts.size());
        desserts.add("apple    1.50");
         desserts.add("pay the Blackberry     2.20");
        desserts.add("banana split    3.50");
        Assert.assertEquals(3, desserts.size());
  
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
        
    }
    
}
