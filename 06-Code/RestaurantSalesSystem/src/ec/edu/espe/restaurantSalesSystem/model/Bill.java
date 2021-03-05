
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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Group3
 */
public class Bill 
{
    private String name;
    private String date;
    private float identificationCard;
    private String cellPhone;
    private String description;
    private String direction;

    public Bill() {
    }
    
  
    public void checkIn()
    {
        
    }
    
    public void calculateTotal(int quantity, float price) 
    {
        
        
        
    }

    public Bill(String name, String date, float identificationCard, String cellPhone, String direction, String description) {
        this.name = name;
        this.date = date;
        this.identificationCard = identificationCard;
        this.cellPhone = cellPhone;
        this.direction = direction;
        this.description = description;
    }
public void registerBill(Bill bill) {

        Scanner input = new Scanner(System.in);
        File file = new File("Bill.json");

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name: ");
                bill.setName(input.nextLine());
                System.out.print("Enter ID: ");
                bill.setDate(input.nextLine());
                System.out.print("Enter age: ");
                bill.setIdentificationCard(input.nextInt());
                input.nextLine();
                System.out.print("Enter phone number: ");
                bill.setCellPhone(input.nextLine());
                System.out.print("Enter descriptionr: ");
                bill.setDescription(input.nextLine());
                System.out.print("Enter direction: ");
                bill.setDirection(input.nextLine());
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                System.out.print("Enter name: ");
                bill.setName(input.nextLine());
                System.out.print("Enter ID: ");
                bill.setDate(input.nextLine());
                System.out.print("Enter age: ");
                bill.setIdentificationCard(input.nextInt());
                input.nextLine();
                System.out.print("Enter phone number: ");
                bill.setCellPhone(input.nextLine());
                System.out.print("Enter descriptionr: ");
                bill.setDescription(input.nextLine());
                System.out.print("Enter direction: ");
                bill.setDirection(input.nextLine());
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public String toString() {
        return "Bill{" + "name=" + name + ", date=" + date + ", identificationCard=" + identificationCard + ", cellPhone=" + cellPhone + ", description=" + description + ", direction=" + direction + '}';
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the identificationCard
     */
    public float getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(float identificationCard) {
        this.identificationCard = identificationCard;
    }

    /**
     * @return the cellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
