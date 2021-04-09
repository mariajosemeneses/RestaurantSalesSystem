/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import org.junit.Test;

/**
 *
 * @author Group 3
 */
public class SuggestionControllerTest {
    
    public SuggestionControllerTest() {
    }

    /**
     * Test of add method, of class SuggestionController.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String suggestion = "Good System";
        SuggestionController instance = new SuggestionController();
        instance.add(suggestion);        
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add2");
        String suggestion = "Improve a little bit the windos of program";
        SuggestionController instance = new SuggestionController();
        instance.add(suggestion);        
    }
    
    @Test
    public void testAdd3() {
        System.out.println("add3");
        String suggestion = "The Menu is great";
        SuggestionController instance = new SuggestionController();
        instance.add(suggestion);        
    }
    
}
