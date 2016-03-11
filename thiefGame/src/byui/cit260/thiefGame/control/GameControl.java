/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.ItemsToSteal;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Player;
import byui.cit260.thiefGame.model.SceneType;
import byui.cit260.thiefGame.model.Item;
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


        static void assignScenesToLocations(Map map, MapControl.Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.loadingDock.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.exhibitRoom1.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.sculptureRoom.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.securityRoom.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.bathrooms.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.hallway1.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.hallway2.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.mainEntry.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.basementStairs.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.exhibitRoom2.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.exhibitRoom3.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.lobby.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.controlRoom.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.diamondRoom.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.admin.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.safeRoom.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.janitorCloset.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.laserHallway.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.exhibitRoom4.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.giftShop.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.basement.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.hallway3.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.vaseRoom.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
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
    



    
}