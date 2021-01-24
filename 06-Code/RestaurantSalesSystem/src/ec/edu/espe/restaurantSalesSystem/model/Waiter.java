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
public class Waiter {
    private String name;
    private String id;
    private int age;
    private String cellphone;

    
    public Waiter(String name, String id, int age, String cellphone) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.cellphone = cellphone;
    }

     public void registerWaiter(Waiter waiter) {

        Scanner input = new Scanner(System.in);
        File file = new File("Waiter.json");

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name the waiter: ");
                waiter.setName(input.nextLine());
                System.out.print("Enter ID: ");
                waiter.setId(input.nextLine());
                System.out.print("Enter age: ");
                waiter.setAge(input.nextInt());
                input.nextLine();
                System.out.print("Enter phone number: ");
                waiter.setCellphone(input.nextLine());
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(TypeOfFood.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name the waiter : ");
                waiter.setName(input.nextLine());
                System.out.print("Enter ID: ");
                waiter.setId(input.nextLine());
                System.out.print("Enter aget: ");
                waiter.setAge(input.nextInt());
                input.nextLine();
                System.out.print("Enter phone number: ");
                waiter.setCellphone(input.nextLine());
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(TypeOfFood.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
    
    public Waiter() {
    }

    @Override
    public String toString() {
        return "Waiter{" + "name=" + name + ", id=" + id + ", age=" + age + ", cellphone=" + cellphone + '}';
    }
    
    
    public void deliverOrder(Order order){
        
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    
    
}
