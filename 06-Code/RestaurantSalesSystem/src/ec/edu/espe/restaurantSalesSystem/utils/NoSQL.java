/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.mongodb.MongoClient;

/**
 *
 * @author Group 3
 */
public interface NoSQL extends Persistence {

    MongoClient openConnection(String URL);

    boolean closeConnection(MongoClient mongo);
    
}
