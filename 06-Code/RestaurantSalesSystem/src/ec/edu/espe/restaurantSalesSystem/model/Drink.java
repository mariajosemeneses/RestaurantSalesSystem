/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

/**
 *
 * @author Group 3 
 */
public class Drink extends Product{
    
    String sizeCup;
    
    public void choice (Juice juice, Soda soda){
        
    }

    public Drink(String sizeCup, String name, float price, int quantity) {
        super(name, price, quantity);
        this.sizeCup = sizeCup;
    }
    
    
}
