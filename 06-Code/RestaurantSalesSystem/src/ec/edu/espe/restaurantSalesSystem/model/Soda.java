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
public class Soda extends Drink {

    private ArrayList<String> brands = new ArrayList();

    public Soda(String typeOfProduct, String description, float price) {
        super(typeOfProduct, description, price);
    }

    public ArrayList<String> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<String> brands) {
        this.brands = brands;
    }
    

}
