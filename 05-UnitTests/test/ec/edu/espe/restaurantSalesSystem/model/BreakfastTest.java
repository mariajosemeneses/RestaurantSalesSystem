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

/**
 *
 * @author DAVID
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
     * Test of getDrinks method, of class Breakfast.
     */
    @Test
    public void testGetDrinks() {
        System.out.println("getDrinks");
        ArrayList<String> drinks = new ArrayList<>();
        Assert.assertEquals(0 , drinks.size());
        drinks.add("1. Cafe en agua");
        drinks.add("2. Cafe en leche");
        Assert.assertEquals(2 , drinks.size());
    
    }

    /**
     * Test of setDrinks method, of class Breakfast.
     */
    @Test
    public void testSetDrinks() {
        System.out.println("setDrinks");
        ArrayList<String> drinks = new ArrayList<>();
        Assert.assertEquals(0 , drinks.size());
        drinks.add("1. Te con limon");
        drinks.add("2. Leche");
        Assert.assertEquals(2 , drinks.size());
    }

    /**
     * Test of getJuices method, of class Breakfast.
     */
    @Test
    public void testGetJuices() {
        System.out.println("getJuices");
        ArrayList<String> juices = new ArrayList<>();
        Assert.assertEquals(0 , juices.size());
        juices.add("1. Jugo de mora");
        juices.add("2. Jugo de naranjilla");
        Assert.assertEquals(2 , juices.size());
    }

    /**
     * Test of setJuices method, of class Breakfast.
     */
    @Test
    public void testSetJuices() {
        System.out.println("setJuices");
        ArrayList<String> juices = new ArrayList<>();
        Assert.assertEquals(0 , juices.size());
        juices.add("1. Jugo de tomate de arbol");
        Assert.assertEquals(1 , juices.size());
    }

    /**
     * Test of getBreads method, of class Breakfast.
     */
    @Test
    public void testGetBreads() {
        System.out.println("getBreads");
        ArrayList<String> breads = new ArrayList<>();
        Assert.assertEquals(0 , breads.size());
        breads.add("1. Simple");
        breads.add("2. Pan con jamon");
        Assert.assertEquals(2 , breads.size());
    }

    /**
     * Test of setBreads method, of class Breakfast.
     */
    @Test
    public void testSetBreads() {
        System.out.println("setBreads");
        ArrayList<String> breads = new ArrayList<>();
        Assert.assertEquals(0 , breads.size());
        breads.add("1. Pan con mortadela");
        breads.add("2. Pan integral");
        Assert.assertEquals(2 , breads.size());
    }

    /**
     * Test of getEggs method, of class Breakfast.
     */
    @Test
    public void testGetEggs() {
        System.out.println("getEggs");
        ArrayList<String> eggs = new ArrayList<>();
        Assert.assertEquals(0 , eggs.size());
        eggs.add("1. Huevos cocidos");
        eggs.add("2. Huevos tibios");
        eggs.add("2. Torta de huevo");
        Assert.assertEquals(3 , eggs.size());
    }

    /**
     * Test of setEggs method, of class Breakfast.
     */
    @Test
    public void testSetEggs() {
        System.out.println("setEggs");
        ArrayList<String> eggs = new ArrayList<>();
        Assert.assertEquals(0 , eggs.size());
        eggs.add("1. Huevos fritos");
        eggs.add("2. Huevos revueltos");
        Assert.assertEquals(2 , eggs.size());
    }

    /**
     * Test of getFruits method, of class Breakfast.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getFruits");
        ArrayList<String> fruits = new ArrayList<>();
        Assert.assertEquals(0 , fruits.size());
        fruits.add("1. Manzana");
        fruits.add("2. Pera");
        Assert.assertEquals(2 , fruits.size());
    }

    /**
     * Test of setFruits method, of class Breakfast.
     */
    @Test
    public void testSetFruits() {
        System.out.println("setFruits");
        ArrayList<String> fruits = new ArrayList<>();
        Assert.assertEquals(0 , fruits.size());
        fruits.add("1. Banano");
        Assert.assertEquals(1 , fruits.size());
    }

    /**
     * Test of getStews method, of class Breakfast.
     */
    @Test
    public void testGetStews() {
        System.out.println("getStews");
        ArrayList<String> stews = new ArrayList<>();
        Assert.assertEquals(0 , stews.size());
        stews.add("1. Estofado de carne");
        Assert.assertEquals(1 , stews.size());
    }

    /**
     * Test of setStews method, of class Breakfast.
     */
    @Test
    public void testSetStews() {
        System.out.println("setStews");
        ArrayList<String> stews = new ArrayList<>();
        Assert.assertEquals(0 , stews.size());
        stews.add("1. Estofado de pollo");
        Assert.assertEquals(1 , stews.size());
    }
    
}
