/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

import java.util.ArrayList;



/**
 *
 * @author Maria José Meneses
 */
public class Owner {
    private String name;
    private ArrayList<Cashier> cashiers = new ArrayList();
    private ArrayList<Customer> customers = new ArrayList();
    private ArrayList<Course> courses = new ArrayList();
    private ArrayList<Chef> chefs = new ArrayList();
    private ArrayList<Waiter> waiters = new ArrayList();

    
    
    public void addCashier(Cashier cashier){
        
    }
    
    public void deleteCashier(Cashier cashier){
        
    } 
    
    public void editCashier(Cashier cashier){
        
    } 
    
    public void createCourse(Course course){
        
    }
    
    public void editCourse(Course course){
        
    }
    
    public void deleteCourse(Course course){
        
    }
    
    public void addChef(Chef chef){
        
    }
    
    public void deleteChef(Chef chef){
        
    }
    
    public void editChef(Chef chef){
        
    }
    
    public void addWaiter(Waiter waiter){
        
    }
    
    public void editWaiter(Waiter waiter){
        
    }
    
    public void deleteWaiter(Waiter waiter){
        
    }
    
    public void reportSale(){
        
    }

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + ", cashiers=" + cashiers + ", customer=" + customers + ", course=" + courses + ", chefs=" + chefs + ", waiters=" + waiters + '}';
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cashiers
     */
    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }

    /**
     * @param cashiers the cashiers to set
     */
    public void setCashiers(ArrayList<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    /**
     * @return the customer
     */
    public ArrayList<Customer> getCustomer() {
        return customers;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(ArrayList<Customer> customer) {
        this.customers = customer;
    }

    /**
     * @return the course
     */
    public ArrayList<Course> getCourse() {
        return courses;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(ArrayList<Course> course) {
        this.courses = course;
    }

    /**
     * @return the chefs
     */
    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    /**
     * @param chefs the chefs to set
     */
    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }

    /**
     * @return the waiters
     */
    public ArrayList<Waiter> getWaiters() {
        return waiters;
    }

    /**
     * @param waiters the waiters to set
     */
    public void setWaiters(ArrayList<Waiter> waiters) {
        this.waiters = waiters;
    }
    
    
}
