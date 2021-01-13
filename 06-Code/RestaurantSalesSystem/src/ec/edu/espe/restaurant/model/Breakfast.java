/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author DAVID
 */
public class Breakfast 
{
    private TypeOfBreakfast typeOfBreakfast;
    private String content;
    private float price;
    private Drink drink;

    public Breakfast(TypeOfBreakfast typeOfBreakfast, String content, float price, Drink drink) {
        this.typeOfBreakfast = typeOfBreakfast;
        this.content = content;
        this.price = price;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Breakfast{" + "typeOfBreakfast=" + typeOfBreakfast + ", content=" + content + ", price=" + price + ", drink=" + drink + '}';
    }
    
    
    
    
    public void choice()
    {
        
    }
    public void billin()
    {
        
    }
    public void buy()
    {
        
    }

    /**
     * @return the typeOfBreakfast
     */
    public TypeOfBreakfast getTypeOfBreakfast() {
        return typeOfBreakfast;
    }

    /**
     * @param typeOfBreakfast the typeOfBreakfast to set
     */
    public void setTypeOfBreakfast(TypeOfBreakfast typeOfBreakfast) {
        this.typeOfBreakfast = typeOfBreakfast;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return the drink
     */
    public Drink getDrink() {
        return drink;
    }

    /**
     * @param drink the drink to set
     */
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    
    
}
