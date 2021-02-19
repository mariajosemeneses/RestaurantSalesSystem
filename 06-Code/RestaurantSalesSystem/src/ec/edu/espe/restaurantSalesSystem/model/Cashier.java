
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
public class Cashier extends Employee{

    private ArrayList<Customer> customers = new ArrayList();
    private ArrayList<Course> courses = new ArrayList();

    public Cashier(String id, int age, String name, String address, String email, String cellPhone, 
            ArrayList<Customer> customers, ArrayList<Course> courses) {
        
        super(id, age, name, address, email, cellPhone);
        this.customers = customers;
        this.courses = courses;
        
    }

    @Override
    public String toString() {
        return "Cashier{" + "id=" + id + ", age=" + age + ", customers=" + customers + ", courses=" 
                + courses + '}';
    }

    public void addCashier() {
        //Cashier cashier = new Cashier();

        Customer customer = new Customer();
        Course course = new Course();

        Scanner input = new Scanner(System.in);
        File file = new File("Cashier.json");

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter name the Cashier: ");
                //cashier.setName(input.nextLine());
                System.out.print("\nEnter information the Customer: \n");
                customer.registerCustomer(customer);
                customers.add(customer);
                System.out.print("Enter course: ");
                //course.setCourses(input.nextLine());
                //courses.add(course);

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Soda.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                 System.out.print("Enter name the Cashier: ");
                //cashier.setName(input.nextLine());
                System.out.print("\nEnter information the Customer: \n");
                customer.registerCustomer(customer);
                customers.add(customer);
                System.out.print("Enter course: ");
                //course.setCourses(input.nextLine());
                //courses.add(course);

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Soda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void registerCustomer(Customer customer) {

    }

    public void registerOrder(Order order) {

    }

    public void generateBill(Bill bill) {

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
