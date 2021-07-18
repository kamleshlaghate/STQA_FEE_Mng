/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;

import static java.lang.Thread.sleep;
import java.util.List;
import mm.fee.gui.AddStudent;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import mm.fee.gui.AddStudent;
import mm.fee.database.*;
/**
 *
 * @author HP
 */
public class AddStudentTest {
    
    public AddStudentTest() {
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
     * Test of main method, of class AddStudent.
     */
    AddStudent frame = new AddStudent();
    JButton  duefee= frame.getDueFee();
    JButton  add= frame.getjButton1();
    JButton back = frame.getjButton2();
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
    
    
     @Test
   public void testMain() throws InterruptedException 
    {
        System.out.println("Test for Add Stdent With Valid Data");
        frame.setVisible(true);
        sleep(2000);
        name.setText("Dummy");
        sleep(2000);
        email.setText("dummy@yahoo.com");
        sleep(2000);
        course.setText("BE Comp");
        sleep(2000);
        fees.setText("10000");
        sleep(2000);
        paid.setText("5000");
        sleep(2000);
        due.setText("5000");
        sleep(2000);
        address.setText("shree soci,Hadapsar");
        sleep(2000);
        city.setText("Pune");
        sleep(2000);
        state.setText("Maharashtra");
        sleep(2000);
        country.setText("India");
        sleep(2000);
        contactno.setText("7845129631");
        sleep(2000);
        add.doClick(1000);
        //sleep(2000);
        System.out.println("Test for Add Stdent With Valid Data Successful");
        
    }
    
    @Test
    public void testMainInvalid() throws InterruptedException 
    {
        System.out.println("Test for Add Stdent With InValid Data");
        frame.setVisible(true);
        sleep(2000);
        name.setText("");
        sleep(2000);
        add.doClick(1000);
        sleep(2000);
        
        name.setText("dummy");
        sleep(2000);
        email.setText("");
        sleep(2000);
        add.doClick(1000);
        sleep(2000);
        
        email.setText("dummy@yahoo.com");
        sleep(2000);
        course.setText("");
        sleep(2000);
        add.doClick(1000);
        sleep(2000);
        
        course.setText("BE Comp");
        sleep(2000);
        fees.setText("");
        sleep(2000);
        add.doClick(1000);
        sleep(2000);
        
        fees.setText("10000");
        sleep(2000);
        //sleep(2000);
        
        paid.setText("5000");
        sleep(2000);
        
        
        due.setText("2000");
        sleep(2000);
        address.setText("shree soci,Hadapsar");
        sleep(2000);
        city.setText("Pune");
        sleep(2000);
        state.setText("Maharashtra");
        sleep(2000);
        country.setText("India");
        sleep(2000);
        contactno.setText("7845129631");
        sleep(2000);
        add.doClick(1000);
        //sleep(2000);
        System.out.println("Test for Add Stdent With InValid Data Successful");
        
    }
    @Test
    public void testMainDueFees() throws InterruptedException 
    {
        System.out.println("Test for Add Stdent With Valid Due fees");
        frame.setVisible(true);
        sleep(2000);
        name.setText("Dummy");
        sleep(2000);
        email.setText("dummy@yahoo.com");
        sleep(2000);
        course.setText("BE Comp");
        sleep(2000);
        fees.setText("10000");
        sleep(2000);
        paid.setText("5000");
        sleep(2000);
        
        duefee.doClick();
        sleep(2000);
        int totalFees = 10000;
        int paidfees = 5000;
        int duefee1 = Integer.parseInt(due.getText());
        assertEquals(duefee1, totalFees-paidfees);
        address.setText("shree soci,Hadapsar");
        sleep(2000);
        city.setText("Pune");
        sleep(2000);
        state.setText("Maharashtra");
        sleep(2000);
        country.setText("India");
        sleep(2000);
        contactno.setText("7845129631");
        sleep(2000);
        add.doClick(1000);
        //sleep(2000);
        System.out.println("Test for Add Student With Valid Due Fees Successful");
        
    }
    @Test 
    public void DatabaseTest()
    {
        System.out.println("Add Student With valid Data Database Test");
        Student s = new Student(101,"DBDummy", "DBdummy@gmail.com", "BS comp", 10000, 5000, 5000, "ABC colony", "Pune", "Maharashtra", "India", "7894561233");
        int expected = 1;
        assertEquals(StudentDao.save(s), expected);
        System.out.println("Add Student With valid Data Database Test Successful");
    }
    
}
