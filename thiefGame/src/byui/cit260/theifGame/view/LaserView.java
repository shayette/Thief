/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.LaserControl;
import byui.cit260.thiefGame.exceptions.LaserControlException;
import java.util.Scanner;

/**
 *
 * @author Shayna
 */
public class LaserView {
    
    public static void getInput() throws LaserControlException {
        
        
        boolean valid = false;
        double baseOne = -1;
        double baseTwo = -1;
        double height = -1;
        
        // while a valid value has not been retrieved
        while (!valid) {
            
             // prompt for baseOne value
            System.out.println("Enter a number between 1 and 4 for the base one value or -1 to cancel:");
            
            // get the value entered from the keyboard
            baseOne = keyboard.readLine();
            
            
            
            
            if (baseOne == -1) { // blank value entered
                return;
            } else if (baseOne < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        valid = false;
        
        while (!valid) {
            
             // prompt for baseTwo value
            System.out.println("Enter a number between 1 and 10 for the base two value or -1 to cancel:");
            
            // get the value entered from the keyboard
            baseTwo = keyboard.readLine();
            
            
            if (baseTwo == -1) { // blank value entered
                return;
            } else if (baseTwo < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        valid = false;
            
            while (!valid) {
            
             // prompt for baseOne value
            System.out.println("Enter a number between 1 and 6 for the height value or -1 to cancel:");
            
            // get the value entered from the keyboard
            height = keyboard.readLine();
            
            
            if (height == -1) { // blank value entered
                return;
            } else if (height < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        
        double area = LaserControl.calcAreaOfLasers(baseOne, baseTwo, height);
        System.out.println("The area of the lasers is "+ area);
    }

    private static class keyboard {

        private static double readLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
 

        public keyboard() {
        }
    }
        
}
    
    

