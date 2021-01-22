/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.restaurantsalessystem.model.Cashier;
import ec.edu.espe.restaurantsalessystem.model.Customer;
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
            System.out.println("\n1. Register Customer");
            System.out.println("2. Find Data");
            System.out.println("3. Exit");

            try {

                System.out.println("\nEnter one of the options: ");
                option = sn.nextInt();

                switch (option) {

                    case 1:

                        Cashier object1 = new Cashier();
                        Customer object2 = new Customer();
                        object1.registerCustomer(object2);

                        String dataToSave = object1.toString();

                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Customer.csv", dataToSave);
                        System.out.println(" ");
                        break;

                    case 2:
                        File file = new File("Customer.csv");
                        Scanner keyboard = new Scanner(System.in);
                        System.out.println(" ");
                        System.out.print("Write the word to search in the file: ");
                        String data = keyboard.nextLine();
                        System.out.println("");
                        Data.find(file, data);
                        System.out.println(" ");
                        break;

                    case 3:
                        System.out.println("Thanks!!!");
                        exit = true;
                        System.out.println(" ");
                        break;

                    default:
                        System.out.println("Only numbers between  1 - 3");
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
