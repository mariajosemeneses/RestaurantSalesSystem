/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

/**
 *
 * @author Group3
 */
public abstract class Product {
    private String name;
    private float price;
    private int quantity;

    public Product() {
    }
    
    
    
    public void add(){
        
    }
    
    public void modiffy(){
        
    }
    
    public void delete(){
        
    }
    
    public void visualize(){
        
    }
    
    public void buy(){
        
    }
    
    public boolean availability(Food food, Drink drink, Snack snack , Dessert dessert){
        return true;
        
    }

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
