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
public class Dessert 
{
    private int code;
    private String type;
    private int quantity;

    public Dessert(int code, String type, int quantity) {
        this.code = code;
        this.type = type;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Dessert{" + "code=" + code + ", type=" + type + ", quantity=" + quantity + '}';
    }
    
    
    
    public void add()
    {
        
    }
    public void delete()
    {
        
    }
    public void modify()
    {
        
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
