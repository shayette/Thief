/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.ProgramControl;
import byui.cit260.thiefGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Shayna
 */
public class StartProgramView {

    private Object mainMenuView;
    
    public StartProgramView(){
    }
    
    public void startProgram(){
    
            //Display the banner screen
            this.displayBanner();
            
            //prompt the palyer to enter their name Retrieve the name of the player
            String playersName = this.getPlayersName();
            
            //Create and save the player object
            Player player = ProgramControl.createPlayer(playersName);
            
            // Display a personalized welcome message
            this.displayWelcomeMessage(player);
            
            // Display the Main Menu
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("\n\n***************************************************************");
                
        System.out.println("*                                                             *"
                + "\n* You are a master thief with your eye on the local museum    *"
                + "\n* as your last, big score. This is no small task. The museum  *"
                + "\n* is two stories with numerous different rooms and hidden     *"
                + "\n* walkways. Your job is to steal as many valuables as you     *"
                + "\n* can before the alarm sounds or security catches you.        *");

        System.out.println("*                                                             *"
                + "\n* The game starts with you in the van getting ready to go     *"
                + "\n* through the loading dock of the museum. Your job is to      *"
                + "\n* safely navigate the museum, steal the items and escape      *"
                + "\n* in your van before the cops arrive.                         *");

        System.out.println("*                                                             *"
                + "\n* You have 50 moves to get out before getting caught.          *"
                + "\n*                                                             *"
                + "\n***************************************************************"); 

    }

    public String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than two characters in length)
            if (playersName.length() < 2) {
               System.out.println("Invalid name - the name must not be blank");
            }
            break; //out of (exit) the repetition
        }
        return playersName; //return the name
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("\n\n===============================================");
    }
    
}
