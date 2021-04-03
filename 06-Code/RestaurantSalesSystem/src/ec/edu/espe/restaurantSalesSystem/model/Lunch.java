/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class Lunch extends Food {

    ArrayList<String> soups = new ArrayList();
    ArrayList<String> mainCourses = new ArrayList();
    Drink drink;
    Dessert dessert;

    public Lunch(Drink drink, Dessert dessert) {
        this.drink = drink;
        this.dessert = dessert;
    }

    
    public ArrayList<String> getSoups() {
        return soups;
    }

    public void setSoups(ArrayList<String> soups) {
        this.soups = soups;
    }

    public ArrayList<String> getMainCourses() {
        return mainCourses;
    }

    public void setMainCourses(ArrayList<String> mainCourses) {
        this.mainCourses = mainCourses;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

}
