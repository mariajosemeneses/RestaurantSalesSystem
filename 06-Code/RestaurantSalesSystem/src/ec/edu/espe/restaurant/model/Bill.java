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
public class Bill 
{
    private String name;
    private String date;
    private float identificationCard;
    private int cellPhone;
    private String direction;
    private int order;
    
    
  
    public void checkIn()
    {
        
    }

    public Bill() {
    }

    public Bill(String name, String date, float identificationCard, int cellPhone, String direction, int order) {
        this.name = name;
        this.date = date;
        this.identificationCard = identificationCard;
        this.cellPhone = cellPhone;
        this.direction = direction;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Bill{" + "name=" + name + ", date=" + date + ", identificationCard=" + identificationCard + ", cellPhone=" + cellPhone + ", direction=" + direction + ", order=" + order + '}';
    }
    
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the identificationCard
     */
    public float getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(float identificationCard) {
        this.identificationCard = identificationCard;
    }

    /**
     * @return the cellPhone
     */
    public int getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the order
     */
    public int getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(int order) {
        this.order = order;
    }
}
