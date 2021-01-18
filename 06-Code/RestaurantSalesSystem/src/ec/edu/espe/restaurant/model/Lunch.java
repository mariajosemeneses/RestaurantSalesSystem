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
public class Lunch 
{
    private Drink drink;
    private Dessert dessert;
    private Course mainCourse;
    private String others;

    public Lunch() {
    }

    public Lunch(Drink drink, Dessert dessert, Course mainCourse, String others) {
        this.drink = drink;
        this.dessert = dessert;
        this.mainCourse = mainCourse;
        this.others = others;
    }

    @Override
    public String toString() {
        return "Lunch{" + "drink=" + getDrink() + ", dessert=" + getDessert() + ", mainCourse=" + getMainCourse() + ", others=" + getOthers() + '}';
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
     * @return the dessert
     */
    public Dessert getDessert() {
        return dessert;
    }

    /**
     * @param dessert the dessert to set
     */
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    /**
     * @return the mainCourse
     */
    public Course getMainCourse() {
        return mainCourse;
    }

    /**
     * @param mainCourse the mainCourse to set
     */
    public void setMainCourse(Course mainCourse) {
        this.mainCourse = mainCourse;
    }

    /**
     * @return the others
     */
    public String getOthers() {
        return others;
    }

    /**
     * @param others the others to set
     */
    public void setOthers(String others) {
        this.others = others;
    }
}
    
  