/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;
import junit.framework.Assert;
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
        ArrayList<String> soups = new ArrayList<>();
        Assert.assertEquals(0 , soups.size());
        soups.add("1. Locro : sopa de papacon queso fresco y aguacate");
        Assert.assertEquals(1 , soups.size());
    }

    /**
     * Test of setSoups method, of class Lunch.
     */
    @Test
    public void testSetSoups() {
        System.out.println("setSoups");
        ArrayList<String> soups = new ArrayList<>();
        Assert.assertEquals(0 , soups.size());
        soups.add("1. Locro : sopa de papacon queso fresco y aguacate");
        soups.add("2. Tomate : coliflor, brocolo, zanahoria y crema de tomate");
        soups.add("3. Pollo : pechuga de pollo picada, alverja, zanahoria y apio");
        Assert.assertEquals(3 , soups.size());
    }

    /**
     * Test of getMainCourses method, of class Lunch.
     */
    @Test
    public void testGetMainCourses() {
        System.out.println("getMainCourses");
        ArrayList<String> mainCourses = new ArrayList<>();
        Assert.assertEquals(0,mainCourses.size() );
        mainCourses.add("1. Chuleta de cerdo : acompañada con papas fritas y ensalada");
        Assert.assertEquals(1,mainCourses.size() );
    }

    /**
     * Test of setMainCourses method, of class Lunch.
     */
    @Test
    public void testSetMainCourses() {
        System.out.println("setMainCourses");
        ArrayList<String> mainCourses = new ArrayList<>();
        Assert.assertEquals(0,mainCourses.size() );
        mainCourses.add("1. Chuleta de cerdo : acompañada con papas fritas y ensalada");
        mainCourses.add("2.Camarones apanados : acompañado de salsa ranch, arroz, maduro frito y ensalada.");
        mainCourses.add("3. Lasagna: acompañado con ensalada");
        Assert.assertEquals(3,mainCourses.size() );
    }

    /**
     * Test of getDrink method, of class Lunch.
     */
    @Test
    public void testGetDrink() {
        System.out.println("getDrink");
        ArrayList<String> drink = new ArrayList<>();
        Assert.assertEquals(0,drink.size() );
        drink.add("1. Piña");
        Assert.assertEquals(1,drink.size() );
    }

    /**
     * Test of setDrink method, of class Lunch.
     */
    @Test
    public void testSetDrink() {
        System.out.println("setDrink");
        ArrayList<String> drink = new ArrayList<>();
        Assert.assertEquals(0,drink.size() );
        drink.add("1. Piña");
        drink.add("2. Mora");
        drink.add("3. Sandia");
        Assert.assertEquals(3,drink.size() );
    }

    /**
     * Test of getDessert method, of class Lunch.
     */
    @Test
    public void testGetDessert() {
        System.out.println("getDessert");
        ArrayList<String> dessert = new ArrayList<>();
        Assert.assertEquals(0,dessert.size() );
        dessert.add("1. Brownie");
        Assert.assertEquals(1,dessert.size() );
    }

    /**
     * Test of setDessert method, of class Lunch.
     */
    @Test
    public void testSetDessert() {
        System.out.println("setDessert");
        ArrayList<String> dessert = new ArrayList<>();
        Assert.assertEquals(0,dessert.size() );
        dessert.add("1. Brownie");
        dessert.add("2. Chesecake : fresa y mayacuya");
        dessert.add("3. Tres leches");
        Assert.assertEquals(3,dessert.size() );
    }
    }
    

