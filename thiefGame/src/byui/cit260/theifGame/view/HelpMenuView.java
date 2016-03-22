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
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Help Menu                                         |"
            + "\n-----------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How do I move?"
            + "\nS - How do I save?"
            + "\nH - How many moves do I have?"
            + "\nI - How do I steal items?"
            + "\nE - Exit"
            + "\n-----------------------------------------------------");
    }
    
    @Override
     public boolean doAction(String value) {
        char selection = value.toUpperCase().charAt(0);
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
                return true;
            default:
                ErrorView.display("HelpMenuView",
                        "\n*** Invalid Selection *** Try again");
                break;
    }
        return false;
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
  
