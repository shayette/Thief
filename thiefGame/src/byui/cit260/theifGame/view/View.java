/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import java.util.Scanner;

/**
 *
 * @author Shayna
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {    
}
    
public View(String message) {
    this.displayMessage = message;
}

@Override
public void display() {
        
        boolean done = false;
        do {
            //prompt for and get player's name
            String value = this.getInput();
            if (value.toUpperCase().equals("E")) // user wants to exit
                return; // exit the view
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); // exit the view when done == true
        
}

@Override
public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        boolean valid = false; //indicates if the value has been retrieved
        String value = null;
       
        
        while(!valid) { //while a valid value has not been retrieved
            
            // prompt for the value
            System.out.println("\n" + this.displayMessage);
            
            //get the value from the keyboard and trim off the blanks
            value = keyboard.nextLine();
            value = value.trim();
            
            //if the name is invalid (less than two characters in length)
            if (value.length() < 1) { //blank value entered
               System.out.println("\n*** You must ener a value *** ");
               continue;
            }
            break; //out of (exit) the repetition
        }
        return value; //return the value
    }

@Override
public boolean doAction(String value) {
    
    value = value.toUpperCase(); // converts to all upper case
    
} 
 
}


        
        
