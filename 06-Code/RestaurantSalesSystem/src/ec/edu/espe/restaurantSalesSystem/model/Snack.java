/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Group3
 */
public class Snack extends Product{
    
    ArrayList<String> choppeds = new ArrayList();
    ArrayList<String> salads = new ArrayList();
    ArrayList<String> hamburguers = new ArrayList();
    ArrayList<String> sandwitches = new ArrayList();

    public Snack(String name, float price, int quantity) {
        super(name, price, quantity);
    }
    
}
