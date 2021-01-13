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
public class Course 
{
    private String id;
    private String description;
    private float price;
    private int quantity;
    private Food type;
    
    public void buy ()
    {
        
    }
    public void sell()
    {
        
    }
    public void consult()
    {
        
    }
    public void prepare(int time)
    {
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

    /**
     * @return the type
     */
    public Food getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Food type) {
        this.type = type;
    }
    
    
}
