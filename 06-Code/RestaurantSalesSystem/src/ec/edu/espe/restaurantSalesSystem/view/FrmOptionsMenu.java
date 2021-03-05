/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.view;

/**
 *
 * @author DAVID
 */
public class FrmOptionsMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmOptionsMenu
     */
    public FrmOptionsMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditBreakfast = new javax.swing.JButton();
        btnEditLunch = new javax.swing.JButton();
        btnEditSnack = new javax.swing.JButton();
        btnEditDrink = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnEditDessert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEditBreakfast.setText("Edit Breakfast");
        btnEditBreakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBreakfastActionPerformed(evt);
            }
        });

        btnEditLunch.setText("Edit Lunch");
        btnEditLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditLunchActionPerformed(evt);
            }
        });

        btnEditSnack.setText("Edit Snack");
        btnEditSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSnackActionPerformed(evt);
            }
        });

        btnEditDrink.setText("Edit Drink");
        btnEditDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDrinkActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnEditDessert.setText("Edit Dessert");
        btnEditDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDessertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditBreakfast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditLunch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditSnack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditDrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditDessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnReturn)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnEditBreakfast)
                .addGap(29, 29, 29)
                .addComponent(btnEditLunch)
                .addGap(28, 28, 28)
                .addComponent(btnEditSnack)
                .addGap(34, 34, 34)
                .addComponent(btnEditDrink)
                .addGap(31, 31, 31)
                .addComponent(btnEditDessert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnReturn)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditBreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBreakfastActionPerformed
        this.setVisible(false);
        FrmEditBreakfast frmEditBreakfast = new FrmEditBreakfast();
        frmEditBreakfast.setVisible(true);         
    }//GEN-LAST:event_btnEditBreakfastActionPerformed

    private void btnEditLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditLunchActionPerformed
        this.setVisible(false);
        FrmEditLunch frmEditLunch = new FrmEditLunch();
        frmEditLunch.setVisible(true);
    }//GEN-LAST:event_btnEditLunchActionPerformed

    private void btnEditSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSnackActionPerformed
        this.setVisible(false);
        FrmEditSnack frmEditSnack = new FrmEditSnack();
        frmEditSnack.setVisible(true);
    }//GEN-LAST:event_btnEditSnackActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
        FrmOptionsOwner frmOptionsOwner = new FrmOptionsOwner();
        frmOptionsOwner.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnEditDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDessertActionPerformed
        this.setVisible(false);
        FrmEditDessert frmEditDessert = new FrmEditDessert();
        frmEditDessert.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditDessertActionPerformed

    private void btnEditDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDrinkActionPerformed
        this.setVisible(false);
        FrmOptionsDrinkOwner frmOptionsDrinkOwner = new FrmOptionsDrinkOwner();
        frmOptionsDrinkOwner.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_btnEditDrinkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmOptionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOptionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOptionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOptionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOptionsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditBreakfast;
    private javax.swing.JButton btnEditDessert;
    private javax.swing.JButton btnEditDrink;
    private javax.swing.JButton btnEditLunch;
    private javax.swing.JButton btnEditSnack;
    private javax.swing.JButton btnReturn;
    // End of variables declaration//GEN-END:variables
}