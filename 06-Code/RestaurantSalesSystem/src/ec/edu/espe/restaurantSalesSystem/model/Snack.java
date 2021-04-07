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
public class Snack extends Product{
    
    private ArrayList<String> nachos = new ArrayList();
    private ArrayList<String> wings = new ArrayList();
    private ArrayList<String> hamburguers = new ArrayList();

    public Snack(String typeOfProduct, String description, float price) {
        super(typeOfProduct, description, price);
    }

    public ArrayList<String> getNachos() {
        return nachos;
    }

    public void setNachos(ArrayList<String> nachos) {
        this.nachos = nachos;
    }

    public ArrayList<String> getWings() {
        return wings;
    }

    public void setWings(ArrayList<String> wings) {
        this.wings = wings;
    }

    public ArrayList<String> getHamburguers() {
        return hamburguers;
    }

    public void setHamburguers(ArrayList<String> hamburguers) {
        this.hamburguers = hamburguers;
    }

   
    
}
