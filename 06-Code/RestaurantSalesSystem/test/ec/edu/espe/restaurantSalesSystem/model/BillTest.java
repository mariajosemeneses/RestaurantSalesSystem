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
 * @author Group 3
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
        String expResult = "Jose";
        String result = instance.getName();
        assertEquals(expResult, result, null);

    }

    /**
     * Test of setName method, of class Bill.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jose";
        Bill instance = new Bill();
        instance.setName(name);

    }

    /**
     * Test of getDate method, of class Bill.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Bill instance = new Bill();
        String expResult = "2021/03/17";
        String result = instance.getDate();
        assertEquals(expResult, result, null);

    }

    /**
     * Test of setDate method, of class Bill.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "2021/03/17";
        Bill instance = new Bill();
        instance.setDate(date);

    }

    /**
     * Test of getIdentificationCard method, of class Bill.
     */
    @Test
    public void testGetIdentificationCard() {
        System.out.println("getIdentificationCard");
        Bill instance = new Bill();
        int expResult = 44857;
        int result = instance.getIdentificationCard();
        assertEquals(expResult, result, 44857);

    }

    /**
     * Test of setIdentificationCard method, of class Bill.
     */
    @Test
    public void testSetIdentificationCard() {
        System.out.println("setIdentificationCard");
        int identificationCard = 44857;
        Bill instance = new Bill();
        instance.setIdentificationCard(identificationCard);

    }

    /**
     * Test of getCellPhone method, of class Bill.
     */
    @Test
    public void testGetCellPhone() {
        System.out.println("getCellPhone");
        Bill instance = new Bill();
        String expResult = "0983023247";
        String result = instance.getCellPhone();
        assertEquals(expResult, result, null);

    }

    /**
     * Test of setCellPhone method, of class Bill.
     */
    @Test
    public void testSetCellPhone() {
        System.out.println("setCellPhone");
        String cellPhone = "0983023247";
        Bill instance = new Bill();
        instance.setCellPhone(cellPhone);

    }

}
