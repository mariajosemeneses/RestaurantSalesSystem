/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantsalessystem.model;

/**
 *
 * @author DAVID
 */
public class Employee extends Person{
    String id;
    int age;

    public Employee(String id, int age, String name, String address, String email, String cellPhone) {
        super(name, address, email, cellPhone);
        this.id = id;
        this.age = age;
    }
    
}
