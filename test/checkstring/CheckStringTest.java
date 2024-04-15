/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package checkstring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mehak
 */
public class CheckStringTest {
    
    public CheckStringTest() {
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
     * Test of checkchar method, of class CheckString.
     */
    @Test
    public void testCheckcharGood() {
        System.out.println("checkchar Good  case");
        String str = "123";
        boolean expResult = true;
        boolean result = CheckString.checkchar(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckcharBoundary() {
        System.out.println("checkchar  Boundary case");
        String str = "Mehak1";
        boolean expResult = true;
        boolean result = CheckString.checkchar(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
@Test
    public void testCheckcharBad() {
        System.out.println("checkchar Bad case");
        String str = "Mehak";
        boolean expResult = false;
        boolean result = CheckString.checkchar(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
   
    
}
