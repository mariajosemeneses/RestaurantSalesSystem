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
public class SnackTest {
    
    public SnackTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getChoppeds method, of class Snack.
     */
    @Test
    public void testGetChoppeds() {
        System.out.println("getChoppeds");
        ArrayList<String> choppeds = new ArrayList<>();
        Assert.assertEquals(0, choppeds.size());
        choppeds.add("Alitas: BBQ O BUFALO con papas y tiras de apio y zanahoria");
        Assert.assertEquals(1, choppeds.size());
    }

    /**
     * Test of setChoppeds method, of class Snack.
     */
    @Test
    public void testSetChoppeds() {
        System.out.println("setChoppeds");
        ArrayList<String> choppeds = new ArrayList<>();
        Assert.assertEquals(0, choppeds.size());
        choppeds.add("Picaditas: papas con picado de pollo salchica y carne");
        Assert.assertEquals(1, choppeds.size());
    }
    /**
     * Test of getSalads method, of class Snack.
     */
    @Test
    public void testGetSalads() {
        System.out.println("getSalads");
        ArrayList<String> salads= new ArrayList<>();
        Assert.assertEquals(0, salads.size());
        salads.add("Nachos con queso: nachos con queso rallado");
        Assert.assertEquals(1, salads.size());
       
    }

    /**
     * Test of setSalads method, of class Snack.
     */
    @Test
    public void testSetSalads() {
        System.out.println("setSalads");
        ArrayList<String> salads= new ArrayList<>();
        Assert.assertEquals(0, salads.size());
        salads.add("Andinacho: lechuga, tomate, queso rallado,frejol refrito y nachos");
        Assert.assertEquals(1, salads.size());
    }

    /**
     * Test of getHamburguers method, of class Snack.
     */
    @Test
    public void testGetHamburguers() {
        System.out.println("getHamburguers");
        ArrayList<String> hamburguers= new ArrayList<>();
        Assert.assertEquals(0, hamburguers.size());
        hamburguers.add("Hamburguesas: clasica, queso, tocino o pollo con papas y soda");
        Assert.assertEquals(1, hamburguers.size());
    }

    /**
     * Test of setHamburguers method, of class Snack.
     */
    @Test
    public void testSetHamburguers() {
        System.out.println("setHamburguers");
        ArrayList<String> hamburguers = new ArrayList<>();
        Assert.assertEquals(0, hamburguers.size());
        hamburguers.add("Hamburguesas: cheese, queso Americano");
        Assert.assertEquals(1, hamburguers.size());
    }

    /**
     * Test of getSandwitches method, of class Snack.
     */
    @Test
    public void testGetSandwitches() {
        System.out.println("getSandwitches");
        ArrayList<String> sandwitches = new ArrayList<>();
        Assert.assertEquals(0, sandwitches.size());
        sandwitches.add("Pechuga de pollo: lechuga, tomate, queso, mayonesa, pechuga de pollo");
        Assert.assertEquals(1, sandwitches.size());
    }

    /**
     * Test of setSandwitches method, of class Snack.
     */
    @Test
    public void testSetSandwitches() {
        System.out.println("setSandwitches");
        ArrayList<String> sandwitches = new ArrayList<>();
        Assert.assertEquals(0, sandwitches.size());
        sandwitches.add("Queso a la plancha: lechuga, tomate, queso mozzarella");
        Assert.assertEquals(1, sandwitches.size());
    }
    
}
