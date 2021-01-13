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
public class Food 
{
    private Breakfast breakfast;
    private Lunch lunch;
    private Snack snack;
    private Dessert desert;
    private Quantity quantity;

    public Food(Breakfast breakfast, Lunch lunch, Snack snack, Dessert desert, Quantity quantity) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.snack = snack;
        this.desert = desert;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Food{" + "breakfast=" + breakfast + ", lunch=" + lunch + ", snack=" + snack + ", desert=" + desert + ", quantity=" + quantity + '}';
    }
    
    public Food() {
    } 
}
