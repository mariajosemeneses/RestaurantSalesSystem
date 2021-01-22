/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

import java.util.ArrayList;

/**
 *
 * @author Group 3
 */
public class Soda 
{
    private float price;
    private ArrayList<SodaBrand> sodabrand= new ArrayList<>();
    private ArrayList<SodaFlavor> sodaflavor= new ArrayList<>();

    public Soda() {
        
    }

    public Soda(float price, ArrayList<SodaBrand> sodabrand,ArrayList<SodaFlavor> sodaflavor) {
        this.price = price;
        this.sodabrand = sodabrand;
        this.sodaflavor = sodaflavor;
    }

    @Override
    public String toString() {
        return "Soda{" + "price=" + getPrice() + ", sodabrand=" + getSodabrand() + ", sodaflavor=" + getSodaflavor() + '}';
    }

    
    
    
    public void add()
    {
        
    }
    public void delete()
    {
        
    }
    public void modify()
    {
        
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

    /**
     * @return the sodabrand
     */
    public ArrayList<SodaBrand> getSodabrand() {
        return sodabrand;
    }

    /**
     * @param sodabrand the sodabrand to set
     */
    public void setSodabrand(ArrayList<SodaBrand> sodabrand) {
        this.sodabrand = sodabrand;
    }

    /**
     * @return the sodaflavor
     */
    public ArrayList<SodaFlavor> getSodaflavor() {
        return sodaflavor;
    }

    /**
     * @param sodaflavor the sodaflavor to set
     */
    public void setSodaflavor(ArrayList<SodaFlavor> sodaflavor) {
        this.sodaflavor = sodaflavor;
    }

    
    
}
