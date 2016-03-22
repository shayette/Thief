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
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
                  + "\n--------------------------"
                  + "\n| Main Menu              |"
                  + "\n--------------------------"
                  + "\nG -- Start new game"
                  + "\nL -- Load a game"
                  + "\nS -- Save game"
                  + "\nH -- Get help"
                  + "\nE -- Exit"
                  + "\n--------------------------");
    }

    
    private void startNewGame() {
                //create a new game
            GameControl.createNewGame(ThiefGame.getPlayer());
                    
                //display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        
            //System.out.println("*** startNewGame function called ***");
        }
         
        private void startExistingGame() {
            
            // prompt for and get the name of the file to save the game in
            System.out.println("\n\nEnter the file path for file where the game "
                                + "is to be saved.");
            
            String filePath = this.getInput();
            
            try {
                // start a saved game
                GameControl.getSavedGame(filePath);
            } catch (Exception e) {
                ErrorView.display("MainMenuView", e.getMessage());
            }
            
            // display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        }
        
        private void saveGame() {
            // prompt for and get the name of the file to save the game in
            System.out.println("\n\nEnter the file path for the file where the game"
                                + "is to be saved.");
            String filePath = this.getInput();
            
            try {
                // save the game to the specified file
                GameControl.saveGame(ThiefGame.getCurrentGame(), filePath);
            } catch (Exception e) {
                ErrorView.display("MainMenuView", e.getMessage());
            }
        }
        
        private void displayHelpMenu() {
            HelpMenuView helpMenu = new HelpMenuView();
            helpMenu.display();
        }

    @Override
     public boolean doAction(String value) {
        char selection = value.toUpperCase().charAt(0);
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
                return true;
            default:
                ErrorView.display("MainMenuView",
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
}

    