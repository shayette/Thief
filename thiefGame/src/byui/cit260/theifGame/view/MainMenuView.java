/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.GameControl;
import java.util.Scanner;
import thiefgame.ThiefGame;

/**
 *
 * @author sierrajane
 */
public class MainMenuView {
    
    private final String MENU = "\n"
                  + "\n--------------------------"
                  + "\n| Main Menu              |"
                  + "\n--------------------------"
                  + "\nG -- Start new game"
                  + "\nL -- Load a game"
                  + "\nS -- Save game"
                  + "\nH -- Get help"
                  + "\nE -- Exit"
                  + "\n--------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
            
        System.out.println(MENU); //display the main menu
        
        String input = this.getInput(); //get user's selection
        selection = input.charAt(0); //get first character of string
        
        this.doAction(selection); //do action based on selection
    }
        while (selection != 'E'); // an selection is not Exit
    }

        private void startNewGame() {
                //create a new game
            GameControl.createNewGame(ThiefGame.getPlayer());
                    
                //display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        
            System.out.println("*** startNewGame function called ***");
        }
         
        private void startExistingGame() {
            System.out.println("*** startExistingGame function called ***");
        }
        
        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }
        
        private void displayHelpMenu() {
            System.out.println("*** displayHelpMenu function called ***");
        }

    private void doAction(char selection) {
        
        switch (selection) {
            case 'G': //create and start new game
                this.startNewGame();
                break;
            case 'L': //get and start existing game
                this.startExistingGame();
                break;
            case 'S': //save the game
                this.saveGame();
                break;
            case 'H': //display the help menu
                this.displayHelpMenu();
                break;
            case 'E': //Exit the program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }

    public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersSelection = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter a selection below:");
            
            //get the selection from the keyboard and trim off the blanks
            playersSelection = keyboard.nextLine();
            playersSelection = playersSelection.trim();
            
            //if the name is invalid (less than two characters in length)
            if (playersSelection.length() > 1) {
               System.out.println("Invalid selection - only one letter is necessay");
            }
            break; //out of (exit) the repetition
        }
        return playersSelection; //return the name
    }

    public class GameMenuView {
        
        void displayMenu() {
            System.out.println("\n*** displayMenu stub function called ***");
        }
    }

}