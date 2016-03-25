/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.exceptions.GameControlException;
import byui.cit260.thiefGame.exceptions.MapControlException;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.ItemsToSteal;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import thiefgame.ThiefGame;

/**
 *
 * @author Shayna
 */
public class GameControl {

    private static Object game;

    public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game
        ThiefGame.setCurrentGame(game); //save in ThiefGame
        
        game.setPlayer(player); //save player in game
       
        //create Items To Steal and save in game
        ItemsToSteal[] itemsToSteal = GameControl.createItemsToStealList();
        game.setItemsToSteal(itemsToSteal);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move actors to starting positiion in map
        try {
            MapControl.moveActorsToStartingLocation(map);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }

    }

    public static void saveGame(Game currentGame, String filePath) 
        throws GameControlException, IOException {
        
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            
            output.writeObject(game); // write the game object out to file
        }
        catch(IOException e){
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) 
            throws GameControlException {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); // read the game object from file
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        // close the output file
        ThiefGame.setCurrentGame(game); // save in ThiefGame
    }
    
    
    public enum Item {
        painting,
        diamond,
        sculpture,
        gold, 
        vase;
    }

    public static ItemsToSteal[] createItemsToStealList() {
    //created array(list) of items
    ItemsToSteal[] itemsToSteal = 
            new ItemsToSteal[Item.values().length];
    
    ItemsToSteal painting = new ItemsToSteal();
    painting.setDescription("Painting");
    painting.setQuantityInStock(0);
    painting.setRequiredAmount(2);
    itemsToSteal[Item.painting.ordinal()] = painting;
    
    ItemsToSteal diamond = new ItemsToSteal();
    diamond.setDescription("Diamond");
    diamond.setQuantityInStock(0);
    diamond.setRequiredAmount(1);
    itemsToSteal[Item.diamond.ordinal()] = diamond;
    
    ItemsToSteal sculpture = new ItemsToSteal();
    sculpture.setDescription("Sculpture");
    sculpture.setQuantityInStock(0);
    sculpture.setRequiredAmount(1);
    itemsToSteal[Item.sculpture.ordinal()] = sculpture;
    
    ItemsToSteal gold = new ItemsToSteal();
    gold.setDescription("Gold");
    gold.setQuantityInStock(0);
    gold.setRequiredAmount(1);
    itemsToSteal[Item.gold.ordinal()] = gold;
    
    ItemsToSteal vase = new ItemsToSteal();
    vase.setDescription("Vase");
    vase.setQuantityInStock(0);
    vase.setRequiredAmount(1);
    itemsToSteal[Item.vase.ordinal()] = vase;
    
    return itemsToSteal;
    }

    public static ItemsToSteal[] getItemsToStealList() {
         System.out.println("\n*** called getItemsToStealList in GameControl ***");
         return null;
    }
    
public long getValue(int[] value) {
    
    int total = 0;
    
    for(int i = 0; i < value.length; i++) {
        total += value[i];
    }
    return total;
}

public void printMapReport() {
    
     Writer outputLocation = null;
     
    try (PrintWriter out = new PrintWriter(outputLocation)) {
        
        out.println("\n           Map of Thief Game          ");
        
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
}
}
