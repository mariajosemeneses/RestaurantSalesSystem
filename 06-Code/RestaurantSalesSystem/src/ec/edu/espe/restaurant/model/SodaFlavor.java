/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author Anthony
 */
public class SodaFlavor {
    
    private String name;

    public SodaFlavor() {
    }

    public SodaFlavor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SodaFlavor{" + "name=" + name + '}';
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
    
}
