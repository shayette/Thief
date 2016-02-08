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
        
        /****************
         * Test case #1
         ***************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double height = 4;
        double width = 15;
        LoadingDockControl instance = new LoadingDockControl();
        double expResult = 38;
        double result = instance.calcBoxesPerimeter(height, width);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
}
