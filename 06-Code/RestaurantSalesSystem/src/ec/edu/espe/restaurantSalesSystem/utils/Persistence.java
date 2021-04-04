    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Group 3
 */
public interface Persistence {

    boolean create(String data, String table, BasicDBObject document);

    String find(String dataBase, String dataToFind, String field, String table);

    boolean update(String dataBase, String dataToFind, String newData, String field, String table);

    boolean delete(String dataBase, String dataToFind, String field, String table);

    String read(String dataBase, String table);

}
