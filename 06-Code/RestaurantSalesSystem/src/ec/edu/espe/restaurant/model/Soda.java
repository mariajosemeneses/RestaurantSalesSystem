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
public class Soda 
{
    private SodaBrand sodaBrand;

    public Soda(SodaBrand sodaBrand) {
        this.sodaBrand = sodaBrand;
    }

    @Override
    public String toString() {
        return "Soda{" + "sodaBrand=" + sodaBrand + '}';
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
     * @return the sodaBrand
     */
    public SodaBrand getSodaBrand() {
        return sodaBrand;
    }

    /**
     * @param sodaBrand the sodaBrand to set
     */
    public void setSodaBrand(SodaBrand sodaBrand) {
        this.sodaBrand = sodaBrand;
    }
    
}
