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
public class Quantity 
{
    private int stock;

    public Quantity() {
    }

    public Quantity(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Quantity{" + "stock=" + stock + '}';
    }
    
    public void editQuantity()
    {
        
    }
    public void deleteQuantity()
    {
        
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
