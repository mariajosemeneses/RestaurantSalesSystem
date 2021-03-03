/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file4, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.view;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import ec.edu.espe.restaurantsalessystem.model.Bill;
import ec.edu.espe.restaurantsalessystem.model.Cashier;
import ec.edu.espe.restaurantsalessystem.model.Chef;
import ec.edu.espe.restaurantsalessystem.model.Customer;
//import ec.edu.espe.restaurantsalessystem.model.Juice;
import ec.edu.espe.restaurantSalesSystem.model.Soda;
import ec.edu.espe.restaurantSalesSystem.model.Food;
import ec.edu.espe.restaurantSalesSystem.model.Product;
import static ec.edu.espe.restaurantSalesSystem.utils.Connection.createConnection;
import ec.edu.espe.restaurantsalessystem.model.Waiter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ec.edu.espe.restaurantsalessystem.utils.CrudOperation.create;
import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class RestaurantSalesSystem {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        MongoClient mongo = createConnection();
        ArrayList<Customer> customers = new ArrayList();
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

                        Customer customer = new Customer("", "", "", "");
                        try {
                            if (mongo != null) {
                                
                                System.out.println("\nADD CUSTOMER");
                                sn.nextLine();
                                System.out.print("Enter name: ");
                                customer.setName(sn.nextLine());
                                System.out.print("Enter address: ");
                                customer.setAddress(sn.nextLine());
                                System.out.print("Enter email: ");
                                customer.setEmail(sn.nextLine());
                                System.out.print("Enter phone number: ");
                                customer.setCellPhone(sn.nextLine());
                                customers.add(customer);
                                create(mongo, "Person", "customers", customer.getName(), customer.getAddress(), 
                                        customer.getEmail(), customer.getCellPhone(), 0, "");
                                System.out.println("\nNEW CUSTOMER ADDED!\n");
                                break;
                            }
                        } catch (Exception ex) {
                            System.out.println("Database could not be created");
                        }
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
                            Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        Data.save("Waiter.json", jsonWaiter);
                        System.out.println(" ");
                        break;

                    case 3:
                        ArrayList<Product> products = new ArrayList();
                        Cashier cashier = new Cashier("", 0, "", "", "", "", customers);
                        try {
                            if (mongo != null) {
                                System.out.println("\nADD CASHIER");
                                sn.nextLine();
                                System.out.print("Enter name: ");
                                cashier.setName(sn.nextLine());
                                System.out.print("Enter address: ");
                                cashier.setAddress(sn.nextLine());
                                System.out.print("Enter email: ");
                                cashier.setEmail(sn.nextLine());
                                System.out.print("Enter phone number: ");
                                cashier.setCellPhone(sn.nextLine());
                                System.out.print("Enter age: ");
                                cashier.setAge(sn.nextInt());
                                sn.nextLine();
                                System.out.print("Enter id: ");
                                cashier.setId(sn.nextLine());
                                create(mongo, "Employee", "cashiers", cashier.getName(), cashier.getAddress(), 
                                        cashier.getEmail(), cashier.getCellPhone(), cashier.getAge(), 
                                        cashier.getId());
                                System.out.println("\nNEW CASHIER ADDED!\n");
                                break;
                            }
                        } catch (Exception ex) {
                            System.out.println("Database could not be created");
                        }
                        break;

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
