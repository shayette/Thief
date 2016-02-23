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
public class GameMenuView {
    
    private final String MENU = "\n"
            + "\n--------------------------------------------------------------"
            + "\n| Game Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nM - Move locations"
            + "\nS - Search room"
            + "\nI - Items to steal"
            + "\nC - Items stolen"
            + "\nB - Blow open safe"
            + "\nL - Pick lock"
            + "\nK - Sneak"
            + "\nD - Dodge lasers"
            + "\nP - Security room puzzle"
            + "\nV - View map"
            + "\nH - Display Help Menu"
            + "\nA - Save and Quit"
            + "\nQ - Quit"
            + "\n--------------------------------------------------------------";
    
    public void displayGameMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display the game menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'Q'); // selection is not "Quit"
    }

    private String getInput() {
        boolean valid = false; //indicates if the value has been retrieved
        String value = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid value has not been retrieved
            
            // prompt for the value
            System.out.println("Please enter your selection below:");
            
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
            case 'M': // move locations
                this.moveLocations();
                break;
            case 'S': // search room
                this.searchRoom();
                break;
            case 'I': // list items to steal
                this.itemsToSteal();
                break;
            case 'C': // list items stolen
                this.itemsStolen();
                break;
            case 'B': // blow open safe action
                this.blowOpenSafe();
                break;
            case 'L': // pick lock
                this.pickLock();
                break;
            case 'K': // sneak
                this.sneak();
                break;
            case 'D': // dodge lasers
                this.dodgeLasers();
                break;
            case 'P': // security room puzzle
                this.securityRoomPuzzle();
                break;
            case 'V': // view map
                this.viewMap();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'A': // save and quit
                this.saveAndQuit();
                break;
            case 'Q': // quit
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
              
        }
    }

    private void moveLocations() {
        System.out.println("*** moveLocations function called ***");
    }

    private void searchRoom() {
        System.out.println("*** searchRoom function called ***");
    }

    private void itemsToSteal() {
        System.out.println("*** itemsToSteal function called ***");
    }

    private void itemsStolen() {
        System.out.println("*** itemsStolen function called ***");
    }

    private void blowOpenSafe() {
        System.out.println("*** blowOpenSafe function called ***");
    }

    private void pickLock() {
        System.out.println("*** pickLock function called ***");
    }

    private void sneak() {
        System.out.println("*** sneak function called ***");
    }

    private void dodgeLasers() {
        System.out.println("*** dodgeLasers function called ***");
    }

    private void securityRoomPuzzle() {
        System.out.println("*** securityRoomPuzzle function called ***");
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveAndQuit() {
        System.out.println("*** saveAndQuit function called ***");
    }

    
}
