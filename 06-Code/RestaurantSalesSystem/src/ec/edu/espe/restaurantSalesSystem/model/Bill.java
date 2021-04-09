
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
public class Bill {

    private Double iva;

    private float tip;

    private float price;

    private String description;

    private int quantity;

    private float total;
    
    public int numSales;

    public Bill() {
    }

    public int getNumSales() {
        return numSales;
    }

    public void setNumSales() {
        this.numSales = numSales;
    }

    public Double getIva() {
        return iva;

    }

    public void setIva(Double iva) {
        this.iva = iva;

    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
