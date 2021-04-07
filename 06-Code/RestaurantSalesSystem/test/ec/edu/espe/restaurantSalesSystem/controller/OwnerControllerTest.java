/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import ec.edu.espe.restaurantSalesSystem.model.Product;
import ec.edu.espe.restaurantsalessystem.model.Cashier;
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
public class OwnerControllerTest {
    
    public OwnerControllerTest() {
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
     * Test of addEmployee method, of class OwnerController.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        String typeEmployee = "";
        Cashier cashier = null;
        OwnerController instance = new OwnerController();
        instance.addEmployee(typeEmployee, cashier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmployee method, of class OwnerController.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee");
        String typeEmployee = "";
        String dataToFind = "";
        String field = "";
        OwnerController instance = new OwnerController();
        instance.deleteEmployee(typeEmployee, dataToFind, field);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class OwnerController.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        String typeEmployee = "";
        String dataToFind = "";
        String newData = "";
        String field = "";
        OwnerController instance = new OwnerController();
        instance.updateEmployee(typeEmployee, dataToFind, newData, field);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProduct method, of class OwnerController.
     */
    @Test
    public void testCreateProduct() {
        System.out.println("createProduct");
        Product product = null;
        OwnerController instance = new OwnerController();
        instance.createProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProduct method, of class OwnerController.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        String dataToDelete = "";
        OwnerController instance = new OwnerController();
        instance.deleteProduct(dataToDelete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
