/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Group 3
 */
public class MongoManager implements NoSQL {

    public void create(MongoClient mongo, String dataBase, String collection, String continental, float priceContinental,
            String full, float priceFull) {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Continental", continental);
        document.put("Price Continental", priceContinental);
        document.put("Full", full);
        document.put("Price Full", priceFull);
        dbCollection.insert(document);
    }

    public void create(MongoClient mongo, String dataBase, String collection, String soup, String mainCourse,
            String drink, String dessert, float priceLunch) {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Soup", soup);
        document.put("Main Course", mainCourse);
        document.put("Drink", drink);
        document.put("Dessert", dessert);
        document.put("Price", priceLunch);
        dbCollection.insert(document);
    }

    public void create(MongoClient mongo, String dataBase, String collection, int number, String dessert, float price) {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Number", number);
        document.put("Dessert", dessert);
        document.put("Price", price);
        dbCollection.insert(document);
    }

    public void create(MongoClient mongo, String dataBase, String collection1, String name, String id,
            String quantity, String price) {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection1);
        BasicDBObject document1 = new BasicDBObject();
        if (dataBase.equals("Order")) {
            document1.put("name", name);
            document1.put("id", id);
            document1.put("quantity", quantity);
            document1.put("price", price);

        } else {
            document1.put("name", name);
            document1.put("id", id);
            document1.put("quantity", quantity);
            document1.put("price", price);
        }
        dbCollection.insert(document1);
    }
    public static void createSuggestions(MongoClient mongo, String dataBase, String collection, String suggestion) {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();
            document.put("Sugestion ", suggestion);
        dbCollection.insert(document);
    }

    @Override
    public MongoClient openConnection(String URL) {
        try {
            MongoClientURI uri = new MongoClientURI(URL);
            MongoClient mongo = new MongoClient(uri);
            return mongo;

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public boolean closeConnection(MongoClient mongo) {
        boolean closed = false;
        try {
            mongo.close();
            closed = true;

        } catch (Exception ex) {
            closed = false;
        }
        return closed;
    }

    @Override
    public boolean create(String data, String table, BasicDBObject document) {
        boolean created = false;
        try {
            MongoClient mongo = openConnection("mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net"
                    + "/<dbname>?retryWrites=true&w=majority");
            DB db = mongo.getDB(data);
            DBCollection dbCollection = db.getCollection(table);
            dbCollection.insert(document);
        } catch (Exception ex) {
            System.out.println("Could not create");
            created = false;
        }
        return created;
    }
   
    
    public boolean createReportSale(String data, String table, BasicDBObject document, int numTable, float total ) {
        boolean created = false;
        try {
            MongoClient mongo = openConnection("mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net"
                    + "/<dbname>?retryWrites=true&w=majority");
            DB db = mongo.getDB(data);
            DBCollection dbCollection = db.getCollection(table);
            dbCollection.insert(document);
        } catch (Exception ex) {
            System.out.println("Could not create");
            created = false;
        }
        return created;
    }

    @Override
    public String find(String dataBase, String dataToFind, String field, String table) {
        return null;
    }

    @Override
    public boolean update(String dataBase, String dataToFind, String newData, String field, String table) {
        boolean updated = false;

        try {
            MongoClient mongo = openConnection("mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net"
                    + "/<dbname>?retryWrites=true&w=majority");
            DB db = mongo.getDB(dataBase);
            DBCollection dbCollection = db.getCollection(table);

            BasicDBObject searchedName = new BasicDBObject();
            searchedName.append(field, dataToFind);

            BasicDBObject updateData = new BasicDBObject();
            updateData.append("$set", new BasicDBObject().append(field, newData));
            dbCollection.updateMulti(searchedName, updateData);
            updated = true;

        } catch (Exception ex) {
            System.out.println("Data not found");
            updated = false;
        }
        return updated;

    }

    @Override
    public boolean delete(String dataBase, String dataToFind, String field, String table) {
        boolean deleted = false;
        try {
            MongoClient mongo = openConnection("mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net"
                    + "/<dbname>?retryWrites=true&w=majority");
            DB db = mongo.getDB(dataBase);
            DBCollection dbCollection = db.getCollection(table);
            dbCollection.remove(new BasicDBObject().append(field, dataToFind));
        } catch (Exception ex) {
            System.out.println("Data not found");
            deleted = false;
        }
        return deleted;
    }

    @Override
    public String read(String dataBase, String table) {
        return null;
    }

}
