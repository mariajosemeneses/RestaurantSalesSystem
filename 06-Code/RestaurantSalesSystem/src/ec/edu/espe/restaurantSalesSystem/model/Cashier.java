
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
public class Cashier extends Person {

    private ArrayList<Customer> customers = new ArrayList();

    public Cashier(String id, int age, String name, String address, String email, String cellPhone,
            ArrayList<Customer> customers) {

        super(id, age, name, address, email, cellPhone);
        this.customers = customers;

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

}
