/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;

import java.awt.Event;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class AdminLoginTest {
    
    public AdminLoginTest() {
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
     * Test of main method, of class AdminLogin.
     */
     AdminLogin frame;
    @Test
    public void testMain() {
        try {
           
            System.out.println("Admin Login Test");
            String[] args = null;
            //AdminLogin.main(args);
            frame = new AdminLogin();
            frame.setVisible(true);
            JTextField name = frame.getTextField();
            name.setText("admin");
            sleep(2000);
            JPasswordField pw = frame.getPasswordField();
            pw.setText("admin123");
            sleep(2000);
            JButton jb = frame.getBtnLogin();
            jb.doClick(1000);
            System.out.println("Admin Login Test with valid entries Successful");
            frame.dispose();
        
        } catch (InterruptedException ex) {
           System.out.println(ex);
        }
    }
    @Test
    public void testMainInvalidLogin() {
        try {
            System.out.println("Admin Login Test with invalid entries");
            String[] args = null;
            frame = new AdminLogin();
            frame.setVisible(true);
            JTextField name = frame.getTextField();
            JPasswordField pw = frame.getPasswordField();
            JButton jb = frame.getBtnLogin();
            name.setText("admin");
            sleep(2000);
            pw.setText("admin@123");
            sleep(2000);
            jb.doClick(1000);
            System.out.println("Admin Login Test with invalid entries Successful");
             
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
    
    
}
