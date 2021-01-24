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


public class Chef {
    private String name;
    private String id;
    private int age;
    private String cellphone;

    public Chef(String name, String id, int age, String cellphone) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.cellphone = cellphone;
    }

    public Chef() {
    }
    
    public void registerChef(Chef chef) {

        Scanner input = new Scanner(System.in);
        File file = new File("Chef.json");

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name: ");
                chef.setName(input.nextLine());
                System.out.print("Enter ID: ");
                chef.setId(input.nextLine());
                System.out.print("Enter age: ");
                chef.setAge(input.nextInt());
                input.nextLine();
                System.out.print("Enter phone number: ");
                chef.setCellphone(input.nextLine());
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
                System.out.print("Enter name: ");
                chef.setName(input.nextLine());
                System.out.print("Enter ID: ");
                chef.setId(input.nextLine());
                System.out.print("Enter aget: ");
                chef.setAge(input.nextInt());
                input.nextLine();
                System.out.print("Enter phone number: ");
                chef.setCellphone(input.nextLine());
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(TypeOfFood.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Chef{" + "name=" + name + ", id=" + id + ", age=" + age + ", cellphone=" + cellphone + '}';
    }

    public void prepareCourse(Ingredient ingredient){
       
    }
    
    public void viewOrder(Order order){
        
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
