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
import javax.swing.JTextArea;
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
public class printreceipt {
   
     
    public printreceipt() {
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
    FeeReportgenrator frame = new FeeReportgenrator();
    
    
    @Test
    public void testMain() throws InterruptedException {
        System.out.println("Print Receipt Test");
        String[] args = null;
        
        frame.setVisible(true);
        JTextField roll = frame.getTextField_10();
        JTextField name = frame. getTextField();
        JTextField email = frame.getTextField_1();
        JTextField course = frame.getTextField_2();
        JTextField fees = frame.getTextField_3();
        JTextField paid = frame.getTextField_4();
        JTextField city = frame.getTextField_6();
        JTextField state = frame.getTextField_7();
        JTextField country = frame.getTextField_8();
        JTextField contact = frame.getTextField_9();
        JTextArea address= frame.getTextArea();
        JButton duefees= frame.getjButton2();
        JButton print= frame.getBtnPrint() ;
        
        
        
        roll.setText("1");
         sleep(1000);
        
        name.setText("komal");
         sleep(1000);
        email.setText("komal@gmail.com");
         sleep(1000);
         
        course.setText("BE Computer");
         sleep(1000);
         
        fees.setText("80000");
         sleep(1000);
         
        paid.setText("70000");
         sleep(1000);
         
        duefees.doClick(1000);
        
        address.setText("Rahulnagar ,Kothrud");
         sleep(1000);
         
        city.setText("Pune");
         sleep(1000);
         
        state.setText("Maharashtra");
         sleep(1000);
         
        country.setText("India");
         sleep(1000);
         
        contact.setText("7350789613");
         sleep(1000);
         
          print.doClick(1000);
        
        System.out.println("Print Receipt Test Successful");
        frame.dispose();  
   }  
    
}
