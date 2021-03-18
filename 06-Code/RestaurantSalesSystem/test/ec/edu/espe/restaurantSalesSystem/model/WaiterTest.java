/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Order;
import ec.edu.espe.restaurantsalessystem.model.Waiter;
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
public class WaiterTest {
    
    public WaiterTest() {
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
     * Test of getOrders method, of class Waiter.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        Waiter instance = new Waiter();
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrders method, of class Waiter.
     */
    @Test
    public void testSetOrders() {
        System.out.println("setOrders");
        ArrayList<Order> orders = null;
        Waiter instance = new Waiter();
        instance.setOrders(orders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delieverOrder method, of class Waiter.
     */
    @Test
    public void testDelieverOrder() {
        System.out.println("delieverOrder");
        Order order = null;
        Waiter instance = new Waiter();
        instance.delieverOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
