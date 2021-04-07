/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.restaurantSalesSystem.utils.MongoManager;
import ec.edu.espe.restaurantSalesSystem.utils.NoSQL;

/**
 *
 * @author Group 3
 */
public class CashierController {
    
    public void generateBill(String name, String id, String cellPhone, String date, String cashier, double pay) {
        
        NoSQL nosql;
        nosql = new MongoManager();

        BasicDBObject document = new BasicDBObject();

        document.put("name", name);
        document.put("id", id);
        document.put("cellPhone", cellPhone);    
        document.put("date", date); 
        document.put("cashier", cashier); 
        document.put("totalPay", pay);

        nosql.create("Bill", "customers", document);
    }
}
