/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Sebas
 */
public class Connection {

    public static MongoClient createConnection() {
        System.out.println("\nESTABLISHED CONNECTION");
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net/<dbname>?retryWrites=true&w=majority");

        MongoClient mongo = new MongoClient(uri);
        return mongo;
    }
}
