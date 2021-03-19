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
public class Order {

    private int numberOrder;
    private Customer customer;
    private ArrayList<Product> products = new ArrayList();
    private float price;
    private int tableNumber;

    public Order(int numberOrder, Customer customer, float price, int tableNumber) {
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.price = price;
        this.tableNumber = tableNumber;
    }

    Order() {

    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

}
