/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem;

import ec.edu.espe.restaurant.model.Cashier;
import ec.edu.espe.restaurant.model.Customer;

/**
 *
 * @author Group3
 */
public class restaurantSalesSystem {

    public static void main(String[] args) {

        Cashier cashier = new Cashier("JAVIER");
        Cashier cashier2 = new Cashier("MARCO");
        Cashier cashier3 = new Cashier("VINICIO");

        Cashier[] cashiers;
        cashiers = new Cashier[2];

        Customer customer = new Customer("Andres", "street 10 the December", "andres@gmail.com ", "0986124565");
        Customer customer2 = new Customer("Maria", "Av. Simón Bolívar ", "maria2006@gmail.com ", "0946523647");

        String[] food = {"Hamburguesa", "Sandwitch", "Pizza", "Chicken Rice"};
        System.out.println("toys size --> " + food.length);

        int[] numberCustomer = {2, 3, 2, 1, 4, 1};
       
        try {
            System.out.println("numbers[7] -> " + numberCustomer[6]);
        } catch (Exception ex) {
            
            System.out.println("cannot read more than six items ");
                }
    }

   

    
}
