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
public class DrinkTest {
    
    public DrinkTest() {
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
     * Test of choice method, of class Drink.
     */
    @Test
    public void testChoice() {
        System.out.println("choice");
        Coffee coffee = null;
        Juice juice = null;
        Soda soda = null;
        Drink instance = null;
        instance.choice(coffee, juice, soda);
        
    }
    
    @Test
    public void testChoice2() {
        System.out.println("choice2");
        Coffee coffee = null;
        Juice juice = null;
        Soda soda = null;
        Drink instance = null;
        instance.choice(coffee, juice, soda);
        
    }
}
