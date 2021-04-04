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
import static ec.edu.espe.restaurantSalesSystem.view.FrmLunch.validationSpinner;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maria José Meneses
 */
public class FrmJuice extends javax.swing.JFrame {
    
    public static void validationSpinner(JSpinner spinner) {
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(100);
        nm.setMinimum(0);
        nm.setStepSize(1);
        spinner.setModel(nm);
    }
    
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
                this.setLocationRelativeTo(null);
                rsscalelabel.RSScaleLabel.setScaleLabel(jimage,"src/ec/edu/espe/restaurantSalesSystem/images/papaya.jpg" );
                rsscalelabel.RSScaleLabel.setScaleLabel(jimage2,"src/ec/edu/espe/restaurantSalesSystem/images/sandia.png" );
                rsscalelabel.RSScaleLabel.setScaleLabel(jimage3,"src/ec/edu/espe/restaurantSalesSystem/images/naranjilla.jpg" );
                rsscalelabel.RSScaleLabel.setScaleLabel(jimage4,"src/ec/edu/espe/restaurantSalesSystem/images/tomate de arbol.jpg" );
                rsscalelabel.RSScaleLabel.setScaleLabel(jimage5,"src/ec/edu/espe/restaurantSalesSystem/images/JUGO-DE-MORA.jpg" );
                rsscalelabel.RSScaleLabel.setScaleLabel(jimage6,"src/ec/edu/espe/restaurantSalesSystem/images/limonada.jpg" );
                validationSpinner(spiValor);
                validationSpinner(spiValor2);
                validationSpinner(spiValor3);
                validationSpinner(spiValor4);
                validationSpinner(spiValor5);
                validationSpinner(spiValor6);
                validationSpinner(spiValor7);
                validationSpinner(spiValor8);
                validationSpinner(spiValor9);
                validationSpinner(spiValor10);
                validationSpinner(spiValor11);
                validationSpinner(spiValor12);
        this.getContentPane().setBackground(Color.WHITE);
        
       
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtJuice = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        spiValor = new javax.swing.JSpinner();
        spiValor2 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spiValor7 = new javax.swing.JSpinner();
        spiValor8 = new javax.swing.JSpinner();
        spiValor3 = new javax.swing.JSpinner();
        spiValor4 = new javax.swing.JSpinner();
        spiValor9 = new javax.swing.JSpinner();
        spiValor10 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        spiValor6 = new javax.swing.JSpinner();
        spiValor5 = new javax.swing.JSpinner();
        spiValor11 = new javax.swing.JSpinner();
        spiValor12 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jimage = new javax.swing.JLabel();
        jimage2 = new javax.swing.JLabel();
        jimage3 = new javax.swing.JLabel();
        jimage6 = new javax.swing.JLabel();
        jimage4 = new javax.swing.JLabel();
        jimage5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtJuice.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        txtJuice.setText("JUICES");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add Order");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel1.setText("PAPAYA");

        jLabel5.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel5.setText("NARANJILLA");

        jLabel7.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel7.setText("Juice jar...............$1,50");

        jLabel6.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel6.setText("TOMATE DE ARBOL");

        jLabel8.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel8.setText("Juice jar...............$1,50");

        jLabel9.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel9.setText("Glass of juice..........$0,75");

        jLabel10.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel10.setText("Glass of juice..........$0,75");

        jLabel11.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel11.setText("SANDIA");

        jLabel12.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel12.setText("Juice jar...............$1,50");

        jLabel13.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel13.setText("Glass of juice..........$0,75");

        jLabel14.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel14.setText("MORA");

        jLabel3.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel3.setText("Juice jar...............$1,50");

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel4.setText("Glass of juice..........$0,75");

        jLabel15.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel15.setText("Juice jar...............$1,50");

        jLabel16.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel16.setText("Glass of juice..........$0,75");

        jLabel17.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel17.setText("LIMONADA");

        jLabel18.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel18.setText("Juice jar...............$1,50");

        jLabel19.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel19.setText("Glass of juice..........$0,75");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Return");

        jimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                                .addComponent(spiValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(spiValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spiValor3)
                                            .addComponent(spiValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jimage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spiValor)
                                            .addComponent(spiValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jimage6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spiValor8)
                                    .addComponent(spiValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spiValor11)
                                    .addComponent(spiValor12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(txtJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(561, Short.MAX_VALUE)
                    .addComponent(jimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(430, 430, 430)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtJuice)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(spiValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(spiValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jimage, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(spiValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel13)
                                                    .addComponent(spiValor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15)
                                            .addComponent(spiValor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel16)
                                            .addComponent(spiValor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnAdd))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(spiValor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addComponent(jimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(spiValor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(spiValor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spiValor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spiValor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jimage6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(323, Short.MAX_VALUE)
                    .addComponent(jimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(259, 259, 259)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jimage;
    private javax.swing.JLabel jimage2;
    private javax.swing.JLabel jimage3;
    private javax.swing.JLabel jimage4;
    private javax.swing.JLabel jimage5;
    private javax.swing.JLabel jimage6;
    private javax.swing.JSpinner spiValor;
    private javax.swing.JSpinner spiValor10;
    private javax.swing.JSpinner spiValor11;
    private javax.swing.JSpinner spiValor12;
    private javax.swing.JSpinner spiValor2;
    private javax.swing.JSpinner spiValor3;
    private javax.swing.JSpinner spiValor4;
    private javax.swing.JSpinner spiValor5;
    private javax.swing.JSpinner spiValor6;
    private javax.swing.JSpinner spiValor7;
    private javax.swing.JSpinner spiValor8;
    private javax.swing.JSpinner spiValor9;
    private javax.swing.JLabel txtJuice;
    // End of variables declaration//GEN-END:variables

    private void create(MongoClient mongo, String order, String order0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createOrder(MongoClient mongo, String order, String generateOrder, Object selectedItem, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
