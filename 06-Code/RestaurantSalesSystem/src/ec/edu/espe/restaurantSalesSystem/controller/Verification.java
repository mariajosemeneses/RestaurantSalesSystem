/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import ec.edu.espe.restaurantSalesSystem.view.FrmLoginScreen;
import javax.swing.JOptionPane;

/**
 *
 * @author Group3
 */
public class Verification {
    FrmLoginScreen login=  new FrmLoginScreen();
    String message;
    
    public void VerfiyUser(String users[], String user, String password, int attempts) {
        boolean findOut = false;

        for (int i = 0; i < users.length; i++) {
            if (users[i].equalsIgnoreCase(user) && users[i + 1].equals(password)) {
                message = "Bienvenido ---> " + user;
                findOut = true;
                JOptionPane.showMessageDialog(null, message, "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                attempts=0;

                break;
            } 
        }
        if (findOut == false) {
            message = " Key y/o users incorrects ... go " + attempts + " attempts wrong";
            JOptionPane.showMessageDialog(null, message, "LOGIN", JOptionPane.ERROR_MESSAGE);
        }
        if (attempts > 2) {
            JOptionPane.showMessageDialog(null, "3 attempts Wrongs ", "LOGIN", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }
    }
}
