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
public class Soda extends Drink {

    private String flavor;
    private String brand;

    public Soda(String flavor, String brand, String typeOfProduct, String description, float price) {
        super(typeOfProduct, description, price);
        this.flavor = flavor;
        this.brand = brand;
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

}
