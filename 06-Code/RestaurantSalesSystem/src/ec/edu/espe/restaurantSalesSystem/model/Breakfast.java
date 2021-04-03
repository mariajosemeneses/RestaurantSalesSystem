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
public class Breakfast extends Food {

    private String continental;
    private String full;
    private float priceContinental;
    private float priceFull;

    

    public Breakfast(String continental, String full, float priceContinental, float priceFull, String typeOfProduct, String description, float price) {
        super(typeOfProduct, description, price);
        this.continental = continental;
        this.full = full;
        this.priceContinental = priceContinental;
        this.priceFull = priceFull;
    }

    public String getContinental() {
        return continental;
    }

    public void setContinental(String continental) {
        this.continental = continental;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public float getPriceContinental() {
        return priceContinental;
    }

    public void setPriceContinental(float priceContinental) {
        this.priceContinental = priceContinental;
    }

    public float getPriceFull() {
        return priceFull;
    }

    public void setPriceFull(float priceFull) {
        this.priceFull = priceFull;
    }

    
    }

