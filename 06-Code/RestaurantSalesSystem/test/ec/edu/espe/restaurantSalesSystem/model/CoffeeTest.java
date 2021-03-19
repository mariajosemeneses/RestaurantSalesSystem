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
        
        ArrayList<String> coffees = new ArrayList<>();
        Assert.assertEquals(0, coffees.size());
        coffees.add("Coffee    Small Price    Big Price");
        Assert.assertEquals(1, coffees.size());
    }
    @Test
    public void testGetCoffees2() {
        System.out.println("getCoffees");
        
        ArrayList<String> coffees = new ArrayList<>();
        Assert.assertEquals(0, coffees.size());
        coffees.add("1. American $3,00  $6,00");
        coffees.add("2. Tinto    $3,00  $6,00");
        Assert.assertEquals(2, coffees.size());
    }
        @Test
    public void testGetCoffees3() {
        System.out.println("getCoffees");
        ArrayList<String> coffees = new ArrayList<>();
        Assert.assertEquals(0, coffees.size());
        coffees.add("1. American $3,00  $6,00");
        coffees.add("2. Tinto    $2,00  $5,00");
        //coffees.add("3. Tinto    $3,00  $5,00");
        Assert.assertEquals(3, coffees.size());
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
