
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

    private float numberSales;
       
    public int numventas;

    public Bill() {
    }
    

    public int getNumventas(){
        return numventas;
    }
    public void setNumventas(){
        this.numventas= numventas;
    }

    public Double getIva() {
        return iva;
        
    }
    public void setIva(Double iva) {
        this.iva = iva;
        
    }

    
    public float getPropina() {
        return tip;
    }
    public void setPropina(float propina) {
        this.tip = propina;
    }

    
    public float getPrecio() {
        return price;
    }
    public void setPrecio(float precio) {
        this.price = precio;
    }
    
     public void setConcepto(String concepto) {
        this.description = concepto;
    }
    
    public String getConcepto() {
        return description;
    }
    
    public void setCantidad(int cantidad) {
        this.quantity = cantidad;
    }
    public int getCantidad() {
        return quantity;
    }

    public float getTotal() {
        return numberSales;
    }
    public void setTotal(float total) {
        this.numberSales = total;
    }

 
    
}
