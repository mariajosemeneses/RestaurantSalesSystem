
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class Continental 
{
    private ArrayList<Ingredient> ingredients = new ArrayList<> ();
    private float price;

    public Continental(float price, ArrayList<Ingredient> ingredients) {
        this.price = price;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Continental{" + "ingredients=" + getIngredients() + ", price=" + getPrice() + '}';
    }

    /**
     * @return the ingredients
     */
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
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
   
    
    