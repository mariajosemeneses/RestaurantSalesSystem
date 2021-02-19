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
public class Juice extends Drink{
    
    private String fruit;

    public Juice(String sizeCup, String name, float price, int quantity) {
        super(sizeCup, name, price, quantity);
    }
    
    
}
