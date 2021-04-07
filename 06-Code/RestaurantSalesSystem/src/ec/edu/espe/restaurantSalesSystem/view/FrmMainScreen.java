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
import ec.edu.espe.restaurantSalesSystem.controller.SuggestionController;
import ec.edu.espe.restaurantSalesSystem.controller.Verification;
import ec.edu.espe.restaurantSalesSystem.controller.VerificationController;
import ec.edu.espe.restaurantSalesSystem.model.Product;
import ec.edu.espe.restaurantSalesSystem.utils.MongoManager;
import ec.edu.espe.restaurantSalesSystem.utils.NoSQL;
import ec.edu.espe.restaurantsalessystem.model.Bill;
import java.awt.Image;
import java.awt.Menu;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;


/**
 *
 * @author Grupo 3
 */
public class FrmMainScreen extends javax.swing.JFrame {

    MongoManager mongoManager = new MongoManager();
    String URL = "mongodb+srv://unitedByCode:group3@data.j0bvg.mongodb.net/<dbname>?retryWrites=true&w=majority";
    MongoClient mongo = mongoManager.openConnection(URL);
    
    int contador = 0;
    int suma = 0;

    /**
     * Creates new form FrmMainScreen1
     */
    public FrmMainScreen() {
        initComponents();

        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jlogo, "src/ec/edu/espe/restaurantSalesSystem/images/logo.jpg");
        
        validationSpinner(spiValor201);
        validationSpinner(spiValor202);
        validationSpinner(spiValor203);
        validationSpinner(spiValor204);
        validationSpinner(spiValor205);
        validationSpinner(spiValor206);
        validationSpinner(spiValor207);
        validationSpinner(spiValor208);
        validationSpinner(spiValor209);
        validationSpinner(spiValor210);
        validationSpinner(spiValor211);
        validationSpinner(spiValor212);
        validationSpinner(spiValor213);
        validationSpinner(spiValor214);
        validationSpinner(spiValor215);
        validationSpinner(spiValor216);
        validationSpinner(spiValor217);
        validationSpinner(spiValor218);
        validationSpinner(spiValor219);
        validationSpinner(spiValor220);
        validationSpinner(spiValor221);
        //Validation Lunch
        validationSpinner(spiValor222);
        validationSpinner(spiValor223);
        validationSpinner(spiValor224);
        validationSpinner(spiValor225);
        validationSpinner(spiValor226);
        validationSpinner(spiValor227);
        validationSpinner(spiValor228);
        validationSpinner(spiValor229);
        validationSpinner(spiValor230);
        validationSpinner(spiValor231);
        validationSpinner(spiValor232);
        validationSpinner(spiValor233);
        //Validation Snack
        validationSpinner(spiValor234);
        validationSpinner(spiValor235);
        validationSpinner(spiValor236);
        validationSpinner(spiValor237);
        validationSpinner(spiValor238);
        validationSpinner(spiValor239);
        validationSpinner(spiValor240);
        validationSpinner(spiValor241);
        validationSpinner(spiValor242);
        validationSpinner(spiValor243);
        //Validation Coffee
        validationSpinner(spiValor244);
        validationSpinner(spiValor245);
        validationSpinner(spiValor246);
        validationSpinner(spiValor247);
        validationSpinner(spiValor248);
        validationSpinner(spiValor249);
        validationSpinner(spiValor250);
        validationSpinner(spiValor251);
        validationSpinner(spiValor252);
        validationSpinner(spiValor253);
        validationSpinner(spiValor254);
        validationSpinner(spiValor255);
        validationSpinner(spiValor256);
        validationSpinner(spiValor257);
        validationSpinner(spiValor258);
        validationSpinner(spiValor259);
        //Validation Juice
        validationSpinner(spiValor260);
        validationSpinner(spiValor261);
        validationSpinner(spiValor262);
        validationSpinner(spiValor263);
        validationSpinner(spiValor264);
        validationSpinner(spiValor265);
        validationSpinner(spiValor266);
        validationSpinner(spiValor267);
        validationSpinner(spiValor268);
        validationSpinner(spiValor269);
        validationSpinner(spiValor270);
        validationSpinner(spiValor271);
        //Validation Soda
        validationSpinner(spiValor272);
        validationSpinner(spiValor273);
        validationSpinner(spiValor274);
        validationSpinner(spiValor275);
        validationSpinner(spiValor276);
        validationSpinner(spiValor277);
        validationSpinner(spiValor278);
        validationSpinner(spiValor279);
        //Validation Dessert
        validationSpinner(spiValor280);
        validationSpinner(spiValor281);
        validationSpinner(spiValor282);
        validationSpinner(spiValor283);
        validationSpinner(spiValor284);
        validationSpinner(spiValor285);
        validationSpinner(spiValor286);
        validationSpinner(spiValor287);
        validationSpinner(spiValor288);
        validationSpinner(spiValor289);
        validationSpinner(spiValor290);
        validationSpinner(spiValor291);
        validationSpinner(spiValor292);
        validationSpinner(spiValor293);
        validationSpinner(spiValor294);
        validationSpinner(spiValor295);
        validationSpinner(spiValor296);
        validationSpinner(spiValor297);
        validationSpinner(spiValor298);
        validationSpinner(spiValor299);
        validationSpinner(spiValor300);
        validationSpinner(spiValor301);
        validationSpinner(spiValor302);
        validationSpinner(spiValor303);
        validationSpinner(spiValor304);
        validationSpinner(spiValor305);
        validationSpinner(spiValor306);
        validationSpinner(spiValor307);
        validationSpinner(spiValor308);
        validationSpinner(spiValor309);
        validationSpinner(spiValor310);
        validationSpinner(spiValor311);
        validationSpinner(spiValor312);
        validationSpinner(spiValor313);
        validationSpinner(spiValor314);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel191 = new javax.swing.JLabel();
        OptionsCashier = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        OptionsOwner = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnEditMenu = new javax.swing.JButton();
        btnRegisterEmployee = new javax.swing.JButton();
        btnReportSale = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FrmStockProducts = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnFindProducts = new javax.swing.JButton();
        btnReturn2 = new javax.swing.JButton();
        txtProducts = new javax.swing.JTextField();
        btnAddProduct1 = new javax.swing.JButton();
        btnDeleteProduct1 = new javax.swing.JButton();
        btnViewProducts1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ReportSale = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        btnNumSales = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnReturn6 = new javax.swing.JButton();
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
        Suggestions = new javax.swing.JDialog();
        txtSuggestions = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jSuggestions = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        dlgDeleteProduct = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtDataToDelete = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Menu = new javax.swing.JFrame();
        btnDessert = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnExit1 = new javax.swing.JButton();
        btnBreakfast = new javax.swing.JButton();
        btnLunch = new javax.swing.JButton();
        btnSnack = new javax.swing.JButton();
        btnDrink = new javax.swing.JButton();
        MenuBreakfast = new javax.swing.JFrame();
        txtBreakfast = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bntOrderBreakfast = new javax.swing.JButton();
        btnReturnBreakfast = new javax.swing.JButton();
        txtDescription1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        spiValor201 = new javax.swing.JSpinner();
        spiValor202 = new javax.swing.JSpinner();
        spiValor203 = new javax.swing.JSpinner();
        spiValor204 = new javax.swing.JSpinner();
        spiValor212 = new javax.swing.JSpinner();
        spiValor213 = new javax.swing.JSpinner();
        spiValor214 = new javax.swing.JSpinner();
        spiValor215 = new javax.swing.JSpinner();
        spiValor216 = new javax.swing.JSpinner();
        cafeEnAgua = new javax.swing.JLabel();
        cafeEnLeche = new javax.swing.JLabel();
        teConLimon = new javax.swing.JLabel();
        leche = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        spiValor208 = new javax.swing.JSpinner();
        spiValor206 = new javax.swing.JSpinner();
        spiValor207 = new javax.swing.JSpinner();
        spiValor205 = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        spiValor209 = new javax.swing.JSpinner();
        spiValor210 = new javax.swing.JSpinner();
        spiValor211 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spiValor217 = new javax.swing.JSpinner();
        spiValor218 = new javax.swing.JSpinner();
        spiValor219 = new javax.swing.JSpinner();
        spiValor220 = new javax.swing.JSpinner();
        spiValor221 = new javax.swing.JSpinner();
        jSeparator5 = new javax.swing.JSeparator();
        jIntegralBread = new javax.swing.JLabel();
        jBreadWithJam = new javax.swing.JLabel();
        jBlackberryJuice = new javax.swing.JLabel();
        jSimpleBread = new javax.swing.JLabel();
        jMilkCoffee = new javax.swing.JLabel();
        jCoffeWater = new javax.swing.JLabel();
        jLemonTea = new javax.swing.JLabel();
        jTreeTomato = new javax.swing.JLabel();
        jNaranjillasq = new javax.swing.JLabel();
        jboiledEgg = new javax.swing.JLabel();
        jWarmEgg = new javax.swing.JLabel();
        jOmelette = new javax.swing.JLabel();
        jPear = new javax.swing.JLabel();
        jBanano = new javax.swing.JLabel();
        jApple1 = new javax.swing.JLabel();
        jBeefStew = new javax.swing.JLabel();
        jChickenStew = new javax.swing.JLabel();
        MenuLunch = new javax.swing.JFrame();
        jLabel53 = new javax.swing.JLabel();
        spiValor232 = new javax.swing.JSpinner();
        jLabel49 = new javax.swing.JLabel();
        jNaranjilla = new javax.swing.JLabel();
        spiValor226 = new javax.swing.JSpinner();
        spiValor223 = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        spiValor228 = new javax.swing.JSpinner();
        jCaldoGallina = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLasaña = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jChuleta = new javax.swing.JLabel();
        spiValor224 = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLocro = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        spiValor225 = new javax.swing.JSpinner();
        jChesecake = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jBabaco = new javax.swing.JLabel();
        jPineapple = new javax.swing.JLabel();
        spiValor222 = new javax.swing.JSpinner();
        spiValor233 = new javax.swing.JSpinner();
        btnOrderLunch = new javax.swing.JButton();
        spiValor229 = new javax.swing.JSpinner();
        jLabel43 = new javax.swing.JLabel();
        jCremaTomato = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jBrownies = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        spiValor230 = new javax.swing.JSpinner();
        spiValor231 = new javax.swing.JSpinner();
        jLabel55 = new javax.swing.JLabel();
        btnReturnLunch = new javax.swing.JButton();
        spiValor227 = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        jThreeMilksCake = new javax.swing.JLabel();
        jCamaron = new javax.swing.JLabel();
        MenuSnack = new javax.swing.JFrame();
        spiValor237 = new javax.swing.JSpinner();
        spiValor238 = new javax.swing.JSpinner();
        spiValor242 = new javax.swing.JSpinner();
        jLabel165 = new javax.swing.JLabel();
        spiValor243 = new javax.swing.JSpinner();
        jLabel166 = new javax.swing.JLabel();
        jBBQ = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jHot = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        spiValor234 = new javax.swing.JSpinner();
        txtSnack = new javax.swing.JLabel();
        spiValor235 = new javax.swing.JSpinner();
        jSeparator20 = new javax.swing.JSeparator();
        spiValor236 = new javax.swing.JSpinner();
        jNachosWithGuacamole = new javax.swing.JLabel();
        btnAddOrderSnack = new javax.swing.JButton();
        jCheeseburger = new javax.swing.JLabel();
        bntReturnSnack = new javax.swing.JButton();
        jBaconCheeseBurger = new javax.swing.JLabel();
        jJackDanielsBurger = new javax.swing.JLabel();
        spiValor241 = new javax.swing.JSpinner();
        spiValor239 = new javax.swing.JSpinner();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jpassionFruit = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jNachosWithCheese = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jChickenBurguer = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jClassicBurger = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        spiValor240 = new javax.swing.JSpinner();
        MenuCoffee = new javax.swing.JFrame();
        spiValor244 = new javax.swing.JSpinner();
        spiValor245 = new javax.swing.JSpinner();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        btnReturnCoffee = new javax.swing.JButton();
        spiValor246 = new javax.swing.JSpinner();
        jSeparator10 = new javax.swing.JSeparator();
        spiValor247 = new javax.swing.JSpinner();
        btnOrderCoffee = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        spiValor248 = new javax.swing.JSpinner();
        spiValor249 = new javax.swing.JSpinner();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        spiValor250 = new javax.swing.JSpinner();
        spiValor251 = new javax.swing.JSpinner();
        spiValor252 = new javax.swing.JSpinner();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        spiValor253 = new javax.swing.JSpinner();
        spiValor254 = new javax.swing.JSpinner();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        spiValor255 = new javax.swing.JSpinner();
        spiValor256 = new javax.swing.JSpinner();
        spiValor257 = new javax.swing.JSpinner();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jCapuccino = new javax.swing.JLabel();
        jExpressoRistretto = new javax.swing.JLabel();
        jFrocaccino = new javax.swing.JLabel();
        jFrapuccino = new javax.swing.JLabel();
        spiValor258 = new javax.swing.JSpinner();
        jMocaccino = new javax.swing.JLabel();
        spiValor259 = new javax.swing.JSpinner();
        jLatteMacchaiato = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jAmericano = new javax.swing.JLabel();
        jTinto = new javax.swing.JLabel();
        MenuJuice = new javax.swing.JFrame();
        spiValor263 = new javax.swing.JSpinner();
        spiValor268 = new javax.swing.JSpinner();
        spiValor269 = new javax.swing.JSpinner();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        spiValor266 = new javax.swing.JSpinner();
        spiValor267 = new javax.swing.JSpinner();
        spiValor262 = new javax.swing.JSpinner();
        spiValor270 = new javax.swing.JSpinner();
        spiValor271 = new javax.swing.JSpinner();
        jSeparator14 = new javax.swing.JSeparator();
        btnReturnJuice = new javax.swing.JButton();
        jimage1 = new javax.swing.JLabel();
        jimage5 = new javax.swing.JLabel();
        jimage6 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        spiValor265 = new javax.swing.JSpinner();
        spiValor264 = new javax.swing.JSpinner();
        txtJuice = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jimage7 = new javax.swing.JLabel();
        jimage8 = new javax.swing.JLabel();
        jimage9 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        spiValor260 = new javax.swing.JSpinner();
        spiValor261 = new javax.swing.JSpinner();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        btnOrderJuice = new javax.swing.JButton();
        MenuSoda = new javax.swing.JFrame();
        btnOrderSoda = new javax.swing.JButton();
        spiValor272 = new javax.swing.JSpinner();
        jSeparator12 = new javax.swing.JSeparator();
        spiValor273 = new javax.swing.JSpinner();
        btnReturnSoda = new javax.swing.JButton();
        spiValor276 = new javax.swing.JSpinner();
        spiValor277 = new javax.swing.JSpinner();
        spiValor274 = new javax.swing.JSpinner();
        jLabel69 = new javax.swing.JLabel();
        spiValor275 = new javax.swing.JSpinner();
        spiValor278 = new javax.swing.JSpinner();
        spiValor279 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jimage4 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jimage3 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jimage2 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jimage = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        MenuDessert = new javax.swing.JFrame();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        spiValor306 = new javax.swing.JSpinner();
        spiValor307 = new javax.swing.JSpinner();
        spiValor308 = new javax.swing.JSpinner();
        spiValor309 = new javax.swing.JSpinner();
        spiValor310 = new javax.swing.JSpinner();
        spiValor311 = new javax.swing.JSpinner();
        spiValor312 = new javax.swing.JSpinner();
        spiValor294 = new javax.swing.JSpinner();
        spiValor295 = new javax.swing.JSpinner();
        spiValor296 = new javax.swing.JSpinner();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        spiValor290 = new javax.swing.JSpinner();
        spiValor289 = new javax.swing.JSpinner();
        spiValor291 = new javax.swing.JSpinner();
        spiValor292 = new javax.swing.JSpinner();
        spiValor293 = new javax.swing.JSpinner();
        spiValor281 = new javax.swing.JSpinner();
        spiValor282 = new javax.swing.JSpinner();
        spiValor283 = new javax.swing.JSpinner();
        spiValor284 = new javax.swing.JSpinner();
        spiValor285 = new javax.swing.JSpinner();
        spiValor286 = new javax.swing.JSpinner();
        spiValor287 = new javax.swing.JSpinner();
        spiValor288 = new javax.swing.JSpinner();
        spiValor299 = new javax.swing.JSpinner();
        jLabel139 = new javax.swing.JLabel();
        spiValor298 = new javax.swing.JSpinner();
        spiValor313 = new javax.swing.JSpinner();
        spiValor297 = new javax.swing.JSpinner();
        spiValor314 = new javax.swing.JSpinner();
        jSeparator15 = new javax.swing.JSeparator();
        spiValor280 = new javax.swing.JSpinner();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel147 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        spiValor305 = new javax.swing.JSpinner();
        jLabel148 = new javax.swing.JLabel();
        spiValor300 = new javax.swing.JSpinner();
        spiValor301 = new javax.swing.JSpinner();
        spiValor302 = new javax.swing.JSpinner();
        spiValor303 = new javax.swing.JSpinner();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        spiValor304 = new javax.swing.JSpinner();
        jLojanoTamale = new javax.swing.JLabel();
        jChocolate = new javax.swing.JLabel();
        jVanilla = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jNutella = new javax.swing.JLabel();
        jBrownie = new javax.swing.JLabel();
        jCoconutCaramelAlmond = new javax.swing.JLabel();
        jHumita = new javax.swing.JLabel();
        jLemon = new javax.swing.JLabel();
        jOrange = new javax.swing.JLabel();
        jCakeChocolate = new javax.swing.JLabel();
        jBolon = new javax.swing.JLabel();
        jApple = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jQuimbolito = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        btnAddOrderDessert = new javax.swing.JButton();
        btnReturnDessert = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        Order = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel178 = new javax.swing.JLabel();
        btnReturn4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        datosTable = new javax.swing.JTable();
        jLabel179 = new javax.swing.JLabel();
        btnSendOrder = new javax.swing.JButton();
        numMesa = new javax.swing.JTextField();
        viewOrder = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        datosTable2 = new javax.swing.JTable();
        btnGenerateBill = new javax.swing.JButton();
        jLabel180 = new javax.swing.JLabel();
        btnReturn3 = new javax.swing.JButton();
        btnOtherOrder = new javax.swing.JButton();
        GenerateBill = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        txtTableNumber = new javax.swing.JTextField();
        btngenerateBillCashier = new javax.swing.JButton();
        btnReturn1 = new javax.swing.JButton();
        jGenerateBill = new javax.swing.JLabel();
        Bill = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        factTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        btnCellphoneCostumer = new javax.swing.JTextField();
        txtIdCostumer = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        txtNameCostumer = new javax.swing.JTextField();
        btnReturn5 = new javax.swing.JButton();
        infoFact = new javax.swing.JLabel();
        fac = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JLabel();
        numMesa2 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        TOTALtot = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        PROPINA = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        txtNameCashier = new javax.swing.JTextField();
        OptionsDrink = new javax.swing.JDialog();
        btnSoda = new javax.swing.JButton();
        btnReturnOptionDrink = new javax.swing.JButton();
        btnCoffee = new javax.swing.JButton();
        btnJuice = new javax.swing.JButton();
        jlogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        itmMnuExit = new javax.swing.JMenuItem();
        itmSuggestions = new javax.swing.JMenuItem();
        mnuLogin = new javax.swing.JMenu();
        itmMnuOwner = new javax.swing.JMenuItem();
        itmMnuCashier = new javax.swing.JMenuItem();
        itmMnuCustomer = new javax.swing.JMenuItem();

        Login.setMinimumSize(new java.awt.Dimension(440, 317));

        btnLogin.setText("Log in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit2.setText("Return");
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnExit2)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel189.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel189.setText("Username:");

        jLabel190.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel190.setText("Password:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel190)
                    .addComponent(jLabel189))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel189)
                    .addComponent(txtUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel190)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel191.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel191.setText("Restaurant Sales System");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel191)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel191)
                .addGap(38, 38, 38)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        OptionsCashier.setTitle("Options Cashier");
        OptionsCashier.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CASHIER MENU");
        OptionsCashier.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 49, 220, 23));

        jLabel192.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(102, 255, 255));
        jLabel192.setText("Generate Bill");
        OptionsCashier.getContentPane().add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, -1));

        OptionsOwner.setTitle("Options Owner");
        OptionsOwner.setMinimumSize(new java.awt.Dimension(468, 413));
        OptionsOwner.setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/back (1).png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 60, 30));

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
        jPanel1.add(btnEditMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

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
        jPanel1.add(btnRegisterEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));

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
        jPanel1.add(btnReportSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/fondo_ownerOptionsq.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 410));

        javax.swing.GroupLayout OptionsOwnerLayout = new javax.swing.GroupLayout(OptionsOwner.getContentPane());
        OptionsOwner.getContentPane().setLayout(OptionsOwnerLayout);
        OptionsOwnerLayout.setHorizontalGroup(
            OptionsOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsOwnerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        OptionsOwnerLayout.setVerticalGroup(
            OptionsOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsOwnerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        btnFindProducts.setText("FIND PRODUCTS");
        btnFindProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindProductsActionPerformed(evt);
            }
        });
        jPanel6.add(btnFindProducts);
        btnFindProducts.setBounds(360, 190, 140, 30);

        btnReturn2.setText("Return");
        btnReturn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnReturn2);
        btnReturn2.setBounds(500, 510, 65, 23);
        jPanel6.add(txtProducts);
        txtProducts.setBounds(200, 190, 140, 30);

        btnAddProduct1.setText("ADD PRODUCT");
        btnAddProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProduct1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnAddProduct1);
        btnAddProduct1.setBounds(170, 130, 120, 30);

        btnDeleteProduct1.setText("DELETE PRODUCT");
        btnDeleteProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProduct1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnDeleteProduct1);
        btnDeleteProduct1.setBounds(360, 130, 140, 30);

        btnViewProducts1.setText("VIEW PRODUCTS");
        btnViewProducts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProducts1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnViewProducts1);
        btnViewProducts1.setBounds(250, 83, 150, 30);

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRODUCTS");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(210, 10, 230, 44);

        tblProducts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblProducts.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProducts.setInheritsPopupMenu(true);
        tblProducts.setSelectionBackground(new java.awt.Color(204, 204, 0));
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(140, 240, 380, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/fondo-product_1.jpg"))); // NOI18N
        jPanel6.add(jLabel5);
        jLabel5.setBounds(0, 0, 620, 620);

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

        ReportSale.setTitle("Report Sales");
        ReportSale.setBackground(new java.awt.Color(0, 0, 0));
        ReportSale.setMinimumSize(new java.awt.Dimension(341, 333));
        ReportSale.setUndecorated(true);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        btnNumSales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNumSales.setForeground(new java.awt.Color(255, 0, 51));
        btnNumSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/reportSale1.png"))); // NOI18N
        btnNumSales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnNumSales.setContentAreaFilled(false);
        btnNumSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumSales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNumSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumSalesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 102));
        jLabel8.setText("Total number of sales");

        btnReturn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/back (1).png"))); // NOI18N
        btnReturn6.setContentAreaFilled(false);
        btnReturn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnNumSales))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnReturn6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNumSales)
                .addGap(36, 36, 36)
                .addComponent(btnReturn6)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ReportSaleLayout = new javax.swing.GroupLayout(ReportSale.getContentPane());
        ReportSale.getContentPane().setLayout(ReportSaleLayout);
        ReportSaleLayout.setHorizontalGroup(
            ReportSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ReportSaleLayout.setVerticalGroup(
            ReportSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        cmbTypeOfProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "SOUP", "MAIN COURSE", "JUICE", "DRINK", "DESSERT", "STEW", "FRUIT", "EGG", "BREAD", "HAMBURGUESAS", "ALITAS", "NACHOS", "COFFEE", "SODA", "CHESECAKE", "PIES", "CAKES", "ESPECIALES" }));
        cmbTypeOfProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeOfProductActionPerformed(evt);
            }
        });
        jPanel7.add(cmbTypeOfProduct);
        cmbTypeOfProduct.setBounds(330, 70, 106, 20);

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/fondo-Addproduct.jpg"))); // NOI18N
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

        Suggestions.setTitle("Suggestions");
        Suggestions.setMinimumSize(new java.awt.Dimension(478, 300));

        txtSuggestions.setColumns(20);
        txtSuggestions.setRows(5);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        jLabel3.setText("SUGGESTIONS:");

        btnSend.setFont(new java.awt.Font("Calibri Light", 3, 14)); // NOI18N
        btnSend.setText("SEND");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnReturn.setText("RETURN");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SuggestionsLayout = new javax.swing.GroupLayout(Suggestions.getContentPane());
        Suggestions.getContentPane().setLayout(SuggestionsLayout);
        SuggestionsLayout.setHorizontalGroup(
            SuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuggestionsLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SuggestionsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jSuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnReturn)
                .addGap(79, 79, 79)
                .addComponent(btnSend)
                .addGap(39, 39, 39))
            .addGroup(SuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuggestionsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtSuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        SuggestionsLayout.setVerticalGroup(
            SuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuggestionsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGroup(SuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SuggestionsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSend)
                            .addComponent(btnReturn)))
                    .addGroup(SuggestionsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(SuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuggestionsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtSuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Suggestions.getAccessibleContext().setAccessibleParent(null);

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
        btnDelete.setBounds(210, 160, 87, 25);

        jLabel16.setFont(new java.awt.Font("Perpetua Titling MT", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DELETE PRODUCT");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(150, 20, 250, 30);

        txtDataToDelete.setBackground(new java.awt.Color(0, 0, 0));
        txtDataToDelete.setForeground(new java.awt.Color(255, 255, 255));
        txtDataToDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataToDeleteActionPerformed(evt);
            }
        });
        jPanel8.add(txtDataToDelete);
        txtDataToDelete.setBounds(210, 110, 170, 30);

        jLabel17.setFont(new java.awt.Font("Perpetua Titling MT", 3, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Description:");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(110, 120, 90, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/fondo-Addproduct.jpg"))); // NOI18N
        jPanel8.add(jLabel7);
        jLabel7.setBounds(0, 0, 630, 300);

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

        Menu.setMinimumSize(new java.awt.Dimension(400, 377));
        Menu.setResizable(false);

        btnDessert.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnDessert.setText("DESSERT");
        btnDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDessertActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Javanese Text", 0, 24)); // NOI18N
        jLabel9.setText("MENU");

        btnExit1.setText("EXIT");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        btnBreakfast.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBreakfast.setText("BREAKFAST");
        btnBreakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBreakfastActionPerformed(evt);
            }
        });

        btnLunch.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLunch.setText("LUNCH");
        btnLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLunchActionPerformed(evt);
            }
        });

        btnSnack.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnSnack.setText("SNACK");
        btnSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnackActionPerformed(evt);
            }
        });

        btnDrink.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnDrink.setText("DRINK");
        btnDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu.getContentPane());
        Menu.getContentPane().setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnSnack))
                            .addComponent(btnBreakfast))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                                .addComponent(btnDrink)
                                .addGap(35, 35, 35))
                            .addComponent(btnLunch, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel9))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDessert)
                                    .addGroup(MenuLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(btnExit1)))))
                        .addGap(108, 108, 108)))
                .addGap(60, 60, 60))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(24, 24, 24)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBreakfast)
                    .addComponent(btnLunch))
                .addGap(58, 58, 58)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSnack)
                    .addComponent(btnDrink))
                .addGap(49, 49, 49)
                .addComponent(btnDessert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit1)
                .addGap(32, 32, 32))
        );

        MenuBreakfast.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        MenuBreakfast.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBreakfast.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        txtBreakfast.setText("Breakfast");

        jLabel10.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel10.setText("Bebida");

        jLabel11.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel11.setText("Huevos");

        bntOrderBreakfast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntOrderBreakfast.setText("Add Order");
        bntOrderBreakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOrderBreakfastActionPerformed(evt);
            }
        });

        btnReturnBreakfast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturnBreakfast.setText("Return");
        btnReturnBreakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBreakfastActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel15.setText("HUEVOS REVUELTOS.............$0,20");

        jLabel18.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel18.setText("HUEVOS COCIDOS...............$0,20");

        jLabel19.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel19.setText("HUEVOS TIBIOS................$0,20");

        jLabel20.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel20.setText("TORTA DE HUEVO...............$0,20");

        jLabel21.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel21.setText("HUEVOS FRITOS (CON YEMA).....$0,20");

        cafeEnAgua.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        cafeEnAgua.setText("CAFE EN AGUA..................$0.50 ");
        cafeEnAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cafeEnLeche.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        cafeEnLeche.setText("CAFE EN LECHE.................$0.75");

        teConLimon.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        teConLimon.setText("TE CON LIMON..................$0.50");

        leche.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        leche.setText("LECHE.........................$0.60");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel22.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel22.setText("Pan");

        jLabel24.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel24.setText("SIMPLE...................$0,10");

        jLabel25.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel25.setText("PAN CON JAMON............$0,25");

        jLabel26.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel26.setText("PAN CON MORTADELA........$0,25");

        jLabel27.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel27.setText("PAN INTEGRAL.............$0,25");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel28.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel28.setText("Jugos");

        jLabel29.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel29.setText("JUGO DE MORA.......................$0,75");

        jLabel30.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel30.setText("JUGO DE NARANJILLA.................$0,75");

        jLabel31.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel31.setText("JUGO DE TOMATE DE ARBOL............$0,75");

        jLabel32.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel32.setText("Frutas");

        jLabel33.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel33.setText("Estofado");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel34.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel34.setText("MANZANA c/u...........$0,35");

        jLabel35.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel35.setText("PERA c/u..............$0,25");

        jLabel36.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel36.setText("BANANO c/u............$0,25");

        jLabel37.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel37.setText("ESTOFADO DE CARNE..................$1,50");

        jLabel38.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel38.setText("ESTOFADO DE POLLO..................$1,50");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jIntegralBread.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBreadWithJam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBlackberryJuice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSimpleBread.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMilkCoffee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCoffeWater.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLemonTea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTreeTomato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jNaranjillasq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jboiledEgg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jWarmEgg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jOmelette.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBanano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jApple1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBeefStew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jChickenStew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout MenuBreakfastLayout = new javax.swing.GroupLayout(MenuBreakfast.getContentPane());
        MenuBreakfast.getContentPane().setLayout(MenuBreakfastLayout);
        MenuBreakfastLayout.setHorizontalGroup(
            MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescription1)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel23))))
                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                        .addComponent(jCoffeWater, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jMilkCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addComponent(jLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cafeEnAgua)
                                        .addComponent(cafeEnLeche, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(teConLimon)
                                    .addComponent(leche))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spiValor202, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor203, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor201)
                                    .addComponent(spiValor204, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBreakfastLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBreakfastLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(spiValor206, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spiValor205, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(spiValor207, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spiValor208, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(jLabel22))
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addComponent(jSimpleBread, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBreadWithJam, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jIntegralBread, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtBreakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel28))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jBlackberryJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTreeTomato, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jNaranjillasq, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor211, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor209, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor210, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spiValor216)
                                    .addComponent(spiValor212)
                                    .addComponent(spiValor213)
                                    .addComponent(spiValor214)
                                    .addComponent(spiValor215, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel11))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jboiledEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jWarmEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jOmelette, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addComponent(jLabel32))
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addComponent(jApple1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBanano, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(28, 28, 28)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel33))
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel37)
                                                    .addComponent(jLabel38)
                                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                        .addGap(89, 89, 89)
                                                        .addComponent(jBeefStew, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jChickenStew, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(spiValor220, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spiValor221, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel34))
                                        .addGap(18, 18, 18)
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spiValor217)
                                            .addComponent(spiValor218)
                                            .addComponent(spiValor219, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnReturnBreakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                                .addComponent(bntOrderBreakfast)
                                .addGap(108, 108, 108))))))
        );
        MenuBreakfastLayout.setVerticalGroup(
            MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addComponent(txtBreakfast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                        .addComponent(jSeparator4)
                                        .addGap(13, 13, 13))
                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jSimpleBread, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jBreadWithJam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jIntegralBread, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(spiValor205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel24))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(spiValor206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel25))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel26)
                                                            .addComponent(spiValor207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel27)
                                                            .addComponent(spiValor208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jLabel14))))
                                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jMilkCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jCoffeWater, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spiValor201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cafeEnAgua))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spiValor202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cafeEnLeche))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spiValor203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(teConLimon))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spiValor204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(leche)))
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBreakfastLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spiValor209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(spiValor210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spiValor211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBlackberryJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTreeTomato, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNaranjillasq, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel29)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jboiledEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jWarmEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jOmelette, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(spiValor212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(spiValor213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(spiValor214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(spiValor215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spiValor216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuBreakfastLayout.createSequentialGroup()
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jApple1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBanano, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(spiValor217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spiValor218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addGap(16, 16, 16)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36)
                                    .addComponent(spiValor219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuBreakfastLayout.createSequentialGroup()
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jChickenStew, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBeefStew, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(spiValor220, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(spiValor221, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBreakfastLayout.createSequentialGroup()
                        .addGroup(MenuBreakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReturnBreakfast)
                            .addComponent(bntOrderBreakfast))
                        .addGap(42, 42, 42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDescription1)
                .addGap(35, 35, 35))
        );

        jLabel53.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel53.setText("CALDO DE GALLINA (PECHUGA DE POLLO PICADA, ALVERJA, PAPAS, ZANAHORIA Y APIO)........$1,25");

        jLabel49.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel49.setText("LASAÑA DE POLLO (ENSALADA, PAPAS FRITAS).............................................$3,20");

        jNaranjilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel46.setText("BROWNIE..................$0,75");

        jCaldoGallina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel50.setText("CAMARONES APANADOS (SALSA RANCH, ARROZ, MADURO FRITO, PAPAS FRITAS Y ENSALADA).......$2,20");

        jLasaña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel39.setText("Dessert");

        jLabel40.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel40.setText("LUNCH");

        jChuleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel48.setText("Main Course");

        jLabel41.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel41.setText("VASO DE JUGO DE PIÑA...............$0,50");

        jLabel42.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel42.setText("CHESECAKE................$0,75");

        jLabel54.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel54.setText("CREMA DE TOMATE (COLIFLOR, BRÓCOLI, ZANAHORIA Y CREMA DE TOMATE)....................$1,25");

        jLabel52.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel52.setText("PASTEL TRES LECHES.......$0,75");

        jLocro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel51.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel51.setText("CHULETA DE CERDO (ARROZ, PAPAS FRITAS Y ENSALADA)....................................$2,00");

        jChesecake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jBabaco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPineapple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOrderLunch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrderLunch.setText("Add Order");
        btnOrderLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderLunchActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel43.setText("Soup");

        jCremaTomato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel44.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel44.setText("VASO DE JUGO DE NARANJILLA.........$0,50");

        jBrownies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel45.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel45.setText("VASO DE JUGO DE BABACO.............$0,50");

        jLabel55.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel55.setText("LOCRO DE PAPAS CON QUESO Y AGUACATE.................................................$1,25");

        btnReturnLunch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturnLunch.setText("Return");
        btnReturnLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnLunchActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel47.setText("Juice");

        jThreeMilksCake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCamaron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout MenuLunchLayout = new javax.swing.GroupLayout(MenuLunch.getContentPane());
        MenuLunch.getContentPane().setLayout(MenuLunchLayout);
        MenuLunchLayout.setHorizontalGroup(
            MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLunchLayout.createSequentialGroup()
                .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel43))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spiValor222, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor223, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor224, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(jLocro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCremaTomato, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCaldoGallina, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel48))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spiValor225, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor226, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor227, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(jChuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCamaron, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLasaña, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel47))
                            .addComponent(jLabel41)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44))
                        .addGap(18, 18, 18)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spiValor228, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor229, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor230, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addComponent(jPineapple, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBabaco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jNaranjilla, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel39))
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor231, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor232, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor233, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addComponent(jBrownies, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jChesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jThreeMilksCake, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addComponent(btnReturnLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrderLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLunchLayout.setVerticalGroup(
            MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLunchLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel40)
                .addGap(6, 6, 6)
                .addComponent(jLabel43)
                .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel55)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel54))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addComponent(spiValor222, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(spiValor223, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiValor224, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLocro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCremaTomato, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCaldoGallina, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel48)
                .addGap(11, 11, 11)
                .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel51)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel50))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addComponent(spiValor225, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(spiValor226, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiValor227, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)))
                    .addComponent(jChuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCamaron, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLasaña, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel47)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel41)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel45)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel44))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(spiValor228, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(spiValor229, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(spiValor230, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPineapple, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBabaco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jNaranjilla, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBrownies, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jThreeMilksCake, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLunchLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addComponent(spiValor231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(spiValor232, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(spiValor233, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuLunchLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel42)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel52)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(MenuLunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnLunch)
                    .addComponent(btnOrderLunch)))
        );

        jLabel165.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel165.setText("Alitas BBQ: 12 alitas, porcion de papas, tiras de apio, zanahoria, salsa BBQ..................$13,50");

        jLabel166.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel166.setText("Alitas Picantes: 12 alitas, porcion de papas, tiras de apio, zanahoria, salsa picante.........$13,50");

        jBBQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel167.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel167.setText("Nachos con queso chedar.........$6,25");

        jHot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel168.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel168.setText("Pollo (Pechuga de Pollo ahumado, Salsas, cebolla, Champiñones, lechuga, Tomate, Champiñones, Aceitunas, Cebolla Caramelizada, Cebolla Cruda).......$6,50");

        jLabel169.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel169.setText("Jack Daniels (Carne de res a la parrilla, Tocino, Queso Holandés, Cebolla Crispy, Lechuga, Tomate, salsa JACK DANIELS).............................$7,99");

        txtSnack.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        txtSnack.setText("SNACKS");

        jNachosWithGuacamole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAddOrderSnack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddOrderSnack.setText("Add Order");
        btnAddOrderSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderSnackActionPerformed(evt);
            }
        });

        jCheeseburger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntReturnSnack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntReturnSnack.setText("Return");
        bntReturnSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReturnSnackActionPerformed(evt);
            }
        });

        jBaconCheeseBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jJackDanielsBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel170.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel170.setText("Simple (Carne de res, salsas, lechuga, Tomate, Pickles, Champiñones, Aceitunas, Pico de Gallo).....................................................$5,25");

        jLabel171.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel171.setText("Queso (Carne de res, queso cheddar, salsas, lechuga, Tomate, Champiñones, Cebolla Caramelizada, Cebolla Cruda, Pico de Gallo, Aceitunas)...........$5,75");

        jLabel172.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel172.setText("Queso y Tocino (carne de res, queso cheedar, tocino, salsas, Lechuga, Tomate, Champiñones, Pickles, Aceitunas, Cebolla Caramelizada)...............$6,90");

        jLabel173.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel173.setText("ALITAS");

        jpassionFruit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel174.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel174.setText("NACHOS");

        jNachosWithCheese.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel175.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel175.setText("HAMBURGUESAS");

        jChickenBurguer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel176.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel176.setText("Alitas de maracuya: 12 alitas, porcion de papas, tiras de apio, zanahoria, salsa de maracuya..$13,50");

        jClassicBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel177.setFont(new java.awt.Font("Consolas", 2, 13)); // NOI18N
        jLabel177.setText("Nachos con guacamole............$6,25");

        javax.swing.GroupLayout MenuSnackLayout = new javax.swing.GroupLayout(MenuSnack.getContentPane());
        MenuSnack.getContentPane().setLayout(MenuSnackLayout);
        MenuSnackLayout.setHorizontalGroup(
            MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1164, Short.MAX_VALUE)
            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuSnackLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuSnackLayout.createSequentialGroup()
                            .addComponent(bntReturnSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddOrderSnack)
                            .addGap(200, 200, 200))
                        .addGroup(MenuSnackLayout.createSequentialGroup()
                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MenuSnackLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MenuSnackLayout.createSequentialGroup()
                                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(MenuSnackLayout.createSequentialGroup()
                                                    .addGap(269, 269, 269)
                                                    .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(MenuSnackLayout.createSequentialGroup()
                                                        .addComponent(jBBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(249, 249, 249)
                                                        .addComponent(jHot, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jpassionFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuSnackLayout.createSequentialGroup()
                                                                .addComponent(jLabel176)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(spiValor241, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuSnackLayout.createSequentialGroup()
                                                                .addComponent(jLabel166)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(spiValor240, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuSnackLayout.createSequentialGroup()
                                                            .addComponent(jLabel165)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(spiValor239, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSnackLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel167)
                                                        .addComponent(jLabel177))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(spiValor242, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(spiValor243, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(MenuSnackLayout.createSequentialGroup()
                                                    .addGap(108, 108, 108)
                                                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(MenuSnackLayout.createSequentialGroup()
                                                    .addGap(38, 38, 38)
                                                    .addComponent(jNachosWithCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jNachosWithGuacamole, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(47, 47, 47))))
                                        .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(MenuSnackLayout.createSequentialGroup()
                                                .addComponent(jBaconCheeseBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(159, 159, 159)
                                                .addComponent(jClassicBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(181, 181, 181)
                                                .addComponent(jChickenBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCheeseburger, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(182, 182, 182)
                                                .addComponent(jJackDanielsBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(MenuSnackLayout.createSequentialGroup()
                                                .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel172)
                                                    .addComponent(jLabel170)
                                                    .addComponent(jLabel171)
                                                    .addComponent(jLabel168)
                                                    .addComponent(jLabel169))
                                                .addGap(18, 18, 18)
                                                .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(spiValor238)
                                                    .addComponent(spiValor237)
                                                    .addComponent(spiValor236)
                                                    .addComponent(spiValor235)
                                                    .addComponent(spiValor234, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(MenuSnackLayout.createSequentialGroup()
                                    .addComponent(txtSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(335, 335, 335)
                                    .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap()))
        );
        MenuSnackLayout.setVerticalGroup(
            MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuSnackLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel171)
                        .addComponent(spiValor234, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spiValor235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel170))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spiValor236, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel172))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spiValor237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel168))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spiValor238, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel169))
                    .addGap(18, 18, 18)
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuSnackLayout.createSequentialGroup()
                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jClassicBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheeseburger, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jChickenBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBaconCheeseBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MenuSnackLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel167)
                                        .addComponent(spiValor242, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel177)
                                        .addComponent(spiValor243, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jNachosWithGuacamole, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jNachosWithCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(MenuSnackLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator19)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSnackLayout.createSequentialGroup()
                                            .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel165)
                                                .addComponent(spiValor239, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel166)
                                                .addComponent(spiValor240, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSnackLayout.createSequentialGroup()
                                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel176)
                                                        .addComponent(spiValor241, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jHot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jpassionFruit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(MenuSnackLayout.createSequentialGroup()
                            .addComponent(jJackDanielsBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(MenuSnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddOrderSnack)
                        .addComponent(bntReturnSnack))
                    .addContainerGap()))
        );

        jLabel56.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel56.setText("CAPUCCINO");

        jLabel57.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel57.setText("Small.............$3,25");

        jLabel58.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel58.setText("Big...............$7,25");

        jLabel59.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel59.setText("COFFEE");

        jLabel60.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel60.setText("Big...............$5,00");

        btnReturnCoffee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturnCoffee.setText("Return");
        btnReturnCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnCoffeeActionPerformed(evt);
            }
        });

        btnOrderCoffee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrderCoffee.setText("Add Order");
        btnOrderCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderCoffeeActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel61.setText("EXPRESSO RISTRETTO");

        jLabel62.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel62.setText("AMERICAN");

        jLabel63.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel63.setText("Small.............$2,00");

        jLabel64.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel64.setText("Small.............$3,00");

        jLabel65.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel65.setText("Big...............$5,00");

        jLabel66.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel66.setText("Big...............$6,00");

        jLabel67.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel67.setText(" FRAPUCCINO (CAPUCCINO BLENDED WITH ICE)");

        jLabel68.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel68.setText("Small.............$3,00");

        jLabel82.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel82.setText("Big...............$6,20");

        jLabel83.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel83.setText("LATTE MACCHAIATO");

        jLabel84.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel84.setText("Small.............$2,50");

        jLabel85.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel85.setText("Big...............$4,50");

        jLabel86.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel86.setText("MOCACCINO");

        jLabel87.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel87.setText("Small.............$3,50");

        jLabel88.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel88.setText("Big...............$5,50");

        jLabel89.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel89.setText("FROCACCINO (MOCACCINO BLENDED WITH ICE)");

        jLabel90.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel90.setText("Small.............$3,00");

        jLabel91.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel91.setText("Big...............$6,20");

        jCapuccino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jExpressoRistretto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jFrocaccino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jFrapuccino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMocaccino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLatteMacchaiato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel92.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel92.setText("TINTO");

        jLabel93.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel93.setText("Small.............$2,00");

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jAmericano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTinto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout MenuCoffeeLayout = new javax.swing.GroupLayout(MenuCoffee.getContentPane());
        MenuCoffee.getContentPane().setLayout(MenuCoffeeLayout);
        MenuCoffeeLayout.setHorizontalGroup(
            MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnReturnCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrderCoffee)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel62)
                                    .addComponent(jTinto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jExpressoRistretto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61)))
                            .addComponent(jCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addGap(44, 44, 44)
                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spiValor248, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor249, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spiValor246, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor247, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spiValor250, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor251, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor245, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor244, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel89))
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spiValor252, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor255, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor253, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor254, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spiValor256, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor257, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addComponent(jLatteMacchaiato, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel85)))
                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFrapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFrocaccino, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel86)
                                    .addComponent(jMocaccino, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(26, 26, 26)
                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spiValor258, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor259, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        MenuCoffeeLayout.setVerticalGroup(
            MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel59)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTinto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jExpressoRistretto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                                .addComponent(jLatteMacchaiato, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel67)
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(spiValor254, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel68))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(spiValor255, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel82)))
                                                    .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                                        .addGap(9, 9, 9)
                                                        .addComponent(jFrapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spiValor252, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel84))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spiValor253, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel85))))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel89)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel90)
                                                    .addComponent(spiValor256, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel91)
                                                    .addComponent(spiValor257, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jFrocaccino, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel86)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jMocaccino, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(MenuCoffeeLayout.createSequentialGroup()
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spiValor258, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel88)
                                                    .addComponent(spiValor259, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel64)
                                                .addComponent(spiValor244, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel66)
                                                .addComponent(spiValor245, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(57, 57, 57)
                                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                                                    .addComponent(spiValor246, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(spiValor247, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                                                    .addComponent(jLabel93)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel60)))
                                            .addGap(58, 58, 58)
                                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel63)
                                                .addComponent(spiValor248, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(16, 16, 16)
                                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel65)
                                                .addComponent(spiValor249, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(56, 56, 56)
                                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(spiValor250, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel57))
                                            .addGap(18, 18, 18)
                                            .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel58)
                                                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spiValor251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(17, 17, 17))))
                                .addGap(27, 27, 27)))
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                        .addComponent(btnReturnCoffee)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCoffeeLayout.createSequentialGroup()
                        .addComponent(btnOrderCoffee)
                        .addGap(24, 24, 24))))
        );

        jLabel94.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel94.setText("Juice jar...............$1,50");

        jLabel95.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel95.setText("Glass of juice..........$0,75");

        jLabel96.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel96.setText("LIMONADA");

        jLabel97.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel97.setText("Juice jar...............$1,50");

        jLabel98.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel98.setText("Glass of juice..........$0,75");

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnReturnJuice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturnJuice.setText("Return");
        btnReturnJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnJuiceActionPerformed(evt);
            }
        });

        jimage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel99.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel99.setText("Juice jar...............$1,50");

        jLabel100.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel100.setText("Glass of juice..........$0,75");

        txtJuice.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        txtJuice.setText("JUICES");

        jLabel101.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel101.setText("PAPAYA");

        jLabel102.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel102.setText("NARANJILLA");

        jimage7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jimage9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel103.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel103.setText("Juice jar...............$1,50");

        jLabel104.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel104.setText("Glass of juice..........$0,75");

        jLabel105.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel105.setText("MORA");

        jLabel106.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel106.setText("Juice jar...............$1,50");

        jLabel107.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel107.setText("TOMATE DE ARBOL");

        jLabel108.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel108.setText("Juice jar...............$1,50");

        jLabel109.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel109.setText("Glass of juice..........$0,75");

        jLabel110.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel110.setText("Glass of juice..........$0,75");

        jLabel111.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel111.setText("SANDIA");

        btnOrderJuice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrderJuice.setText("Add Order");
        btnOrderJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderJuiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuJuiceLayout = new javax.swing.GroupLayout(MenuJuice.getContentPane());
        MenuJuice.getContentPane().setLayout(MenuJuiceLayout);
        MenuJuiceLayout.setHorizontalGroup(
            MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuJuiceLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnReturnJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrderJuice)
                .addGap(79, 79, 79))
            .addGroup(MenuJuiceLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(MenuJuiceLayout.createSequentialGroup()
                            .addComponent(jLabel111)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(MenuJuiceLayout.createSequentialGroup()
                            .addComponent(jimage6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuJuiceLayout.createSequentialGroup()
                                    .addComponent(jLabel95)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                    .addComponent(spiValor265, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(MenuJuiceLayout.createSequentialGroup()
                                    .addComponent(jLabel94)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spiValor264, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(MenuJuiceLayout.createSequentialGroup()
                            .addComponent(jimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel103)
                                .addComponent(jLabel104))
                            .addGap(22, 22, 22)
                            .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spiValor262)
                                .addComponent(spiValor263, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(MenuJuiceLayout.createSequentialGroup()
                            .addComponent(jimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel106)
                                .addComponent(jLabel109))
                            .addGap(22, 22, 22)
                            .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spiValor260)
                                .addComponent(spiValor261, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jimage8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jimage7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jimage9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor269, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor268, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spiValor267)
                                    .addComponent(spiValor266, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuJuiceLayout.createSequentialGroup()
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel100))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spiValor270)
                                    .addComponent(spiValor271, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65))
                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuJuiceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(466, 466, 466))
        );
        MenuJuiceLayout.setVerticalGroup(
            MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuJuiceLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtJuice)
                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                .addComponent(jLabel101)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel106)
                                            .addComponent(spiValor260, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel109)
                                            .addComponent(spiValor261, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70))
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel111)))
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                                .addComponent(spiValor262, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31))
                                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                                .addComponent(jLabel103)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel104)
                                                    .addComponent(spiValor263, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel102)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel94)
                                            .addComponent(spiValor264, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel95)
                                            .addComponent(spiValor265, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jimage6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(41, 41, 41)
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReturnJuice)
                            .addComponent(btnOrderJuice))
                        .addGap(21, 21, 21))
                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel107)
                        .addGap(14, 14, 14)
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel108)
                                    .addComponent(spiValor266, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor267, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel110)))
                            .addComponent(jimage9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel105)
                        .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jimage7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel96)
                                .addGap(18, 18, 18)
                                .addComponent(jimage8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addGroup(MenuJuiceLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel97)
                                    .addComponent(spiValor268, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel98)
                                    .addComponent(spiValor269, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addGroup(MenuJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addComponent(spiValor270, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spiValor271, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuJuiceLayout.createSequentialGroup()
                                        .addComponent(jLabel99)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel100)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        MenuSoda.setTitle("Menu Soda");

        btnOrderSoda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrderSoda.setText("Add Order");
        btnOrderSoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderSodaActionPerformed(evt);
            }
        });

        btnReturnSoda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturnSoda.setText("Return");
        btnReturnSoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnSodaActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel69.setText("SODA");

        jComboBox2.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negra", "Fresa", "Limon", "Piña" }));

        jComboBox1.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Zero", "Light" }));

        jLabel70.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel70.setText("1lt................................$1,35");

        jLabel71.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel71.setText("Personal...........................$0,50");

        jLabel72.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel72.setText("Big Cola");

        jLabel73.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel73.setText("1lt................................$1,35");

        jLabel74.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel74.setText("Personal...........................$0,50");

        jLabel75.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel75.setText("Sprite");

        jLabel76.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel76.setText("1lt................................$1,20");

        jLabel77.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel77.setText("Personal...........................$0,50");

        jimage4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel78.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel78.setText("Fanta");

        jimage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel79.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel79.setText("1lt................................$1,35");

        jimage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel80.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel80.setText("Personal...........................$0,50");

        jimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel81.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel81.setText("Coca-Cola");

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout MenuSodaLayout = new javax.swing.GroupLayout(MenuSoda.getContentPane());
        MenuSoda.getContentPane().setLayout(MenuSodaLayout);
        MenuSodaLayout.setHorizontalGroup(
            MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSodaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel78)
                    .addComponent(jimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuSodaLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuSodaLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spiValor272, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuSodaLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spiValor273, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuSodaLayout.createSequentialGroup()
                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spiValor275, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiValor274, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuSodaLayout.createSequentialGroup()
                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuSodaLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuSodaLayout.createSequentialGroup()
                                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel71)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSodaLayout.createSequentialGroup()
                                                .addComponent(jLabel70)
                                                .addGap(10, 10, 10)))
                                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spiValor277, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spiValor276, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(MenuSodaLayout.createSequentialGroup()
                                            .addComponent(jLabel73)
                                            .addGap(18, 18, 18)
                                            .addComponent(spiValor279, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(MenuSodaLayout.createSequentialGroup()
                                            .addComponent(jLabel74)
                                            .addGap(18, 18, 18)
                                            .addComponent(spiValor278, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSodaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))))
                    .addComponent(jLabel75))
                .addGap(75, 75, 75))
            .addGroup(MenuSodaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator12)
                .addContainerGap())
            .addGroup(MenuSodaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnReturnSoda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrderSoda)
                .addGap(117, 117, 117))
            .addGroup(MenuSodaLayout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(jLabel69)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuSodaLayout.setVerticalGroup(
            MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSodaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel69)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuSodaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuSodaLayout.createSequentialGroup()
                                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuSodaLayout.createSequentialGroup()
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jimage, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel78))
                                    .addGroup(MenuSodaLayout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel80)
                                            .addComponent(spiValor272, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel79)
                                            .addComponent(spiValor273, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(13, 13, 13)
                                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(MenuSodaLayout.createSequentialGroup()
                                            .addComponent(spiValor274, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(spiValor275, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(MenuSodaLayout.createSequentialGroup()
                                            .addComponent(jLabel77)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel76)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuSodaLayout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenuSodaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderSoda)
                    .addComponent(btnReturnSoda))
                .addGap(27, 27, 27))
            .addGroup(MenuSodaLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel71)
                    .addComponent(spiValor276, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(spiValor277, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(spiValor278, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuSodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(spiValor279, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel112.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel112.setText("Coco, caramelo y almendra");

        jLabel113.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel113.setText("Portion.....$4,80");

        jLabel114.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel114.setText("Medium.....$16,00");

        jLabel115.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel115.setText("Big........$25,50");

        jLabel116.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel116.setText("Portion.....$2,80");

        jLabel117.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel117.setText("Medium.....$13,25");

        jLabel118.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel118.setText("Medium.....$15,20");

        jLabel119.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel119.setText("Big........$20,00");

        jLabel120.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel120.setText("Naranja");

        jLabel121.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel121.setText("Portion.....$1,25");

        jLabel122.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel122.setText("Big........$21,80");

        jLabel123.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel123.setText("Brownie");

        jLabel124.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel124.setText("Portion.....$1,80");

        jLabel125.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel125.setText("Chocolate");

        jLabel126.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel126.setText("Medium......$6,20");

        jLabel127.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel127.setText("Portion.....$1,50");

        jLabel128.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel128.setText("Big........$14,50");

        jLabel129.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel129.setText("Medium.....$15,50");

        jLabel130.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel130.setText("Big........$23,50");

        jLabel131.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel131.setText("Vainilla");

        jLabel132.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel132.setText("Portion.....$1,25");

        jLabel133.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel133.setText("Big........$21,80");

        jLabel134.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel134.setText("Portion.....$4,50");

        jLabel135.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel135.setText("Medium.....$15,20");

        jLabel136.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel136.setText("Medium.....$15,20");

        jLabel137.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel137.setText("Big........$20,00");

        jLabel138.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel138.setText("Big........$25,80");

        jLabel139.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel139.setText("Sal c/u......$0,35");

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel140.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel140.setText("Dulce c/u....$0,35");

        jLabel141.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel141.setText("Quimbolito c/u...$0,35");

        jLabel142.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel142.setText("Pollo c/u....$1,25");

        jLabel143.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel143.setText("Chancho c/u..$1,50");

        jLabel144.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel144.setText("Chicharron c/u..$0,75");

        jLabel145.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel145.setText("Queso c/u.......$0,50");

        jLabel146.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel146.setText("Bolones");

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel147.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel147.setText("Tamal Lojano");

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel148.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel148.setText("CAKES");

        jLabel149.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel149.setText("Humitas");

        jLabel150.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel150.setText("Mixto c/u.......$1,25");

        jLojanoTamale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jChocolate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jVanilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel151.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel151.setText("Quimbolitos");

        jNutella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBrownie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCoconutCaramelAlmond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jHumita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jOrange.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCakeChocolate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBolon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jApple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jQuimbolito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel152.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel152.setText("DESSERTS");

        btnAddOrderDessert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddOrderDessert.setText("Add Order");
        btnAddOrderDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderDessertActionPerformed(evt);
            }
        });

        btnReturnDessert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturnDessert.setText("Return");
        btnReturnDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnDessertActionPerformed(evt);
            }
        });

        jLabel153.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel153.setText("CHESECAKE");

        jLabel154.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel154.setText("Medium.....$14,00");

        jLabel155.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel155.setText("Manzana");

        jLabel156.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel156.setText("Chocolate");

        jLabel157.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel157.setText("Portion.....$2,80");

        jLabel158.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel158.setText("Medium.....$13,25");

        jLabel159.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel159.setText("PIES");

        jLabel160.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel160.setText("ESPECIALES");

        jLabel161.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel161.setText("Big........$25,80");

        jLabel162.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel162.setText("Limon");

        jLabel163.setFont(new java.awt.Font("Baskerville Old Face", 2, 18)); // NOI18N
        jLabel163.setText("Nutella");

        jLabel164.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel164.setText("Portion.....$3,80");

        javax.swing.GroupLayout MenuDessertLayout = new javax.swing.GroupLayout(MenuDessert.getContentPane());
        MenuDessert.getContentPane().setLayout(MenuDessertLayout);
        MenuDessertLayout.setHorizontalGroup(
            MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDessertLayout.createSequentialGroup()
                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDessertLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jCoconutCaramelAlmond, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                                .addComponent(jLabel114)
                                                .addGap(18, 18, 18)
                                                .addComponent(spiValor313, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                                .addComponent(jLabel113)
                                                .addGap(18, 18, 18)
                                                .addComponent(spiValor312, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                                .addComponent(jLabel115)
                                                .addGap(18, 18, 18)
                                                .addComponent(spiValor314, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jNutella, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel154)
                                            .addComponent(jLabel161)
                                            .addComponent(jLabel164, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spiValor307)
                                            .addComponent(spiValor308)
                                            .addComponent(spiValor306, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuDessertLayout.createSequentialGroup()
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(jBrownie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuDessertLayout.createSequentialGroup()
                                                .addComponent(jLabel126)
                                                .addGap(18, 18, 18)
                                                .addComponent(spiValor310, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuDessertLayout.createSequentialGroup()
                                                .addComponent(jLabel124)
                                                .addGap(18, 18, 18)
                                                .addComponent(spiValor309, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuDessertLayout.createSequentialGroup()
                                                .addComponent(jLabel128)
                                                .addGap(18, 18, 18)
                                                .addComponent(spiValor311, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel163)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLemon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel158)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor281, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel122)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor282, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel157)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor280, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel155)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jApple, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel117)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor284, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel133)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor285, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel116)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor283, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel136)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor287, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel134)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor286, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel138)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor288, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addComponent(jCakeChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel130)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor291, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel129)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor290, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel127)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor289, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel131)
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addComponent(jVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor293, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel119)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor294, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel132)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor292, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel120)
                            .addComponent(jOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel135)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor296, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel121)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor295, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addGap(18, 18, 18)
                                .addComponent(spiValor297, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel146)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jBolon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel145)
                                    .addComponent(jLabel144)
                                    .addComponent(jLabel150))
                                .addGap(18, 18, 18)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor302, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor303, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor304, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel151)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jQuimbolito, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel141)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spiValor305, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel147)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLojanoTamale, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel142)
                                    .addComponent(jLabel143))
                                .addGap(18, 18, 18)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiValor301, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiValor300, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jHumita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel139)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor298, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel140)
                                        .addGap(18, 18, 18)
                                        .addComponent(spiValor299, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuDessertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator18)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDessertLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnReturnDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddOrderDessert)
                .addGap(19, 19, 19))
            .addGroup(MenuDessertLayout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuDessertLayout.setVerticalGroup(
            MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDessertLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel164)
                                    .addComponent(spiValor306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel154)
                                    .addComponent(spiValor307, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel161)
                                    .addComponent(spiValor308, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addComponent(jLabel163)
                                .addGap(18, 18, 18)
                                .addComponent(jNutella, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel123)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jBrownie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel124)
                                    .addComponent(spiValor309, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel126)
                                    .addComponent(spiValor310, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel128)
                                    .addComponent(spiValor311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel112)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jCoconutCaramelAlmond, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel113)
                                    .addComponent(spiValor312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel114)
                                    .addComponent(spiValor313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel115)
                                    .addComponent(spiValor314, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addComponent(jLabel159)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel162)
                                .addGap(18, 18, 18)
                                .addComponent(jLemon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel157)
                                    .addComponent(spiValor280, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel158)
                                    .addComponent(spiValor281, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel122)
                                    .addComponent(spiValor282, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel155)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jApple, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel116)
                                    .addComponent(spiValor283, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel117)
                                    .addComponent(spiValor284, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel133)
                                    .addComponent(spiValor285, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel156)
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel134)
                                    .addComponent(spiValor286, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel136)
                                    .addComponent(spiValor287, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel138)
                                    .addComponent(spiValor288, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(MenuDessertLayout.createSequentialGroup()
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel160))
                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel125)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel127)
                                            .addComponent(spiValor289, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel129)
                                            .addComponent(spiValor290, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel130)
                                            .addComponent(spiValor291, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jCakeChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel131)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel132)
                                            .addComponent(spiValor292, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel118)
                                            .addComponent(spiValor293, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel119)
                                            .addComponent(spiValor294, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel120)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel121)
                                            .addComponent(spiValor295, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel135)
                                            .addComponent(spiValor296, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel137)
                                            .addComponent(spiValor297, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(MenuDessertLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel149)
                                .addGap(11, 11, 11)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jHumita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spiValor298, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel139, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel140)
                                            .addComponent(spiValor299, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel147)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLojanoTamale, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(spiValor300, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spiValor301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel142)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addComponent(jLabel146)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBolon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuDessertLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel144)
                                            .addComponent(spiValor302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel145)
                                            .addComponent(spiValor303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel150)
                                            .addComponent(spiValor304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(23, 23, 23)
                                .addComponent(jLabel151)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jQuimbolito, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDessertLayout.createSequentialGroup()
                                        .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel141)
                                            .addComponent(spiValor305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddOrderDessert)
                    .addComponent(btnReturnDessert))
                .addContainerGap())
        );

        Order.setTitle("PEDIDOS");
        Order.setMinimumSize(new java.awt.Dimension(840, 580));
        Order.setModal(true);
        Order.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel178.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel178.setText("Number table:");
        jPanel3.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, -1));

        btnReturn4.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn4.setText("return");
        btnReturn4.setContentAreaFilled(false);
        btnReturn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnReturn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 70, 70));

        datosTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        datosTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        datosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TYPE OF PRODUCT", "PRICE", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(datosTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 400, 230));

        jLabel179.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel179.setText("ORDER");
        jPanel3.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 200, -1));

        btnSendOrder.setBackground(java.awt.Color.white);
        btnSendOrder.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSendOrder.setText("SEND ORDER");
        btnSendOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendOrderActionPerformed(evt);
            }
        });
        jPanel3.add(btnSendOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 190, 30));
        jPanel3.add(numMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 30));

        javax.swing.GroupLayout OrderLayout = new javax.swing.GroupLayout(Order.getContentPane());
        Order.getContentPane().setLayout(OrderLayout);
        OrderLayout.setHorizontalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        OrderLayout.setVerticalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        viewOrder.setTitle("View Order");
        viewOrder.setMinimumSize(new java.awt.Dimension(928, 393));
        viewOrder.setResizable(false);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setMaximumSize(new java.awt.Dimension(781, 393));
        jPanel9.setMinimumSize(new java.awt.Dimension(899, 393));
        jPanel9.setLayout(null);

        datosTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        datosTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        datosTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TYPE OF PRODUCT", "QUANTITY", "TABLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(datosTable2);

        jPanel9.add(jScrollPane3);
        jScrollPane3.setBounds(110, 60, 430, 300);

        btnGenerateBill.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        btnGenerateBill.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateBill.setText("BIll");
        btnGenerateBill.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 255, 255)));
        btnGenerateBill.setContentAreaFilled(false);
        btnGenerateBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillActionPerformed(evt);
            }
        });
        jPanel9.add(btnGenerateBill);
        btnGenerateBill.setBounds(620, 180, 230, 40);

        jLabel180.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setText("Orders:");
        jPanel9.add(jLabel180);
        jLabel180.setBounds(90, 30, 100, 19);

        btnReturn3.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        btnReturn3.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn3.setText("Return");
        btnReturn3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(0, 51, 255)));
        btnReturn3.setContentAreaFilled(false);
        btnReturn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn3ActionPerformed(evt);
            }
        });
        jPanel9.add(btnReturn3);
        btnReturn3.setBounds(10, 331, 80, 50);

        btnOtherOrder.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        btnOtherOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOtherOrder.setText("REGISTER OTHER ORDER");
        btnOtherOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 255, 255)));
        btnOtherOrder.setContentAreaFilled(false);
        btnOtherOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOtherOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherOrderActionPerformed(evt);
            }
        });
        jPanel9.add(btnOtherOrder);
        btnOtherOrder.setBounds(620, 260, 230, 40);

        javax.swing.GroupLayout viewOrderLayout = new javax.swing.GroupLayout(viewOrder.getContentPane());
        viewOrder.getContentPane().setLayout(viewOrderLayout);
        viewOrderLayout.setHorizontalGroup(
            viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        viewOrderLayout.setVerticalGroup(
            viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        GenerateBill.setMinimumSize(new java.awt.Dimension(412, 328));
        GenerateBill.setUndecorated(true);
        GenerateBill.setResizable(false);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(null);

        jLabel181.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setText("TABLE BILL N°:");
        jPanel12.add(jLabel181);
        jLabel181.setBounds(40, 40, 140, 30);

        txtTableNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTableNumberActionPerformed(evt);
            }
        });
        txtTableNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTableNumberKeyTyped(evt);
            }
        });
        jPanel12.add(txtTableNumber);
        txtTableNumber.setBounds(190, 40, 70, 30);

        btngenerateBillCashier.setBackground(java.awt.Color.white);
        btngenerateBillCashier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btngenerateBillCashier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/bill.png"))); // NOI18N
        btngenerateBillCashier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(51, 51, 255), java.awt.Color.white));
        btngenerateBillCashier.setContentAreaFilled(false);
        btngenerateBillCashier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenerateBillCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateBillCashierActionPerformed(evt);
            }
        });
        jPanel12.add(btngenerateBillCashier);
        btngenerateBillCashier.setBounds(140, 100, 140, 140);

        btnReturn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReturn1.setText("Return");
        btnReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn1ActionPerformed(evt);
            }
        });
        jPanel12.add(btnReturn1);
        btnReturn1.setBounds(160, 260, 75, 25);

        jGenerateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSalesSystem/images/ABll.jpg"))); // NOI18N
        jPanel12.add(jGenerateBill);
        jGenerateBill.setBounds(0, 0, 410, 330);

        javax.swing.GroupLayout GenerateBillLayout = new javax.swing.GroupLayout(GenerateBill.getContentPane());
        GenerateBill.getContentPane().setLayout(GenerateBillLayout);
        GenerateBillLayout.setHorizontalGroup(
            GenerateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        GenerateBillLayout.setVerticalGroup(
            GenerateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        Bill.setTitle("FACTURA");
        Bill.setMinimumSize(new java.awt.Dimension(680, 694));
        Bill.setModal(true);
        Bill.setResizable(false);
        Bill.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.setMaximumSize(new java.awt.Dimension(620, 400));
        jPanel10.setMinimumSize(new java.awt.Dimension(620, 400));
        jPanel10.setLayout(null);

        factTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        factTable.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        factTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPTION", "            PRICE", "  QUANTITY", "         SUBTOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(factTable);

        jPanel10.add(jScrollPane5);
        jScrollPane5.setBounds(50, 330, 590, 150);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jPanel11.setLayout(null);

        btnCellphoneCostumer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnCellphoneCostumerKeyTyped(evt);
            }
        });
        jPanel11.add(btnCellphoneCostumer);
        btnCellphoneCostumer.setBounds(110, 70, 160, 20);

        txtIdCostumer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdCostumerKeyTyped(evt);
            }
        });
        jPanel11.add(txtIdCostumer);
        txtIdCostumer.setBounds(110, 40, 160, 20);

        jLabel182.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel182.setText("Cellphone:");
        jPanel11.add(jLabel182);
        jLabel182.setBounds(10, 70, 90, 20);

        jLabel183.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel183.setText("Id:");
        jPanel11.add(jLabel183);
        jLabel183.setBounds(10, 44, 90, 20);

        jLabel184.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel184.setText("Name:");
        jPanel11.add(jLabel184);
        jLabel184.setBounds(10, 14, 90, 20);

        txtNameCostumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameCostumerActionPerformed(evt);
            }
        });
        txtNameCostumer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameCostumerKeyTyped(evt);
            }
        });
        jPanel11.add(txtNameCostumer);
        txtNameCostumer.setBounds(110, 10, 160, 20);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(170, 80, 310, 110);

        btnReturn5.setText("return");
        btnReturn5.setToolTipText("Volver");
        btnReturn5.setContentAreaFilled(false);
        btnReturn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn5ActionPerformed(evt);
            }
        });
        jPanel10.add(btnReturn5);
        btnReturn5.setBounds(50, 570, 70, 70);

        infoFact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infoFact.setText("Cashier:");
        infoFact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(infoFact);
        infoFact.setBounds(340, 290, 110, 30);

        fac.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fac.setText("Restaurant Sales System");
        jPanel10.add(fac);
        fac.setBounds(220, 10, 220, 80);

        jLabel185.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel185.setText("       Factura:            001         Serie:            1             Fecha:   ");
        jLabel185.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(jLabel185);
        jLabel185.setBounds(50, 250, 410, 30);

        jTextField40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField40.setText("Mesa: ");
        jTextField40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(jTextField40);
        jTextField40.setBounds(50, 290, 60, 30);

        numMesa2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numMesa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(numMesa2);
        numMesa2.setBounds(120, 290, 60, 30);

        jLabel186.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel186.setText("+Tip");
        jPanel10.add(jLabel186);
        jLabel186.setBounds(360, 510, 90, 20);

        jLabel187.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel187.setText("+IVA");
        jPanel10.add(jLabel187);
        jLabel187.setBounds(360, 490, 90, 20);

        jLabel188.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel188.setText("Total Purchase");
        jPanel10.add(jLabel188);
        jLabel188.setBounds(360, 540, 110, 20);

        TOTALtot.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        TOTALtot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TOTALtot.setText("jLabel20");
        jPanel10.add(TOTALtot);
        TOTALtot.setBounds(530, 540, 80, 17);

        IVA.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        IVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IVA.setText("jLabel20");
        jPanel10.add(IVA);
        IVA.setBounds(520, 490, 80, 14);

        PROPINA.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        PROPINA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PROPINA.setText("jLabel20");
        jPanel10.add(PROPINA);
        PROPINA.setBounds(520, 510, 80, 14);

        btnPay.setBackground(new java.awt.Color(255, 102, 153));
        btnPay.setText("Pay");
        btnPay.setContentAreaFilled(false);
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel10.add(btnPay);
        btnPay.setBounds(550, 590, 70, 70);

        txtNameCashier.setBackground(new java.awt.Color(204, 204, 204));
        txtNameCashier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(txtNameCashier);
        txtNameCashier.setBounds(470, 290, 150, 30);

        Bill.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 710));

        OptionsDrink.setMinimumSize(new java.awt.Dimension(444, 444));

        btnSoda.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        btnSoda.setText("SODA");
        btnSoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSodaActionPerformed(evt);
            }
        });

        btnReturnOptionDrink.setText("Return");
        btnReturnOptionDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnOptionDrinkActionPerformed(evt);
            }
        });

        btnCoffee.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        btnCoffee.setText("COFFEE");
        btnCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoffeeActionPerformed(evt);
            }
        });

        btnJuice.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        btnJuice.setText("JUICE");
        btnJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsDrinkLayout = new javax.swing.GroupLayout(OptionsDrink.getContentPane());
        OptionsDrink.getContentPane().setLayout(OptionsDrinkLayout);
        OptionsDrinkLayout.setHorizontalGroup(
            OptionsDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsDrinkLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(OptionsDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OptionsDrinkLayout.createSequentialGroup()
                        .addComponent(btnCoffee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnJuice))
                    .addGroup(OptionsDrinkLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnReturnOptionDrink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(OptionsDrinkLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnSoda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OptionsDrinkLayout.setVerticalGroup(
            OptionsDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsDrinkLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(OptionsDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJuice)
                    .addComponent(btnCoffee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnSoda)
                .addGap(71, 71, 71)
                .addComponent(btnReturnOptionDrink)
                .addGap(59, 59, 59))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Screen");

        jlogo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jlogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        mnuSystem.setText("System");

        itmMnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuExit.setText("Exit");
        itmMnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuExitActionPerformed(evt);
            }
        });
        mnuSystem.add(itmMnuExit);

        itmSuggestions.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        itmSuggestions.setText("Suggestions");
        itmSuggestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSuggestionsActionPerformed(evt);
            }
        });
        mnuSystem.add(itmSuggestions);

        jMenuBar1.add(mnuSystem);

        mnuLogin.setText("Login");

        itmMnuOwner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuOwner.setText("Owner");
        itmMnuOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuOwnerActionPerformed(evt);
            }
        });
        mnuLogin.add(itmMnuOwner);

        itmMnuCashier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuCashier.setText("Cashier");
        itmMnuCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuCashierActionPerformed(evt);
            }
        });
        mnuLogin.add(itmMnuCashier);

        itmMnuCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuCustomer.setText("Customer");
        itmMnuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuCustomerActionPerformed(evt);
            }
        });
        mnuLogin.add(itmMnuCustomer);

        jMenuBar1.add(mnuLogin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Validation Spinner
    public static void validationSpinner(JSpinner spinner) {
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(100);
        nm.setMinimum(0);
        nm.setStepSize(1);
        spinner.setModel(nm);
    }
    public Icon setIcon(String url, JButton button){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        
        int width = button.getWidth();
        int height = button.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
        return icono;
    }
    //ADD ORDER
    public void addOrder(JSpinner spinner, String product, float price) {
        DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

        int value = spinner.getValue().hashCode();

        if (value > 0) {
            model.addRow(new Object[]{product, price, value});
        }
    }

    //SEND ORDER
    public void sendOrder(JSpinner spinner, String product) {
        DefaultTableModel model = (DefaultTableModel) datosTable2.getModel();

        int value = spinner.getValue().hashCode();

        if (value > 0) {
            if (Integer.parseInt(numMesa.getText()) >= 0) {
                model.addRow(new Object[]{product, value, numMesa.getText()});
            }
        }
    }
    
     //GENERATE BILL
    public float generateBill(JSpinner spinner, String product, float price, float contTotal) {

        int cant = spinner.getValue().hashCode();

        if (cant > 0) {

            Bill fact = new Bill();
            fact.setDescription(product);

            float precio = price;
            fact.setPrice(precio);
            fact.setQuantity(cant);

            float total = cant * precio;
            fact.setTotal(total);
            contTotal = (float) (contTotal + total);

            DefaultTableModel model = (DefaultTableModel) factTable.getModel();
            model.addRow(new Object[]{fact.getDescription(), fact.getPrice(), fact.getQuantity(), fact.getTotal()});
            factTable.setModel(model);
        }

        return contTotal;
    }
    void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    private void itmMnuCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuCustomerActionPerformed
        Menu.setVisible(true);
        Menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmMnuCustomerActionPerformed

    private void itmMnuCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuCashierActionPerformed
        this.setVisible(false);
       GenerateBill.setVisible(true);
       GenerateBill.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmMnuCashierActionPerformed

    private void itmMnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmMnuExitActionPerformed

    private void itmMnuOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuOwnerActionPerformed
        this.setVisible(false);
        Login.setVisible(true);
        Login.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmMnuOwnerActionPerformed

    private void itmSuggestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSuggestionsActionPerformed
        Suggestions.setVisible(true);
        Suggestions.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(jSuggestions, "src/ec/edu/espe/restaurantSalesSystem/images/sugerencia.jpg");
    }//GEN-LAST:event_itmSuggestionsActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String suggestion = txtSuggestions.getText();
        
        if (suggestion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
        } else {
            String dataToSave = "Want to send suggestion?: \nSuggestion: " + suggestion;

            int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Suggestion",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            switch (selection) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Suggestion sent ", txtSuggestions.getText(),
                            JOptionPane.INFORMATION_MESSAGE);
                    SuggestionController suggestionController = new SuggestionController();
                    suggestionController.add(suggestion);
                    emptyFields();
                    FrmMainScreen frmMainScreen = new FrmMainScreen();
                    Suggestions.setVisible(false);
                    frmMainScreen.setVisible(true);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Suggestion not sent ", txtSuggestions.getText(),
                            JOptionPane.INFORMATION_MESSAGE);
                    emptyFields();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Action was cancelled ", txtSuggestions.getText(),
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        Suggestions.setVisible(false);
        FrmMainScreen frmMainScreen = new FrmMainScreen();
        frmMainScreen.setVisible(true);

        NoSQL nosql;
        nosql = new MongoManager();
        if (nosql.closeConnection(mongo)) {
            System.out.println("\nCONNECTION CLOSED");
        } else {
            System.out.println("\nCONNECTION COULD NOT BE CLOSED");
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn1ActionPerformed
        this.setVisible(false);
        FrmMainScreen frmMainScreen = new FrmMainScreen();
        frmMainScreen.setVisible(true);
    }//GEN-LAST:event_btnReturn1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        OptionsOwner.setVisible(false);
        Login.setVisible(true);
        NoSQL nosql;
        nosql = new MongoManager();
        if (nosql.closeConnection(mongo)) {
            System.out.println("\nCONNECTION CLOSED");
        } else {
            System.out.println("\nCONNECTION COULD NOT BE CLOSED");
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMenuActionPerformed
        OptionsOwner.setVisible(false);
        FrmStockProducts.setVisible(true);
        this.dispose();
        FrmStockProducts.setLocationRelativeTo(null);
       
    }//GEN-LAST:event_btnEditMenuActionPerformed

    private void btnRegisterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterEmployeeActionPerformed
        OptionsOwner.setVisible(false);
        this.setVisible(false);
        FrmResgisterEmployee frmResgisterEmployee = new FrmResgisterEmployee();
        frmResgisterEmployee.setVisible(true);
    }//GEN-LAST:event_btnRegisterEmployeeActionPerformed

    private void btnReportSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportSaleActionPerformed
       OptionsOwner.setVisible(false);
       ReportSale.setVisible(true);
       ReportSale.setLocationRelativeTo(null);
       
     // btnNumSales.setIcon(setIcon("src/ec/edu/espe/restaurantSalesSystem/images/reportSale.jpg",btnNumSales));
    }//GEN-LAST:event_btnReportSaleActionPerformed

    private void btnFindProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindProductsActionPerformed
        if (txtProducts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "FILL THE FIELD");
        } else {
            DB db = mongo.getDB("Products");
            DBCollection dbCollection = db.getCollection("Food");
            BasicDBObject query = new BasicDBObject();
            query.put("Type of Product", txtProducts.getText().toUpperCase());

            DBCursor cursor = null;

            try {
                cursor = dbCollection.find(query);
                String[] columnNames = {"Type of Product", "Description", "Price"};
                DefaultTableModel modelTable = new DefaultTableModel(columnNames, 0);
                while (cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String typeOfProduct = (String) obj.get("Type of Product");
                    String description = (String) obj.get("Description");
                    float price = Float.valueOf(obj.get("Price").toString());
                    modelTable.addRow(new Object[]{typeOfProduct, description, price});
                }
                tblProducts.setModel(modelTable);
                cursor.close();
            } catch (Exception ex) {
                System.out.println("Error printing tables");
            }
        }
    }//GEN-LAST:event_btnFindProductsActionPerformed

    private void btnReturn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn2ActionPerformed
       
        OptionsOwner.setVisible(true);
        OptionsOwner.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReturn2ActionPerformed

    private void btnAddProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProduct1ActionPerformed
        dlgAddProduct.setVisible(true);
        dlgAddProduct.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddProduct1ActionPerformed

    private void btnDeleteProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProduct1ActionPerformed
        dlgDeleteProduct.setVisible(true);
        dlgDeleteProduct.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDeleteProduct1ActionPerformed

    private void btnViewProducts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProducts1ActionPerformed
        DBCursor cursor = null;
        DB db = mongo.getDB("Products");
        DBCollection dbCollection = db.getCollection("Food");
        try {
            cursor = dbCollection.find();
            String[] columnNames = {"Type of Product", "Description", "Price"};
            DefaultTableModel modelTable = new DefaultTableModel(columnNames, 0);
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String typeOfProduct = (String) obj.get("Type of Product");
                String description = (String) obj.get("Description");
                float price = Float.valueOf(obj.get("Price").toString());
                modelTable.addRow(new Object[]{typeOfProduct, description, price});
            }
            tblProducts.setModel(modelTable);
            cursor.close();
        } catch (Exception ex) {
            System.out.println("Error printing tables");
        }
    }//GEN-LAST:event_btnViewProducts1ActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductsMouseClicked

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String typeProduct = cmbTypeOfProduct.getSelectedItem().toString();
        String description = txtDescription.getText();
        float price = Float.parseFloat(txtPrice.getText());

        String dataToSave = "Do you want to save this information?: \n Procustc" + "\nType Of Product: " + typeProduct
        + "\nDescription: " + description + "\nPrice: " + txtPrice.getText();

        int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Product added successfully",
            JOptionPane.YES_NO_CANCEL_OPTION);

        switch (selection) {
            case 0:
            JOptionPane.showMessageDialog(null, "Information was saved", cmbTypeOfProduct.getSelectedItem() + "Saved",
                JOptionPane.INFORMATION_MESSAGE);

            OwnerController ownerController = new OwnerController();
            Product product = new Product(typeProduct, description, price);
            ownerController.createProduct(product);
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
    }//GEN-LAST:event_btnAddActionPerformed

    public void emptyFields() {
        txtDescription.setText("");
        cmbTypeOfProduct.setSelectedIndex(0);
        txtPrice.setText("");
        txtSuggestions.setText("");
    }
    private void cmbTypeOfProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeOfProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTypeOfProductActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String product = txtDataToDelete.getText();

        String dataToDelete = "Do you want to delete " + product + "?";
        if (txtDataToDelete.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
        } else {
            int selection = JOptionPane.showConfirmDialog(null, dataToDelete, "Speaker deleting",
                JOptionPane.YES_NO_CANCEL_OPTION);

            switch (selection) {
                case 0:
                JOptionPane.showMessageDialog(null, "Information was deleting", txtDataToDelete.getText() + "Deleted",
                    JOptionPane.INFORMATION_MESSAGE);
                OwnerController ownerController = new OwnerController();
                ownerController.deleteProduct(product);
                txtDataToDelete.setText("");
                break;
                case 1:
                JOptionPane.showMessageDialog(null, "Information was NOT deleted", txtDataToDelete.getText() + "NOT deleted",
                    JOptionPane.INFORMATION_MESSAGE);
                txtDataToDelete.setText("");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Action was cancelled", txtDataToDelete.getText() + "Cancelled",
                    JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtDataToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataToDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataToDeleteActionPerformed

    private void btnNumSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumSalesActionPerformed

        JOptionPane.showMessageDialog(null, "Today they were made" + contador + " ventas. sales. With a total of: " + suma,"", JOptionPane.INFORMATION_MESSAGE);

        
    }//GEN-LAST:event_btnNumSalesActionPerformed

    private void btnDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDessertActionPerformed
        
        MenuDessert.setVisible(true);
        MenuDessert.setLocationRelativeTo(null);

        this.setLocationRelativeTo(null);

        rsscalelabel.RSScaleLabel.setScaleLabel(jNutella,
            "src/ec/edu/espe/restaurantSalesSystem/images/CheesecakeNutella.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jBrownie,
            "src/ec/edu/espe/restaurantSalesSystem/images/CheesecakeBrownie.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jCoconutCaramelAlmond,
            "src/ec/edu/espe/restaurantSalesSystem/images/CheesecakeCoco.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jLemon,
            "src/ec/edu/espe/restaurantSalesSystem/images/PieLemon.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jApple,
            "src/ec/edu/espe/restaurantSalesSystem/images/PieApple.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jChocolate,
            "src/ec/edu/espe/restaurantSalesSystem/images/PieChocolate.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jCakeChocolate,
            "src/ec/edu/espe/restaurantSalesSystem/images/CakeChocolate.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jVanilla,
            "src/ec/edu/espe/restaurantSalesSystem/images/CakeVanilla.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jOrange,
            "src/ec/edu/espe/restaurantSalesSystem/images/CakeOrange.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jHumita,
            "src/ec/edu/espe/restaurantSalesSystem/images/Humita.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLojanoTamale,
            "src/ec/edu/espe/restaurantSalesSystem/images/LojanoTamale.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jBolon,
            "src/ec/edu/espe/restaurantSalesSystem/images/Bolon.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jQuimbolito,
            "src/ec/edu/espe/restaurantSalesSystem/images/Quimbolito.jpg");
    }//GEN-LAST:event_btnDessertActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.setVisible(false);
        FrmMainScreen frmMainScreen = new FrmMainScreen();
        frmMainScreen.setVisible(true);
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnBreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBreakfastActionPerformed
       
        MenuBreakfast.setVisible(true);
        MenuBreakfast.setLocationRelativeTo(null);

        rsscalelabel.RSScaleLabel.setScaleLabel(jCoffeWater,
            "src/ec/edu/espe/restaurantSalesSystem/images/WaterCoffee.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jMilkCoffee,
            "src/ec/edu/espe/restaurantSalesSystem/images/MilkCoffee.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jLemonTea,
            "src/ec/edu/espe/restaurantSalesSystem/images/LemonTea.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jSimpleBread,
            "src/ec/edu/espe/restaurantSalesSystem/images/SimpleBread.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBreadWithJam,
            "src/ec/edu/espe/restaurantSalesSystem/images/BreadWithJam.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jIntegralBread,
            "src/ec/edu/espe/restaurantSalesSystem/images/IntegralBread.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBlackberryJuice,
            "src/ec/edu/espe/restaurantSalesSystem/images/BlackberryJuice.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jNaranjillasq,
            "src/ec/edu/espe/restaurantSalesSystem/images/Naranjillas.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jTreeTomato,
            "src/ec/edu/espe/restaurantSalesSystem/images/TreeTomato.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jboiledEgg,
            "src/ec/edu/espe/restaurantSalesSystem/images/BoiledEgg.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jWarmEgg,
            "src/ec/edu/espe/restaurantSalesSystem/images/WarmEgg.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jOmelette,
            "src/ec/edu/espe/restaurantSalesSystem/images/Omelette.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jApple1,
            "src/ec/edu/espe/restaurantSalesSystem/images/Apple.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jPear,
            "src/ec/edu/espe/restaurantSalesSystem/images/Pear.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBanano,
            "src/ec/edu/espe/restaurantSalesSystem/images/Banano.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBeefStew,
            "src/ec/edu/espe/restaurantSalesSystem/images/BeefStew.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jChickenStew,
            "src/ec/edu/espe/restaurantSalesSystem/images/ChickenStew.jpg");

    }//GEN-LAST:event_btnBreakfastActionPerformed

    private void btnLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLunchActionPerformed
        
        MenuLunch.setVisible(true);
        MenuLunch.setLocationRelativeTo(null);

        rsscalelabel.RSScaleLabel.setScaleLabel(jLocro, "src/ec/edu/espe/restaurantSalesSystem/images/Locro.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jCremaTomato, "src/ec/edu/espe/restaurantSalesSystem/images/CremaTomato.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jCaldoGallina, "src/ec/edu/espe/restaurantSalesSystem/images/CaldoGallina.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jChuleta, "src/ec/edu/espe/restaurantSalesSystem/images/Chuleta.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jCamaron,
            "src/ec/edu/espe/restaurantSalesSystem/images/Camaron.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jLasaña,
            "src/ec/edu/espe/restaurantSalesSystem/images/Lasaña.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jPineapple,
            "src/ec/edu/espe/restaurantSalesSystem/images/Pineapple.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBabaco,
            "src/ec/edu/espe/restaurantSalesSystem/images/Babaco.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jNaranjilla,
            "src/ec/edu/espe/restaurantSalesSystem/images/Naranjillas.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBrownies,
            "src/ec/edu/espe/restaurantSalesSystem/images/Brownie.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jChesecake,
            "src/ec/edu/espe/restaurantSalesSystem/images/Chesecake.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jThreeMilksCake,
            "src/ec/edu/espe/restaurantSalesSystem/images/ThreeMilksCake.jpg");
    }//GEN-LAST:event_btnLunchActionPerformed

    private void btnSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnackActionPerformed
       
        MenuSnack.setVisible(true);
        MenuSnack.setLocationRelativeTo(null);
        
        this.setLocationRelativeTo(null);

        rsscalelabel.RSScaleLabel.setScaleLabel(jClassicBurger,
            "src/ec/edu/espe/restaurantSalesSystem/images/classicBurger.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jCheeseburger,
            "src/ec/edu/espe/restaurantSalesSystem/images/Cheeseburger.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBaconCheeseBurger,
            "src/ec/edu/espe/restaurantSalesSystem/images/BaconCheeseBurger.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jChickenBurguer,
            "src/ec/edu/espe/restaurantSalesSystem/images/ChickenBurguer.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jJackDanielsBurger,
            "src/ec/edu/espe/restaurantSalesSystem/images/JackDanielsBurger.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jBBQ,
            "src/ec/edu/espe/restaurantSalesSystem/images/BBQWings.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jHot,
            "src/ec/edu/espe/restaurantSalesSystem/images/HotWings.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jpassionFruit,
            "src/ec/edu/espe/restaurantSalesSystem/images/PassionFruitWings.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jNachosWithCheese,
            "src/ec/edu/espe/restaurantSalesSystem/images/NachosWithCheese.jpg");

        rsscalelabel.RSScaleLabel.setScaleLabel(jNachosWithGuacamole,
            "src/ec/edu/espe/restaurantSalesSystem/images/NachosWithGuacamole.jpg");
    }//GEN-LAST:event_btnSnackActionPerformed

    private void btnDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkActionPerformed
       
        OptionsDrink.setVisible(true);
        OptionsDrink.setLocationRelativeTo(null);;
    }//GEN-LAST:event_btnDrinkActionPerformed

    private void bntOrderBreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOrderBreakfastActionPerformed

        addOrder(spiValor201, "Cafe en Agua", (float) 0.50);
        addOrder(spiValor202, "Cafe en Leche", (float) 0.75);
        addOrder(spiValor203, "Te con Limon", (float) 0.50);
        addOrder(spiValor204, "Leche", (float) 0.60);
        addOrder(spiValor205, "Pan Simple", (float) 0.10);
        addOrder(spiValor206, "Pan con Jamón", (float) 0.25);
        addOrder(spiValor207, "Pan con Mortadela", (float) 0.25);
        addOrder(spiValor208, "Pan Integral", (float) 0.25);
        addOrder(spiValor209, "Jugo de Mora", (float) 0.75);
        addOrder(spiValor210, "Jugo de Naranjilla", (float) 0.75);
        addOrder(spiValor211, "Jugo de Tomate de Arbol", (float) 0.75);
        addOrder(spiValor212, "Huevos Cocidos", (float) 0.20);
        addOrder(spiValor213, "Huevos Tibios", (float) 0.20);
        addOrder(spiValor214, "Torta de Huevo", (float) 0.20);
        addOrder(spiValor215, "Huevos Fritos", (float) 0.20);
        addOrder(spiValor216, "Huevos Rvueltos", (float) 0.20);
        addOrder(spiValor217, "Manzana", (float) 0.35);
        addOrder(spiValor218, "Pera", (float) 0.25);
        addOrder(spiValor219, "Banana", (float) 0.25);
        addOrder(spiValor220, "Estofado de carne", (float) 1.50);
        addOrder(spiValor221, "Estofado de pollo", (float) 1.50);

        Order.setVisible(true);
        MenuBreakfast.dispose();
    }//GEN-LAST:event_bntOrderBreakfastActionPerformed

    private void btnReturnBreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBreakfastActionPerformed
        MenuBreakfast.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_btnReturnBreakfastActionPerformed

    private void btnOrderLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderLunchActionPerformed

        addOrder(spiValor222, "Locro de papas", (float) 1.25);
        addOrder(spiValor223, "Crema de Tomate", (float) 1.25);
        addOrder(spiValor224, "Caldo de Gallina", (float) 1.25);
        addOrder(spiValor225, "Chuleta de Cerdo", (float) 2.00);
        addOrder(spiValor226, "Camorones Apanados", (float) 2.20);
        addOrder(spiValor227, "Lasaña de Pollo", (float) 3.20);
        addOrder(spiValor228, "Jugo de Piña", (float) 0.50);
        addOrder(spiValor229, "Jugo de Babaco", (float) 0.50);
        addOrder(spiValor230, "Jugo de Naranjilla", (float) 0.50);
        addOrder(spiValor231, "Brownie", (float) 0.75);
        addOrder(spiValor232, "ChesseCake", (float) 0.75);
        addOrder(spiValor233, "Pastel Tres Leches", (float) 0.75);

        Order.setVisible(true);
        MenuLunch.dispose();
    }//GEN-LAST:event_btnOrderLunchActionPerformed

    private void btnReturnLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLunchActionPerformed
        
        MenuLunch.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_btnReturnLunchActionPerformed

    private void btnAddOrderSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderSnackActionPerformed

        DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

        addOrder(spiValor234, "Hamburguesa de Queso", (float) 5.75);
        addOrder(spiValor235, "Hamburguesa Simple", (float) 5.25);
        addOrder(spiValor236, "Hamburguesa de Queso y Tocino", (float) 6.90);
        addOrder(spiValor237, "Hamburguesa de Pollo", (float) 6.50);
        addOrder(spiValor238, "Hamburguesa Jack Daniels", (float) 7.99);
        addOrder(spiValor239, "Alitas BBQ", (float) 13.50);
        addOrder(spiValor240, "Alitas Picantes", (float) 13.50);
        addOrder(spiValor241, "Alitas Maracuya", (float) 13.50);
        addOrder(spiValor242, "Nachos con Queso Chedar", (float) 6.25);
        addOrder(spiValor243, "Nachos con Guacamole", (float) 6.25);

        Order.setVisible(true);
        MenuSnack.dispose();
    }//GEN-LAST:event_btnAddOrderSnackActionPerformed

    private void bntReturnSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReturnSnackActionPerformed
        MenuSnack.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_bntReturnSnackActionPerformed

    private void btnReturnCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnCoffeeActionPerformed
        MenuCoffee.setVisible(false);
        OptionsDrink.setVisible(true);
    }//GEN-LAST:event_btnReturnCoffeeActionPerformed

    private void btnOrderCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderCoffeeActionPerformed
        // TODO add your handling code here:
        addOrder(spiValor244, "American Small", (float) 3.00);
        addOrder(spiValor245, "American Big", (float) 6.00);
        addOrder(spiValor246, "Tinto Small", (float) 2.00);
        addOrder(spiValor247, "Tinto Big", (float) 5.00);
        addOrder(spiValor248, "Expresso Ristretto Small", (float) 2.00);
        addOrder(spiValor249, "Expresso Ristretto Big", (float) 5.00);
        addOrder(spiValor250, "Capuccino Small", (float) 3.25);
        addOrder(spiValor251, "Capuccino Big", (float) 7.25);
        addOrder(spiValor252, "Latte Macchaiato Small", (float) 2.50);
        addOrder(spiValor253, "Latte Macchaiato Big", (float) 4.50);
        addOrder(spiValor254, "Frapuccino Small", (float) 3.00);
        addOrder(spiValor255, "Frapuccino Big", (float) 6.20);
        addOrder(spiValor256, "Fropaccino Small", (float) 3.00);
        addOrder(spiValor257, "Fropuccino Big", (float) 6.20);
        addOrder(spiValor258, "Mocaccino Small", (float) 3.50);
        addOrder(spiValor259, "Mocaccino Big", (float) 6.20);
        Order.setVisible(true);
        MenuCoffee.dispose();
    }//GEN-LAST:event_btnOrderCoffeeActionPerformed

    private void btnReturnJuiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnJuiceActionPerformed
        MenuJuice.setVisible(false);
        OptionsDrink.setVisible(true);
    }//GEN-LAST:event_btnReturnJuiceActionPerformed

    private void btnOrderJuiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderJuiceActionPerformed
        addOrder(spiValor260, "Jarra Jugo de Papaya", (float) 1.50);
        addOrder(spiValor261, "Vaso Jugo de Papaya", (float) 0.75);
        addOrder(spiValor262, "Jarra Jugo de Sandia", (float) 1.50);
        addOrder(spiValor263, "Vaso Jugo de Sandia", (float) 0.75);
        addOrder(spiValor264, "Jarra Jugo de Naranjilla", (float) 1.50);
        addOrder(spiValor265, "Vaso Jugo de Naranjilla", (float) 0.75);
        addOrder(spiValor266, "Jarra Jugo de Tomate de arbol", (float) 1.50);
        addOrder(spiValor267, "Vaso Jugo de Tomate de arbol", (float) 0.75);
        addOrder(spiValor268, "Jarra Jugo de Mora", (float) 1.50);
        addOrder(spiValor269, "Vaso Jugo de Mora", (float) 0.75);
        addOrder(spiValor270, "Jarra Jugo de Limonada", (float) 1.50);
        addOrder(spiValor271, "Vaso Jugo de Limonada", (float) 0.75);

        Order.setVisible(true);
        MenuJuice.dispose();
    }//GEN-LAST:event_btnOrderJuiceActionPerformed

    private void btnOrderSodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderSodaActionPerformed
        addOrder(spiValor272, "Coca Cola Personal", (float) 0.50);
        addOrder(spiValor273, "Coca Cola 1 lt", (float) 1.35);
        addOrder(spiValor274, "Fanta Personal", (float) 0.50);
        addOrder(spiValor275, "Fanta 1 lt", (float) 1.20);
        addOrder(spiValor276, "Big Cola Personal", (float) 0.50);
        addOrder(spiValor277, "Big Cola 1 lt", (float) 1.35);
        addOrder(spiValor278, "Sprite Personal", (float) 0.50);
        addOrder(spiValor279, "Sprite 1 lt", (float) 1.35);

        Order.setVisible(true);
        MenuSoda.dispose();
    }//GEN-LAST:event_btnOrderSodaActionPerformed

    private void btnReturnSodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnSodaActionPerformed
        MenuSoda.setVisible(false);
        OptionsDrink.setVisible(true);
    }//GEN-LAST:event_btnReturnSodaActionPerformed

    private void btnAddOrderDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderDessertActionPerformed
        DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

        //Dessert
        addOrder(spiValor280, "Portion Limon Pie", (float) 2.80);
        addOrder(spiValor281, "Medium Limon Pie", (float) 13.25);
        addOrder(spiValor282, "Big Limon Pie", (float) 21.80);
        addOrder(spiValor283, "Portion Manzana Pie", (float) 1.80);
        addOrder(spiValor284, "Medium Manzana Pie", (float) 13.25);
        addOrder(spiValor285, "Big Manzana Pie", (float) 21.80);
        addOrder(spiValor286, "Portion Chocolate Pie", (float) 4.50);
        addOrder(spiValor287, "Medium Chocolate Pie", (float) 15.20);
        addOrder(spiValor288, "Big Chocolate Pie", (float) 25.80);
        addOrder(spiValor289, "Portion Chocolate Cake", (float) 1.50);
        addOrder(spiValor290, "Medium Chocolate Cake", (float) 15.50);
        addOrder(spiValor291, "Big Chocolate Cake", (float) 23.50);
        addOrder(spiValor292, "Portion Vainilla Cake", (float) 1.25);
        addOrder(spiValor293, "Medium Vainilla Cake", (float) 15.20);
        addOrder(spiValor294, "Big Vainilla Cake", (float) 20.00);
        addOrder(spiValor295, "Portion Naranja Cake", (float) 1.25);
        addOrder(spiValor296, "Medium Naranja Cake", (float) 15.20);
        addOrder(spiValor297, "Big Naranja Cake", (float) 20.00);
        addOrder(spiValor298, "Humitas de Sal", (float) 0.35);
        addOrder(spiValor299, "Humitas de Dulce", (float) 0.35);
        addOrder(spiValor300, "Tamal Lojano de Pollo", (float) 1.25);
        addOrder(spiValor301, "Tamal Lojano de Chancho", (float) 1.50);
        addOrder(spiValor302, "Tamal Lojano de Chicharron", (float) 0.75);
        addOrder(spiValor303, "Bolon de Queso ", (float) 0.50);
        addOrder(spiValor304, "Bolon Mixto", (float) 1.25);
        addOrder(spiValor305, "Quimbolito", (float) 0.35);
        addOrder(spiValor306, "Porción de tarta de queso Nutella", (float) 3.80);
        addOrder(spiValor307, "Medium de tarta de queso Nutella", (float) 14.00);
        addOrder(spiValor308, "Big de tarta de queso Nutella", (float) 25.00);
        addOrder(spiValor309, "Brownie de porción de tarta de queso", (float) 1.80);
        addOrder(spiValor310, "Medium Brownie de tarta de queso", (float) 6.20);
        addOrder(spiValor311, "Big Brownie de porción de tarta de queso", (float) 14.50);
        addOrder(spiValor312, " Porción de tarta de queso Coco, caramelo y almendra ", (float) 4.80);
        addOrder(spiValor313, " Medium de tarta de queso Coco, caramelo y almendra ", (float) 16.00);
        addOrder(spiValor314, " Big de tarta de queso Coco, caramelo y almendra ", (float) 25.00);

        Order.setVisible(true);
        MenuDessert.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrderDessertActionPerformed

    private void btnReturnDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnDessertActionPerformed
        MenuDessert.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_btnReturnDessertActionPerformed

    private void btnReturn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn4ActionPerformed
        Order.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnReturn4ActionPerformed

    private void btnSendOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendOrderActionPerformed
        if (numMesa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter the table number");
        }

        //Breakfast
        sendOrder(spiValor201, "Cafe en Agua");
        sendOrder(spiValor202, "Cafe en Leche");
        sendOrder(spiValor203, "Te con Limon");
        sendOrder(spiValor204, "Leche");
        sendOrder(spiValor205, "Pan Simple");
        sendOrder(spiValor206, "Pan con Jamon");
        sendOrder(spiValor207, "Pan con Mortadela");
        sendOrder(spiValor208, "Pan Integral");
        sendOrder(spiValor209, "Jugo de Mora");
        sendOrder(spiValor210, "Jugo de Naranjilla");
        sendOrder(spiValor211, "Jugo de Tomate de Arbol");
        sendOrder(spiValor212, "Huevos Cocidos");
        sendOrder(spiValor213, "Huevos Tibios");
        sendOrder(spiValor214, "Torta de Huevo");
        sendOrder(spiValor215, "Huevos Fritos");
        sendOrder(spiValor216, "Huevos Revueltos");
        sendOrder(spiValor217, "Manzana");
        sendOrder(spiValor218, "Pera");
        sendOrder(spiValor219, "Banana");
        sendOrder(spiValor220, "Estofado de Carne");
        sendOrder(spiValor221, "Estofado de Pollo");

        //Lunch
        sendOrder(spiValor222, "Locro de Papas");
        sendOrder(spiValor223, "Crema de Tomate");
        sendOrder(spiValor224, "Caldo de gallina");
        sendOrder(spiValor225, "Chuleta de Cerdo");
        sendOrder(spiValor226, "Camarones Apanados");
        sendOrder(spiValor227, "Lasaña de Pollo");
        sendOrder(spiValor228, "Jugo de Piña");
        sendOrder(spiValor229, "Jugo de Babaco");
        sendOrder(spiValor230, "Jugo de Naranjilla");
        sendOrder(spiValor231, "Brownie");
        sendOrder(spiValor232, "ChesseCake");
        sendOrder(spiValor233, "Pastel Tres Leches");

        //Snack
        sendOrder(spiValor234, "Hamburguesa de Queso");
        sendOrder(spiValor235, "Hamburguesa Simple");
        sendOrder(spiValor236, "Hamburguesa de Queso y Tocino");
        sendOrder(spiValor237, "Hamburguesa de Pollo");
        sendOrder(spiValor238, "Hamburguesa Jack Daniels");
        sendOrder(spiValor239, "Alitas BBQ");
        sendOrder(spiValor240, "Alitas Picantes");
        sendOrder(spiValor241, "Alitas Maracuya");
        sendOrder(spiValor242, "Nachos con Queso Chedar");
        sendOrder(spiValor243, "Nachos con Guacamole");

        //Coffe
        sendOrder(spiValor244, "American Small");
        sendOrder(spiValor245, "American Big");
        sendOrder(spiValor246, "Tinto Small");
        sendOrder(spiValor247, "Tinto Big");
        sendOrder(spiValor248, "Expresso Ristretto Small");
        sendOrder(spiValor249, "Expresso Ristretto Big");
        sendOrder(spiValor250, "Capuccino Small");
        sendOrder(spiValor251, "Capuccino Big");
        sendOrder(spiValor252, "Latte Macchaiato Small");
        sendOrder(spiValor253, "Latte Macchaiato Big");
        sendOrder(spiValor254, "Frapuccino Small");
        sendOrder(spiValor255, "Frapuccino Big");
        sendOrder(spiValor256, "Fropaccino Small");
        sendOrder(spiValor257, "Fropuccino Big");
        sendOrder(spiValor258, "Mocaccino Small");
        sendOrder(spiValor259, "Mocaccino Big");

        //Juice
        sendOrder(spiValor260, "Jarra Jugo de Papaya");
        sendOrder(spiValor261, "Vaso Jugo de Papaya");
        sendOrder(spiValor262, "Jarra Jugo de Sandia");
        sendOrder(spiValor263, "Vaso Jugo de Sandia");
        sendOrder(spiValor264, "Jarra Jugo de Naranjilla");
        sendOrder(spiValor265, "Vaso Jugo de Naranjilla");
        sendOrder(spiValor266, "Jarra Jugo de Tomate de Arbol");
        sendOrder(spiValor267, "Vaso Jugo de Tomate de Arbol");
        sendOrder(spiValor268, "Jarra Jugo de Mora");
        sendOrder(spiValor269, "Vaso Jugo de Mora");
        sendOrder(spiValor270, "Jarra Jugo de Limonada");
        sendOrder(spiValor271, "Vaso Jugo de Limonada");

        //Soda
        sendOrder(spiValor272, "Coca Cola Personal");
        sendOrder(spiValor273, "Coca Cola 1 lt");
        sendOrder(spiValor274, "Fanta Personal");
        sendOrder(spiValor275, "Fanta 1 lt");
        sendOrder(spiValor276, "Big Cola Personal");
        sendOrder(spiValor277, "Big Cola 1 lt");
        sendOrder(spiValor278, "Sprite Personal");
        sendOrder(spiValor279, "Sprite 1 lt");

        //Dessert
        sendOrder(spiValor280, "Portion pai de Limon");
        sendOrder(spiValor281, "Medium pai de Limon ");
        sendOrder(spiValor282, "Big pai de limon");
        sendOrder(spiValor283, "Portion pai de Manzana ");
        sendOrder(spiValor284, "Medium pai de Manzana ");
        sendOrder(spiValor285, "Big pai de Manzana ");
        sendOrder(spiValor286, "Portion pai de Chocolate");
        sendOrder(spiValor287, "Medium pai de Chocolate");
        sendOrder(spiValor288, "Big pai de Chocolate");
        sendOrder(spiValor289, "Portion cake de Chocolate");
        sendOrder(spiValor290, "Medium cake de Chocolate");
        sendOrder(spiValor291, "Big cake de Chocolate");
        sendOrder(spiValor292, "Portion cake de Vainilla");
        sendOrder(spiValor293, "Medium cake de Vainilla");
        sendOrder(spiValor294, "Big cake de Vainilla");
        sendOrder(spiValor295, "Portion cake de Naranja");
        sendOrder(spiValor296, "Medium cake de Naranja");
        sendOrder(spiValor297, "Big cake de Naranja");
        sendOrder(spiValor298, "Humitas de Sal ");
        sendOrder(spiValor299, " Humitas de Dulce");
        sendOrder(spiValor300, "Tamal Lojano de Pollo");
        sendOrder(spiValor301, "Tamal Lojano de Chancho");
        sendOrder(spiValor302, "Tamal Lojano de Chichcarron");
        sendOrder(spiValor303, "Bolon de Queso");
        sendOrder(spiValor304, "Bolon Mixto");
        sendOrder(spiValor305, "Quimbolito ");
        sendOrder(spiValor306, "Porción de tarta de queso Nutella");
        sendOrder(spiValor307, "Medium de tarta de queso Nutella");
        sendOrder(spiValor308, "Big de tarta de queso Nutella");
        sendOrder(spiValor309, "Brownie de porción de tarta de queso");
        sendOrder(spiValor310, "Medium Brownie de tarta de queso");
        sendOrder(spiValor311, "Big Brownie de porción de tarta de queso");
        sendOrder(spiValor312, "Porción de tarta de queso Coco, caramelo y almendra");
        sendOrder(spiValor313, "Medium de tarta de queso Coco, caramelo y almendra");
        sendOrder(spiValor314, "Big de tarta de queso Coco, caramelo y almendra");

        viewOrder.setVisible(true);
        Order.setVisible(false);
    }//GEN-LAST:event_btnSendOrderActionPerformed

    private void btnGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillActionPerformed
        int filas = datosTable2.getRowCount();

        GenerateBill.setVisible(false);
        GenerateBill.setLocationRelativeTo(null);
        viewOrder.setVisible(false);
    }//GEN-LAST:event_btnGenerateBillActionPerformed

    private void btnReturn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn3ActionPerformed
        viewOrder.setVisible(false);
        MenuBreakfast.setVisible(true);
    }//GEN-LAST:event_btnReturn3ActionPerformed

    private void btnOtherOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherOrderActionPerformed

        //Reset valores de pedido tabla de pedidos
        this.setVisible(false);

        limpiarTabla(datosTable);
        numMesa.getText();
        
        Menu.setVisible(true);
        viewOrder.setVisible(false);

        //Breakfast
        spiValor201.getValue();
        spiValor202.getValue();
        spiValor203.getValue();
        spiValor204.getValue();
        spiValor205.getValue();
        spiValor206.getValue();
        spiValor207.getValue();
        spiValor208.getValue();
        spiValor209.getValue();
        spiValor210.getValue();
        spiValor211.getValue();
        spiValor212.getValue();
        spiValor213.getValue();
        spiValor214.getValue();
        spiValor215.getValue();
        spiValor216.getValue();
        spiValor217.getValue();
        spiValor218.getValue();
        spiValor219.getValue();
        spiValor220.getValue();
        spiValor221.getValue();

        //Lunch
        spiValor222.getValue();
        spiValor223.getValue();
        spiValor224.getValue();
        spiValor225.getValue();
        spiValor226.getValue();
        spiValor227.getValue();
        spiValor228.getValue();
        spiValor229.getValue();
        spiValor230.getValue();
        spiValor231.getValue();
        spiValor232.getValue();
        spiValor233.getValue();

        //Snack
        spiValor234.getValue();
        spiValor235.getValue();
        spiValor236.getValue();
        spiValor237.getValue();
        spiValor238.getValue();
        spiValor239.getValue();
        spiValor240.getValue();
        spiValor241.getValue();
        spiValor242.getValue();
        spiValor243.getValue();

        //Coffee
        spiValor244.getValue();
        spiValor245.getValue();
        spiValor246.getValue();
        spiValor247.getValue();
        spiValor248.getValue();
        spiValor249.getValue();
        spiValor250.getValue();
        spiValor251.getValue();
        spiValor252.getValue();
        spiValor253.getValue();
        spiValor254.getValue();
        spiValor255.getValue();
        spiValor256.getValue();
        spiValor257.getValue();
        spiValor258.getValue();
        spiValor259.getValue();

        //Juice
        spiValor260.getValue();
        spiValor261.getValue();
        spiValor262.getValue();
        spiValor263.getValue();
        spiValor264.getValue();
        spiValor265.getValue();
        spiValor266.getValue();
        spiValor267.getValue();
        spiValor268.getValue();
        spiValor269.getValue();
        spiValor270.getValue();
        spiValor271.getValue();

        //Soda
        spiValor272.getValue();
        spiValor273.getValue();
        spiValor274.getValue();
        spiValor275.getValue();
        spiValor276.getValue();
        spiValor277.getValue();
        spiValor278.getValue();
        spiValor279.getValue();

        //Dessert
        spiValor280.getValue();
        spiValor281.getValue();
        spiValor282.getValue();
        spiValor283.getValue();
        spiValor284.getValue();
        spiValor285.getValue();
        spiValor286.getValue();
        spiValor287.getValue();
        spiValor288.getValue();
        spiValor289.getValue();
        spiValor290.getValue();
        spiValor291.getValue();
        spiValor292.getValue();
        spiValor293.getValue();
        spiValor294.getValue();
        spiValor295.getValue();
        spiValor296.getValue();
        spiValor297.getValue();
        spiValor298.getValue();
        spiValor299.getValue();
        spiValor300.getValue();
        spiValor301.getValue();
        spiValor302.getValue();
        spiValor303.getValue();
        spiValor304.getValue();
        spiValor305.getValue();
        spiValor306.getValue();
        spiValor307.getValue();
        spiValor308.getValue();
        spiValor309.getValue();
        spiValor310.getValue();
        spiValor311.getValue();
        spiValor312.getValue();
        spiValor313.getValue();
        spiValor314.getValue();

    }//GEN-LAST:event_btnOtherOrderActionPerformed

    private void txtTableNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTableNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTableNumberActionPerformed

    private void txtTableNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTableNumberKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtTableNumberKeyTyped

    private void btngenerateBillCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateBillCashierActionPerformed
        
        //Bill
        float contTotal = (float) 0.0;
        int c1 = Integer.parseInt(numMesa.getText()), c2 = Integer.parseInt(txtTableNumber.getText());

        if (c1 == c2) {
            limpiarTabla(factTable);

            //Breakfast
            contTotal = generateBill(spiValor201, "Cafe en Agua", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor202, "Cafe en Leche", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor203, "Te con Limon", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor204, "Leche", (float) 0.60, contTotal);
            contTotal = generateBill(spiValor205, "Pan Simple", (float) 0.10, contTotal);
            contTotal = generateBill(spiValor206, "Pan con Jamon", (float) 0.25, contTotal);
            contTotal = generateBill(spiValor207, "Pan con Mortadela", (float) 0.25, contTotal);
            contTotal = generateBill(spiValor208, "Pan Integral", (float) 0.25, contTotal);
            contTotal = generateBill(spiValor209, "Jugo de Mora", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor210, "Jugo de Naranjilla", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor211, "Jugo de Tomate de Arbol", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor212, "Huevos Cocidos", (float) 0.20, contTotal);
            contTotal = generateBill(spiValor213, "Huevos Tibios", (float) 0.20, contTotal);
            contTotal = generateBill(spiValor214, "Huevos Torta de Huevo", (float) 0.20, contTotal);
            contTotal = generateBill(spiValor215, "Huevos Fritos", (float) 0.20, contTotal);
            contTotal = generateBill(spiValor216, "Huevos Revueltos", (float) 0.20, contTotal);
            contTotal = generateBill(spiValor217, "Manzana", (float) 0.35, contTotal);
            contTotal = generateBill(spiValor218, "Pera", (float) 0.25, contTotal);
            contTotal = generateBill(spiValor219, "Banana", (float) 0.25, contTotal);
            contTotal = generateBill(spiValor220, "Estofado de Carne", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor221, "Estofado de Pollo", (float) 1.50, contTotal);

            //lunch
            contTotal = generateBill(spiValor222, "Locro de Papas", (float) 1.25, contTotal);
            contTotal = generateBill(spiValor223, "Crema de Tomate", (float) 1.25, contTotal);
            contTotal = generateBill(spiValor224, "Caldo de Gallina", (float) 1.25, contTotal);
            contTotal = generateBill(spiValor225, "Chuleta de Cerdo", (float) 2.00, contTotal);
            contTotal = generateBill(spiValor226, "Camarones Apanados", (float) 2.20, contTotal);
            contTotal = generateBill(spiValor227, "Lasaña de Pollo", (float) 3.20, contTotal);
            contTotal = generateBill(spiValor228, "Jugo de Piña", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor229, "Jugo de Babaco", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor230, "Jugo de Naranjilla", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor231, "Brownie", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor232, "ChesseCake", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor233, "Pastel Tres Leches", (float) 0.75, contTotal);

            //Snack
            contTotal = generateBill(spiValor234, "Hamburguesa de Queso", (float) 5.75, contTotal);
            contTotal = generateBill(spiValor235, "Hamburguesa Simple", (float) 5.25, contTotal);
            contTotal = generateBill(spiValor236, "Hamburguesa de Queso y Tocino", (float) 6.90, contTotal);
            contTotal = generateBill(spiValor237, "Hamburguesa de Pollo", (float) 6.50, contTotal);
            contTotal = generateBill(spiValor238, "Hamburguesa Jack Daniels", (float) 7.99, contTotal);
            contTotal = generateBill(spiValor239, "Alitas BBQ", (float) 13.50, contTotal);
            contTotal = generateBill(spiValor240, "Alitas Picantes", (float) 13.50, contTotal);
            contTotal = generateBill(spiValor241, "Alitas Maracuya", (float) 13.50, contTotal);
            contTotal = generateBill(spiValor242, "Nachos con Queso Chedar", (float) 6.25, contTotal);
            contTotal = generateBill(spiValor243, "Nachos con Guacamole", (float) 6.25, contTotal);

            //Coffee
            contTotal = generateBill(spiValor244, "American Small", (float) 3.00, contTotal);
            contTotal = generateBill(spiValor245, "American Big", (float) 6.00, contTotal);
            contTotal = generateBill(spiValor246, "Tinto Small", (float) 2.00, contTotal);
            contTotal = generateBill(spiValor247, "Tinto Big", (float) 5.00, contTotal);
            contTotal = generateBill(spiValor248, "Expresso Ristretto Small", (float) 2.00, contTotal);
            contTotal = generateBill(spiValor249, "Expresso Ristretto Big", (float) 5.00, contTotal);
            contTotal = generateBill(spiValor250, "Capuccino Small", (float) 3.25, contTotal);
            contTotal = generateBill(spiValor251, "Capuccino Big", (float) 7.25, contTotal);
            contTotal = generateBill(spiValor252, "Latte Macchaiato Small", (float) 2.50, contTotal);
            contTotal = generateBill(spiValor253, "Latte Macchaiato Big", (float) 4.50, contTotal);
            contTotal = generateBill(spiValor254, "Frapuccino Small", (float) 3.00, contTotal);
            contTotal = generateBill(spiValor255, "Frapuccino Big", (float) 6.20, contTotal);
            contTotal = generateBill(spiValor256, "Fropaccino Small", (float) 3.00, contTotal);
            contTotal = generateBill(spiValor257, "Fropuccino Big", (float) 6.20, contTotal);
            contTotal = generateBill(spiValor258, "Mocaccino Small", (float) 3.50, contTotal);
            contTotal = generateBill(spiValor259, "Mocaccino Big", (float) 6.20, contTotal);

            //Juice
            contTotal = generateBill(spiValor260, "Jarra Jugo de Papaya", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor261, "Vaso Jugo de Papaya", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor262, "Jarra Jugo de Sandia", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor263, "Vaso Jugo de Sandia", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor264, "Jarra Jugo de Naranjilla", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor265, "Vaso Jugo de Naranjilla", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor266, "Jarra Jugo de Tomate de arbol", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor267, "Vaso Jugo de Tomate de arbol", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor268, "Jarra Jugo de Mora", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor269, "Vaso Jugo de Mora", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor270, "Jarra Jugo de Limonada", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor271, "Vaso Jugo de Limonada", (float) 0.75, contTotal);

            //Soda
            contTotal = generateBill(spiValor272, "Coca Cola Personal", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor273, "Coca Cola 1 lt", (float) 1.35, contTotal);
            contTotal = generateBill(spiValor274, "Fanta Personal", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor275, "Fanta 1 lt", (float) 1.20, contTotal);
            contTotal = generateBill(spiValor276, "Big Cola Personal", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor277, "Big Cola 1 lt", (float) 1.35, contTotal);
            contTotal = generateBill(spiValor278, "Sprite Personal", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor279, "Sprite 1 lt", (float) 1.35, contTotal);

            //Dessert
            contTotal = generateBill(spiValor280, "Portion Limon Pie", (float) 2.80, contTotal);
            contTotal = generateBill(spiValor281, "Medium Limon Pie", (float) 13.25, contTotal);
            contTotal = generateBill(spiValor282, "Big Limon Pie", (float) 21.80, contTotal);
            contTotal = generateBill(spiValor283, "Portion Manzana Pie", (float) 1.80, contTotal);
            contTotal = generateBill(spiValor284, "Medium Manzana Pie", (float) 13.25, contTotal);
            contTotal = generateBill(spiValor285, "Big Manzana Pie", (float) 21.80, contTotal);
            contTotal = generateBill(spiValor286, "Portion Chocolate Pie", (float) 4.50, contTotal);
            contTotal = generateBill(spiValor287, "Medium Chocolate Pie", (float) 15.20, contTotal);
            contTotal = generateBill(spiValor288, "Big Chocolate Pie", (float) 25.80, contTotal);
            contTotal = generateBill(spiValor289, "Portion Chocolate Cake", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor290, "Medium Chocolate Cake", (float) 15.50, contTotal);
            contTotal = generateBill(spiValor291, "Big Chocolate Cake", (float) 23.50, contTotal);
            contTotal = generateBill(spiValor292, "Portion Vainilla Cake", (float) 1.25, contTotal);
            contTotal = generateBill(spiValor293, "Medium Vainilla Cake", (float) 15.20, contTotal);
            contTotal = generateBill(spiValor294, "Big Vainilla Cake", (float) 20.00, contTotal);
            contTotal = generateBill(spiValor295, "Portion Naranja Cake", (float) 1.25, contTotal);
            contTotal = generateBill(spiValor296, "Medium Naranja Cake", (float) 15.20, contTotal);
            contTotal = generateBill(spiValor297, "Big Naranja Cake", (float) 20.00, contTotal);
            contTotal = generateBill(spiValor298, "Humitas de Sal", (float) 0.35, contTotal);
            contTotal = generateBill(spiValor299, "Humitas de Dulce", (float) 0.35, contTotal);
            contTotal = generateBill(spiValor300, "Tamal Lojano de Pollo", (float) 1.25, contTotal);
            contTotal = generateBill(spiValor301, "Tamal Lojano de Chancho", (float) 1.50, contTotal);
            contTotal = generateBill(spiValor302, "Tamal Lojano de Chicharron", (float) 0.75, contTotal);
            contTotal = generateBill(spiValor303, "Bolon de Queso ", (float) 0.50, contTotal);
            contTotal = generateBill(spiValor304, "Bolon Mixto", (float) 1.25, contTotal);
            contTotal = generateBill(spiValor305, "Quimbolito", (float) 0.35, contTotal);
            contTotal = generateBill(spiValor306, "Porción de tarta de queso Nutella", (float) 3.80, contTotal);
            contTotal = generateBill(spiValor307, "Medium de tarta de queso Nutella", (float) 14.00, contTotal);
            contTotal = generateBill(spiValor308, "Big de tarta de queso Nutella", (float) 25.00, contTotal);
            contTotal = generateBill(spiValor309, "Brownie de porción de tarta de queso", (float) 1.80, contTotal);
            contTotal = generateBill(spiValor310, "Medium Brownie de tarta de queso", (float) 6.20, contTotal);
            contTotal = generateBill(spiValor311, "Big Brownie de tarta de queso", (float) 14.50, contTotal);
            contTotal = generateBill(spiValor312, " Porción de tarta de queso Coco, caramelo y almendra ", (float) 4.80, contTotal);
            contTotal = generateBill(spiValor313, " Medium de tarta de queso Coco, caramelo y almendra ", (float) 16.00, contTotal);
            contTotal = generateBill(spiValor314, " Big de tarta de queso Coco, caramelo y almendra ", (float) 25.50, contTotal);

            //iva prop y total a labels factura
            float iva = (float) (contTotal * 0.12);
            float prop = (float) (contTotal * 0.05);
            float tot = iva + prop + contTotal;
            IVA.setText(String.valueOf(iva));
            PROPINA.setText(String.valueOf(prop));
            TOTALtot.setText(String.valueOf(tot));

            
            String c = txtTableNumber.getText();
            numMesa2.setText(c);
            Bill.setVisible(true);
            Bill.setLocationRelativeTo(null);
            GenerateBill.setVisible(false);
            String fecha1 = (new Date()).toString();

        } else {
            JOptionPane.showMessageDialog(null, "Tables do not match, check again");
            txtTableNumber.setText("");
        }

        if (txtTableNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You have not entered a table number to generate an invoice.");
        }
    }//GEN-LAST:event_btngenerateBillCashierActionPerformed

    private void btnCellphoneCostumerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCellphoneCostumerKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_btnCellphoneCostumerKeyTyped

    private void txtIdCostumerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCostumerKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtIdCostumerKeyTyped

    private void txtNameCostumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameCostumerActionPerformed
        JOptionPane.showMessageDialog(null, "The payment has been made successfully.");
        txtIdCostumer.setText("");
        txtNameCostumer.setText("");
        btnCellphoneCostumer.setText("");
        infoFact.setText("");
    }//GEN-LAST:event_txtNameCostumerActionPerformed

    private void txtNameCostumerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameCostumerKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && ((c < 'A') | c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameCostumerKeyTyped

    private void btnReturn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn5ActionPerformed
        Bill.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnReturn5ActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed

        //BOTON FINALIZA FACTURA
        Bill f = new Bill();
        f.numSales = 0;

        if ((txtNameCostumer.getText().equals("")) && (txtIdCostumer.getText().equals("")) && (btnCellphoneCostumer.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "You have not filled in the customer information");

        }

        if (((!txtNameCostumer.getText().equals("")) && (!txtIdCostumer.getText().equals("")) && (!btnCellphoneCostumer.getText().equals("")))) {
            contador++;
            suma = (int) (suma + Double.parseDouble(TOTALtot.getText()));
            f.numSales = f.numSales + 1;
            JOptionPane.showMessageDialog(null, "The payment has been made successfully. SEE YOU LATER");
            Bill.setVisible(false);
            this.setVisible(true);

            txtNameCostumer.setText("");
            txtIdCostumer.setText("");
            btnCellphoneCostumer.setText("");
            numMesa2.setText("");
            limpiarTabla(datosTable);
            limpiarTabla(factTable);
            limpiarTabla(datosTable2);

        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnSodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSodaActionPerformed
        OptionsDrink.setVisible(false);
        MenuSoda.setVisible(true);
        MenuSoda.setLocationRelativeTo(null);

        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage, "src/ec/edu/espe/restaurantSalesSystem/images/Soda Coca Cola.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage2, "src/ec/edu/espe/restaurantSalesSystem/images/Soda Fanta.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage3, "src/ec/edu/espe/restaurantSalesSystem/images/Soda BigCola.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage4, "src/ec/edu/espe/restaurantSalesSystem/images/Soda Sprite.png");
    }//GEN-LAST:event_btnSodaActionPerformed

    private void btnReturnOptionDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnOptionDrinkActionPerformed
        OptionsDrink.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_btnReturnOptionDrinkActionPerformed

    private void btnCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoffeeActionPerformed
        OptionsDrink.setVisible(false);
        MenuCoffee.setVisible(true);
        MenuCoffee.setLocationRelativeTo(null);

        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jAmericano, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeeAmericano.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jTinto, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeeTinto.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jExpressoRistretto, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeExpressoRistretto.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jCapuccino, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeeCapuccino.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLatteMacchaiato, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeLatteMacchaiato.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jFrapuccino, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeFrapuccino.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jFrocaccino, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeFrocaccino.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jMocaccino, "src/ec/edu/espe/restaurantSalesSystem/images/CoffeMocaccino.jpg");
    }//GEN-LAST:event_btnCoffeeActionPerformed

    private void btnJuiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuiceActionPerformed
        OptionsDrink.setVisible(false);
        MenuJuice.setVisible(true);
        MenuJuice.setLocationRelativeTo(null);

        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage1, "src/ec/edu/espe/restaurantSalesSystem/images/papaya.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage7, "src/ec/edu/espe/restaurantSalesSystem/images/JUGO-DE-MORA.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage8, "src/ec/edu/espe/restaurantSalesSystem/images/limonada.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage9, "src/ec/edu/espe/restaurantSalesSystem/images/tomate de arbol.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage5, "src/ec/edu/espe/restaurantSalesSystem/images/sandia.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jimage6, "src/ec/edu/espe/restaurantSalesSystem/images/Naranjillas.jpg");
    }//GEN-LAST:event_btnJuiceActionPerformed

    static String name;
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       
        if (txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
        } else if((txtUserName.getText().equals("admin")) && (txtPassword.getText().equals("admin123"))) {
            name = "admin";
            JOptionPane.showMessageDialog(null, "Welcome " + name);
                Login.setVisible(false);
                OptionsOwner.setVisible(true);
                OptionsOwner.setLocationRelativeTo(null);
        }else {
                JOptionPane.showMessageDialog(null, "Incorrect data, check again.");
            }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.setVisible(false);
        Login.setVisible(false);
        FrmMainScreen frmMainScreen = new FrmMainScreen();
        frmMainScreen.setVisible(true);
    }//GEN-LAST:event_btnExit2ActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnReturn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn6ActionPerformed
         this.setVisible(false);
        OptionsOwner.setVisible(true);
    }//GEN-LAST:event_btnReturn6ActionPerformed
    

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
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainScreen().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Bill;
    private javax.swing.JFrame FrmStockProducts;
    private javax.swing.JDialog GenerateBill;
    private javax.swing.JLabel IVA;
    private javax.swing.JFrame Login;
    private javax.swing.JFrame Menu;
    private javax.swing.JFrame MenuBreakfast;
    private javax.swing.JFrame MenuCoffee;
    private javax.swing.JFrame MenuDessert;
    private javax.swing.JFrame MenuJuice;
    private javax.swing.JFrame MenuLunch;
    private javax.swing.JFrame MenuSnack;
    private javax.swing.JFrame MenuSoda;
    private javax.swing.JFrame OptionsCashier;
    private javax.swing.JDialog OptionsDrink;
    private javax.swing.JFrame OptionsOwner;
    private javax.swing.JDialog Order;
    private javax.swing.JLabel PROPINA;
    private javax.swing.JFrame ReportSale;
    private javax.swing.JDialog Suggestions;
    private javax.swing.JLabel TOTALtot;
    private javax.swing.JButton bntOrderBreakfast;
    private javax.swing.JButton bntReturnSnack;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddOrderDessert;
    private javax.swing.JButton btnAddOrderSnack;
    private javax.swing.JButton btnAddProduct1;
    private javax.swing.JButton btnBreakfast;
    private javax.swing.JTextField btnCellphoneCostumer;
    private javax.swing.JButton btnCoffee;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteProduct1;
    private javax.swing.JButton btnDessert;
    private javax.swing.JButton btnDrink;
    private javax.swing.JButton btnEditMenu;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnFindProducts;
    private javax.swing.JButton btnGenerateBill;
    private javax.swing.JButton btnJuice;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLunch;
    private javax.swing.JButton btnNumSales;
    private javax.swing.JButton btnOrderCoffee;
    private javax.swing.JButton btnOrderJuice;
    private javax.swing.JButton btnOrderLunch;
    private javax.swing.JButton btnOrderSoda;
    private javax.swing.JButton btnOtherOrder;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnRegisterEmployee;
    private javax.swing.JButton btnReportSale;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnReturn1;
    private javax.swing.JButton btnReturn2;
    private javax.swing.JButton btnReturn3;
    private javax.swing.JButton btnReturn4;
    private javax.swing.JButton btnReturn5;
    private javax.swing.JButton btnReturn6;
    private javax.swing.JButton btnReturnBreakfast;
    private javax.swing.JButton btnReturnCoffee;
    private javax.swing.JButton btnReturnDessert;
    private javax.swing.JButton btnReturnJuice;
    private javax.swing.JButton btnReturnLunch;
    private javax.swing.JButton btnReturnOptionDrink;
    private javax.swing.JButton btnReturnSoda;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendOrder;
    private javax.swing.JButton btnSnack;
    private javax.swing.JButton btnSoda;
    private javax.swing.JButton btnViewProducts1;
    private javax.swing.JButton btngenerateBillCashier;
    private javax.swing.JLabel cafeEnAgua;
    private javax.swing.JLabel cafeEnLeche;
    private javax.swing.JComboBox<String> cmbTypeOfProduct;
    private javax.swing.JTable datosTable;
    private javax.swing.JTable datosTable2;
    private javax.swing.JLabel description2;
    private javax.swing.JDialog dlgAddProduct;
    private javax.swing.JDialog dlgDeleteProduct;
    private javax.swing.JLabel fac;
    private javax.swing.JTable factTable;
    private javax.swing.JLabel infoFact;
    private javax.swing.JMenuItem itmMnuCashier;
    private javax.swing.JMenuItem itmMnuCustomer;
    private javax.swing.JMenuItem itmMnuExit;
    private javax.swing.JMenuItem itmMnuOwner;
    private javax.swing.JMenuItem itmSuggestions;
    private javax.swing.JLabel jAmericano;
    private javax.swing.JLabel jApple;
    private javax.swing.JLabel jApple1;
    private javax.swing.JLabel jBBQ;
    private javax.swing.JLabel jBabaco;
    private javax.swing.JLabel jBaconCheeseBurger;
    private javax.swing.JLabel jBanano;
    private javax.swing.JLabel jBeefStew;
    private javax.swing.JLabel jBlackberryJuice;
    private javax.swing.JLabel jBolon;
    private javax.swing.JLabel jBreadWithJam;
    private javax.swing.JLabel jBrownie;
    private javax.swing.JLabel jBrownies;
    private javax.swing.JLabel jCakeChocolate;
    private javax.swing.JLabel jCaldoGallina;
    private javax.swing.JLabel jCamaron;
    private javax.swing.JLabel jCapuccino;
    private javax.swing.JLabel jCheeseburger;
    private javax.swing.JLabel jChesecake;
    private javax.swing.JLabel jChickenBurguer;
    private javax.swing.JLabel jChickenStew;
    private javax.swing.JLabel jChocolate;
    private javax.swing.JLabel jChuleta;
    private javax.swing.JLabel jClassicBurger;
    private javax.swing.JLabel jCoconutCaramelAlmond;
    private javax.swing.JLabel jCoffeWater;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jCremaTomato;
    private javax.swing.JLabel jExpressoRistretto;
    private javax.swing.JLabel jFrapuccino;
    private javax.swing.JLabel jFrocaccino;
    private javax.swing.JLabel jGenerateBill;
    private javax.swing.JLabel jHot;
    private javax.swing.JLabel jHumita;
    private javax.swing.JLabel jIntegralBread;
    private javax.swing.JLabel jJackDanielsBurger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLasaña;
    private javax.swing.JLabel jLatteMacchaiato;
    private javax.swing.JLabel jLemon;
    private javax.swing.JLabel jLemonTea;
    private javax.swing.JLabel jLocro;
    private javax.swing.JLabel jLojanoTamale;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jMilkCoffee;
    private javax.swing.JLabel jMocaccino;
    private javax.swing.JLabel jNachosWithCheese;
    private javax.swing.JLabel jNachosWithGuacamole;
    private javax.swing.JLabel jNaranjilla;
    private javax.swing.JLabel jNaranjillasq;
    private javax.swing.JLabel jNutella;
    private javax.swing.JLabel jOmelette;
    private javax.swing.JLabel jOrange;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jPear;
    private javax.swing.JLabel jPineapple;
    private javax.swing.JLabel jQuimbolito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jSimpleBread;
    private javax.swing.JLabel jSuggestions;
    private javax.swing.JLabel jTextField40;
    private javax.swing.JLabel jThreeMilksCake;
    private javax.swing.JLabel jTinto;
    private javax.swing.JLabel jTreeTomato;
    private javax.swing.JLabel jVanilla;
    private javax.swing.JLabel jWarmEgg;
    private javax.swing.JLabel jboiledEgg;
    private javax.swing.JLabel jimage;
    private javax.swing.JLabel jimage1;
    private javax.swing.JLabel jimage2;
    private javax.swing.JLabel jimage3;
    private javax.swing.JLabel jimage4;
    private javax.swing.JLabel jimage5;
    private javax.swing.JLabel jimage6;
    private javax.swing.JLabel jimage7;
    private javax.swing.JLabel jimage8;
    private javax.swing.JLabel jimage9;
    private javax.swing.JLabel jlogo;
    private javax.swing.JLabel jpassionFruit;
    private javax.swing.JLabel leche;
    private javax.swing.JMenu mnuLogin;
    private javax.swing.JMenu mnuSystem;
    private javax.swing.JTextField numMesa;
    private javax.swing.JLabel numMesa2;
    private javax.swing.JLabel products;
    private javax.swing.JSpinner spiValor201;
    private javax.swing.JSpinner spiValor202;
    private javax.swing.JSpinner spiValor203;
    private javax.swing.JSpinner spiValor204;
    private javax.swing.JSpinner spiValor205;
    private javax.swing.JSpinner spiValor206;
    private javax.swing.JSpinner spiValor207;
    private javax.swing.JSpinner spiValor208;
    private javax.swing.JSpinner spiValor209;
    private javax.swing.JSpinner spiValor210;
    private javax.swing.JSpinner spiValor211;
    private javax.swing.JSpinner spiValor212;
    private javax.swing.JSpinner spiValor213;
    private javax.swing.JSpinner spiValor214;
    private javax.swing.JSpinner spiValor215;
    private javax.swing.JSpinner spiValor216;
    private javax.swing.JSpinner spiValor217;
    private javax.swing.JSpinner spiValor218;
    private javax.swing.JSpinner spiValor219;
    private javax.swing.JSpinner spiValor220;
    private javax.swing.JSpinner spiValor221;
    private javax.swing.JSpinner spiValor222;
    private javax.swing.JSpinner spiValor223;
    private javax.swing.JSpinner spiValor224;
    private javax.swing.JSpinner spiValor225;
    private javax.swing.JSpinner spiValor226;
    private javax.swing.JSpinner spiValor227;
    private javax.swing.JSpinner spiValor228;
    private javax.swing.JSpinner spiValor229;
    private javax.swing.JSpinner spiValor230;
    private javax.swing.JSpinner spiValor231;
    private javax.swing.JSpinner spiValor232;
    private javax.swing.JSpinner spiValor233;
    private javax.swing.JSpinner spiValor234;
    private javax.swing.JSpinner spiValor235;
    private javax.swing.JSpinner spiValor236;
    private javax.swing.JSpinner spiValor237;
    private javax.swing.JSpinner spiValor238;
    private javax.swing.JSpinner spiValor239;
    private javax.swing.JSpinner spiValor240;
    private javax.swing.JSpinner spiValor241;
    private javax.swing.JSpinner spiValor242;
    private javax.swing.JSpinner spiValor243;
    private javax.swing.JSpinner spiValor244;
    private javax.swing.JSpinner spiValor245;
    private javax.swing.JSpinner spiValor246;
    private javax.swing.JSpinner spiValor247;
    private javax.swing.JSpinner spiValor248;
    private javax.swing.JSpinner spiValor249;
    private javax.swing.JSpinner spiValor250;
    private javax.swing.JSpinner spiValor251;
    private javax.swing.JSpinner spiValor252;
    private javax.swing.JSpinner spiValor253;
    private javax.swing.JSpinner spiValor254;
    private javax.swing.JSpinner spiValor255;
    private javax.swing.JSpinner spiValor256;
    private javax.swing.JSpinner spiValor257;
    private javax.swing.JSpinner spiValor258;
    private javax.swing.JSpinner spiValor259;
    private javax.swing.JSpinner spiValor260;
    private javax.swing.JSpinner spiValor261;
    private javax.swing.JSpinner spiValor262;
    private javax.swing.JSpinner spiValor263;
    private javax.swing.JSpinner spiValor264;
    private javax.swing.JSpinner spiValor265;
    private javax.swing.JSpinner spiValor266;
    private javax.swing.JSpinner spiValor267;
    private javax.swing.JSpinner spiValor268;
    private javax.swing.JSpinner spiValor269;
    private javax.swing.JSpinner spiValor270;
    private javax.swing.JSpinner spiValor271;
    private javax.swing.JSpinner spiValor272;
    private javax.swing.JSpinner spiValor273;
    private javax.swing.JSpinner spiValor274;
    private javax.swing.JSpinner spiValor275;
    private javax.swing.JSpinner spiValor276;
    private javax.swing.JSpinner spiValor277;
    private javax.swing.JSpinner spiValor278;
    private javax.swing.JSpinner spiValor279;
    private javax.swing.JSpinner spiValor280;
    private javax.swing.JSpinner spiValor281;
    private javax.swing.JSpinner spiValor282;
    private javax.swing.JSpinner spiValor283;
    private javax.swing.JSpinner spiValor284;
    private javax.swing.JSpinner spiValor285;
    private javax.swing.JSpinner spiValor286;
    private javax.swing.JSpinner spiValor287;
    private javax.swing.JSpinner spiValor288;
    private javax.swing.JSpinner spiValor289;
    private javax.swing.JSpinner spiValor290;
    private javax.swing.JSpinner spiValor291;
    private javax.swing.JSpinner spiValor292;
    private javax.swing.JSpinner spiValor293;
    private javax.swing.JSpinner spiValor294;
    private javax.swing.JSpinner spiValor295;
    private javax.swing.JSpinner spiValor296;
    private javax.swing.JSpinner spiValor297;
    private javax.swing.JSpinner spiValor298;
    private javax.swing.JSpinner spiValor299;
    private javax.swing.JSpinner spiValor300;
    private javax.swing.JSpinner spiValor301;
    private javax.swing.JSpinner spiValor302;
    private javax.swing.JSpinner spiValor303;
    private javax.swing.JSpinner spiValor304;
    private javax.swing.JSpinner spiValor305;
    private javax.swing.JSpinner spiValor306;
    private javax.swing.JSpinner spiValor307;
    private javax.swing.JSpinner spiValor308;
    private javax.swing.JSpinner spiValor309;
    private javax.swing.JSpinner spiValor310;
    private javax.swing.JSpinner spiValor311;
    private javax.swing.JSpinner spiValor312;
    private javax.swing.JSpinner spiValor313;
    private javax.swing.JSpinner spiValor314;
    private javax.swing.JTable tblProducts;
    private javax.swing.JLabel teConLimon;
    private javax.swing.JLabel txtBreakfast;
    private javax.swing.JTextField txtDataToDelete;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JLabel txtDescription1;
    private javax.swing.JTextField txtIdCostumer;
    private javax.swing.JLabel txtJuice;
    private javax.swing.JTextField txtNameCashier;
    private javax.swing.JTextField txtNameCostumer;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProducts;
    private javax.swing.JLabel txtSnack;
    private javax.swing.JTextArea txtSuggestions;
    private javax.swing.JTextField txtTableNumber;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JDialog viewOrder;
    // End of variables declaration//GEN-END:variables
}
