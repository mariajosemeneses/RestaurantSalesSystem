/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Coffee extends Drink {
    ArrayList<String> coffees = new ArrayList();

    public Coffee(String name, float price, int quantity) {
        super(name, price, quantity);
    }
}