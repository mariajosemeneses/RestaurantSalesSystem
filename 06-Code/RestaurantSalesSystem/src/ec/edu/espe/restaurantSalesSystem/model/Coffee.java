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
public class Coffee extends Drink {
    private ArrayList<String> coffees = new ArrayList();

    public Coffee(String name, float price, int quantity, ArrayList<String> coffees) {
        super(name, price, quantity);
        this.coffees = coffees;
    }

    /**
     * @return the coffees
     */
    public ArrayList<String> getCoffees() {
        return coffees;
    }

    /**
     * @param coffees the coffees to set
     */
    public void setCoffees(ArrayList<String> coffees) {
        this.coffees = coffees;
    }
}
