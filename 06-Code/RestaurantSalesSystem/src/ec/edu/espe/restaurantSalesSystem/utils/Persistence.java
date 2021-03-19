/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.mongodb.MongoClient;

/**
 *
 * @author DAVID
 */
public interface Persistence {
    public void create(String data);
    public void read();
    public void update(String dataToFind, String datatoUpdate);
    public void delete(String dataToDelete);
    public void findName(String dataToFind);
    
}
