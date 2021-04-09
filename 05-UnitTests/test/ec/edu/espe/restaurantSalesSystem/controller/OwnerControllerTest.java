/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import ec.edu.espe.restaurantSalesSystem.model.Product;
import ec.edu.espe.restaurantsalessystem.model.Cashier;
import org.junit.Test;

/**
 *
 * @author Group 3
 */
public class OwnerControllerTest {

    public OwnerControllerTest() {
    }

    /**
     * Test of addEmployee method, of class OwnerController.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        String typeEmployee = "chef";
        Cashier cashier = new Cashier("1721451281", 25, "Jose Ramos", "Av. 6 December", "jose@gmail.com",
                "0993124857");
        OwnerController instance = new OwnerController();
        instance.addEmployee(typeEmployee, cashier);
    }

    /**
     * Test of updateEmployee method, of class OwnerController.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        String typeEmployee = "chef";
        String field = "email";
        String dataToFind = "jose@gmail.com";
        String newData = "jramos@gmail.com";
        OwnerController instance = new OwnerController();
        instance.updateEmployee(typeEmployee, dataToFind, newData, field);
    }

    /**
     * Test of deleteEmployee method, of class OwnerController.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee");
        String typeEmployee = "chef";
        String field = "name";
        String dataToFind = "Jose Ramos";
        OwnerController instance = new OwnerController();
        instance.deleteEmployee(typeEmployee, dataToFind, field);
    }

    /**
     * Test of createProduct method, of class OwnerController.
     */
    @Test
    public void testCreateProduct() {
        System.out.println("createProduct");
        Product product = new Product("DESSERT", "BROWNIE", (float) 2.50);
        OwnerController instance = new OwnerController();
        instance.createProduct(product);
    }

    /**
     * Test of deleteProduct method, of class OwnerController.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        String dataToDelete = "BROWNIE";
        OwnerController instance = new OwnerController();
        instance.deleteProduct(dataToDelete);
    }

    @Test
    public void testAddEmployee2() {
        System.out.println("addEmployee2");
        String typeEmployee = "waiter";
        Cashier cashier = new Cashier("1726381173", 28, "Luis Gonzales", "Conocoto", "luisG@gmail.com",
                "0983231452");
        OwnerController instance = new OwnerController();
        instance.addEmployee(typeEmployee, cashier);
    }

    /**
     * Test of updateEmployee method, of class OwnerController.
     */
    @Test
    public void testUpdateEmployee2() {
        System.out.println("updateEmployee2");
        String typeEmployee = "waiter";
        String field = "cellPhone";
        String dataToFind = "0983231452";
        String newData = "0993195907";
        OwnerController instance = new OwnerController();
        instance.updateEmployee(typeEmployee, dataToFind, newData, field);
    }

    /**
     * Test of deleteEmployee method, of class OwnerController.
     */
    @Test
    public void testDeleteEmployee2() {
        System.out.println("deleteEmployee2");
        String typeEmployee = "waiter";
        String field = "id";
        String dataToFind = "1726381173";
        OwnerController instance = new OwnerController();
        instance.deleteEmployee(typeEmployee, dataToFind, field);
    }

    /**
     * Test of createProduct method, of class OwnerController.
     */
    @Test
    public void testCreateProduct2() {
        System.out.println("createProduct2");
        Product product = new Product("DRINK", "CAFE EN LECHE", (float) 1.50);
        OwnerController instance = new OwnerController();
        instance.createProduct(product);
    }

    /**
     * Test of deleteProduct method, of class OwnerController.
     */
    @Test
    public void testDeleteProduct2() {
        System.out.println("deleteProduct2");
        String dataToDelete = "CAFE EN LECHE";
        OwnerController instance = new OwnerController();
        instance.deleteProduct(dataToDelete);
    }

    @Test
    public void testAddEmployee3() {
        System.out.println("addEmployee3");
        String typeEmployee = "cashier";
        Cashier cashier = new Cashier("172123891", 35, "Pablo Machado", "Barrionuevo", "pablo35@gmail.com",
                "0967310948");
        OwnerController instance = new OwnerController();
        instance.addEmployee(typeEmployee, cashier);
    }

    /**
     * Test of updateEmployee method, of class OwnerController.
     */
    @Test
    public void testUpdateEmployee3() {
        System.out.println("updateEmployee3");
        String typeEmployee = "cashier";
        String field = "address";
        String dataToFind = "Barrionuevo";
        String newData = "Chillogallo";
        OwnerController instance = new OwnerController();
        instance.updateEmployee(typeEmployee, dataToFind, newData, field);
    }

    /**
     * Test of deleteEmployee method, of class OwnerController.
     */
    @Test
    public void testDeleteEmployee3() {
        System.out.println("deleteEmployee3");
        String typeEmployee = "cashier";
        String field = "id";
        String dataToFind = "172123891";
        OwnerController instance = new OwnerController();
        instance.deleteEmployee(typeEmployee, dataToFind, field);
    }

    /**
     * Test of createProduct method, of class OwnerController.
     */
    @Test
    public void testCreateProduct3() {
        System.out.println("createProduct3");
        Product product = new Product("FRUIT", "UVA", (float) 1.50);
        OwnerController instance = new OwnerController();
        instance.createProduct(product);
    }

    /**
     * Test of deleteProduct method, of class OwnerController.
     */
    @Test
    public void testDeleteProduct3() {
        System.out.println("deleteProduct3");
        String dataToDelete = "UVA";
        OwnerController instance = new OwnerController();
        instance.deleteProduct(dataToDelete);
    }

    @Test
    public void testAddEmployee4() {
        System.out.println("addEmployee4");
        String typeEmployee = "chef";
        Cashier cashier = new Cashier("1768912382", 30, "Pedro Fuentes", "El Pintado", "pedro21@hotmail.com",
                "0984100492");
        OwnerController instance = new OwnerController();
        instance.addEmployee(typeEmployee, cashier);
    }

    /**
     * Test of updateEmployee method, of class OwnerController.
     */
    @Test
    public void testUpdateEmployee4() {
        System.out.println("updateEmployee4");
        String typeEmployee = "chef";
        String field = "name";
        String dataToFind = "Pedro Fuentes";
        String newData = "Santiago Fuentes";
        OwnerController instance = new OwnerController();
        instance.updateEmployee(typeEmployee, dataToFind, newData, field);
    }

    /**
     * Test of deleteEmployee method, of class OwnerController.
     */
    @Test
    public void testDeleteEmployee4() {
        System.out.println("deleteEmployee4");
        String typeEmployee = "chef";
        String field = "name";
        String dataToFind = "Santiago Fuentes";
        OwnerController instance = new OwnerController();
        instance.deleteEmployee(typeEmployee, dataToFind, field);
    }

    /**
     * Test of createProduct method, of class OwnerController.
     */
    @Test
    public void testCreateProduct4() {
        System.out.println("createProduct4");
        Product product = new Product("SNACK", "NACHOS CON QUESO", (float) 3.50);
        OwnerController instance = new OwnerController();
        instance.createProduct(product);
    }

    /**
     * Test of deleteProduct method, of class OwnerController.
     */
    @Test
    public void testDeleteProduct4() {
        System.out.println("deleteProduct4");
        String dataToDelete = "NACHOS CON QUESO";
        OwnerController instance = new OwnerController();
        instance.deleteProduct(dataToDelete);
    }
}
