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
        Verification instance = new Verification();
        String expResult = "admin";
        String result = instance.getUser();
    }

    /**
     * Test of setUser method, of class Verification.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "admin";
        Verification instance = new Verification();
        instance.setUser(user);
    }

    /**
     * Test of getPassword method, of class Verification.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Verification instance = new Verification();
        String expResult = "admin123";
        String result = instance.getPassword();
    }

    /**
     * Test of setPassword method, of class Verification.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "admin123";
        Verification instance = new Verification();
        instance.setPassword(password);
    }
    
}
