
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

/**
 *
 * @author Group3
 */
public class Breakfast 
{
    private Drink drink;
    private Full full;
    private Continental continental;

    public Breakfast(Drink drink, Full full, Continental continental) {
        this.drink = drink;
        this.full = full;
        this.continental = continental;
    }

    @Override
    public String toString() {
        return "Breakfast{" + "drink=" + getDrink() + ", full=" + getFull() + ", continental=" + getContinental() + '}';
    }

    /**
     * @return the drink
     */
    public Drink getDrink() {
        return drink;
    }

    /**
     * @param drink the drink to set
     */
    public void setDrink(Drink drink) {
        this.drink = drink;
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
}
   
   