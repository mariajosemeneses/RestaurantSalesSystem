/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Customer;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Group 3
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
     * Test of getCustomers method, of class Cashier.
     */
    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        ArrayList<Customer> expResult = new ArrayList();
        Customer customer = new Customer("5", 30, "Jorge", "Av. 6 December", 
                "jjorge@gmail.com", "0983641574");
        Assert.assertEquals(0, expResult.size());
        expResult.add(customer);
        Assert.assertEquals(1, expResult.size());
    }

    /**
     * Test of setCustomers method, of class Cashier.
     */
    @Test
    public void testSetCustomers() {
        System.out.println("setCustomers");
        ArrayList<Customer> expResult = new ArrayList();
        Customer customer = new Customer("1", 25, "Juan", "Barrionuevo", 
                "juan@gmail.com", "0993122574");
        Customer customer1 = new Customer("2", 27, "Pedro", "La Tola", 
                "pedro@hotmail.com", "0976285821");
        Assert.assertEquals(0, expResult.size());
        expResult.add(customer);
        expResult.add(customer1);
        Assert.assertEquals(2, expResult.size());

    }

}
