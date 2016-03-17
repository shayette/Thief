/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import byui.cit260.thiefGame.exceptions.LaserControlException;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Map;
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
            + "\nS - Search room"
            + "\nQ - List of equipment"    
            + "\nI - Items to steal"
            + "\nC - Value of Items stolen"
            + "\nB - Blow open safe"
            + "\nL - Pick lock"
            + "\nK - Sneak"
            + "\nD - Dodge lasers"
            + "\nP - Security room puzzle"
            + "\nV - View map"
            + "\nH - Display Help Menu"
            + "\nA - Save and Quit"
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
            case 'S': // search room
                this.searchRoom();
                break;
            case 'Q': // search room
                this.listEqupiment();
                break;
            case 'I': // list items to steal
                this.itemsToSteal();
            case 'C': // list total value of items stolen
                this.valueOfItemsStolen();
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
            case 'D': {
            try {
                // dodge lasers
                this.dodgeLasers();
            } catch (LaserControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'P': // security room puzzle
                this.securityRoomPuzzle();
                break;
            case 'V': // view map
                this.displayMap();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'A': // save and quit
                this.saveAndQuit();
                break;
            case 'E': // Exit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        return false;
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

    private void blowOpenSafe() {
        System.out.println("*** blowOpenSafe function called ***");
    }

    private void pickLock() {
        System.out.println("*** pickLock function called ***");
    }

    private void sneak() {
        System.out.println("*** sneak function called ***");
    }

    private void dodgeLasers() throws LaserControlException {
        LaserView LaserView = new LaserView();
        LaserView.getInput();
    }

    private void securityRoomPuzzle() {
        System.out.println("*** securityRoomPuzzle function called ***");
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
                 if(locations[row][col].isVisited()){
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

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveAndQuit() {
        System.out.println("*** saveAndQuit function called ***");
    }

    private void listEqupiment() {
        ListEquipmentView listEquipment = new ListEquipmentView();
        listEquipment.display();
    }

    public void valueOfItemsStolen() {
        
        int[] value = {63100000, 3000000, 101000000, 1000000, 10000};
                
               //getValue(value);
    }
}

    
