/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Bill;
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
public class BillTest {
    
    public BillTest() {
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
     * Test of getName method, of class Bill.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Bill instance = new Bill();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Bill.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Bill instance = new Bill();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Bill.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Bill instance = new Bill();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Bill.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Bill instance = new Bill();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificationCard method, of class Bill.
     */
    @Test
    public void testGetIdentificationCard() {
        System.out.println("getIdentificationCard");
        Bill instance = new Bill();
        float expResult = 0.0F;
        float result = instance.getIdentificationCard();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificationCard method, of class Bill.
     */
    @Test
    public void testSetIdentificationCard() {
        System.out.println("setIdentificationCard");
        float identificationCard = 0.0F;
        Bill instance = new Bill();
        instance.setIdentificationCard(identificationCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellPhone method, of class Bill.
     */
    @Test
    public void testGetCellPhone() {
        System.out.println("getCellPhone");
        Bill instance = new Bill();
        String expResult = "";
        String result = instance.getCellPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellPhone method, of class Bill.
     */
    @Test
    public void testSetCellPhone() {
        System.out.println("setCellPhone");
        String cellPhone = "";
        Bill instance = new Bill();
        instance.setCellPhone(cellPhone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class Bill.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        Bill instance = new Bill();
        String expResult = "";
        String result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class Bill.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        String direction = "";
        Bill instance = new Bill();
        instance.setDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Bill.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Bill instance = new Bill();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Bill.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Bill instance = new Bill();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
