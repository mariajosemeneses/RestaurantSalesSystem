/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
 * @author DAVID
 */
public class TypeOfBreakfast 
{
    private Continental continental;
    private Full full;
    
    public boolean choice()
    {
        return true;
    }

    /**
     * @return the continental
     */
    public Continental getContinental() {
        return continental;
    }

    /**
     * @param continental the continental to set
     */
    public void setContinental(Continental continental) {
        this.continental = continental;
    }

    /**
     * @return the full
     */
    public Full getFull() {
        return full;
    }

    /**
     * @param full the full to set
     */
    public void setFull(Full full) {
        this.full = full;
    }
    
}
