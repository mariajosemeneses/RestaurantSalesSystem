/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class Order 
{
    private int numberOrder;
    private Customer customer;
    private ArrayList<Course> courses= new ArrayList();
    private float price;
    private int tableNumber;

    public Order() {
    }

    public Order(int numberOrder, Customer customer, float price, int tableNumber, ArrayList<Course> courses) {
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.price = price;
        this.tableNumber = tableNumber;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Order{" + "numberOrder=" + numberOrder + ", customer=" + customer + ", courses=" + courses + ", price=" + price + ", tableNumber=" + tableNumber + '}';
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
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

    
    public void generateOrder()
    {
        
    }
    public void removeOrder()
    {
        
    }
    public void visualize()
    {
        
    }
    public void calculateTotal(int quantity, float price)
    {
        
    }

}
