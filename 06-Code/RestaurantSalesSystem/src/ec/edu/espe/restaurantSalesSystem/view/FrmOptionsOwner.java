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
import static ec.edu.espe.Connection.utils.Conection.createConnection;
import static ec.edu.espe.restaurantSalesSystem.utils.FileManager.create;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DAVID
 */
public class FrmOptionsOwner extends javax.swing.JFrame {
    MongoClient mongo = createConnection();
    DefaultTableModel modelo;
    /**
     * Creates new form frmOptions
     */
    public FrmOptionsOwner() {
        initComponents();
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Type Of Product");
        modelo.addColumn("Description");
        modelo.addColumn("Price");
        this.tblProducts.setModel(modelo);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrmStockProducts = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnAddProduct1 = new javax.swing.JButton();
        btnDeleteProduct1 = new javax.swing.JButton();
        btnViewProducts1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        dlgAddProduct = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        description2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        cmbTypeOfProduct = new javax.swing.JComboBox<>();
        txtDescription = new javax.swing.JTextField();
        products = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dlgDeleteProduct = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtRow2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegisterEmployee = new javax.swing.JButton();
        btnEditMenu = new javax.swing.JButton();
        btnReportSale = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        FrmStockProducts.setTitle("STOCK");
        FrmStockProducts.setMinimumSize(new java.awt.Dimension(622, 633));
        FrmStockProducts.setResizable(false);

        jPanel4.setMaximumSize(new java.awt.Dimension(623, 418));
        jPanel4.setMinimumSize(new java.awt.Dimension(623, 418));
        jPanel4.setPreferredSize(new java.awt.Dimension(622, 418));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(622, 418));
        jPanel6.setMinimumSize(new java.awt.Dimension(622, 418));
        jPanel6.setName(""); // NOI18N
        jPanel6.setLayout(null);

        btnAddProduct1.setText("ADD PRODUCT");
        btnAddProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProduct1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnAddProduct1);
        btnAddProduct1.setBounds(170, 140, 120, 23);

        btnDeleteProduct1.setText("DELETE PRODUCT");
        btnDeleteProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProduct1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnDeleteProduct1);
        btnDeleteProduct1.setBounds(370, 140, 140, 23);

        btnViewProducts1.setText("VIEW PRODUCTS");
        btnViewProducts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProducts1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnViewProducts1);
        btnViewProducts1.setBounds(250, 90, 150, 23);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCTS");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(210, 10, 230, 44);

        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9);
        jButton9.setBounds(20, 340, 50, 50);

        tblProducts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblProducts.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProducts.setGridColor(new java.awt.Color(255, 255, 255));
        tblProducts.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jScrollPane4.setViewportView(tblProducts);

        jPanel6.add(jScrollPane4);
        jScrollPane4.setBounds(140, 230, 380, 230);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-product_1.jpg"))); // NOI18N
        jPanel6.add(jLabel4);
        jLabel4.setBounds(0, 0, 620, 620);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FrmStockProductsLayout = new javax.swing.GroupLayout(FrmStockProducts.getContentPane());
        FrmStockProducts.getContentPane().setLayout(FrmStockProductsLayout);
        FrmStockProductsLayout.setHorizontalGroup(
            FrmStockProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FrmStockProductsLayout.setVerticalGroup(
            FrmStockProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        dlgAddProduct.setTitle("AÑADIR");
        dlgAddProduct.setMinimumSize(new java.awt.Dimension(803, 414));
        dlgAddProduct.setResizable(false);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NEW PRODUCT");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(280, 10, 220, 30);

        description2.setFont(new java.awt.Font("Perpetua Titling MT", 3, 12)); // NOI18N
        description2.setForeground(new java.awt.Color(255, 255, 255));
        description2.setText("Description:");
        jPanel7.add(description2);
        description2.setBounds(160, 130, 89, 16);

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price:");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(170, 190, 41, 16);

        txtPrice.setBackground(new java.awt.Color(0, 0, 0));
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel7.add(txtPrice);
        txtPrice.setBounds(340, 180, 40, 30);

        btnAdd.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel7.add(btnAdd);
        btnAdd.setBounds(330, 260, 63, 25);

        cmbTypeOfProduct.setBackground(new java.awt.Color(204, 204, 204));
        cmbTypeOfProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "SOUP", "MAIN COURSE", "JUICE", "DRINK", "DESSERT", "STEW", "FRUIT", "EGG", "BREAD", " ", " " }));
        cmbTypeOfProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeOfProductActionPerformed(evt);
            }
        });
        jPanel7.add(cmbTypeOfProduct);
        cmbTypeOfProduct.setBounds(330, 70, 95, 20);

        txtDescription.setBackground(new java.awt.Color(0, 0, 0));
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setToolTipText("Name and Lastname");
        jPanel7.add(txtDescription);
        txtDescription.setBounds(340, 110, 370, 50);

        products.setFont(new java.awt.Font("Perpetua Titling MT", 3, 12)); // NOI18N
        products.setForeground(new java.awt.Color(255, 255, 255));
        products.setText("Type Of Product:");
        jPanel7.add(products);
        products.setBounds(160, 70, 126, 16);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-Addproduct.jpg"))); // NOI18N
        jPanel7.add(jLabel6);
        jLabel6.setBounds(0, 0, 960, 400);

        javax.swing.GroupLayout dlgAddProductLayout = new javax.swing.GroupLayout(dlgAddProduct.getContentPane());
        dlgAddProduct.getContentPane().setLayout(dlgAddProductLayout);
        dlgAddProductLayout.setHorizontalGroup(
            dlgAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        dlgAddProductLayout.setVerticalGroup(
            dlgAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        dlgDeleteProduct.setTitle("AÑADIR");
        dlgDeleteProduct.setMinimumSize(new java.awt.Dimension(503, 314));
        dlgDeleteProduct.setResizable(false);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(null);

        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel8.add(btnDelete);
        btnDelete.setBounds(200, 160, 87, 25);

        jLabel16.setFont(new java.awt.Font("Perpetua Titling MT", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DELETE PRODUCT");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(150, 20, 250, 30);

        txtRow2.setBackground(new java.awt.Color(0, 0, 0));
        txtRow2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(txtRow2);
        txtRow2.setBounds(210, 90, 80, 20);

        jLabel17.setFont(new java.awt.Font("Perpetua Titling MT", 3, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Row:");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(130, 90, 36, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-Addproduct.jpg"))); // NOI18N
        jPanel8.add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 300);

        javax.swing.GroupLayout dlgDeleteProductLayout = new javax.swing.GroupLayout(dlgDeleteProduct.getContentPane());
        dlgDeleteProduct.getContentPane().setLayout(dlgDeleteProductLayout);
        dlgDeleteProductLayout.setHorizontalGroup(
            dlgDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        dlgDeleteProductLayout.setVerticalGroup(
            dlgDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnRegisterEmployee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegisterEmployee.setText("Register Employee");
        btnRegisterEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterEmployeeActionPerformed(evt);
            }
        });

        btnEditMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditMenu.setText("Edit Menu");
        btnEditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMenuActionPerformed(evt);
            }
        });

        btnReportSale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReportSale.setText("Report Sale");
        btnReportSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportSaleActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReturn.setText("Exit");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegisterEmployee)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditMenu)
                            .addComponent(btnReportSale))
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnReturn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRegisterEmployee)
                .addGap(42, 42, 42)
                .addComponent(btnEditMenu)
                .addGap(31, 31, 31)
                .addComponent(btnReportSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnReturn)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterEmployeeActionPerformed
        this.setVisible(false);
        FrmResgisterEmployee frmResgisterEmployee = new FrmResgisterEmployee();
        frmResgisterEmployee.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterEmployeeActionPerformed

    private void btnEditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMenuActionPerformed
        FrmStockProducts.setVisible(true);
        this.dispose();
        FrmStockProducts.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnEditMenuActionPerformed

    private void btnReportSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportSaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportSaleActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
        FrmLoginScreen frmLoginScreen = new FrmLoginScreen();
        frmLoginScreen.setVisible(true); 
    }//GEN-LAST:event_btnReturnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        FrmStockProducts.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnAddProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProduct1ActionPerformed
         dlgAddProduct.setVisible(true);
        dlgAddProduct.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddProduct1ActionPerformed

    private void btnDeleteProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProduct1ActionPerformed
        dlgDeleteProduct.setVisible(true);
        dlgDeleteProduct.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDeleteProduct1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        
            String dataToSave = "Do you want to save this information?: \n Procustc" + "\nType Of Product: " + cmbTypeOfProduct.getSelectedItem()
                    + "\nDescription: " + txtDescription.getText() + "\nPrice: " + txtPrice.getText();

            int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Product added successfully",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            switch (selection) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Information was saved",  cmbTypeOfProduct.getSelectedItem() + "Saved",
                            JOptionPane.INFORMATION_MESSAGE);
                    float price = Float.parseFloat(txtPrice.getText());
                    create(mongo, "Products", "Food", (String) cmbTypeOfProduct.getSelectedItem(), txtDescription.getText(), price);
                    emptyFields();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Information was NOT saved", cmbTypeOfProduct.getSelectedItem() + "NOT saved",
                            JOptionPane.INFORMATION_MESSAGE);
                    emptyFields();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Action was cancelled", cmbTypeOfProduct.getSelectedItem() + "Cancelled",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            
        }
        /*DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        String typeOfProduct = (String) cmbTypeOfProduct.getSelectedItem();
        String description = txtDescription.getText();
        float price = Float.parseFloat(txtPrice.getText());

        model.addRow(new Object[]{typeOfProduct, description,price});

        if (!typeOfProduct.isEmpty()) {
            if (price != 0) {
                JOptionPane.showMessageDialog(null, "Product added successfully.");
                dlgAddProduct.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No data has been entered.");
        }*/
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbTypeOfProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeOfProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTypeOfProductActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        int row=tblProducts.getSelectedRow();
        if (row>=0){
            model.removeRow(row);
            JOptionPane.showMessageDialog(null, "Product removed.");
             dlgAddProduct.dispose();
        }else {
            JOptionPane.showMessageDialog(null,"Select row");
           
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnViewProducts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProducts1ActionPerformed
         DBCursor cursor = null;
        DB db = mongo.getDB("Products");
        DBCollection dbCollection3 = db.getCollection("Food");
        try {
            cursor = dbCollection3.find();
            String[] columnNames = {"Type of Product", "Description","Price"};
            DefaultTableModel modelTable = new DefaultTableModel(columnNames, 0);
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String typeOfProduct = (String) obj.get("typeOfProduct");
                String description = (String) obj.get("description");
                float price = Float.valueOf(obj.get("price").toString());
                modelTable.addRow(new Object[]{typeOfProduct, description, price});
            }
            tblProducts.setModel(modelTable);
            cursor.close();
        } catch (NumberFormatException ex) {
            System.out.println("Error printing tables");
        }
    }//GEN-LAST:event_btnViewProducts1ActionPerformed
 public void emptyFields() {
        
        cmbTypeOfProduct.setSelectedIndex(0);
        txtDescription.setText("");
        txtPrice.setText("");
        
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
    private javax.swing.JFrame FrmStockProducts;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddProduct1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteProduct1;
    private javax.swing.JButton btnEditMenu;
    private javax.swing.JButton btnRegisterEmployee;
    private javax.swing.JButton btnReportSale;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnViewProducts1;
    private javax.swing.JComboBox<String> cmbTypeOfProduct;
    private javax.swing.JLabel description2;
    private javax.swing.JDialog dlgAddProduct;
    private javax.swing.JDialog dlgDeleteProduct;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel products;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRow2;
    // End of variables declaration//GEN-END:variables
}
