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
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import static ec.edu.espe.Connection.utils.Conection.createConnection;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maria José Meneses
 */
public class FrmJuice extends javax.swing.JFrame {
    
    DB db;
    DBCollection collection1;
    BasicDBObject document1 = new BasicDBObject();

    MongoClient mongo = createConnection();
     DefaultTableModel modelo;
    public FrmJuice() {
       
        MongoClientURI uri = new MongoClientURI(
                    "mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net/<dbname>?retryWrites"
                            + "=true&w=majority");

            MongoClient mongo = new MongoClient(uri);
            
         db = mongo.getDB("Order");
        collection1 = db.getCollection("generateOrder");
       
        initComponents();
                //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        
       
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtJuice = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnOptions = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtQ = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtDescription = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtJuice.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        txtJuice.setText("JUICE");

        jList8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jList8.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1.   Papaya", " ", "2.   Tomate de arbol", " ", "3.   Sandia", " ", "4.   Mora", " ", "5.   Naranjilla", " ", "6.   Melon", " ", "7.   Maracuya" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jList8);

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel2.setText("Price");

        jList1.setFont(new java.awt.Font("Consolas", 3, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "$ 1.00", " ", "$ 1.00", " ", "$ 1.00", " ", "$ 1.00", " ", "$ 1.00", " ", "$ 1.00", " ", "$ 1.00", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel3.setText("Options:");

        btnOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "" }));
        btnOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantity: ");

        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDescription.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(btnOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(btnReturn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(txtJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnAdd)
                        .addGap(87, 87, 87)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtJuice)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescription))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(jButton1))
                        .addGap(129, 129, 129))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
        FrmOptionsDrinkCustomer frmOptionsDrinkCustomer = new FrmOptionsDrinkCustomer();
        frmOptionsDrinkCustomer.setVisible(true);        
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOptionsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
            String dataToSave = "Do you want to save this information?: \nJuice ---->  "+ btnOptions.getSelectedItem();
            int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Juice  Saving",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
           collection1 = db.getCollection("generateOrder");
         if (btnOptions.getSelectedItem().equals("1")){
                document1.put("Name Product", ""+txtJuice.getText() );
                document1.put("Option "," "+ btnOptions.getSelectedItem());
                document1.put("Description: ", "Papaya flavor"+txtDescription.getText() );
                document1.put( "Quantity ",""+ txtQ.getText()+"");
                collection1.insert(document1);
         } else if(btnOptions.getSelectedItem().equals("2")){
                document1.put("Name Product", ""+txtJuice.getText() );
                document1.put("Option ", " " + btnOptions.getSelectedItem());
                document1.put("Description: ", "Tomate de árbol flavor"+txtDescription.getText() );
                document1.put( "Quantity",""+ txtQ.getText()+"");
                collection1.insert(document1);
        }else if (btnOptions.getSelectedItem().equals("3")){
                document1.put("Name Product", ""+txtJuice.getText() );
                document1.put("Option ", " " + btnOptions.getSelectedItem());
                document1.put("Description: ", "Sandia flavor"+txtDescription.getText() );
                document1.put( "Quantity",""+ txtQ.getText()+"");
                collection1.insert(document1);
         } else if(btnOptions.getSelectedItem().equals("4")){
                document1.put("Name Product", ""+txtJuice.getText() );
                document1.put("Option ", " " + btnOptions.getSelectedItem());
                document1.get("Description: Mora flavor juice");
                document1.put( "Quantity",""+ txtQ.getText()+"");
                collection1.insert(document1);
         } else if(btnOptions.getSelectedItem().equals("5")){
                document1.put("Name Product", ""+txtJuice.getText() );
                document1.put("Option ", " " + btnOptions.getSelectedItem());
                document1.put("Description: ", "Naranjilla flavor"+txtDescription.getText() );
                document1.put( "Quantity",""+ txtQ.getText()+"");
                collection1.insert(document1);
         }else if(btnOptions.getSelectedItem().equals("6")){
                document1.put("Name Product", ""+txtJuice.getText() );
                document1.put("Option ", " " + btnOptions.getSelectedItem());
                document1.put("Description: ", "Melon flavor"+txtDescription.getText() );
                document1.put( "Quantity",""+ txtQ.getText()+"");
                collection1.insert(document1);
         }else{
                document1.put("Name Product", ""+txtJuice.getText() );   
                document1.put("Option ", " " + btnOptions.getSelectedItem());
                document1.put("Description: ", "Maracuya flavor"+txtDescription.getText() );
                document1.put( "Quantity",""+ txtQ.getText()+"");
                collection1.insert(document1);
         } 
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        this.setVisible(false);
        FrmOrder frmOrder = new FrmOrder();
        frmOrder.setVisible(true);
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> btnOptions;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtJuice;
    private javax.swing.JTextField txtQ;
    // End of variables declaration//GEN-END:variables

    private void create(MongoClient mongo, String order, String order0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createOrder(MongoClient mongo, String order, String generateOrder, Object selectedItem, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
