/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import ec.edu.espe.restaurantSalesSystem.controller.OwnerController;
import ec.edu.espe.restaurantSalesSystem.model.Product;
import ec.edu.espe.restaurantSalesSystem.utils.MongoManager;
import ec.edu.espe.restaurantSalesSystem.utils.NoSQL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Group 3
 */
public class FrmOptionsOwner extends javax.swing.JFrame {

    MongoManager mongoManager = new MongoManager();
    String URL = "mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net/<dbname>?retryWrites=true&w=majority";
    MongoClient mongo = mongoManager.openConnection(URL);

    /**
     * Creates new form frmOptions
     */
    public FrmOptionsOwner() {
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

        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnEditMenu = new javax.swing.JButton();
        btnRegisterEmployee = new javax.swing.JButton();
        btnReportSale = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/back (1).png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 60, 30));

        btnEditMenu.setBackground(new java.awt.Color(255, 255, 102));
        btnEditMenu.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        btnEditMenu.setForeground(new java.awt.Color(255, 255, 204));
        btnEditMenu.setText("EDIT MENU");
        btnEditMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEditMenu.setContentAreaFilled(false);
        btnEditMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        btnRegisterEmployee.setBackground(new java.awt.Color(255, 255, 102));
        btnRegisterEmployee.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        btnRegisterEmployee.setText("REGISTER EMPLOYEE");
        btnRegisterEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnRegisterEmployee.setContentAreaFilled(false);
        btnRegisterEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegisterEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, 30));

        btnReportSale.setBackground(new java.awt.Color(255, 255, 102));
        btnReportSale.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        btnReportSale.setForeground(new java.awt.Color(255, 255, 204));
        btnReportSale.setText("REPORT SALE");
        btnReportSale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnReportSale.setContentAreaFilled(false);
        btnReportSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportSaleActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/fondo_ownerOptionsq.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -90, 490, 463));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterEmployeeActionPerformed
        this.setVisible(false);
        FrmResgisterEmployee frmResgisterEmployee = new FrmResgisterEmployee();
        frmResgisterEmployee.setVisible(true);
    }//GEN-LAST:event_btnRegisterEmployeeActionPerformed

    private void btnEditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMenuActionPerformed
        FrmStockProducts.setVisible(true);
        this.dispose();
        FrmStockProducts.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEditMenuActionPerformed

    private void btnReportSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportSaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportSaleActionPerformed

    public void emptyFields() {
        txtDescription.setText("");
        cmbTypeOfProduct.setSelectedIndex(0);
        txtPrice.setText("");
    }
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        FrmLoginScreen frmLoginScreen = new FrmLoginScreen();
        frmLoginScreen.setVisible(true);
        NoSQL nosql;
        nosql = new MongoManager();
        if (nosql.closeConnection(mongo)) {
            System.out.println("\nCONNECTION CLOSED");
        } else {
            System.out.println("\nCONNECTION COULD NOT BE CLOSED");
        }
    }//GEN-LAST:event_btnExitActionPerformed


   

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
            java.util.logging.Logger.getLogger(FrmOptionsOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOptionsOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOptionsOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOptionsOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOptionsOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditMenu;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegisterEmployee;
    private javax.swing.JButton btnReportSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
