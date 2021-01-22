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
public class Cashier 
{
    private String name;
    private ArrayList<Customer> customers = new ArrayList();
    private ArrayList<Course> courses = new ArrayList();
    
    public Cashier(String name, ArrayList<Customer> customers, ArrayList<Course> courses) {
        this.name = name;
        this.customers = customers;
        this.courses = courses;
    }

    public Cashier(String javier) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", customers=" + customers + ", courses=" + courses + '}';
    }
        
    
    public void registerCustomer(Customer customer)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        customer.setName(input.nextLine());
        System.out.print("Enter adress: ");
        customer.setAddress(input.nextLine());
        System.out.print("Enter email: ");
        customer.setEmail(input.nextLine());
        System.out.print("Enter phone number: ");
        customer.setPhoneNumber(input.nextLine());
        customers.add(customer);
    }
    public void registerOrder(Order order)
    {
        
    }
    public void generate(Bill bill)
    {
        
    }
    public void viewMenu(Course course)
    {
        
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
     * @return the courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
