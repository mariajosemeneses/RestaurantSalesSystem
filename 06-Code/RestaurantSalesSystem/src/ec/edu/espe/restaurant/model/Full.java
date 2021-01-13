/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author Group3
 */
public class Full 
{
    private String ingredient;
    private float price;

    public Full(String ingredient, float price) {
        this.ingredient = ingredient;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Full{" + "ingredient=" + ingredient + ", price=" + price + '}';
    }
    
    
    
    public void choice()
    {
        
    }

    /**
     * @return the ingredient
     */
    public String getIngredient() {
        return ingredient;
    }

    /**
     * @param ingredient the ingredient to set
     */
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
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
}
