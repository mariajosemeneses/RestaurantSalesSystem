/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import ec.edu.espe.restaurantSalesSystem.model.Verification;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group 3
 */
public class VerificationControllerTest {
    
    /**
     * Test of login method, of class VerificationController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Verification verification = null;
        String user = "rmbonilla";
        String password = "bonilla2021";
        VerificationController instance = new VerificationController();
        boolean expResult = true;
        boolean result = instance.login(verification, user, password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin2() {
        System.out.println("User and password incorrect");
        Verification verification = null;
        String user = "rmbonilla1";
        String password = "bonilla";
        VerificationController instance = new VerificationController();
        boolean expResult = false;
        boolean result = instance.login(verification, user, password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin3() {
        System.out.println("User incorrect");
        Verification verification = null;
        String user = "rmbonilla1";
        String password = "bonilla2021";
        VerificationController instance = new VerificationController();
        boolean expResult = false;
        boolean result = instance.login(verification, user, password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin4() {
        System.out.println("Password incorrect");
        Verification verification = null;
        String user = "rmbonilla";
        String password = "bonilla25";
        VerificationController instance = new VerificationController();
        boolean expResult = false;
        boolean result = instance.login(verification, user, password);
        assertEquals(expResult, result);
    }
}
