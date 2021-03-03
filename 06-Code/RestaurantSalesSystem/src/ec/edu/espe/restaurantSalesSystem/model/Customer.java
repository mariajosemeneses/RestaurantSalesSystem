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
public class Customer extends Person{

    public Customer(String name, String address, String email, String cellPhone) {
        super(name, address, email, cellPhone);
    }
    
    public Order generateOrder() {
        
        return new Order();
    }
    public void cancelOrder () {
        
    }
    public Order editOrder() {
        return new Order();
    }
    
    public void viewMenu(Product product) {
        
    }    
    
    public void viewOrder(Order order) {
        
    }
    
}
    
