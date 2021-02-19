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
public class Snack extends Product{
    
    String brand;
    String size;

    public Snack(String brand, String size, String name, float price, int quantity) {
        super(name, price, quantity);
        this.brand = brand;
        this.size = size;
    }
    
    
}
