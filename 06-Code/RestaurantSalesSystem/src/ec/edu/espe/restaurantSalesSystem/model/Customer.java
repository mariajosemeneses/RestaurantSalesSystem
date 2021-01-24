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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Group3
 */
public class Customer 
{
    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    public Customer() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Order placedOfOrder()
    { 
        return new Order();
    }
    public void cancelOrder ()
    {
        
    }
    public Order editOrder()
    {
        return new Order();
    }
    
    public void viewOrder()
    {
        
    }
    public void viewMenu(Course course)
    {
        
    }
    
    public Customer(String name, String adress, String email, String phoneNumber) {
        this.name = name;
        this.address = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void registerCustomer(Customer customer) {

        Scanner input = new Scanner(System.in);
        File file = new File("Customer.json");
   

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name: ");
                customer.setName(input.nextLine());
                System.out.print("Enter address: ");
                customer.setAddress(input.nextLine());
                System.out.print("Enter email: ");
                customer.setEmail(input.nextLine());
                System.out.print("Enter phone number: ");
                customer.setPhoneNumber(input.nextLine());
                

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name: ");
                customer.setName(input.nextLine());
                System.out.print("Enter adress: ");
                customer.setAddress(input.nextLine());
                System.out.print("Enter email: ");
                customer.setEmail(input.nextLine());
                System.out.print("Enter phone number: ");
                customer.setPhoneNumber(input.nextLine());
              

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
    
