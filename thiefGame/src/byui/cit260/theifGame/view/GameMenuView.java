/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.control.GameControl;
import byui.cit260.thiefGame.control.LaserControl;
import byui.cit260.thiefGame.control.MapControl;
import byui.cit260.thiefGame.exceptions.LaserControlException;
import byui.cit260.thiefGame.exceptions.LoadingDockControlException;
import byui.cit260.thiefGame.exceptions.MapControlException;
import byui.cit260.thiefGame.exceptions.SafeControlException;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.ItemsToSteal;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import thiefgame.ThiefGame;




/**
 *
 * @author Shayna
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Game Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nM - Move locations"
            + "\nS - Steal item"   
            + "\nI - Items to steal"
            + "\nB - Blow open safe"
            + "\nD - Dodge lasers"
            + "\nP - Loading Dock puzzle"
            + "\nV - View map"
            + "\nR - Print map"
            + "\nH - Display Help Menu"
            + "\nA - Main Menu"
            + "\nE - Exit"
            + "\n--------------------------------------------------------------");
    }
    
    
    @Override
     public boolean doAction(String value) {
        char selection = value.toUpperCase().charAt(0);
        switch (selection) {
            case 'M': // move locations
                this.moveLocations();
                break;
            case 'I': // list items to steal
                this.itemsToSteal();
                break;
            case 'B': {
            try {
                // blow open safe action
                this.blowOpenSafe();
            } catch (SafeControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'S': // sneak
                this.stealItem();
                break;
            case 'D': {
            try {
                // dodge lasers
                this.dodgeLasers();
            } catch (LaserControlException e) {
                ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + e.getMessage());
            }
        }
                break;
            case 'P': {
            try {
                // security room puzzle
                this.exitLoadingDock();
            } catch (LoadingDockControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'V': // view map
                this.displayMap();
                break;
            case 'R': // print map
                this.printMap();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'A': // save and quit
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                break;
            case 'E': // Exit
                return true;
            default:
                ErrorView.display("GameMenuView",
                        "\n*** Invalid Selection *** Try again");
                break;
              
        }
        return false;
    }
     
public static int getInteger(String prompt) {
        
        
        boolean valid = false;
        String value = "";
        int returnVal = -1;
        
       BufferedReader keyboard = ThiefGame.getInFile();
        
        
        // while a valid value has not been retrieved
        while (!valid) {
            
             
            System.out.println(prompt);
            
            try {
                //get the value from the keyboard and trim off the blanks
                value = keyboard.readLine();
                value = value.trim();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            // get the value entered from the keyboard
            try {
                returnVal = Integer.parseInt(value);
                valid = true;
            } catch (NumberFormatException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
 
    }
        return returnVal;
}


    private void moveLocations() {
       int row = getInteger("Enter new row between 0 and 4:");
       int col = getInteger("Enter new column between 0 and 4:");
       try {
            MapControl.moveToLocation(ThiefGame.getCurrentGame().getMap(), row, col);
       } catch (MapControlException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
       displayMap();
    }
   

    public boolean itemsToSteal() {
        boolean gameIsWon = true;
        
        Game game = ThiefGame.getCurrentGame();
        ItemsToSteal[] itemsToStealList=game.getItemList();
        System.out.println("List of Items to Steal to Win Game");
        System.out.println("Item\t\tIn Stock\tRequired");
        System.out.println("------------------------------------------");
        for(ItemsToSteal item: itemsToStealList) {
            System.out.println(String.format("%1$-"+10+"s", item.getDescription()) + "\t" + 
                    Integer.toString(item.getQuantityInStock()) + "\t\t" +
                    Integer.toString(item.getRequiredAmount()));
            if (item.getQuantityInStock() < item.getRequiredAmount())
                    gameIsWon = false;
        }
        if (gameIsWon)
            System.out.println("Congratulations!! You have won the game!");
        return gameIsWon;
    }

    private void blowOpenSafe() throws SafeControlException {
        SafeView SafeView = new SafeView();
        SafeView.getInput();
    }

    private void stealItem() {
       if(GameControl.stealItem())
           itemsToSteal();
       else {
           System.out.println("Unable to steal");
       }
    }

    private void dodgeLasers() throws LaserControlException {
        LaserView LaserView = new LaserView();
        LaserView.getInput();
    }

    private void exitLoadingDock() throws LoadingDockControlException {
        LoadingDockView LoadingDockView = new LoadingDockView();
        LoadingDockView.getInput();
    }

    public static void displayMap(){
         String leftIndicator;
         String rightIndicator;
         
         Game game = ThiefGame.getCurrentGame(); // retreive the game
         Map map = game.getMap(); // retreive the map from game
         Location[][] locations = map.getLocations(); // retreive the locations from map
         
         System.out.print("   |");
         for( int col = 0; col < locations[0].length; col++){
             System.out.print("  " + col + " |"); // print col numbers to side of map
         }
         System.out.println();
         for( int row = 0; row < locations.length; row++){
             System.out.print(row + "  "); // print row numbers to side of map
             for( int col = 0; col < locations[row].length; col++){
                 leftIndicator = " ";
                 rightIndicator = " ";
                 if(locations[row][col]==map.getCurrentLocation()){
                     leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                     rightIndicator = "*";
                 } else if(locations[row][col].isVisited()){
                     leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                     rightIndicator = "<"; // same as above
                 }
                 // TODO : use if else ladder to check to see if this location is current location and set proper indicators
                 System.out.print("|"); // start map with a |
                 if(locations[row][col].getScene() == null)
                     System.out.print(leftIndicator + "??" + rightIndicator);
                 else
                     System.out.print(leftIndicator + locations[row][col].getScene().getMapSymbol() + rightIndicator);
             }
             System.out.println("|");
         }
         System.out.println("Your current location is: " + map.getCurrentLocation().getScene().getDescription());
         if (map.getCurrentLocation().getScene().getItem().isEmpty())
            System.out.println("There is nothing to steal here.");
         else {
             if (map.getCurrentLocation().getScene().isItemStolen())
                 System.out.println("The item " + map.getCurrentLocation().getScene().getItem()+ " is already stolen.");
             else 
                 System.out.println("The item " + map.getCurrentLocation().getScene().getItem()+ " is available to steal.");
         }
    }
    
//    private void displayMap(Map map) {
//        
//        Location[][] locations = map.getLocations();
//        System.out.println("Thief Game");
//        for (int i = 0; i < locations.length; i++){
//            for (int j = 0; j < locations[i].length; j++){
//                if (i == 0)
//                {
//                    if (j == 0)
//                    {
//                        System.out.print(((i < 10) ? "Row: ") +i);
//                    }
//                    System.out.print(((j < 10) ? "| " : "|") +j);
//                    if (j == (locations[i].length - 1))
//                        System.out.print("|");
//                }
//                else
//                {
//                    // show row number
//                    if (j == 0){
//                        System.out.print(((i < 10) ? "Row: " : "Row: ") +i+"|");
//                    
//                    }
//                    else
//                        System.out.print("??");
//                        System.out.print("|");
//                }
//            }
//            System.out.print("-");
//        }
//    
//    }
    
    private void printMap() {
      GameControl gameControl = new GameControl();
      gameControl.printMapReport();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}

    
