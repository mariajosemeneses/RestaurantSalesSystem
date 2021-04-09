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
public class JuiceTest {
    
    public JuiceTest() {
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
     * Test of getFruits method, of class Juice.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getFruits");
        ArrayList<String> fruits = new ArrayList<>();
        Assert.assertEquals(0,fruits.size() );
        fruits.add("1. Papaya  $1.00");
        Assert.assertEquals(1,fruits.size() );
    }

    /**
     * Test of setFruits method, of class Juice.
     */
    @Test
    public void testSetFruits() {
          System.out.println("getFruits");
        ArrayList<String> fruits = new ArrayList<>();
        Assert.assertEquals(0,fruits.size() );
        fruits.add("1. Papaya  $1.00");
        fruits.add("2. Tomate de arbol  $1.00");
        fruits.add("3. Sandia  $1.00");
        fruits.add("4. Mora  $1.00");
        fruits.add("5. Naranjilla  $1.00");
        fruits.add("6. Melon  $1.00");
        fruits.add("7. Maracuya  $1.00");
        Assert.assertEquals(7,fruits.size() );
    }

    }
    

