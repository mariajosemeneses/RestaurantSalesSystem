/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

/**
 *
 * @author Maria José Meneses
 */
public class Breakfast extends Food{
    
    Drink drink;

    public Breakfast(Drink drink, String name, float price, int quantity) {
        super(name, price, quantity);
        this.drink = drink;
    }
    
    
}
