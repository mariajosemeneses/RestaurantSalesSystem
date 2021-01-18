/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class TypeOfFood 
{
    private Lunch lunch;
    private ArrayList<Snack> na= new ArrayList<>();
    private Dessert dessert;
    private int quantity;
    private Breakfast breakfast;
    
    
    public void visualize(){
        
    }

    public TypeOfFood() {
    }

    public TypeOfFood(Lunch lunch, Dessert dessert, int quantity, Breakfast breakfast) {
        this.lunch = lunch;
        this.dessert = dessert;
        this.quantity = quantity;
        this.breakfast = breakfast;
    }

    @Override
    public String toString() {
        return "TypeOfFood{" + "lunch=" + lunch + ", na=" + na + ", dessert=" + dessert + ", quantity=" + quantity + ", breakfast=" + breakfast + '}';
    }

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public ArrayList<Snack> getNa() {
        return na;
    }

    public void setNa(ArrayList<Snack> na) {
        this.na = na;
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
    

   
    
}
