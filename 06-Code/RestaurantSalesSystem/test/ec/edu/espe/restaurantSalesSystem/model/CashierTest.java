/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Bill;
import ec.edu.espe.restaurantsalessystem.model.Cashier;
import ec.edu.espe.restaurantsalessystem.model.Customer;
import ec.edu.espe.restaurantsalessystem.model.Order;
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
public class CashierTest {
    
    public CashierTest() {
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
     * Test of registerCustomer method, of class Cashier.
     */
    @Test
    public void testRegisterCustomer() {
        System.out.println("registerCustomer");
        Customer customer = null;
        Cashier instance = null;
        instance.registerCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerOrder method, of class Cashier.
     */
    @Test
    public void testRegisterOrder() {
        System.out.println("registerOrder");
        Order order = null;
        Cashier instance = null;
        instance.registerOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateBill method, of class Cashier.
     */
    @Test
    public void testGenerateBill() {
        System.out.println("generateBill");
        Bill bill = null;
        Cashier instance = null;
        instance.generateBill(bill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomers method, of class Cashier.
     */
    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        Cashier instance = null;
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomers method, of class Cashier.
     */
    @Test
    public void testSetCustomers() {
        System.out.println("setCustomers");
        ArrayList<Customer> customers = null;
        Cashier instance = null;
        instance.setCustomers(customers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
