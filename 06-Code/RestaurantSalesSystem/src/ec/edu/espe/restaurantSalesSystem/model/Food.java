
package ec.edu.espe.restaurantSalesSystem.model;

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
public class Food extends Product {
    
    
    public void choice (Lunch lunch, Breakfast breakfast){
        
    }
    
    public Food(String name, float price, int quantity) {
        super(name, price, quantity);
    }
    
    public void registerFood(Food food){
        Scanner input = new Scanner(System.in);
        File file = new File("Food.json");
   

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                
                System.out.print("Enter quantity: ");
                food.setQuantity(input.nextInt());
                
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);
                
                System.out.print("Enter quantity: ");
                food.setQuantity(input.nextInt());
                
              
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
