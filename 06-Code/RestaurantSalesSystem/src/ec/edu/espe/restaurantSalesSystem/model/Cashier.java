
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", customers=" + customers + ", courses=" + courses + '}';
    }

    public Cashier() {
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
