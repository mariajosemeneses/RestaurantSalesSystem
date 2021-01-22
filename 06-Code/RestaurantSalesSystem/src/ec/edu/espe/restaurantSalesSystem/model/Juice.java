/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;


/**
 *
 * @author Group3
 */
public class Juice 
{
  
     private JuiceFlavor[] juiceFlavor= new JuiceFlavor[6];
     private float price;

    public Juice() {
    }

    public Juice(float price, JuiceFlavor[] juiceFlavor) {
        this.price = price;
        this.juiceFlavor = juiceFlavor;
    }

    @Override
    public String toString() {
        return "Juice{" + "juiceFlavor=" + juiceFlavor + ", price=" + price + '}';
    }

     
    
    
    
    public void add()
    {
        
    }
    public void modify()
    {
        
    }
    public void delete()
    {
        
    }

    /**
     * @return the juiceFlavor
     */
    public JuiceFlavor[] getJuiceFlavor() {
        return juiceFlavor;
    }

    /**
     * @param juiceFlavor the juiceFlavor to set
     */
    public void setJuiceFlavor(JuiceFlavor[] juiceFlavor) {
        this.juiceFlavor = juiceFlavor;
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
