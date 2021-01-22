/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

/**
 *
 * @author Group 3
 */
public class SodaBrand 
{
    private String name;
 

    
    public SodaBrand(String name, int sodaSize, String sodaFlavor) {
        this.name = name;
   
    }
    

    @Override
    public String toString() {
        return "SodaBrand{" + "name=" + name + '}';
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
    
}
