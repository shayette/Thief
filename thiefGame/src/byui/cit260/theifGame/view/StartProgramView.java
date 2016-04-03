/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.ProgramControl;
import byui.cit260.thiefGame.exceptions.ProgramControlException;
import byui.cit260.thiefGame.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shayna
 */
public class StartProgramView extends View {

    
    @Override
    public void display(){        
            
            //prompt the player to enter their name retrieve the name of the player
            String playersName = this.getPlayersName();
            
            //Create and save the player object
            Player player = null;
        try {
            player = ProgramControl.createPlayer(playersName);
        } catch (ProgramControlException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            // Display a personalized welcome message
            this.displayWelcomeMessage(player);
            
            // Display the Main Menu
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.display();
    }

    public String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        
        try {
        while(!valid) { //while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.readLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than two characters in length)
            if (playersName.length() < 2) {
               ErrorView.display(this.getClass().getName(),
                                "You must enter a name.");
            }
            break; //out of (exit) the repetition
        }
       } catch (Exception e) {
           ErrorView.display(this.getClass().getName(),
                   "Error reading input: " + e.getMessage());
       }
        return playersName; //return the name
    }

    public void displayWelcomeMessage(Player player) {
        
        System.out.println("\n\n==============================================");
        System.out.println("\tWelcome to the Thief Game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("\n\n===============================================");
        
        System.out.println("\n\r***************************************************************" 
                + "\n\r*                                                             *"
                + "\n\r* You are a master thief with your eye on the local museum    *"
                + "\n\r* as your last, big score. This is no small task. The museum  *"
                + "\n\r* is two stories with numerous different rooms and hidden     *"
                + "\n\r* walkways. Your job is to steal as many valuables as you     *"
                + "\n\r* can before the alarm sounds or security catches you.        *" 
                + "\n\r*                                                             *"
                + "\n\r* The game starts with you in the van getting ready to go     *"
                + "\n\r* through the loading dock of the museum. Your job is to      *"
                + "\n\r* safely navigate the museum, steal the items and escape      *"
                + "\n\r* in your van before the cops arrive.                         *"
                + "\n\r*                                                             *"
                + "\n\r* You have 50 moves to get out before getting caught.         *"
                + "\n\r*                                                             *"
                + "\n\r***************************************************************");
        
    }
    
}
