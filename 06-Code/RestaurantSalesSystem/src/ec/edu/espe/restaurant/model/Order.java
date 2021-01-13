/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author Group3
 */
public class Order 
{
    private int numberOrder;
    private Customer customer;
    private Course course;
    private float price;
    private int tableNumber;

    public Order(int numberOrder, Customer customer, Course course, float price, int tableNumber) {
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.course = course;
        this.price = price;
        this.tableNumber = tableNumber;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" + "numberOrder=" + numberOrder + ", customer=" + customer + ", course=" + course + ", price=" + price + ", tableNumber=" + tableNumber + '}';
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
    public void calculateTotal(Quantity quantity, float price)
    {
        
    }

    /**
     * @return the numberOrder
     */
    public int getNumberOrder() {
        return numberOrder;
    }

    /**
     * @param numberOrder the numberOrder to set
     */
    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the tableNumber
     */
    public int getTableNumber() {
        return tableNumber;
    }

    /**
     * @param tableNumber the tableNumber to set
     */
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    
    
}
