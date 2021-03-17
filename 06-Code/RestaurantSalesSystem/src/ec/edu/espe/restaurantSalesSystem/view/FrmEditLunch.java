/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import static ec.edu.espe.restaurantSalesSystem.utils.Connection.createConnection;
import static ec.edu.espe.restaurantsalessystem.utils.CrudOperation.createLunch;
import static ec.edu.espe.restaurantsalessystem.utils.CrudOperation.createMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAVID
 */
public class FrmEditLunch extends javax.swing.JFrame {
    DefaultTableModel modelo;
    DB db;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    MongoClient mongo = createConnection();

    /**
     * Creates new form FrmEditLunch
     */
    public FrmEditLunch() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSoup = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMainCourse = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDrink = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDessert = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPriceLunch = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lunch");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtSoup.setText("1. Locro : sopa de papacon queso fresco y aguacate\n2. Tomate : coliflor, brocolo, zanahoria y crema de tomate\n3. Pollo : pechuga de pollo picada, alverja, zanahoria y apio");
        jScrollPane1.setViewportView(txtSoup);

        jLabel2.setText("Soup");

        jLabel3.setText("Main Course");

        txtMainCourse.setText("1. Chuleta de cerdo : acompañada con papas fritas y ensalada\n2.Camarones apanados : acompañado de salsa ranch, arroz, maduro frito y ensalada.\n3. Lasagna: acompañado con ensalada");
        jScrollPane2.setViewportView(txtMainCourse);

        jLabel4.setText("Dessert");

        txtDrink.setText("1. Piña\n2. Mora\n3. Sandia");
        jScrollPane3.setViewportView(txtDrink);

        jLabel5.setText("Drink");

        txtDessert.setText("1. Brownie\n2. Chesecake : fresa y mayacuya\n3. Tres leches");
        jScrollPane4.setViewportView(txtDessert);

        txtPriceLunch.setText("2.50");
        jScrollPane5.setViewportView(txtPriceLunch);

        jLabel6.setText("Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(299, 299, 299)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel5)
                        .addGap(267, 267, 267)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        FrmOptionsMenu frmOptionsMenu = new FrmOptionsMenu();
        frmOptionsMenu.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtSoup.getText().isEmpty() || txtMainCourse.getText().isEmpty()||
                txtDrink.getText().isEmpty() ||txtDessert.getText().isEmpty()||
                txtPriceLunch.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
      }else {
            String dataToSave = "Do you want to save this information?: \nSoup\n" + txtSoup.getText()
            +"\nMain Course\n"+txtMainCourse.getText()+"\nDrink\n" + txtDrink.getText()+"\nDessert\n" 
            + txtDessert.getText()+"\nPrice: "+txtPriceLunch.getText();

            int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Breakfast Saving",
            JOptionPane.YES_NO_CANCEL_OPTION);

            switch (selection) {
                case 0:
                    float priceLunch = Float.parseFloat(txtPriceLunch.getText());
                  
                    JOptionPane.showMessageDialog(null, "Information was saved", txtSoup.getText() + "Saved",
                    JOptionPane.INFORMATION_MESSAGE);
                    createLunch(mongo,"Menu","Lunch", txtSoup.getText(),txtMainCourse.getText(),txtDrink.getText(),txtDessert.getText(),priceLunch);
                   
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Information was NOT saved", txtSoup.getText() + "NOT saved",
                    JOptionPane.INFORMATION_MESSAGE);
                    emptyFields();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Action was cancelled", txtSoup.getText() + "Cancelled",
                    JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void emptyFields() {
        txtSoup.setText("");
        txtMainCourse.setText("");
        txtDrink.setText("");
        txtDessert.setText("");
        txtPriceLunch.setText("");
    }
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
            java.util.logging.Logger.getLogger(FrmEditLunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditLunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditLunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditLunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditLunch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane txtDessert;
    private javax.swing.JTextPane txtDrink;
    private javax.swing.JTextPane txtMainCourse;
    private javax.swing.JTextPane txtPriceLunch;
    private javax.swing.JTextPane txtSoup;
    // End of variables declaration//GEN-END:variables
}
