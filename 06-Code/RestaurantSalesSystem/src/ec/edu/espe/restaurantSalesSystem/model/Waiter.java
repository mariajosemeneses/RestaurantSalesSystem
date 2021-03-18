/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

import java.util.ArrayList;



/**
 *
 * @author Group3
 */
public class Waiter extends Employee
{
    ArrayList<Order> orders=new ArrayList();

    public Waiter(String id, int age, String name, String address, String email, String cellPhone) {
        super(id, age, name, address, email, cellPhone);
    }

    public Waiter() {
        
    
    }

   

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    public void delieverOrder(Order order){
        
    }


}
