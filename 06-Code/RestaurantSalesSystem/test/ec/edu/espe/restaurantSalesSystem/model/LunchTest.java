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
public class LunchTest {
    
    public LunchTest() {
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
     * Test of getSoups method, of class Lunch.
     */
    @Test
    public void testGetSoups() {
        System.out.println("getSoups");
        Lunch instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getSoups();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoups method, of class Lunch.
     */
    @Test
    public void testSetSoups() {
        System.out.println("setSoups");
        ArrayList<String> soups = null;
        Lunch instance = null;
        instance.setSoups(soups);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainCourses method, of class Lunch.
     */
    @Test
    public void testGetMainCourses() {
        System.out.println("getMainCourses");
        Lunch instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getMainCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMainCourses method, of class Lunch.
     */
    @Test
    public void testSetMainCourses() {
        System.out.println("setMainCourses");
        ArrayList<String> mainCourses = null;
        Lunch instance = null;
        instance.setMainCourses(mainCourses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrink method, of class Lunch.
     */
    @Test
    public void testGetDrink() {
        System.out.println("getDrink");
        Lunch instance = null;
        Drink expResult = null;
        Drink result = instance.getDrink();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDrink method, of class Lunch.
     */
    @Test
    public void testSetDrink() {
        System.out.println("setDrink");
        Drink drink = null;
        Lunch instance = null;
        instance.setDrink(drink);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDessert method, of class Lunch.
     */
    @Test
    public void testGetDessert() {
        System.out.println("getDessert");
        Lunch instance = null;
        Dessert expResult = null;
        Dessert result = instance.getDessert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDessert method, of class Lunch.
     */
    @Test
    public void testSetDessert() {
        System.out.println("setDessert");
        Dessert dessert = null;
        Lunch instance = null;
        instance.setDessert(dessert);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
