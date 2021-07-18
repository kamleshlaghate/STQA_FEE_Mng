/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;


import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JPanel;
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
 * @author hp
 */
public class Integration {
    
    public Integration() {
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
    AccountantSection frame1 = new AccountantSection();
     AccountantSection frame2 = new AccountantSection();
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
      
        
        System.out.println("View Accountant Test");
        JButton jb1=frame1.getBtnBack();
        sleep(1000);
        jb1.doClick(1000);
   
        System.out.println("View Accountant Test Successful");
         
          
          System.out.println("Logout Test");
        JButton jb2=frame2.getBtnBack2();
        sleep(2000);
        jb2.doClick(1000);
        
         sleep(3000);
          System.out.println("Logout Test Successful");
        
          
         frame1.dispose();
        frame2.dispose();
    }
    
    
}
