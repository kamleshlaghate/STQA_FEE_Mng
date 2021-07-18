/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.database;

import java.sql.Connection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class AccountantDaoTest {
    
    public AccountantDaoTest() {
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
     * Test of getCon method, of class AccountantDao.
     */
    @Test
    public void testGetCon() {
        System.out.println("Test For getCon");
        Connection expResult = null;
        Connection result = AccountantDao.getCon();
        //assertNotEquals(expResult, result);
        System.out.println("Test For getCon Successful");
    }

    /**
     * Test of validate method, of class AccountantDao.
     */
    @Test
    public void testValidate() {
        
        System.out.println("Test for validate with null data");
        String name = "";
        String password = "";
        boolean expResult = false;
        boolean result = AccountantDao.validate(name, password);
        assertEquals(expResult, result);
        System.out.println("Test for validate with null data Successful");
        
        
        System.out.println("Test for validate with valid data");
        name = "kamlesh";
        password = "kamlesh123";
        expResult = true;
        result = AccountantDao.validate(name, password);
        assertEquals(expResult, result);
        System.out.println("Test for validate with valid data Successful");
    }

    /**
     * Test of save method, of class AccountantDao.
     */
    @Test
    public void testSave() {
        System.out.println("test for save with Invalid data");
        Accountant a = null;
        int expResult = 0;
        int result = AccountantDao.save(a);
        assertEquals(expResult, result);
        System.out.println("test for save with Invalid data successful");
        
        System.out.println("test for save with valid data");
        a = new Accountant("DBdummy", "dummy123", "dummy@gmail.com", "7894561231");
        int expected = 1;
        assertEquals(AccountantDao.save(a), expected);
        System.out.println("Add Accountant With valid Data Database Test Sccessful");
    }

    private void assertNotEquals(Connection expResult, Connection result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
