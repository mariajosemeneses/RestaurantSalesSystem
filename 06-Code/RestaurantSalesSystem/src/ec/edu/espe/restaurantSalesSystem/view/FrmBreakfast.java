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
import com.mongodb.MongoClientURI;
import static ec.edu.espe.Connection.utils.Conection.createConnection;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Maria José Meneses
 */
public class FrmBreakfast extends javax.swing.JFrame {

     DB db;
    DBCollection collection1;
    BasicDBObject document1 = new BasicDBObject();

    MongoClient mongo = createConnection();
    public FrmBreakfast() {
        MongoClientURI uri = new MongoClientURI(
                    "mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net/<dbname>?retryWrites"
                            + "=true&w=majority");

            MongoClient mongo = new MongoClient(uri);
            
         db = mongo.getDB("Order");
        collection1 = db.getCollection("generateOrder");
    
        initComponents();
                //Color JFrame
                SpinnerNumberModel nm = new SpinnerNumberModel();
                nm.setMaximum(10);
                nm.setMinimum(0);
                nm.setStepSize(1);
                spiValor.setModel(nm);
                
                SpinnerNumberModel nm2 = new SpinnerNumberModel();
                nm2.setMaximum(100);
                nm2.setMinimum(0);
                nm2.setStepSize(1);
                spiValor2.setModel(nm2);
                
                SpinnerNumberModel nm3 = new SpinnerNumberModel();
                nm3.setMaximum(100);
                nm3.setMinimum(0);
                nm3.setStepSize(1);
                spiValor3.setModel(nm3);
                
                SpinnerNumberModel nm4 = new SpinnerNumberModel();
                nm4.setMaximum(100);
                nm4.setMinimum(0);
                nm4.setStepSize(1);
                spiValor4.setModel(nm4);
                
                SpinnerNumberModel nm5 = new SpinnerNumberModel();
                nm5.setMaximum(100);
                nm5.setMinimum(0);
                nm5.setStepSize(1);
                spiValor5.setModel(nm5);
                
                SpinnerNumberModel nm6 = new SpinnerNumberModel();
                nm6.setMaximum(100);
                nm6.setMinimum(0);
                nm6.setStepSize(1);
                spiValor6.setModel(nm6);
                
                SpinnerNumberModel nm7 = new SpinnerNumberModel();
                nm7.setMaximum(100);
                nm7.setMinimum(0);
                nm7.setStepSize(1);
                spiValor7.setModel(nm7);
                
                SpinnerNumberModel nm8 = new SpinnerNumberModel();
                nm8.setMaximum(100);
                nm8.setMinimum(0);
                nm8.setStepSize(1);
                spiValor8.setModel(nm8);
                
                SpinnerNumberModel nm9 = new SpinnerNumberModel();
                nm9.setMaximum(100);
                nm9.setMinimum(0);
                nm9.setStepSize(1);
                spiValor9.setModel(nm9);
                
                SpinnerNumberModel nm10 = new SpinnerNumberModel();
                nm10.setMaximum(100);
                nm10.setMinimum(0);
                nm10.setStepSize(1);
                spiValor10.setModel(nm10);
                
                SpinnerNumberModel nm11 = new SpinnerNumberModel();
                nm11.setMaximum(100);
                nm11.setMinimum(0);
                nm11.setStepSize(1);
                spiValor11.setModel(nm11);
                
                SpinnerNumberModel nm12 = new SpinnerNumberModel();
                nm12.setMaximum(100);
                nm12.setMinimum(0);
                nm12.setStepSize(1);
                spiValor12.setModel(nm12);
                
                SpinnerNumberModel nm13 = new SpinnerNumberModel();
                nm13.setMaximum(100);
                nm13.setMinimum(0);
                nm13.setStepSize(1);
                spiValor13.setModel(nm13);
                
                SpinnerNumberModel nm14 = new SpinnerNumberModel();
                nm14.setMaximum(100);
                nm14.setMinimum(0);
                nm14.setStepSize(1);
                spiValor14.setModel(nm14);
                
                SpinnerNumberModel nm15 = new SpinnerNumberModel();
                nm15.setMaximum(100);
                nm15.setMinimum(0);
                nm15.setStepSize(1);
                spiValor15.setModel(nm15);
                
                SpinnerNumberModel nm16 = new SpinnerNumberModel();
                nm16.setMaximum(100);
                nm16.setMinimum(0);
                nm16.setStepSize(1);
                spiValor16.setModel(nm16);
                
                SpinnerNumberModel nm17 = new SpinnerNumberModel();
                nm17.setMaximum(100);
                nm17.setMinimum(0);
                nm17.setStepSize(1);
                spiValor17.setModel(nm17);
                
                SpinnerNumberModel nm18 = new SpinnerNumberModel();
                nm18.setMaximum(100);
                nm18.setMinimum(0);
                nm18.setStepSize(1);
                spiValor18.setModel(nm18);
                
                SpinnerNumberModel nm19 = new SpinnerNumberModel();
                nm19.setMaximum(100);
                nm19.setMinimum(0);
                nm19.setStepSize(1);
                spiValor19.setModel(nm19);
                
                SpinnerNumberModel nm20 = new SpinnerNumberModel();
                nm20.setMaximum(100);
                nm20.setMinimum(0);
                nm20.setStepSize(1);
                spiValor20.setModel(nm20);
                
                SpinnerNumberModel nm21 = new SpinnerNumberModel();
                nm21.setMaximum(100);
                nm21.setMinimum(0);
                nm21.setStepSize(1);
                spiValor21.setModel(nm21);
                
        this.getContentPane().setBackground(Color.WHITE);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBreakfast = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        txtDescription = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spiValor = new javax.swing.JSpinner();
        spiValor2 = new javax.swing.JSpinner();
        spiValor3 = new javax.swing.JSpinner();
        spiValor4 = new javax.swing.JSpinner();
        spiValor12 = new javax.swing.JSpinner();
        spiValor13 = new javax.swing.JSpinner();
        spiValor14 = new javax.swing.JSpinner();
        spiValor15 = new javax.swing.JSpinner();
        spiValor16 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        spiValor8 = new javax.swing.JSpinner();
        spiValor6 = new javax.swing.JSpinner();
        spiValor7 = new javax.swing.JSpinner();
        spiValor5 = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        spiValor9 = new javax.swing.JSpinner();
        spiValor10 = new javax.swing.JSpinner();
        spiValor11 = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spiValor17 = new javax.swing.JSpinner();
        spiValor18 = new javax.swing.JSpinner();
        spiValor19 = new javax.swing.JSpinner();
        spiValor20 = new javax.swing.JSpinner();
        spiValor21 = new javax.swing.JSpinner();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBreakfast.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        txtBreakfast.setText("Breakfast");

        jLabel2.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel2.setText("Bebida");

        jLabel3.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel3.setText("Huevos");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Add Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel12.setText("  ");

        jLabel11.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel11.setText("HUEVOS REVUELTOS.............$0,20");

        jLabel13.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel13.setText("HUEVOS COCIDOS...............$0,20");

        jLabel14.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel14.setText("HUEVOS TIBIOS................$0,20");

        jLabel15.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel15.setText("TORTA DE HUEVO...............$0,20");

        jLabel16.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel16.setText("HUEVOS FRITOS (CON YEMA).....$0,20");

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel4.setText("CAFE EN AGUA..................$0,50\n");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel8.setText("CAFE EN LECHE.................$0,75");

        jLabel10.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel10.setText("TE CON LIMON..................$0,50");

        jLabel9.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel9.setText("LECHE.........................$0,60");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel17.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel17.setText("Pan");

        jLabel18.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel18.setText("SIMPLE...................$0,10");

        jLabel19.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel19.setText("PAN CON JAMON............$0,25");

        jLabel20.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel20.setText("PAN CON MORTADELA........$0,25");

        jLabel21.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel21.setText("PAN INTEGRAL.............$0,25");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel22.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel22.setText("Jugos");

        jLabel23.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel23.setText("JUGO DE MORA.........................$0,75");

        jLabel24.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel24.setText("JUGO DE NARANJILLA...................$0,75");

        jLabel25.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel25.setText("JUGO DE TOMATE DE ARBOL..............$0,75");

        jLabel26.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel26.setText("Frutas");

        jLabel27.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel27.setText("Estofado");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel1.setText("MANZANA c/u...........$0,35");

        jLabel5.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel5.setText("PERA c/u..............$0,25");

        jLabel28.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel28.setText("BANANO c/u............$0,25");

        jLabel29.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel29.setText("ESTOFADO DE CARNE..................$1,50");

        jLabel30.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel30.setText("ESTOFADO DE POLLO..................$1,50");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel6))
                                    .addComponent(txtDescription))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(374, 374, 374)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spiValor2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(spiValor3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor)
                                    .addComponent(spiValor4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spiValor16)
                                    .addComponent(spiValor12)
                                    .addComponent(spiValor13)
                                    .addComponent(spiValor14)
                                    .addComponent(spiValor15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(txtBreakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(spiValor6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spiValor5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(spiValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spiValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel28))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spiValor17)
                                            .addComponent(spiValor18)
                                            .addComponent(spiValor19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel22)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spiValor20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spiValor21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel27)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBreakfast)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(spiValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(spiValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(spiValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(spiValor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel12)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spiValor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(spiValor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spiValor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(spiValor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jSeparator2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(spiValor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(spiValor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(spiValor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(spiValor20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(spiValor21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(spiValor17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spiValor18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(spiValor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(spiValor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(spiValor14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(spiValor15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spiValor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescription)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReturn)
                            .addComponent(jButton1))
                        .addGap(26, 26, 26))))
        );

        jLabel4.getAccessibleContext().setAccessibleName("CAFE EN AGUA..................$0,50\n\\nCAFE EN LECHE.................$0,75\n\\nLECHE............................$0,60\n\\nTE CON LIMON..................$0,50");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
       this.setVisible(false);
        FrmMenu frmOptionsMenuCustomer = new FrmMenu();
        frmOptionsMenuCustomer.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String dataToSave = "Do you want to save this information?: \nJuice ---->  "+ btnOptions.getSelectedItem();
            int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Juice  Saving",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
           collection1 = db.getCollection("generateOrder");
         if (btnOptions.getSelectedItem().equals("Continental")){
                document1.put("Name Product", ""+txtBreakfast.getText() );
                document1.put("Option "," "+ btnOptions.getSelectedItem());
                document1.put("Description: ", " Continental Breakfast"+txtDescription.getText() );
                document1.put( "Quantity ",""+ txtQ.getText()+"");
                collection1.insert(document1);
         } else {
                document1.put("Name Product", ""+txtBreakfast.getText() );
                document1.put("Option ", " " + btnOptions.getSelectedItem());
                document1.put("Description: ", "Full Breakfast "+txtDescription.getText() );
                document1.put( "Quantity",""+ txtQ.getText()+"");
                collection1.insert(document1);
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(FrmBreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBreakfast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner spiValor;
    private javax.swing.JSpinner spiValor10;
    private javax.swing.JSpinner spiValor11;
    private javax.swing.JSpinner spiValor12;
    private javax.swing.JSpinner spiValor13;
    private javax.swing.JSpinner spiValor14;
    private javax.swing.JSpinner spiValor15;
    private javax.swing.JSpinner spiValor16;
    private javax.swing.JSpinner spiValor17;
    private javax.swing.JSpinner spiValor18;
    private javax.swing.JSpinner spiValor19;
    private javax.swing.JSpinner spiValor2;
    private javax.swing.JSpinner spiValor20;
    private javax.swing.JSpinner spiValor21;
    private javax.swing.JSpinner spiValor3;
    private javax.swing.JSpinner spiValor4;
    private javax.swing.JSpinner spiValor5;
    private javax.swing.JSpinner spiValor6;
    private javax.swing.JSpinner spiValor7;
    private javax.swing.JSpinner spiValor8;
    private javax.swing.JSpinner spiValor9;
    private javax.swing.JLabel txtBreakfast;
    private javax.swing.JLabel txtDescription;
    // End of variables declaration//GEN-END:variables
}
