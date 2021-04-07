
package ec.edu.espe.restaurantSalesSystem.model;

import ec.edu.espe.restaurantsalessystem.model.Bill;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group 3
 */
public class BillTest {
    
    public BillTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumSales method, of class Bill.
     */
    @Test
    public void testGetNumSales() {
        System.out.println("getNumSales");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getNumSales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setNumSales method, of class Bill.
     */
    @Test
    public void testSetNumSales() {
        System.out.println("setNumSales");
        Bill instance = new Bill();
        instance.setNumSales();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getIva method, of class Bill.
     */
    @Test
    public void testGetIva() {
        System.out.println("getIva");
        Bill instance = new Bill();
        Double expResult = null;
        Double result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setIva method, of class Bill.
     */
    @Test
    public void testSetIva() {
        System.out.println("setIva");
        Double iva = null;
        Bill instance = new Bill();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTip method, of class Bill.
     */
    @Test
    public void testGetTip() {
        System.out.println("getTip");
        Bill instance = new Bill();
        float expResult = 0.0F;
        float result = instance.getTip();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setTip method, of class Bill.
     */
    @Test
    public void testSetTip() {
        System.out.println("setTip");
        float tip = 0.0F;
        Bill instance = new Bill();
        instance.setTip(tip);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPrice method, of class Bill.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Bill instance = new Bill();
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setPrice method, of class Bill.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        Bill instance = new Bill();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setDescription method, of class Bill.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Bill instance = new Bill();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getDescription method, of class Bill.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Bill instance = new Bill();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setQuantity method, of class Bill.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Bill instance = new Bill();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getQuantity method, of class Bill.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTotal method, of class Bill.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Bill instance = new Bill();
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setTotal method, of class Bill.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        float total = 0.0F;
        Bill instance = new Bill();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
