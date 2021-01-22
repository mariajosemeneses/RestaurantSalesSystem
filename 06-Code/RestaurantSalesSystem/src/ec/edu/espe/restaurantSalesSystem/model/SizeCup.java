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
public class SizeCup {
    private String size;

    @Override
    public String toString() {
        return "SizeCup{" + "size=" + size + '}';
    }

    public SizeCup(String size) {
        this.size = size;
    }

    public SizeCup() {
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
}
