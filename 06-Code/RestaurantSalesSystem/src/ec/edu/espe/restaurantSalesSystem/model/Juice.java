/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Group3 
 */
public class Juice extends Drink{
    
    ArrayList<String> fruits = new ArrayList();

    public Juice(String name, float price, int quantity) {
        super(name, price, quantity);
    }

    public ArrayList<String> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<String> fruits) {
        this.fruits = fruits;
    }
    
    
}
