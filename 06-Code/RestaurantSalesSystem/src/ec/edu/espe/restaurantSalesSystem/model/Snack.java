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
    
    private ArrayList<String> choppeds = new ArrayList();
    private ArrayList<String> salads = new ArrayList();
    private ArrayList<String> hamburguers = new ArrayList();
    private ArrayList<String> sandwitches = new ArrayList();

    public Snack(String typeOfProduct, String description, float price) {
        super(typeOfProduct, description, price);
    }

    /**
     * @return the choppeds
     */
    public ArrayList<String> getChoppeds() {
        return choppeds;
    }

    /**
     * @param choppeds the choppeds to set
     */
    public void setChoppeds(ArrayList<String> choppeds) {
        this.choppeds = choppeds;
    }

    /**
     * @return the salads
     */
    public ArrayList<String> getSalads() {
        return salads;
    }

    /**
     * @param salads the salads to set
     */
    public void setSalads(ArrayList<String> salads) {
        this.salads = salads;
    }

    /**
     * @return the hamburguers
     */
    public ArrayList<String> getHamburguers() {
        return hamburguers;
    }

    /**
     * @param hamburguers the hamburguers to set
     */
    public void setHamburguers(ArrayList<String> hamburguers) {
        this.hamburguers = hamburguers;
    }

    /**
     * @return the sandwitches
     */
    public ArrayList<String> getSandwitches() {
        return sandwitches;
    }

    /**
     * @param sandwitches the sandwitches to set
     */
    public void setSandwitches(ArrayList<String> sandwitches) {
        this.sandwitches = sandwitches;
    }
    
}
