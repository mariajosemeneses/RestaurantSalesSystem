/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class Drink 
{
    private ArrayList<Soda> sodas = new ArrayList<>();
    private ArrayList<Juice> juices = new ArrayList<>();
    private ArrayList<SizeCup> sizeCups = new ArrayList<>();

    public Drink() {
    }

    public Drink(ArrayList<Soda> sodas,ArrayList<Juice> juices,ArrayList<SizeCup> sizeCups) {
        this.juices = juices;
        this.sizeCups = sizeCups;
        this.sodas = sodas;
    }

    @Override
    public String toString() {
        return "Drink{" + "sodas=" + sodas + ", juices=" + juices + ", sizeCups=" + sizeCups + '}';
    }
    
    public Drink(Juice juice, Soda soda,SizeCup sizeCup){
        int buy=0;
        
        
        
    }
    
    /**
     * @return the sodas
     */
    public ArrayList<Soda> getSodas() {
        return sodas;
    }

    /**
     * @param sodas the sodas to set
     */
    public void setSodas(ArrayList<Soda> sodas) {
        this.sodas = sodas;
    }

    /**
     * @return the juices
     */
    public ArrayList<Juice> getJuices() {
        return juices;
    }

    /**
     * @param juices the juices to set
     */
    public void setJuices(ArrayList<Juice> juices) {
        this.juices = juices;
    }

    /**
     * @return the sizeCups
     */
    public ArrayList<SizeCup> getSizeCups() {
        return sizeCups;
    }

    /**
     * @param sizeCups the sizeCups to set
     */
    public void setSizeCups(ArrayList<SizeCup> sizeCups) {
        this.sizeCups = sizeCups;
    }

    
    

    

    
    
    
    
}
