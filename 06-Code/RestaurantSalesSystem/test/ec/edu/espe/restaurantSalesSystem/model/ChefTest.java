/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Chef;
import ec.edu.espe.restaurantsalessystem.model.Order;
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
public class ChefTest {
    
    public ChefTest() {
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
     * Test of toString method, of class Chef.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Chef instance = new Chef();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCourse method, of class Chef.
     */
    @Test
    public void testPrepareCourse() {
        System.out.println("prepareCourse");
        Chef instance = new Chef();
        instance.prepareCourse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewOrder method, of class Chef.
     */
    @Test
    public void testViewOrder() {
        System.out.println("viewOrder");
        Order order = null;
        Chef instance = new Chef();
        instance.viewOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Chef.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Chef instance = new Chef();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Chef.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Chef instance = new Chef();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Chef.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Chef instance = new Chef();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Chef.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Chef instance = new Chef();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Chef.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Chef instance = new Chef();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Chef.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Chef instance = new Chef();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellphone method, of class Chef.
     */
    @Test
    public void testGetCellphone() {
        System.out.println("getCellphone");
        Chef instance = new Chef();
        String expResult = "";
        String result = instance.getCellphone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellphone method, of class Chef.
     */
    @Test
    public void testSetCellphone() {
        System.out.println("setCellphone");
        String cellphone = "";
        Chef instance = new Chef();
        instance.setCellphone(cellphone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
