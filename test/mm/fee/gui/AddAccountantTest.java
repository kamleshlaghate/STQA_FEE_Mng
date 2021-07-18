/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import mm.fee.database.*;
/**
 *
 * @author HP
 */
public class AddAccountantTest {
    
    public AddAccountantTest() {
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

     AddAccountant frame = new AddAccountant();
     AccountantDao acc = new AccountantDao();
     
    /**
     * Test of main method, of class AddAccountant.
     */
    @Test
    public void testMainWithValiddata() throws InterruptedException 
    {
        System.out.println("Add Accountant With valid Data");
        String[] args = null;
        //AddAccountant.main(args);
        AddAccountant frame = new AddAccountant();
        frame.setVisible(true);
        JTextField name,email,contactno;
        JPasswordField pw;
        JButton add = frame.getBtnAddAccountant();
        pw=frame.getPasswordField();
        name=frame.getTextField();
        email=frame.getTextField_1();
        contactno=frame.getTextField_2();
        sleep(2000);
        name.setText("dummy");
        sleep(2000);
        pw.setText("dummy123");
        sleep(2000);
        email.setText("dummy@gmail.com");
        sleep(2000);
        contactno.setText("7894561231");
        add.doClick(1000);
        System.out.println("Add Accountant With valid Data Successful");
        
        
    }
    @Test 
    public void DatabaseTest()
    {
        System.out.println("Add Accountant With valid Data Database Test");
        Accountant a = new Accountant("DBdummy", "dummy123", "dummy@gmail.com", "7894561231");
        int expected = 1;
        assertEquals(AccountantDao.save(a), expected);
        System.out.println("Add Accountant With valid Data Database Test Sccessful");
    }
    
     @Test
    public void testMainWithInvalidNULLData() throws InterruptedException 
    {
        
        String[] args = null;
       
        frame.setVisible(true);
        JTextField name,email,contactno;
        JPasswordField pw;
        JButton add = frame.getBtnAddAccountant();
        pw=frame.getPasswordField();
        name=frame.getTextField();
        email=frame.getTextField_1();
        contactno=frame.getTextField_2();
        System.out.println("Add Accountant With Invalid Null name");
        sleep(2000);
        name.setText("");
        sleep(2000);
        pw.setText("dummy123");
        sleep(2000);
        email.setText("dummy@gmail.com");
        sleep(2000);
        contactno.setText("7894561231");
        add.doClick(1000);
        System.out.println("Add Accountant With Invalid Null name Successful");
        frame.dispose();
        
        frame.setVisible(true);
        System.out.println("Add Accountant With Invalid Null password");
        name.setText("");
        pw.setText("");
        email.setText("");
        contactno.setText("");
        sleep(2000);
        name.setText("dummy");
        sleep(2000);
        pw.setText("");
        sleep(2000);
        email.setText("dummy@gmail.com");
        sleep(2000);
        contactno.setText("7894561231");
        add.doClick(1000);
        System.out.println("Add Accountant With Invalid Null password Successful");
        frame.dispose();
        
        frame.setVisible(true);
        System.out.println("Add Accountant With Invalid Null Email adddress");
         name.setText("");
        pw.setText("");
        email.setText("");
        contactno.setText("");
        sleep(2000);
        name.setText("dummy");
        sleep(2000);
        pw.setText("dumyy122");
        sleep(2000);
        email.setText("");
        sleep(2000);
        contactno.setText("7894561231");
        add.doClick(1000);
        System.out.println("Add Accountant With Invalid Null Email adddress Successful");
        frame.dispose();
        
        frame.setVisible(true);
        System.out.println("Add Accountant With Invalid Null Contact No adddress");
         name.setText("");
        pw.setText("");
        email.setText("");
        contactno.setText("");
        sleep(2000);
        name.setText("dummy");
        sleep(2000);
        pw.setText("dumyy122");
        sleep(2000);
        email.setText("dummy@gmail.com");
        sleep(2000);
        contactno.setText("");
        add.doClick(1000);
        System.out.println("Add Accountant With Invalid Null Contact No. adddress Successful");
        frame.dispose();
    }
    @Test
    public void testMainWithInvalidData() throws InterruptedException 
    {
        
        String[] args = null;
        JTextField name,email,contactno;
        JPasswordField pw;
        JButton add = frame.getBtnAddAccountant();
        pw=frame.getPasswordField();
        name=frame.getTextField();
        email=frame.getTextField_1();
        contactno=frame.getTextField_2();
        
        
        frame.setVisible(true);
        System.out.println("Add Accountant With Invalid password Length");
        name.setText("");
        pw.setText("");
        email.setText("");
        contactno.setText("");
        sleep(2000);
        name.setText("dummy");
        sleep(2000);
        pw.setText("dummy123456789012");
        sleep(2000);
        email.setText("dummy@gmail.com");
        sleep(2000);
        contactno.setText("7894561231");
        add.doClick(1000);
        System.out.println("Add Accountant With Invalid Invalid password Length Successful");
        frame.dispose();
        
        frame.setVisible(true);
        System.out.println("Add Accountant With Invalid Email adddress");
         name.setText("");
        pw.setText("");
        email.setText("");
        contactno.setText("");
        sleep(2000);
        name.setText("dummy");
        sleep(2000);
        pw.setText("dumyy123");
        sleep(2000);
        email.setText("dfsf@g");
        sleep(2000);
        contactno.setText("7894561231");
        add.doClick(1000);
        System.out.println("Add Accountant With Invalid Email adddress Successful");
        frame.dispose();
        
        frame.setVisible(true);
        System.out.println("Add Accountant With Invalid Contact No ");
         name.setText("");
        pw.setText("");
        email.setText("");
        contactno.setText("");
        sleep(2000);
        name.setText("dummy");
        sleep(2000);
        pw.setText("dumyy122");
        sleep(2000);
        email.setText("dummy@gmail.com");
        sleep(2000);
        contactno.setText("asfg1452hfdj141");
        add.doClick(1000);
        System.out.println("Add Accountant With Invalid contact no. Successful");
        frame.dispose();
    }
    
}
