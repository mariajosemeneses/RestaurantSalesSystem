/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Group 3
 */
public class Soda {

    private ArrayList<SodaBrand> sodabrands = new ArrayList();
    private ArrayList<SodaFlavor> sodaflavors = new ArrayList();
    private float price = 0;

    public Soda() {

    }

    public Soda(ArrayList<SodaBrand> sodabrands, ArrayList<SodaFlavor> sodaflavors, float price) {
        this.sodabrands = sodabrands;
        this.sodaflavors = sodaflavors;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soda{" + "sodabrands=" + sodabrands + ", sodaflavors=" + sodaflavors + ", price=" + price + '}';
    }

    public void add() {
        Soda soda = new Soda();
        
        SodaBrand sodaBrand = new SodaBrand();
        SodaFlavor sodaFlavor = new SodaFlavor();

        Scanner input = new Scanner(System.in);
        File file = new File("Soda.json");

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter Soda Brand: ");
                sodaBrand.setName(input.nextLine());
                sodabrands.add(sodaBrand);
                System.out.print("Enter Soda Flavor: ");
                sodaFlavor.setName(input.nextLine());
                sodaflavors.add(sodaFlavor);
                System.out.print("Enter price: ");
                soda.setPrice(input.nextFloat());

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Soda.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter Soda Brand: ");
                sodaBrand.setName(input.nextLine());
                sodabrands.add(sodaBrand);
                System.out.print("Enter Soda Flavor: ");
                sodaFlavor.setName(input.nextLine());
                sodaflavors.add(sodaFlavor);
                System.out.print("Enter price: ");
                soda.setPrice(input.nextFloat());
                
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Soda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void delete() {

    }

    public void modify() {

    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the sodabrand
     */
    public ArrayList<SodaBrand> getSodabrand() {
        return sodabrands;
    }

    /**
     * @param sodabrands the sodabrand to set
     */
    public void setSodabrand(ArrayList<SodaBrand> sodabrands) {
        this.sodabrands = sodabrands;
    }

    /**
     * @return the sodaflavor
     */
    public ArrayList<SodaFlavor> getSodaflavor() {
        return sodaflavors;
    }

    /**
     * @param sodaflavors the sodaflavor to set
     */
    public void setSodaflavor(ArrayList<SodaFlavor> sodaflavors) {
        this.sodaflavors = sodaflavors;
    }

}
