/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author Group 3
 */
public class SodaBrand 
{
    private String name;
    private int sodaSize;
    private String sodaFlavor;

    public SodaBrand(String name, int sodaSize, String sodaFlavor) {
        this.name = name;
        this.sodaSize = sodaSize;
        this.sodaFlavor = sodaFlavor;
    }

    @Override
    public String toString() {
        return "SodaBrand{" + "name=" + name + ", sodaSize=" + sodaSize + ", sodaFlavor=" + sodaFlavor + '}';
    }
    
    
    public void add()
    {
        
    }
    public void modify()
    {
        
    }
    public void delete()
    {
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sodaSize
     */
    public int getSodaSize() {
        return sodaSize;
    }

    /**
     * @param sodaSize the sodaSize to set
     */
    public void setSodaSize(int sodaSize) {
        this.sodaSize = sodaSize;
    }

    /**
     * @return the sodaFlavor
     */
    public String getSodaFlavor() {
        return sodaFlavor;
    }

    /**
     * @param sodaFlavor the sodaFlavor to set
     */
    public void setSodaFlavor(String sodaFlavor) {
        this.sodaFlavor = sodaFlavor;
    }
}
