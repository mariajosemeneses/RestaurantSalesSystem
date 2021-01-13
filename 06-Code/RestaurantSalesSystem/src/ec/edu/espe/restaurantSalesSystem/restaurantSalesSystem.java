/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem;

import com.google.gson.Gson;
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
        cashiers = new Cashier[3];

        Customer[] customers;
        customers = new Customer[2];
        Customer customer = new Customer("Andres", "street 10 the December", "andres@gmail.com ", "0986124565");
        Customer customer2 = new Customer("Maria", "Av. Simón Bolívar ", "maria2006@gmail.com ", "0946523647");

        String[] foods = {"Hamburguesa", "Sandwitch", "Pizza", "Chicken Rice"};
        System.out.println("food size --> " + foods.length);

        int[] numberCustomer = {2, 3, 2, 1, 4, 1};

        try {
            System.out.println("numbers[7] -> " + numberCustomer[6]);
        } catch (Exception ex) {

            System.out.println("cannot read more than six items ");
        }

        System.out.println("cashiers --> " + cashiers[0]);
        System.out.println("cashiers --> " + cashiers[1]);
        System.out.println("cashiers --> " + cashiers[2]);

        for (int i = 0; i < foods.length; i++) {
            System.out.println("food[" + (i + 1) + "] -> " + foods[i]);
        }
        foods[1] = "Pizzas";
        for (String food : foods) {
            System.out.println("food -> " + food);
        }

        for (int number : numberCustomer) {
            number = number * 10;
            System.out.println(number);
        }

        System.out.println("customers --> " + customers[0]);
        System.out.println("customers --> " + customers[1]);

        for (int i = 0; i < cashiers.length; i++) {
            cashiers[i] = new Cashier("Carlos ");
        }
        
       
 

        int counter = 0;
        for (Cashier ch : cashiers) {
            System.out.println("cashiers (" + (++counter) + ") -> " + ch);
        }
        
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer("Pepe","sangolqui","pepe@gamil.com","032114");
        }
        System.out.println("customers --> " + customers[0]);
        System.out.println("customers --> " + customers[1]);
        

        int counter1 = 0;

        for (Customer ch : customers) {
            System.out.println("customers (" + (++counter1) + ") -> " + ch);
        }
        
        
        
        //library : GSON
        Gson gson = new Gson();
        String jsonCashier;
        String jsonCustomer;
           
       //serialization
        jsonCashier = gson.toJson(cashier);

        System.out.println("cashier  in json format -> " + jsonCashier);

        jsonCashier = gson.toJson(cashier2);

        System.out.println("cashier  in json format -> " + jsonCashier);

        //serialization
        jsonCustomer = gson.toJson(customer);

        System.out.println("cashier  in json format -> " + jsonCustomer);

        jsonCustomer = gson.toJson(customer2);

        System.out.println("cashier  in json format -> " + jsonCustomer);
        
        //deserialization
        
        String jsonCh= "{\"name\":\"Juanita\"}";
        
        Cashier cashier4;
        cashier4 = gson.fromJson(jsonCh, Cashier.class);
        
        System.out.println("cashier 4 -> " + cashier4);
        
        
        String jsonC = "{\"name\":\"Francisco\",\"adress\":\"Machachi\","
                + "\"email\":\"fracis@gmail.com\",\"phoneNumber\":\"098563211\"}";
        
        Customer customer3;
        customer3 = gson.fromJson(jsonC, Customer.class);
        
        System.out.println("customer3 -> " + customer3);
    }
}
