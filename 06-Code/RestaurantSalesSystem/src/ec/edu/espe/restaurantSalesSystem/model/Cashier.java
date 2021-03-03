
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Group3
 */
public class Cashier extends Employee {

    private ArrayList<Customer> customers = new ArrayList();
    private ArrayList<Product> products = new ArrayList();

    public Cashier(String id, int age, String name, String address, String email, String cellPhone,
            ArrayList<Customer> customers, ArrayList<Product> products) {

        super(id, age, name, address, email, cellPhone);
        this.customers = customers;
        this.products = products;

    }

    public void registerCustomer(Customer customer) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        customer.setName(input.nextLine());
        System.out.print("Enter address: ");
        customer.setAddress(input.nextLine());
        System.out.print("Enter email: ");
        customer.setEmail(input.nextLine());
        System.out.print("Enter phone number: ");
        customer.setCellPhone(input.nextLine());
        customers.add(customer);
    }

    public void registerOrder(Order order) {

    }

    public void generateBill(Bill bill) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        bill.setName(input.nextLine());
        System.out.print("Enter ID: ");
        bill.setDate(input.nextLine());
        System.out.print("Enter age: ");
        bill.setIdentificationCard(input.nextInt());
        input.nextLine();
        System.out.print("Enter phone number: ");
        bill.setCellPhone(input.nextLine());
        System.out.print("Enter descriptionr: ");
        bill.setDescription(input.nextLine());
        System.out.print("Enter direction: ");
        bill.setDirection(input.nextLine());
        
    }

    /**
     * @return the customers
     */
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    /**
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
}
