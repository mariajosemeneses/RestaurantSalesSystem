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
public class Employee extends Person{
    private String id;
    private int age;

    public Employee(String id, int age, String name, String address, String email, String cellPhone) {
        super(name, address, email, cellPhone);
        this.id = id;
        this.age = age;
    }

    public Employee(String name, String address, String email, String cellPhone) {
        super(name, address, email, cellPhone);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", age=" + age + '}';
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
    
    
}
