/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.util.Scanner;

/**
 *
 * @author Group3
 */
public class CrudOperation {

    //Add a new document
    public static void add(DB db, String cashier, String name, String address, String email, String cellPhone,
            int age, int id) {

        DBCollection collection = db.getCollection(cashier);
        BasicDBObject document = new BasicDBObject();
        document.put("name", name);
        document.put("address", address);
        document.put("email", email);
        document.put("cellPhone", cellPhone);
        document.put("age", age);
        document.put("id", id);
        collection.insert(document);
    }

    //Show All the documents
    public static void showAll(DB db, String cashiers) {
        DBCollection collection = db.getCollection(cashiers);
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            System.out.println(cursor.next().get("id") + "  " + cursor.curr().get("name") + "  "
                    + cursor.curr().get("address") + "  " + cursor.curr().get("email") + "  "
                    + cursor.curr().get("cellPhone") + "  " + cursor.curr().get("age"));
        }
    }

    //Find a name in the documents
    public static void findName(DB db, String cashiers, String name) {
        DBCollection collection = db.getCollection(cashiers);
        BasicDBObject query = new BasicDBObject();
        query.put("name", name);

        DBCursor cursor = collection.find(query);
        while (cursor.hasNext()) {
            System.out.println(cursor.next().get("id") + "  " + cursor.curr().get("name") + "  "
                    + cursor.curr().get("address") + "  " + cursor.curr().get("email") + "  "
                    + cursor.curr().get("cellPhone") + "  " + cursor.curr().get("age"));
        }
    }

    //Update a name in the documents
    public static void update(DB db, String cashiers, String data) {
        DBCollection collection = db.getCollection(cashiers);
        Scanner input = new Scanner(System.in);
        String newName = "";

        BasicDBObject searchedName = new BasicDBObject();
        searchedName.append("name", data);

        System.out.print("Enter new Name: ");
        newName = input.nextLine();
        BasicDBObject updateData = new BasicDBObject();
        updateData.append("$set", new BasicDBObject().append("name", newName));
        collection.updateMulti(searchedName, updateData);
    }

    //Delete a name in the documents
    public static void delete(DB db, String cashiers, String name) {
        DBCollection collection = db.getCollection(cashiers);
        collection.remove(new BasicDBObject().append("name", name));
    }
}
