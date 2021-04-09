/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.model;

/**
 *
 * @author Group3
 */
public class Verification {

    private static Verification instance;
    private String user;
    private String password;

    private Verification(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Verification getInstance(String user, String password) {
        if (instance == null) {
            setInstance(new Verification(user, password));
        }
        return instance;
    }
       
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(Verification aInstance) {
        instance = aInstance;
    }

}
