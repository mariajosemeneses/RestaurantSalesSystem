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
public class TypeOfDrink 
{
    private Soda soda;
    private Juice juice;

    public TypeOfDrink(Soda soda, Juice juice) {
        this.soda = soda;
        this.juice = juice;
    }

    @Override
    public String toString() {
        return "TypeOfDrink{" + "soda=" + soda + ", juice=" + juice + '}';
    }
    
    
    public boolean choice()
    {
        return true;
    }

    /**
     * @return the soda
     */
    public Soda getSoda() {
        return soda;
    }

    /**
     * @param soda the soda to set
     */
    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    /**
     * @return the juice
     */
    public Juice getJuice() {
        return juice;
    }

    /**
     * @param juice the juice to set
     */
    public void setJuice(Juice juice) {
        this.juice = juice;
    }
}
