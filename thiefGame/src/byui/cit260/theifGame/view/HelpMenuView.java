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
public class HelpMenuView {
    
    private final String MENU = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Help Menu                                         |"
            + "\n-----------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How do I move?"
            + "\nS - How do I save?"
            + "\nH - How many moves do I have?"
            + "\nI - How do I steal items?"
            + "\nE - Exit"
            + "\n-----------------------------------------------------";
    
    public void displayHelpMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); // display the help menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // a selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; //indicates if the value has been retrieved
        String value = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid value has not been retrieved
            
            // prompt for the value
            System.out.println("Please enter your value below:");
            
            //get the value from the keyboard and trim off the blanks
            value = keyboard.nextLine();
            value = value.trim();
            
            //if the name is invalid (less than two characters in length)
            if (value.length() < 1) { //blank value entered
               System.out.println("Invalid value - the value must not be blank");
            }
            break; //out of (exit) the repetition
        }
        return value; //return the value
    }

    private void doAction(char selection) {
        switch (selection) {
            case 'G': // What is the goal of the game?
                this.goalOfGame();
                break;
            case 'M': // How do I move?
                this.howToMove();
                break;
            case 'S': //How do I save?
                this.howToSave();
                break;
            case 'H': // How many moves do I have?
                this.howManyMoves();
                break;
            case 'I': // How do I steal items?
                this.howToStealItems();
                break;
            case 'E': // Exit the help menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
}
    }

    private void goalOfGame() {
        System.out.println("Your job is to steal as many valuables as you can before the alarm sounds or security catches you.");
    }

    private void howToMove() {
        System.out.println("*** howToMove function called ***");
    }

    private void howToSave() {
        System.out.println("Go to the Main Menu and enter 'S' to save current game.");
    }

    private void howManyMoves() {
        System.out.println("You have 50 total moves to complete the game.");
    }

    private void howToStealItems() {
        System.out.println("After searching the room, if there is a valuable item found, you can use a move to steal it.");
    }
    }
  
