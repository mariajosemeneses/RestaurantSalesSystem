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
public class Ingredient {
    
    private String name;
    private int quantity;
    private int size;

    public Ingredient() {
    }

    public Ingredient(String name, int quantity, int size) {
        this.name = name;
        this.quantity = quantity;
        this.size = size;
    }
public void registerIngredient(Ingredient ingredient) {

        Scanner input = new Scanner(System.in);
        File file = new File("Ingredient.json");
   

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name: ");
                ingredient.setName(input.nextLine());
                System.out.print("Enter quantity: ");
                ingredient.setQuantity(input.nextInt());
                System.out.print("Enter size: ");
                ingredient.setSize(input.nextInt());
                

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Ingredient.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name: ");
                ingredient.setName(input.nextLine());
                System.out.print("Enter quantity: ");
                ingredient.setQuantity(input.nextInt());
                System.out.print("Enter size: ");
                ingredient.setSize(input.nextInt());
              

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Ingredient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public String toString() {
        return "Ingredient{" + "name=" + name + ", quantity=" + quantity + ", size=" + size + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    public void mix(){
        
    }
    
}
