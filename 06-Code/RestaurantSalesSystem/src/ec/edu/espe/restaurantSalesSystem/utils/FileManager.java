/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import ec.edu.espe.restaurantSalesSystem.controller.Verification;
import ec.edu.espe.restaurantSalesSystem.view.FrmLoginScreen;
import ec.edu.espe.restaurantSalesSystem.view.FrmOptionsOwner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class FileManager implements Persistence{

    @Override
    public void create(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void create(){
        
        
    }

    @Override
    public void read() {
        try{
        String user;
        File file = new File("User.json");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedreader = new BufferedReader(reader);
        while ((user = bufferedreader.readLine()) != null) {
            System.out.println(user);
        }
        
        bufferedreader.close();
        }catch(Exception e){
            System.out.println("Archivo no econtrado");            
        }
        return true;
    }
    @Override
    public void update(String dataToFind, String datatoUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String dataToDelete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findName(String dataToFind) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
