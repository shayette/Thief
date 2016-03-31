/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.SafeControl;
import byui.cit260.thiefGame.exceptions.SafeControlException;

/**
 *
 * @author Shayna
 */
public class SafeView {
    
    public static void getInput() throws SafeControlException {
        
        
        boolean valid = false;
        double length = -1;
        double height = -1;
        double width = -1;
        
        // while a valid value has not been retrieved
        while (!valid) {
            
             // prompt for length value
            System.out.println("Enter a number between 1 and 4 for the length value or -1 to cancel:");
            
            // get the value entered from the keyboard
            length = keyboard.readLine();
            
            
            
            
            if (width == -1) { // blank value entered
                return;
            } else if (width < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        valid = false;
        
        while (!valid) {
            
             // prompt for height value
            System.out.println("Enter a number between 1 and 9 for the height value or -1 to cancel:");
            
            // get the value entered from the keyboard
            height = keyboard.readLine();
            
            
            if (height == -1) { // blank value entered
                return;
            } else if (height < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        valid = false;
            
            while (!valid) {
            
             // prompt for width value
            System.out.println("Enter a number between 1 and 6 for the width value or -1 to cancel:");
            
            // get the value entered from the keyboard
            width = keyboard.readLine();
            
            
            if (width == -1) { // blank value entered
                return;
            } else if (width < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        
        double surfaceArea = SafeControl.calcSurfaceArea(length, height, width);
        System.out.println("The surface area is "+ surfaceArea);
    }

    private static class keyboard {

        private static double readLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
 

        public keyboard() {
        }
    }
        
}