/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.LoadingDockControl;
import byui.cit260.thiefGame.exceptions.LoadingDockControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shayna
 */
public class LoadingDockView {
    
    public static void getInput() throws LoadingDockControlException {
        
        
        boolean valid = false;
        double height = -1;
        double width = -1;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // while a valid value has not been retrieved
        while (!valid) {
            
             // prompt for height value
            System.out.println("Enter a number between 1 and 4 for the height value or -1 to cancel:");
            
            // get the value entered from the keyboard
             try {
                height = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
                Logger.getLogger(LaserView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
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
            System.out.println("Enter a number between 1 and 15 for the width value or -1 to cancel:");
            
            // get the value entered from the keyboard
             try {
                width = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
                Logger.getLogger(LaserView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            if (width == -1) { // blank value entered
                return;
            } else if (width < 1) {
                System.out.println("\n*** Invalid value *** Try again");
            } else 
                valid = true; 
        }
        
        double perimeter = LoadingDockControl.calcBoxesPerimeter(height, width);
        System.out.println("The perimeter of the boxes in the loading dock is "+ perimeter);
    } 
}