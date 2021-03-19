/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Order;
import ec.edu.espe.restaurantsalessystem.model.Waiter;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class WaiterTest {
    
    public WaiterTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getOrders method, of class Waiter.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        ArrayList<String> orders = new ArrayList<>();
        Assert.assertEquals(0, orders.size());
        orders.add("Order N°1");
        orders.add("Order N°15");
        Assert.assertEquals(2, orders.size());
    }

    /**
     * Test of setOrders method, of class Waiter.
     */
    @Test
    public void testSetOrders() {
        ArrayList<String> orders = new ArrayList<>();
        Assert.assertEquals(0, orders.size());
        orders.add("Order N°50");
        orders.add("Order N°112");
        Assert.assertEquals(2, orders.size());
    }
    
}
