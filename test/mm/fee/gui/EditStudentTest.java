/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import mm.fee.gui.EditStudent;
/**
 *
 * @author HP
 */
public class EditStudentTest {
    EditStudent frame = new EditStudent();
    JButton  load= frame.getBtnLoadRecord();
    JButton  update= frame.getjButton2();
    JButton back = frame.getjButton3();
    JTextField name = frame.getTextField();
    JTextField email = frame.getTextField_1();
    JTextField course = frame.getTextField_2();
    JTextField fees = frame.getTextField_3();
    JTextField paid = frame.getTextField_4();
    JTextField due = frame.getTextField_5();
    JTextField city = frame.getTextField_6();
    JTextField state = frame.getTextField_7();
    JTextField country = frame.getTextField_8();
    JTextField contactno = frame.getTextField_9();
    JTextArea address = frame.getTextArea();
    JTextField roll = frame.getTextField_10();
    
    public EditStudentTest() {
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
     * Test of main method, of class EditStudent.
     */
    @Test
    public void testMain() throws InterruptedException {
       System.out.println("Test for Edit Student With Valid Data");
        frame.setVisible(true);
        roll.setText("5");
        load.doClick(1000);
        sleep(2000);
        assertEquals("Dummy",name.getText());
        assertEquals("dummy@yahoo.com",email.getText());
        assertEquals("BE Comp",course.getText());
        assertEquals("10000",fees.getText());
        assertEquals("5000",paid.getText());
        assertEquals("5000",due.getText());
        assertEquals("shree soci,Hadapsar",address.getText());
        assertEquals("Maharashtra",state.getText());
        assertEquals("India",country.getText());
        assertEquals("7845129631",contactno.getText());
       
        update.doClick(1000);
        //sleep(2000);
        System.out.println("Test for Edit Student With Valid Data Successful");
    }
     @Test
    public void testInvalidMain() throws InterruptedException {
       System.out.println("Test for Edit Student With InValid Data");
        frame.setVisible(true);
        roll.setText("5");
        load.doClick(1000);
        sleep(2000);
        
        email.setText("p@g");
        update.doClick(1000);
        //sleep(2000);
        System.out.println("Test for Edit Student With InValid Data Successful");
    }
}
