/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.restaurantSalesSystem.model.Product;
import ec.edu.espe.restaurantSalesSystem.utils.MongoManager;
import ec.edu.espe.restaurantSalesSystem.utils.NoSQL;
import ec.edu.espe.restaurantsalessystem.model.Cashier;

/**
 *
 * @author Group 3
 */
public class OwnerController {

    public void addEmployee(String typeEmployee, Cashier cashier) {
        NoSQL nosql;
        nosql = new MongoManager();

        BasicDBObject document = new BasicDBObject();

        document.put("name", cashier.getName());
        document.put("address", cashier.getAddress());
        document.put("email", cashier.getEmail());
        document.put("cellPhone", cashier.getCellPhone());
        document.put("age", cashier.getAge());
        document.put("id", cashier.getId());

        nosql.create("Employee", typeEmployee.toLowerCase() + "s", document);
    }
    
    public void deleteEmployee(String typeEmployee, String dataToFind, String field) {
        NoSQL nosql;
        nosql = new MongoManager();
        
        nosql.delete("Employee", dataToFind, field, typeEmployee.toLowerCase() + "s");
    }
    
    public void updateEmployee(String typeEmployee, String dataToFind, String newData, String field) {
        NoSQL nosql;
        nosql = new MongoManager();
        
        nosql.update("Employee", dataToFind, newData, field, typeEmployee.toLowerCase() + "s");
    }
    
    public void createProduct(Product product) {
        NoSQL nosql;
        nosql = new MongoManager();

        BasicDBObject document = new BasicDBObject();

        document.put("Type of Product", product.getTypeOfProduct());
        document.put("Description", product.getDescription());
        document.put("Price", product.getPrice());        

        nosql.create("Products", "Food", document);
    }
    
    public void deleteProduct(String dataToDelete) {
        NoSQL nosql;
        nosql = new MongoManager();
        
        nosql.delete("Products", dataToDelete, "Description", "Food");
    }
    
}
