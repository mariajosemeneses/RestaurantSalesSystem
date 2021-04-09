/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Person;
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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new PersonImpl();
        String expResult = "Gabriel Perez";
        String result = instance.getName();
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Gabriel Perez";
        Person instance = new PersonImpl();
        instance.setName(name);
    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Person instance = new PersonImpl();
        String expResult = "San Juan";
        String result = instance.getAddress();
    }

    /**
     * Test of setAddress method, of class Person.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "San Juan";
        Person instance = new PersonImpl();
        instance.setAddress(address);
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new PersonImpl();
        String expResult = "gabriel@gmail.com";
        String result = instance.getEmail();
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "gabriel@gmail.com";
        Person instance = new PersonImpl();
        instance.setEmail(email);
    }

    /**
     * Test of getCellPhone method, of class Person.
     */
    @Test
    public void testGetCellPhone() {
        System.out.println("getCellPhone");
        Person instance = new PersonImpl();
        String expResult = "0948375839";
        String result = instance.getCellPhone();
    }

    /**
     * Test of setCellPhone method, of class Person.
     */
    @Test
    public void testSetCellPhone() {
        System.out.println("setCellPhone");
        String cellPhone = "0948375839";
        Person instance = new PersonImpl();
        instance.setCellPhone(cellPhone);
    }

    public class PersonImpl extends Person {
    }
    
}
