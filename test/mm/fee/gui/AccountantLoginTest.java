/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
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
public class AccountantLoginTest {
    
    public AccountantLoginTest() {
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
     * Test of main method, of class AccountantLogin.
     */
    AccountantLogin frame = new AccountantLogin();
    @Test
    public void testMain() throws InterruptedException {
        System.out.println("Accountant Login Test with Valid entries");
        String[] args = null;
        
        frame.setVisible(true);
        JTextField name = frame.getTextField();
        JPasswordField pw = frame.getPasswordField();
        JButton jb = frame.getBtnLogin();
        sleep(3000);
        name.setText("kamlesh");
         sleep(3000);
        pw.setText("kamlesh123");
         sleep(3000);
        jb.doClick(1000);
        System.out.println("Accountant Login Test with Valid entries Successful");
        frame.dispose();
    }
    
    @Test
    public void testMainInvalid() throws InterruptedException {
        System.out.println("Accountant Login Test with InValid entries");
        String[] args = null;
        //AccountantLogin frame = new AccountantLogin();
        frame.setVisible(true);
        JTextField name = frame.getTextField();
        JPasswordField pw = frame.getPasswordField();
        JButton jb = frame.getBtnLogin();
        sleep(3000);
        name.setText("kamlesh");
        sleep(3000);
        pw.setText("kamleshlaghate123");
        sleep(3000);
        jb.doClick(1000);
        System.out.println("Accountant Login Test with Invalid entries Successful");
        frame.dispose();
    }
}
