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
public class Breakfast extends Food {

    ArrayList<String> drinks = new ArrayList();
    ArrayList<String> juices = new ArrayList();
    ArrayList<String> breads = new ArrayList();
    ArrayList<String> eggs = new ArrayList();
    ArrayList<String> fruits = new ArrayList();
    ArrayList<String> stews = new ArrayList();

    public Breakfast(String typeOfProduct, String description, float price) {
        super(typeOfProduct, description, price);
    }

    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<String> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<String> getJuices() {
        return juices;
    }

    public void setJuices(ArrayList<String> juices) {
        this.juices = juices;
    }

    public ArrayList<String> getBreads() {
        return breads;
    }

    public void setBreads(ArrayList<String> breads) {
        this.breads = breads;
    }

    public ArrayList<String> getEggs() {
        return eggs;
    }

    public void setEggs(ArrayList<String> eggs) {
        this.eggs = eggs;
    }

    public ArrayList<String> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<String> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<String> getStews() {
        return stews;
    }

    public void setStews(ArrayList<String> stews) {
        this.stews = stews;
    }
    
}
