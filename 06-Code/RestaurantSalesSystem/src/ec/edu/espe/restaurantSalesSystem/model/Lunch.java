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
    ArrayList<String> drinks = new ArrayList();
    ArrayList<String> desserts = new ArrayList();

    
    public Lunch(String typeOfProduct, String description, float price) {
        super(typeOfProduct, description, price);
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

    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<String> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<String> getDesserts() {
        return desserts;
    }

    public void setDesserts(ArrayList<String> desserts) {
        this.desserts = desserts;
    }
    
    
}

