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
public class Ingredient {
    
    private String name;
    private int quantity;
    private int size;

    public Ingredient() {
    }

    public Ingredient(String name, int quantity, int size) {
        this.name = name;
        this.quantity = quantity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "name=" + name + ", quantity=" + quantity + ", size=" + size + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    public void mix(){
        
    }
    
}
