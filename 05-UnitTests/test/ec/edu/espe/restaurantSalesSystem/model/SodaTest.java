/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SodaTest {
    
    public SodaTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFlavorsAndBrands method, of class Soda.
     */
    @Test
    public void testGetFlavorsAndBrands() {
        System.out.println("getFlavorsAndBrands");
        ArrayList<String> flavorsandbrands = new ArrayList<>();
        Assert.assertEquals(0, flavorsandbrands.size());
        flavorsandbrands.add("Coca Cola : Normal. light o Zero");
        flavorsandbrands.add("Big Cola: Negra, Fresa, Limon o Piña");
        flavorsandbrands.add("Seven UP");
        Assert.assertEquals(3, flavorsandbrands.size());
        
    }

    /**
     * Test of setFlavorsAndBrands method, of class Soda.
     */
    @Test
    public void testSetFlavorsAndBrands() {
        System.out.println("setFlavorsAndBrands");
       ArrayList<String> flavorsandbrands = new ArrayList<>();
        Assert.assertEquals(0, flavorsandbrands.size());
        flavorsandbrands.add("Fanta");
        flavorsandbrands.add("Sprite");
        Assert.assertEquals(2, flavorsandbrands.size());
    }
    
}
