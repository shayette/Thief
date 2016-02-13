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
public class LoadingDockControlTest {
    
    public LoadingDockControlTest() {
    }

    /**
     * Test of calcBoxesPerimeter method, of class LoadingDockControl.
     */
    @Test
    public void testCalcBoxesPerimeter() {
        
        System.out.println("calcBoxesPerimeter");
        
        /******************
         * Test case #1
         *****************/
        System.out.println("\tTest case #1");
        double height = 4;
        double width = 15;
        LoadingDockControl instance = new LoadingDockControl();
        double expResult = 38;
        double result = instance.calcBoxesPerimeter(height, width);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
        
        /******************
         * Test case #2
         *****************/
        System.out.println("\tTest case #2");
        height = 2;
        width = 15;
        expResult = -1;
        result = instance.calcBoxesPerimeter(height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #3
         *****************/
        System.out.println("\tTest case #3");
        height = 4;
        width = 20;
        expResult = -1;
        result = instance.calcBoxesPerimeter(height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #4
         *****************/
        System.out.println("\tTest case #4");
        height = 3;
        width = 10;
        expResult = -1;
        result = instance.calcBoxesPerimeter(height, width);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #5
         *****************/
        System.out.println("\tTest case #5");
        height = 4;
        width = 15;
        expResult = 38;
        result = instance.calcBoxesPerimeter(height, width);
        assertEquals(expResult, result, 0.0);
    }
    
}
