/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.exceptions.SafeControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sierrajane
 */
public class SafeControlTest {
    
    public SafeControlTest() {
    }
   
    /**
     * Test of calcSurfaceArea method, of class SafeControl.
     */
        @Test
    public void testCalcSurfaceArea() throws SafeControlException {
        
        System.out.println("calcSurfaceArea");
        
        /******************
         * Test case #1
         *****************/
        System.out.println("\tTest case #1");
        double length = 3;
        double height = 8;
        double width = 5;
        SafeControl instance = new SafeControl();
        double expResult = 158;
        double result = instance.calcSurfaceArea(length, height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #2
         *****************/
        System.out.println("\tTest case #2");
        length = 7;
        height = 8;
        width = 5;
        expResult = -1;
        result = instance.calcSurfaceArea(length, height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #3
         *****************/
        System.out.println("\tTest case #3");
        length = 3;
        height = 12;
        width = 5;
        expResult = -1;
        result = instance.calcSurfaceArea(length, height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #4
         *****************/
        System.out.println("\tTest case #4");
        length = 3;
        height = 8;
        width = 6;
        expResult = -1;
        result = instance.calcSurfaceArea(length, height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #5
         *****************/
        System.out.println("\tTest case #5");
        length = 0;
        height = 8;
        width = 5;
        expResult = -1;
        result = instance.calcSurfaceArea(length, height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #6
         *****************/
        System.out.println("\tTest case #6");
        length = 3;
        height = 0;
        width = 5;
        expResult = -1;
        result = instance.calcSurfaceArea(length, height, width);
        assertEquals(expResult, result, 0.0);
        
                /******************
         * Test case #7
         *****************/
        System.out.println("\tTest case #7");
        length = 3;
        height = 8;
        width = 0;
        expResult = -1;
        result = instance.calcSurfaceArea(length, height, width);
        assertEquals(expResult, result, 0.0);
    }
    
}

