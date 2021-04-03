/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Group 3
 */
public class FileManager implements Persistence {

//    @Override
//    public void update(String dataToFind, String dataToUpdate) {
//        boolean update = false;
//        String newLine = "";
//        Gson gson = new Gson();
//
//        try {
//            FileReader readFile = new FileReader("Users.json");
//            BufferedReader reader = new BufferedReader(readFile);
//            String line;
//            while ((line = reader.readLine()) != null) {
//
//                Properties properties = (Properties) gson.fromJson(line, Properties.class);
//                Set<String> keys = properties.stringPropertyNames();
//
//                for (String key : keys) {
//                    if (dataToFind.equals(properties.getProperty(key))) {
//                        properties.setProperty(key, dataToUpdate);
//                        line = gson.toJson(properties);
//                        update = true;
//                    }
//                }
//                newLine = newLine + line + "\n";
//            }
//            reader.close();
//            try (FileWriter writer = new FileWriter("Users.json")) {
//                writer.write(newLine);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex);
//        } catch (IOException ex) {
//            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void delete(String dataToDelete) {
//        boolean deleted = false;
//        boolean ignore = false;
//        String newLine = "";
//        Gson gson = new Gson();
//
//        try {
//            FileReader readFile = new FileReader("Users.json");
//            BufferedReader read = new BufferedReader(readFile);
//            String line;
//            while ((line = read.readLine()) != null) {
//
//                Properties properties = (Properties) gson.fromJson(line, Properties.class);
//                Set<String> keys = properties.stringPropertyNames();
//
//                for (String key : keys) {
//                    if (dataToDelete.equals(properties.getProperty(key))) {
//
//                        ignore = true;
//                        deleted = true;
//                    }
//                }
//                if (!ignore) {
//                    newLine = newLine + line + "\n";
//
//                }
//                ignore = false;
//            }
//            read.close();
//            try (FileWriter writer = new FileWriter("Users.json")) {
//                writer.write(newLine);
//                writer.close();
//
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex);
//        } catch (IOException ex) {
//            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    @Override
    public boolean create(String data, String table) {
        boolean saved = false;
        createFile(table);

        try {
            FileWriter writer = new FileWriter(table + ".txt", true);
            writer.write(System.getProperty("line.separator") + data);
            writer.close();
            System.out.println("A new record of " + table + " was saved");
            saved = true;

        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    }

    public boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");
                created = true;
            } else {
                System.out.println("file already exists");
                created = true;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }

        return created;
    }
    public static void create(MongoClient mongo, String dataBase, String collection, String typeOfProduct, 
                                String description, float price) {
        try {
            DB db = mongo.getDB(dataBase);
            DBCollection dbCollection = db.getCollection(collection);
            BasicDBObject document = new BasicDBObject();
            document.put("Type of Product", typeOfProduct);
            document.put("Description", description);
            document.put("Price", price);
            dbCollection.insert(document);
        } catch (Exception ex) {
            System.out.println("CANNOT CREATE DOCUMENT");
        }


       
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
        String readLine = "";

        try {
            File file = new File(table);
            if (file.exists()) {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedreader = new BufferedReader(reader);
                readLine = bufferedreader.readLine();
                bufferedreader.close();
            }
        } catch (Exception e) {
            System.out.println("File don't found");
        }
        return readLine;
    }
    
     public static void readAll(MongoClient mongo, String dataBase, String collection) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        DBCursor cursor = dbCollection.find();

        while (cursor.hasNext()) {
            System.out.println(cursor.next().get("typeOfProduct") + "  " + cursor.curr().get("description") + "  "
                    + cursor.curr().get("price"));
        }
    }

}
