/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.util.Scanner;

/**
 *
 * @author Group 3
 */
public class MongoManager implements Persistence{

    public void create(MongoClient mongo, String dataBase, String collection, String name,
            String address, String email, String cellPhone, int age, String id) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();
        if (dataBase.equals("Employee")) {
            document.put("name", name);
            document.put("address", address);
            document.put("email", email);
            document.put("cellPhone", cellPhone);
            document.put("age", age);
            document.put("id", id);
        } else {
            document.put("name", name);
            document.put("address", address);
            document.put("email", email);
            document.put("cellPhone", cellPhone);
        }
        dbCollection.insert(document);   
    }
    
    public void create(MongoClient mongo, String dataBase, String collection, String continental, float priceContinental,
        String full, float priceFull) {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Continental", continental);
        document.put("Price Continental", priceContinental);
        document.put("Full", full);
        document.put("Price Full",priceFull);
        dbCollection.insert(document);
    }
    public void create(MongoClient mongo, String dataBase, String collection, String soup,String mainCourse,
    String drink,String dessert,float priceLunch) 
    {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Soup", soup);
        document.put("Main Course", mainCourse);
        document.put("Drink", drink);
        document.put("Dessert",dessert);
        document.put("Price",priceLunch);
        dbCollection.insert(document);
    }
    public void create(MongoClient mongo, String dataBase, String collection, int number,String dessert,float price) 
    {

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

    public void read(MongoClient mongo, String dataBase, String collection) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        DBCursor cursor = dbCollection.find();

        while (cursor.hasNext()) {
            if (collection.equals("Employee")) {
                System.out.println(cursor.next().get("id") + "  " + cursor.curr().get("name") + "  "
                        + cursor.curr().get("address") + "  " + cursor.curr().get("email") + "  "
                        + cursor.curr().get("cellPhone") + "  " + cursor.curr().get("age"));
            } else {
                System.out.println(cursor.next().get("name") + "  " + cursor.curr().get("address") + "  "
                        + cursor.curr().get("email") + "  " + cursor.curr().get("cellPhone"));
            }
        }
    }
   
    public void update(MongoClient mongo, String dataBase, String collection, String data) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        Scanner input = new Scanner(System.in);
        String newName = "";

        BasicDBObject searchedName = new BasicDBObject();
        searchedName.append("name", data);
        System.out.println("Enter new Name: ");
        newName = input.nextLine();
        BasicDBObject updateData = new BasicDBObject();
        updateData.append("$set", new BasicDBObject().append("name", newName));
        dbCollection.updateMulti(searchedName, updateData);
    }
    

    public void delete(MongoClient mongo, String dataBase, String collection, String name) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        dbCollection.remove(new BasicDBObject().append("name", name));
    }

    public void findName(MongoClient mongo, String dataBase, String collection, String name) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject query = new BasicDBObject();
        query.put("name", name);

        DBCursor cursor = dbCollection.find(query);
        while (cursor.hasNext()) {
            if (collection.equals("Employee")) {
                System.out.println(cursor.next().get("id") + "  " + cursor.curr().get("name") + "  "
                        + cursor.curr().get("address") + "  " + cursor.curr().get("email") + "  "
                        + cursor.curr().get("cellPhone") + "  " + cursor.curr().get("age"));
            } else {
                System.out.println(cursor.next().get("name") + "  " + cursor.curr().get("address") + "  "
                        + cursor.curr().get("email") + "  " + cursor.curr().get("cellPhone"));
            }
        }
    }        

    @Override
    public boolean create(String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String find(String dataToFind, String field, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(String dataToFind, String newData, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String dataToFind, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String read(String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
