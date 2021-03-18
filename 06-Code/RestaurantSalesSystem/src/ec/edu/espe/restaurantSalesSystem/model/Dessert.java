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
public class Dessert extends Product{
    
    private ArrayList<String> desserts = new ArrayList();

    public Dessert(String name, float price, int quantity) {
        super(name, price, quantity);
    }

    /**
     * @return the desserts
     */
    public ArrayList<String> getDesserts() {
        return desserts;
    }

    /**
     * @param desserts the desserts to set
     */
    public void setDesserts(ArrayList<String> desserts) {
        this.desserts = desserts;
    }
    
}
