/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.controller;

import javax.swing.JProgressBar;

/**
 *
 * @author Maria José Meneses
 */
public class Load extends Thread{
    
    JProgressBar progress;
    
    public Load (JProgressBar progress){
        super();
        this.progress = progress; 
    }
    
    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            progress.setValue(i);
            pausa(30);
        }
    }
    public void pausa(int mlSeg){
        try {
            Thread.sleep(mlSeg);
        }
        catch(Exception e){
            
        }
    }

    public JProgressBar getProgress() {
        return progress;
    }

    public void setProgress(JProgressBar progress) {
        this.progress = progress;
    }
    
    
}
