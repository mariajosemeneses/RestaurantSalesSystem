/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Customer;
import ec.edu.espe.restaurantsalessystem.model.Order;
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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of generateOrder method, of class Customer.
     */
    @Test
    public void testGenerateOrder() {
        System.out.println("generateOrder");
        Customer instance = new Customer();
        Order expResult = null;
        Order result = instance.generateOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelOrder method, of class Customer.
     */
    @Test
    public void testCancelOrder() {
        System.out.println("cancelOrder");
        Customer instance = new Customer();
        instance.cancelOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editOrder method, of class Customer.
     */
    @Test
    public void testEditOrder() {
        System.out.println("editOrder");
        Customer instance = new Customer();
        Order expResult = null;
        Order result = instance.editOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewMenu method, of class Customer.
     */
    @Test
    public void testViewMenu() {
        System.out.println("viewMenu");
        Product product = null;
        Customer instance = new Customer();
        instance.viewMenu(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewOrder method, of class Customer.
     */
    @Test
    public void testViewOrder() {
        System.out.println("viewOrder");
        Order order = null;
        Customer instance = new Customer();
        instance.viewOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
