/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

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
public class VerificationTest {
    
    public VerificationTest() {
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
     * Test of getUser method, of class Verification.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Verification instance = new Verification("admin","");
        String expResult = "admin";
        String result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class Verification.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "admin";
        Verification instance = new Verification(user,"");
        instance.setUser(user);
    }

    /**
     * Test of getPassword method, of class Verification.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Verification instance = new Verification("","admin123");
        String expResult = "admin123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Verification.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "admin123";
        Verification instance = new Verification("",password);
        instance.setPassword(password);
    }
    
}
