/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author Group3
 */
public class Juice 
{
    private String flavor;
    private int juiceSize;

    public Juice(String flavor, int juiceSize) {
        this.flavor = flavor;
        this.juiceSize = juiceSize;
    }

    @Override
    public String toString() {
        return "Juice{" + "flavor=" + flavor + ", juiceSize=" + juiceSize + '}';
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
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * @return the juiceSize
     */
    public int getJuiceSize() {
        return juiceSize;
    }

    /**
     * @param juiceSize the juiceSize to set
     */
    public void setJuiceSize(int juiceSize) {
        this.juiceSize = juiceSize;
    }
    
    
}
