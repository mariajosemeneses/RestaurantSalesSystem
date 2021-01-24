/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file4, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.restaurantsalessystem.model.Bill;
import ec.edu.espe.restaurantsalessystem.model.Cashier;
import ec.edu.espe.restaurantsalessystem.model.Chef;
import ec.edu.espe.restaurantsalessystem.model.Customer;
import ec.edu.espe.restaurantsalessystem.model.Ingredient;
import ec.edu.espe.restaurantsalessystem.model.Juice;
import ec.edu.espe.restaurantsalessystem.model.Soda;
import ec.edu.espe.restaurantsalessystem.model.TypeOfFood;
import ec.edu.espe.restaurantsalessystem.model.Waiter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Group3
 */
public class RestaurantSalesSystem {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("****Restaurant Sales System****");
            System.out.println("\n  1. Register Customer");
            System.out.println("  2. Register Waiter");
            System.out.println("  3. Register Cashier");
            System.out.println("  4. Register Chef");
            System.out.println("  5. Register Juice");
            System.out.println("  6. Register ");
            System.out.println("  7. Register Ingredient");
            System.out.println("  8. Exit");

            try {

                System.out.print("\nEnter one of the options: ");
                option = sn.nextInt();

                switch (option) {

                    case 1:

                        Customer customer = new Customer();
                        customer.registerCustomer(customer);                     
                        File file =new File("Customer.json");                        
                        String jsonObject = gson.toJson(customer);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true))) {
                            bw.write(jsonObject);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Customer.json", jsonObject);
                        System.out.println(" ");
                        break;

                    case 2:
                       Waiter waiter = new Waiter();
                        waiter.registerWaiter(waiter);                     
                        File file2 =new File("Waiter.json");                        
             
                        String jsonObject2 = gson.toJson(waiter);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2.getAbsoluteFile(), true))) {
                            bw.write(jsonObject2);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(TypeOfFood.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Waiter.json", jsonObject2);
                        System.out.println(" ");
                        break;
                        
                    case 3:

                        Cashier cashier = new Cashier();

                        //String dataToSave = cashier.toString();
                        System.out.println(" ");
                        System.out.println(" ");
                        //Data.save("Cashier.csv", dataToSave);
                        System.out.println(" ");
                        break;

                    case 4:
                        Chef chef = new Chef();
                        chef.registerChef(chef);                     
                        File file4 =new File("Chef.json");                        
                        String jsonChef = gson.toJson(chef);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file4.getAbsoluteFile(), true))) {
                            bw.write(jsonChef);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Chef.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Chef.json", jsonChef);
                        System.out.println(" ");
                        break;

                    case 5:
                        Bill bill = new Bill();
                        bill.registerBill(bill);                     
                        File file5 =new File("Bill.json");                        
                        String jsonBill = gson.toJson(bill);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file5.getAbsoluteFile(), true))) {
                            bw.write(jsonBill);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Bill.json", jsonBill);
                        System.out.println(" ");
                        break;

                    case 6:
                        Soda sado = new Soda();

                        // String dataToSave = cashier.toString();
                        System.out.println(" ");
                        System.out.println(" ");
                        //Data.save("Soda.csv", dataToSave);
                        System.out.println(" ");

                        break;

                    case 7:
                        Ingredient ingredient = new Ingredient();

                        ingredient.registerIngredient(ingredient);                     
                        File file7 =new File("Ingredient.json");                        
             
                        String jsonObject7 = gson.toJson(ingredient);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file7.getAbsoluteFile(), true))) {
                            bw.write(jsonObject7);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Ingredient.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Ingredient.json", jsonObject7);
                        System.out.println(" ");
                        break;
              

                    case 8:
                        System.out.println(" Thanks for trusting us!!!");
                        exit = true;
                        System.out.println(" ");
                        break;

                    default:
                        System.out.println("Only numbers between  1 - 8");
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
