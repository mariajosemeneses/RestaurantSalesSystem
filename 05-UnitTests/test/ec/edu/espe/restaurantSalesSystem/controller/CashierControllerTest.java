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
public class CashierControllerTest {

    public CashierControllerTest() {
    }

    /**
     * Test of generateBill method, of class CashierController.
     */
    @Test
    public void testGenerateBill() {
        System.out.println("generateBill");
        String name = "Juan Flores";
        String id = "1725039121";
        String cellPhone = "0994128421";
        String date = "2021/4/3";
        String cashier = "Jose Ramos";
        double pay = 93.14;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill2() {
        System.out.println("generateBill2");
        String name = "Pedro Lopez";
        String id = "1728312401";
        String cellPhone = "0993821741";
        String date = "2021/4/3";
        String cashier = "Karen Trujillo";
        double pay = 27.144;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill3() {
        System.out.println("generateBill3");
        String name = "Juan Rodriguez";
        String id = "1728321941";
        String cellPhone = "099371412";
        String date = "2021/4/3";
        String cashier = "Jose Ramos";
        double pay = 2.93;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill4() {
        System.out.println("generateBill4");
        String name = "Jorge Navarrete";
        String id = "1729841024";
        String cellPhone = "0986182414";
        String date = "2021/04/04";
        String cashier = "Karen Trujillo";
        double pay = 114.894;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill5() {
        System.out.println("generateBill5");
        String name = "Mishell Tipan";
        String id = "1724686538";
        String cellPhone = "0988274305";
        String date = "2021/4/5";
        String cashier = "Pablo Lugmaña";
        double pay = 19.954;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill6() {
        System.out.println("generateBill6");
        String name = "Fernando Paredes";
        String id = "1726134719";
        String cellPhone = "09868742877";
        String date = "2021/4/5";
        String cashier = "Jose Ramos";
        double pay = 93.14;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill7() {
        System.out.println("generateBill7");
        String name = "Jaime Arteaga";
        String id = "1727249014";
        String cellPhone = "0974532427";
        String date = "2021/4/5";
        String cashier = "Jorge Rodriguez";
        double pay = 104.24;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill8() {
        System.out.println("generateBill8");
        String name = "Sebastian Portero";
        String id = "1721324392";
        String cellPhone = "0987103104";
        String date = "2021/4/5";
        String cashier = "Jose Ramos";
        double pay = 23.20;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill9() {
        System.out.println("generateBill9");
        String name = "Fernando Flores";
        String id = "1728471913";
        String cellPhone = "0960194823";
        String date = "2021/4/6";
        String cashier = "Karen Trujillo";
        double pay = 56.781;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }
    
    @Test
    public void testGenerateBill10() {
        System.out.println("generateBill10");
        String name = "Felix Segovia";
        String id = "1726281492";
        String cellPhone = "0988742003";
        String date = "2021/4/6";
        String cashier = "Jorge Rodriguez";
        double pay = 100.94;
        CashierController instance = new CashierController();
        instance.generateBill(name, id, cellPhone, date, cashier, pay);
    }

}
