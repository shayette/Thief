/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.ItemsToSteal;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Player;
import thiefgame.ThiefGame;

/**
 *
 * @author Shayna
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game
        ThiefGame.setCurrentGame(game); //save in ThiefGame
        
        game.setPlayer(player); //save player in game
       
        //create Items To Steal and save in game
        ItemsToSteal[] itemsToSteal = GameControl.createItemsToStealList();
        game.setItems(itemsToSteal);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move actors to starting positiion in map
        MapControl.moveActorsToStartingLocation(map);
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
    ItemsToSteal[] itemType = 
            new ItemsToSteal[Constants.NUMBER_OF_ITEMS_TO_STEAL];
    
    ItemsToSteal painting = new ItemsToSteal();
    painting.setDescription("Painting");
    painting.setQuantityInStock(0);
    painting.setRequiredAmount(0);
    itemType[Item.painting.ordinal()] = painting;
    
    ItemsToSteal diamond = new ItemsToSteal();
    diamond.setDescription("Diamond");
    diamond.setQuantityInStock(0);
    diamond.setRequiredAmount(0);
    itemType[Item.diamond.ordinal()] = diamond;
    
    ItemsToSteal sculpture = new ItemsToSteal();
    sculpture.setDescription("Sculpture");
    sculpture.setQuantityInStock(0);
    sculpture.setRequiredAmount(0);
    itemType[Item.sculpture.ordinal()] = sculpture;
    
    ItemsToSteal gold = new ItemsToSteal();
    gold.setDescription("Gold");
    gold.setQuantityInStock(0);
    gold.setRequiredAmount(0);
    itemType[Item.gold.ordinal()] = gold;
    
    ItemsToSteal vase = new ItemsToSteal();
    vase.setDescription("Vase");
    vase.setQuantityInStock(0);
    vase.setRequiredAmount(0);
    itemType[Item.vase.ordinal()] = vase;
    
    return itemType;
    }

    public static ItemsToSteal[] getItemsToStealList() {
         System.out.println("\n*** called getItemsToStealList in GameControl ***");
         return null;
    }
        
    private static class Constants {

        private static int NUMBER_OF_ITEMS_TO_STEAL;

        public Constants() {
        }
    }
    
public long getValue(int[] value) {
    
    int total = 0;
    
    for(int i = 0; i < value.length; i++) {
        total += value[i];
    }
    return total;
}
    }
