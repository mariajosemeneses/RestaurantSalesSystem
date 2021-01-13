/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurant.model;

/**
 *
<<<<<<< HEAD
 * @author Group 3
=======
 * @author Group3
>>>>>>> fd2b4d4846fe03454b216f2e753bbbe84312c113
 */
public class TypeOfBreakfast 
{
    private Continental continental;
    private Full full;

    public TypeOfBreakfast(Continental continental, Full full) {
        this.continental = continental;
        this.full = full;
    }

    @Override
    public String toString() {
        return "TypeOfBreakfast{" + "continental=" + continental + ", full=" + full + '}';
    }
    
    
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
