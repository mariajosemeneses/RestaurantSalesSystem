/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;



/**
 *
 * @author Group3
 */


public class Chef {
    private String name;
    private String id;
    private int age;
    private String cellphone;

    public Chef(String name, String id, int age, String cellphone) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.cellphone = cellphone;
    }

    public Chef() {
    }
  
    @Override
    public String toString() {
        return "Chef{" + "name=" + name + ", id=" + id + ", age=" + age + ", cellphone=" + cellphone + '}';
    }

    public void prepareCourse(){
       
    }
    
    public void viewOrder(Order order){
        
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    
    
}
