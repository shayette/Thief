/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shayna
 */
public class LaserControlTest {
    
    public LaserControlTest() {
    }

    /**
     * Test of calcAreaOfLasers method, of class LaserControl.
     */
    @Test
    public void testCalcAreaOfLasers() {
        System.out.println("calcAreaOfLasers");
        
        /********************
         * Test case #1
         *******************/
        System.out.println("\tTest case #1");
        
        int baseOne = 4;
        int baseTwo = 10;
        int height = 6;
        LaserControl instance = new LaserControl();
        double expResult = 42;
        double result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        /********************
         * Test case #2
         *******************/
        System.out.println("\tTest case #2");
        
        baseOne = -1;
        baseTwo = 10;
        height = 6;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #3
         *******************/
        System.out.println("\tTest case #3");
        
        baseOne = 7;
        baseTwo = 10;
        height = 6;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #4
         *******************/
        System.out.println("\tTest case #4");
        
        baseOne = 4;
        baseTwo = -1;
        height = 6;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #5
         *******************/
        System.out.println("\tTest case #5");
        
        baseOne = 4;
        baseTwo = 15;
        height = 6;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #6
         *******************/
        System.out.println("\tTest case #6");
        
        baseOne = 4;
        baseTwo = 10;
        height = -1;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #7
         *******************/
        System.out.println("\tTest case #7");
        
        baseOne = 4;
        baseTwo = 10;
        height = 12;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #8
         *******************/
        System.out.println("\tTest case #8");
        
        baseOne = 1;
        baseTwo = 10;
        height = 6;
        
        expResult = 33;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #9
         *******************/
        System.out.println("\tTest case #9");
        
        baseOne = 4;
        baseTwo = 1;
        height = 6;
        
        expResult = 15;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #10
         *******************/
        System.out.println("\tTest case #10");
        
        baseOne = 4;
        baseTwo = 10;
        height = 1;
        
        expResult = 7;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
    }
    
}
