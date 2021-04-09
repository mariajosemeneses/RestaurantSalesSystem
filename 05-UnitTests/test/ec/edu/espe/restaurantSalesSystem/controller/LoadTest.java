/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import javax.swing.JProgressBar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group 3
 */
public class LoadTest {
    
    public LoadTest() {
    }

    /**
     * Test of run method, of class Load.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Load instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pausa method, of class Load.
     */
    @Test
    public void testPausa() {
        System.out.println("pausa");
        int mlSeg = 0;
        Load instance = null;
        instance.pausa(mlSeg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProgress method, of class Load.
     */
    @Test
    public void testGetProgress() {
        System.out.println("getProgress");
        Load instance = null;
        JProgressBar expResult = null;
        JProgressBar result = instance.getProgress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgress method, of class Load.
     */
    @Test
    public void testSetProgress() {
        System.out.println("setProgress");
        JProgressBar progress = null;
        Load instance = null;
        instance.setProgress(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
