/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class Breakfast extends Food{
    
    private String continental;
    private String full;
    private float priceContinental;
    private float priceFull;
    

    
    public Breakfast(String continental, String full, float priceContinental, float priceFull, String name, float price, int quantity) {
        super(name, price, quantity);
        this.continental = continental;
        this.full = full;
        this.priceContinental = priceContinental;
        this.priceFull = priceFull;
    }

    
    

    /**
     * @return the continental
     */
    public String getContinental() {
        return continental;
    }

    /**
     * @param continental the continental to set
     */
    public void setContinental(String continental) {
        this.continental = continental;
    }

    /**
     * @return the full
     */
    public String getFull() {
        return full;
    }

    /**
     * @param full the full to set
     */
    public void setFull(String full) {
        this.full = full;
    }

    /**
     * @return the priceContinental
     */
    public float getPriceContinental() {
        return priceContinental;
    }

    /**
     * @param priceContinental the priceContinental to set
     */
    public void setPriceContinental(float priceContinental) {
        this.priceContinental = priceContinental;
    }

    /**
     * @return the priceFull
     */
    public float getPriceFull() {
        return priceFull;
    }

    /**
     * @param priceFull the priceFull to set
     */
    public void setPriceFull(float priceFull) {
        this.priceFull = priceFull;
    }
    

    
}
    
    

