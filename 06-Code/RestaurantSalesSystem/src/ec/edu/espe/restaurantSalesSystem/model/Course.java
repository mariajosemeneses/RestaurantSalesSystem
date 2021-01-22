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
public class Course 
{
    private String id;
    private String description;
    private float price;
    private int quantity;
    private TypeOfFood type;

    public Course(String id, String description, float price, int quantity, TypeOfFood type) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", description=" + description + ", price=" + price + ", quantity=" + quantity + ", type=" + type + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TypeOfFood getType() {
        return type;
    }

    public void setType(TypeOfFood type) {
        this.type = type;
    }
    
    public void buy ()
    {
        
    }
    public void sell()
    {
        
    }
    public void consult()
    {
        
    }
    public void prepare(int time)
    {
        
    }

    
    
}
