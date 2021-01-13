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
public class Lunch 
{
    private String soup;
    private Drink drink;
    private Dessert dessert;
    private Course mainCourse;
    private String other;
    
    public void choice()
    {
        
    }
    public void billin()
    {
        
    }
    public void buy()
    {
        
    }

    /**
     * @return the soup
     */
    public String getSoup() {
        return soup;
    }

    /**
     * @param soup the soup to set
     */
    public void setSoup(String soup) {
        this.soup = soup;
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
     * @return the other
     */
    public String getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(String other) {
        this.other = other;
    }
    
    
}
