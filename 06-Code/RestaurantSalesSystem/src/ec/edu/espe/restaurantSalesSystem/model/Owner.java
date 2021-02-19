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
public class Owner extends Person{
    
    private ArrayList<Cashier> cashiers = new ArrayList();
    private ArrayList<Customer> customers = new ArrayList();
    private ArrayList<Course> courses = new ArrayList();
    private ArrayList<Chef> chefs = new ArrayList();
    private ArrayList<Waiter> waiters = new ArrayList();

    public Owner(String name, String address, String email, String cellPhone) {
        super(name, address, email, cellPhone);
    }
    public void add(){
        
    }
    
    public void delete(){
        
    } 
    public void edit(){
        
    }
    public void createCourse(Course course){
        
    }
    public void reportSale(){
        
    }
    public Owner(String name, String address, String email, String cellPhone, ArrayList<Cashier> cashiers, ArrayList<Customer> customers, ArrayList<Course> courses, ArrayList<Chef> chefs, ArrayList<Waiter> waiters) {
        super(name, address, email, cellPhone);
        this.cashiers = cashiers;
        this.customers = customers;
        this.courses = courses;
        this.chefs = chefs;
        this.waiters = waiters;
    }

    @Override
    public String toString() {
        return "Owner{" + "cashiers=" + cashiers + ", customers=" + customers + ", courses=" + courses + ", chefs=" + chefs + ", waiters=" + waiters + '}';
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
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
