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
            System.out.println("*** startExistingGame function called ***");
        }
        
        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }
        
        private void displayHelpMenu() {
            HelpMenuView helpMenu = new HelpMenuView();
            helpMenu.display();
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

    