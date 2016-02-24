/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.LaserControl;
import java.util.Scanner;

/**
 *
 * @author Shayna
 */
public class LaserView {
    
    public static void getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        int baseOne = -1;
        int baseTwo = -1;
        int height = -1;
        
        // while a valid value has not been retrieved
        while (!valid) {
            
             // prompt for baseOne value
            System.out.println("Enter the base one value or -1 to cancel:");
            
            // get the value entered from the keyboard
            baseOne = keyboard.nextInt();
            
            
            if (baseOne == -1) { // blank value entered
                return;
            } else if (baseOne < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        valid = false;
        
        while (!valid) {
            
             // prompt for baseOne value
            System.out.println("Enter the base two value or -1 to cancel:");
            
            // get the value entered from the keyboard
            baseTwo = keyboard.nextInt();
            
            
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
            System.out.println("Enter the height value or -1 to cancel:");
            
            // get the value entered from the keyboard
            height = keyboard.nextInt();
            
            
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
        
    }
    
    
    

