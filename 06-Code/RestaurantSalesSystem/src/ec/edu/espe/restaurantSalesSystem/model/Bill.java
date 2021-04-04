
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

  private float propina;

   private float precio;

    private String concepto;

    private int cantidad;

    private float total;
    public int numventas;
    

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
        return propina;
    }
    public void setPropina(float propina) {
        this.propina = propina;
    }

    
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
     public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    public String getConcepto() {
        return concepto;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }

    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }

 
    
}
