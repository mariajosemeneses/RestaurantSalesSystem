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
public class SuggestionController {

    public void add(String suggestion) {
        NoSQL nosql;
        nosql = new MongoManager();

        BasicDBObject document = new BasicDBObject();

        document.put("Sugestion", suggestion);        
        nosql.create("Sugestions", "Sugestion", document);
    }
}
