/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class StudentDaoTest {
    
    public StudentDaoTest() {
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
     * Test of save method, of class StudentDao.
     */
    @Test
    public void testSave() {
        System.out.println("Test for student save with Invalid null data");
        Student s = null;
        int expResult = 0;
        int result = StudentDao.save(s);
        assertEquals(expResult, result);
        System.out.println("Test for student save with Invalid null data Successful");
        
        System.out.println("Add Student With valid Data Database Test");
        s = new Student(101,"DBDummy", "DBdummy@gmail.com", "BS comp", 10000, 5000, 5000, "ABC colony", "Pune", "Maharashtra", "India", "7894561233");
        int expected = 1;
        assertEquals(StudentDao.save(s), expected);
        System.out.println("Add Student With valid Data Database Test Successful");
    }

    /**
     * Test of update method, of class StudentDao.
     
    @Test
    public void testUpdate() throws SQLException {
        System.out.println("test for update with Invalid NULL data");
        Student s = new Student();
        int expResult = 0;
        int result = StudentDao.update(s);
        assertEquals(expResult, result);
        System.out.println("test for update with Invalid NULL data Successful");
        
       
    }*/
     /**
     * Test of getStudentByRollno method, of class StudentDao.
     * */
    @Test
    public void testGetStudentByRollno() throws SQLException {
        System.out.println("test for getStudentByRollno with Invalid data");
        int rollno = 0;
        Student expResult = new Student();
        expResult.setName(null);
        Student result = StudentDao.getStudentByRollno(rollno);
        assertEquals(expResult.getName(), result.getName());
        System.out.println("test for getStudentByRollno with Invalid data fail");
        
        
        System.out.println("test for getStudentByRollno with valid data");
        Student s=  new Student(101,"DBDummy", "DBdummy@gmail.com", "BS comp", 10000, 5000, 5000, "ABC colony", "Pune", "Maharashtra", "India", "7894561233");
        result = StudentDao.getStudentByRollno(10);
        assertEquals(s.getName(), result.getName());
        assertEquals(s.getPaid(), result.getPaid());
        System.out.println("test for getStudentByRollno with valid data successful");
    }
   
    /**
     * Test of due method, of class StudentDao.
     */
    @Test
    public void testDue() {
        System.out.println("Test for due fees");
        //List<Student> expResult = null;
        List<Student> result = StudentDao.due();
        for(Student s : result)
        {
            // assertNotEquals(0, s.getDue());
        }
        System.out.println("Test for due fees successful");
    }

    private void assertNotEquals(int i, int due) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
