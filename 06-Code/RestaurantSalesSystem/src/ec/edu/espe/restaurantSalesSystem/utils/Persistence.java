/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

/**
 *
 * @author Group 3
 */
public interface Persistence {

    boolean create(String data, String table);

    String find(String dataToFind, String field, String table);

    boolean update(String dataToFind, String newData, String table);

    boolean delete(String dataToFind, String table);

    String read(String table);

}
