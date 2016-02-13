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
        
        double baseOne = 4;
        double baseTwo = 10;
        double height = 6;
        LaserControl instance = new LaserControl();
        double expResult = 42;
        double result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        /********************
         * Test case #2
         *******************/
        System.out.println("\tTest case #2");
        
        baseOne = 12;
        baseTwo = 10;
        height = 6;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #3
         *******************/
        System.out.println("\tTest case #3");
        
        baseOne = 4;
        baseTwo = 7;
        height = 6;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #4
         *******************/
        System.out.println("\tTest case #4");
        
        baseOne = 4;
        baseTwo = 10;
        height = 2;
        
        expResult = -1;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
        
        /********************
         * Test case #5
         *******************/
        System.out.println("\tTest case #5");
        
        baseOne = 4;
        baseTwo = 10;
        height = 6;
        
        expResult = 42;
        result = instance.calcAreaOfLasers(baseOne, baseTwo, height);
        assertEquals(expResult, result, 0.0);
    }
    
}
