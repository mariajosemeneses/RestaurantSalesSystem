/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author Sebas
 */
public class Drink 
{
    private TypeOfDrink tupeOfDrink;
    private float price;
    
    public void buy()
    {
        
    }
    public float computeCost(int a)
    {
        return a;
    }
    public boolean availability(TypeOfDrink typeOfDrink)
    {
        return true;
    }

    /**
     * @return the tupeOfDrink
     */
    public TypeOfDrink getTupeOfDrink() {
        return tupeOfDrink;
    }

    /**
     * @param tupeOfDrink the tupeOfDrink to set
     */
    public void setTupeOfDrink(TypeOfDrink tupeOfDrink) {
        this.tupeOfDrink = tupeOfDrink;
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
