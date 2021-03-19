/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class Owner extends Person {

    private ArrayList<Cashier> cashiers = new ArrayList();
    private ArrayList<Customer> customers = new ArrayList();
    private ArrayList<Product> products = new ArrayList();
    private ArrayList<Chef> chefs = new ArrayList();
    private ArrayList<Waiter> waiters = new ArrayList();

    public Owner(String id, int age, String name, String address, String email, String cellPhone) {
        super(id, age, name, address, email, cellPhone);
    }

    public Owner() {
    }

    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }

    public void setCashiers(ArrayList<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setCourses(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }

    public ArrayList<Waiter> getWaiters() {
        return waiters;
    }

    public void setWaiters(ArrayList<Waiter> waiters) {
        this.waiters = waiters;
    }

}
