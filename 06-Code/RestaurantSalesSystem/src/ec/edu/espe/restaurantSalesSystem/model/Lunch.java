/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

/**
 *
 * @author Group 3
 */
public class Lunch extends Food{
    
    String soup;
    String mainCourse;
    Drink drink;
    String dessert;

    public Lunch(String soup, String mainCourse, Drink drink, String dessert, String name, float price, int quantity) {
        super(name, price, quantity);
        this.soup = soup;
        this.mainCourse = mainCourse;
        this.drink = drink;
        this.dessert = dessert;
    }
    
    
}
