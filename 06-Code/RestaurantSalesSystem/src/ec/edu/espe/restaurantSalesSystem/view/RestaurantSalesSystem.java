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
            System.out.println("  5. Register Bill");
            System.out.println("  6. Register Soda");
            System.out.println("  7. Register Ingredient");
            System.out.println("  8. Exit");

            try {

                System.out.print("\nEnter one of the options: ");
                option = sn.nextInt();

                switch (option) {

                    case 1:

                        Customer customer = new Customer();
                        customer.registerCustomer(customer);
                        File file = new File("Customer.json");
                        String jsonCustomer = gson.toJson(customer);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true))) {
                            bw.write(jsonCustomer);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Customer.json", jsonCustomer);
                        System.out.println(" ");
                        break;

                    case 2:
                        Waiter waiter = new Waiter();
                        waiter.registerWaiter(waiter);
                        File file2 = new File("Waiter.json");

                        String jsonWaiter = gson.toJson(waiter);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2.getAbsoluteFile(), true))) {
                            bw.write(jsonWaiter);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(TypeOfFood.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Waiter.json", jsonWaiter);
                        System.out.println(" ");
                        break;

                    case 3:

                        Cashier cashier = new Cashier();
                        cashier.addCashier();
                        File file3 = new File("cashier.json");
                        String jsonCashier = gson.toJson(cashier);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file3.getAbsoluteFile(), true))) {
                            bw.write(jsonCashier);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Cashier.json", jsonCashier);
                        System.out.println(" ");

                    case 4:
                        Chef chef = new Chef();
                        chef.registerChef(chef);
                        File file4 = new File("Chef.json");
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
                        File file5 = new File("Bill.json");
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
                        Soda soda = new Soda();
                        soda.add();
                        File file6 = new File("Soda.json");
                        String jsonSoda = gson.toJson(soda);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file6.getAbsoluteFile(), true))) {
                            bw.write(jsonSoda);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Soda.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Soda.json", jsonSoda);
                        System.out.println(" ");
                        break;

                    case 7:
                        Ingredient ingredient = new Ingredient();

                        ingredient.registerIngredient(ingredient);
                        File file7 = new File("Ingredient.json");

                        String jsonIngredient = gson.toJson(ingredient);
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file7.getAbsoluteFile(), true))) {
                            bw.write(jsonIngredient);
                            bw.write('\n');
                        } catch (IOException ex) {
                            Logger.getLogger(Ingredient.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Ingredient.json", jsonIngredient);
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
