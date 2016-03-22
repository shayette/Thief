/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thiefgame.ThiefGame;

/**
 *
 * @author Shayna
 */
public abstract class View implements ViewInterface {
    
    private String displayMessage;
    
    protected final BufferedReader keyboard = ThiefGame.getInFile();
    protected final PrintWriter console = ThiefGame.getOutFile();
    
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
        
     
        boolean valid = false; //indicates if the value has been retrieved
        String value = null;
       
        
        while(!valid) { //while a valid value has not been retrieved
            
            // prompt for the value
            System.out.println("\n" + this.displayMessage);
            
            try {
                //get the value from the keyboard and trim off the blanks
                value = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();
            
            //if the name is invalid (less than two characters in length)
            if (value.length() < 1) { //blank value entered
               ErrorView.display(this.getClass().getName(),
                                "You must enter a value.");
               continue;
            }
            break; //out of (exit) the repetition
        }
        return value; //return the value
    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); // converts to all upper case

       return true;
    } 
    
    }
 


        
        
