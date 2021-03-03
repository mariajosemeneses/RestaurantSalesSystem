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
    
    private ArrayList<String> components  = new ArrayList(); 

    public Breakfast(String name, float price, int quantity, ArrayList<String> components) {
        super(name, price, quantity);
        this.components = components;
    }

    /**
     * @return the components
     */
    public ArrayList<String> getComponents() {
        return components;
    }

    /**
     * @param components the components to set
     */
    public void setComponents(ArrayList<String> components) {
        this.components = components;
    }

    
}
    
    

