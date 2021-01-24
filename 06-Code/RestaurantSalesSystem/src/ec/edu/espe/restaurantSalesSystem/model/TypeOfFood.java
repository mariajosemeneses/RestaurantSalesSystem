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
public class TypeOfFood 
{
    
    private Lunch lunch;
    private ArrayList<Snack> snacks = new ArrayList();
    private Dessert dessert;
    private int quantity;
    private Breakfast breakfast;
    
    
    public void visualize(){
        
    }

    public TypeOfFood() {
    }

    public TypeOfFood(Lunch lunch, Dessert dessert, int quantity, Breakfast breakfast, ArrayList<Snack> snacks) {
        this.lunch = lunch;
        this.dessert = dessert;
        this.quantity = quantity;
        this.breakfast = breakfast;
        this.snacks = snacks;
    }

    public TypeOfFood(int quantity) {
        this.quantity = quantity;
    }
   
    
    @Override
    public String toString() {
        return "TypeOfFood{" + "lunch=" + lunch + ", snacks=" + snacks + ", dessert=" + dessert + ", quantity=" + quantity + ", breakfast=" + breakfast + '}';
    }

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public ArrayList<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Breakfast getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Breakfast breakfast) {
        this.breakfast = breakfast;
    }
    
 public void registerTypeOfFood(TypeOfFood typeOfFood) {

        Scanner input = new Scanner(System.in);
        File file = new File("TypeOfFood.json");
   

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                
                System.out.print("Enter quantity: ");
                typeOfFood.setQuantity(input.nextInt());
                
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
                
                System.out.print("Enter quantity: ");
                typeOfFood.setQuantity(input.nextInt());
                
              
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(TypeOfFood.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
   
    
}
