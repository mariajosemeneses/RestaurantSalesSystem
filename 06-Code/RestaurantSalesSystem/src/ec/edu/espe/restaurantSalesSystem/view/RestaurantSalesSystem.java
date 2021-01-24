/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.restaurantsalessystem.model.Cashier;
import ec.edu.espe.restaurantsalessystem.model.Chef;
import ec.edu.espe.restaurantsalessystem.model.Customer;
import ec.edu.espe.restaurantsalessystem.model.Ingredient;
import ec.edu.espe.restaurantsalessystem.model.Juice;
import ec.edu.espe.restaurantsalessystem.model.Soda;
import ec.edu.espe.restaurantsalessystem.model.TypeOfFood;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Group3
 */
public class RestaurantSalesSystem {

    public static void main(String[] args) {

        Cashier[] cashiers;
        cashiers = new Cashier[3];

        //library : GSON
        String jsonType;

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("****Restaurant Sales System****");
            System.out.println("\n  1. Register Customer");
            System.out.println("  2. Register Food");
            System.out.println("  3. Register Cashier");
            System.out.println("  4. Register Chef");
            System.out.println("  5. Register Juice");
            System.out.println("  6. Register Soda");
            System.out.println("  7. Register Ingredient");
            System.out.println("  8. Exit");

            try {

                System.out.print("\nEnter one of the options: ");
                option = sn.nextInt();

                switch (option) {

                    case 1:

                        Cashier cashier = new Cashier();
                        Customer customer = new Customer();
                        cashier.registerCustomer(customer);

                        String dataToSave = cashier.toString();

                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Customer.csv", dataToSave);
                        System.out.println(" ");
                        break;

                    case 2:
                        TypeOfFood food = new TypeOfFood();
                        //cashier.registerCustomer(customer);

                        //String dataToSave = cashier.toString();
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("TypeOfFood.csv", dataToSave);
                        System.out.println(" ");

                        break;
                    case 3:

                        Cashier cashier1 = new Cashier();
                      

                        //String dataToSave = cashier.toString();

                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Cashier.csv", dataToSave);
                        System.out.println(" ");
                        break;

                    case 4:
                        Chef chef = new Chef();

                        //String dataToSave = cashier.toString();
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Chef.csv", dataToSave);
                        System.out.println(" ");

                        break;

                    case 5:
                        Juice juice = new Juice();

                        //String dataToSave = cashier.toString();
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Juice.csv", dataToSave);
                        System.out.println(" ");

                        break;

                    case 6:
                        Soda sado = new Soda();

                        // String dataToSave = cashier.toString();
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Soda.csv", dataToSave);
                        System.out.println(" ");

                        break;

                    case 7:
                        Ingredient ingredient = new Ingredient();

                        // String dataToSave = cashier.toString();
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Ingredient.csv", dataToSave);
                        System.out.println(" ");

                        break;

                    case 8:
                        System.out.println(" Thanks for trusting us!!!");
                        exit = true;
                        System.out.println(" ");
                        break;

                    default:
                        System.out.println("Only numbers between  1 - 4");
                        System.out.println(" ");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number!!");
                System.out.println(" ");
                sn.next();

            }
        }
              
        
    }
    
    

}
