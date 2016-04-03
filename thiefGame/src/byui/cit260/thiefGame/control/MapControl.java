/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.exceptions.MapControlException;
import byui.cit260.thiefGame.model.Actor;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.Item;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Scene;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import thiefgame.ThiefGame;

/**
 *
 * @author Shayna
 */
public class MapControl {

    public static Map createMap() {
        // create the map
        Map map = new Map(5, 5);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        try {
            moveToStartingLocation(map);
        } catch (MapControlException ex) {
            Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }

    public static void moveToStartingLocation(Map map) 
                            throws MapControlException {
       
         moveToLocation(map, 0, 0);  
        }
    
    public static void moveToLocation(Map map, int row, int col)
        throws MapControlException {
        if ((row < 0) || (row > map.getLocations().length) || (col < 0) || (col > map.getLocations()[0].length))
            throw new MapControlException("Error, input out of range");
        map.setCurrentLocation(map.getLocations()[row][col]);
        map.getCurrentLocation().setVisited(true);
    }
    
public enum SceneType {
        start,
        loadingDock,
        exhibitRoom1,
        sculptureRoom,
        securityRoom,
        bathroom,
        hallway1,
        hallway2,
        mainEntry,
        basementStairs,
        exhibitRoom2,
        exhibitRoom3,
        lobby,
        controlRoom,
        diamondRoom,
        admin,
        safeRoom,
        janitorCloset,
        laserHallway,
        exhibitRoom4,
        giftShop,
        basement,
        hallway3,
        vaseRoom,
        finish;   
    }

    private static Scene[] createScenes() {
        Game game = ThiefGame.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n*** You start in the van getting ready to go through the "
                        + "loading dock of the museum. You are anxious "
                        + "to see the treasures that are waiting inside.");
        startingScene.setMapSymbol("ST");
        startingScene.setVisited(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene scene = new Scene();
        scene.setDescription(
                "\n*** You made it into the loading dock. However the museum "
                + "doors are locked. You must complete an equation to unlock "
                + "the doors.");
        scene.setMapSymbol("LD");
        scene.setVisited(false);
        scenes[SceneType.loadingDock.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have entered an exhibit room, but there is nothing "
                        + "that interests you in here.");
        scene.setMapSymbol("E1");
        scene.setVisited(false);
        scenes[SceneType.exhibitRoom1.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have found the sculpture room. So many sculptures can "
                        + "be found, but there is only one that interests you. "
                        + "This is the Chariot Sculpture worth $101 Million.");
        scene.setMapSymbol("SR");
        scene.setItem(game.getItemList()[Item.sculpture.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.sculptureRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** Be careful, this room will have security back in it in "
                        + "five minutes. You are famished however, so maybe "
                        + "you will steal that donut on your way out.");
        scene.setMapSymbol("SC");
        scene.setItem(game.getItemList()[Item.donut.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.securityRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have entered the restroom and there is a police officer "
                        + "in here. You better get out before they see you!");
        scene.setMapSymbol("BA");
        scene.setVisited(false);
        scenes[SceneType.bathroom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have reached a hallway. What's through that "
                        + "door over there?");
        scene.setMapSymbol("H1");
        scene.setVisited(false);
        scenes[SceneType.hallway1.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have reached a hallway. What's through that "
                        + "door at the end?");
        scene.setMapSymbol("H2");
        scene.setVisited(false);
        scenes[SceneType.hallway2.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** There's security patroling the entry. Sneak out quick "
                        + "before they see you!");
        scene.setMapSymbol("ME");
        scene.setVisited(false);
        scenes[SceneType.mainEntry.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** These stairs lead to the basement, there may not be much"
                        + " down there to steal.");
        scene.setMapSymbol("BS");
        scene.setVisited(false);
        scenes[SceneType.basementStairs.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have found the most rare item here! A $3.5 million "
                        + "violin known as the “Davidoff-Morini Stradivarius,”"
                        + " it was made in 1727, by Antonio Stradivari.");
        scene.setMapSymbol("E2");
        scene.setItem(game.getItemList()[Item.violin.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.exhibitRoom2.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** Wow! This exhibit room has the Van Gogh painting you "
                        + "were hoping to find. Better grab it and go!");
        scene.setMapSymbol("E3");
        scene.setItem(game.getItemList()[Item.painting.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.exhibitRoom3.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have entered the Lobby. I think there's a gift shop nearby, "
                + "maybe there is something in there worth stealing");
        scene.setMapSymbol("LO");
        scene.setVisited(false);
        scenes[SceneType.lobby.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have found the Control Room. Take a minute and "
                        + "learn where the security cameras are located throughtout "
                        + "the museum so that you can be sure to dodge them.");
        scene.setMapSymbol("CR");
        scene.setVisited(false);
        scenes[SceneType.controlRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have found the room that has the Allnatt Diamond from "
                        + "South Africa worth $3 Million, which you want to have "
                        + "as your own. Be careful not to sound any alarms!");
        scene.setMapSymbol("DR");
        scene.setItem(game.getItemList()[Item.diamond.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.diamondRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** Don't stay in here too long, the administrator does not "
                        + "stay away for very long.");
        scene.setMapSymbol("AD");
        scene.setVisited(false);
        scenes[SceneType.admin.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have entered the room with a safe. This safe is full "
                        + "of 2 million dollars worth of gold bars! You must "
                        + "complete an equation in order to blow open the safe "
                        + "to get the gold.");
        scene.setMapSymbol("GR");
        scene.setItem(game.getItemList()[Item.gold.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.safeRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** The janitor closet is a perfect place to hide, but there "
                        + "is nothing of value in here, don't waste too much time"
                        + "in here, there are still many treasures to get.");
        scene.setMapSymbol("JC");
        scene.setVisited(false);
        scenes[SceneType.janitorCloset.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You turn the corner and notice that there are lasers "
                + "guarding the hallway you need to go down. However, you see a "
                + "shape that you recognize, it is a trapezoid and if you can "
                + "calculate the area of the trapezoid you will know how much room "
                + "you have to see if you can get through them.");
        scene.setMapSymbol("LH");
        scene.setVisited(false);
        scenes[SceneType.laserHallway.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** This room has nothing that you are really interested in, "
                        + "however you hear a guard coming, get out quick!");
        scene.setMapSymbol("E4");
        scene.setVisited(false);
        scenes[SceneType.exhibitRoom4.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** There are so many things of little value here, but if you "
                        + "think it is worth it, you could steal that teddy "
                        + "bear just for fun.");
        scene.setMapSymbol("GS");
        scene.setItem(game.getItemList()[Item.bear.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.giftShop.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have entered the basement. There is nothing of value "
                        + "down here, but it does make a good place to hide.");
        scene.setMapSymbol("BM");
        scene.setVisited(false);
        scenes[SceneType.basement.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You are in a hallway. Be extra careful the police are by "
                    + "all the exits.");
        scene.setMapSymbol("H3");
        scene.setVisited(false);
        scenes[SceneType.hallway3.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have found the room with the valuable vase that you"
                        + "are looking to steal. Be careful not to get caught "
                        + "and don't drop the vase in the process of sneaking "
                        + "out.");
        scene.setMapSymbol("VM");
        scene.setItem(game.getItemList()[Item.vase.ordinal()].getDescription());
        scene.setVisited(false);
        scenes[SceneType.vaseRoom.ordinal()] = scene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\n*** What a fun balcony you found. I think you can even see "
                        + "your house from here. However, you should probably "
                        + "go back inside and finish stealing your treasures.");
        finishScene.setMapSymbol("FN");
        finishScene.setVisited(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }
        
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][0].setVisited(false);
        locations[0][1].setScene(scenes[SceneType.loadingDock.ordinal()]);
        locations[0][1].setVisited(false);
        locations[0][2].setScene(scenes[SceneType.exhibitRoom1.ordinal()]);
        locations[0][2].setVisited(false);
        locations[0][3].setScene(scenes[SceneType.sculptureRoom.ordinal()]);
        locations[0][3].setVisited(false);
        locations[0][4].setScene(scenes[SceneType.securityRoom.ordinal()]);
        locations[0][4].setVisited(false);
        locations[1][0].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[1][0].setVisited(false);
        locations[1][1].setScene(scenes[SceneType.hallway1.ordinal()]);
        locations[1][1].setVisited(false);
        locations[1][2].setScene(scenes[SceneType.hallway2.ordinal()]);
        locations[1][2].setVisited(false);
        locations[1][3].setScene(scenes[SceneType.mainEntry.ordinal()]);
        locations[1][3].setVisited(false);
        locations[1][4].setScene(scenes[SceneType.basementStairs.ordinal()]);
        locations[1][4].setVisited(false);
        locations[2][0].setScene(scenes[SceneType.exhibitRoom2.ordinal()]);
        locations[2][0].setVisited(false);
        locations[2][1].setScene(scenes[SceneType.exhibitRoom3.ordinal()]);
        locations[2][1].setVisited(false);
        locations[2][2].setScene(scenes[SceneType.lobby.ordinal()]);
        locations[2][2].setVisited(false);
        locations[2][3].setScene(scenes[SceneType.controlRoom.ordinal()]);
        locations[2][3].setVisited(false);
        locations[2][4].setScene(scenes[SceneType.diamondRoom.ordinal()]);
        locations[2][4].setVisited(false);
        locations[3][0].setScene(scenes[SceneType.admin.ordinal()]);
        locations[3][0].setVisited(false);
        locations[3][1].setScene(scenes[SceneType.safeRoom.ordinal()]);
        locations[3][1].setVisited(false);
        locations[3][2].setScene(scenes[SceneType.janitorCloset.ordinal()]);
        locations[3][2].setVisited(false);
        locations[3][3].setScene(scenes[SceneType.laserHallway.ordinal()]);
        locations[3][3].setVisited(false);
        locations[3][4].setScene(scenes[SceneType.exhibitRoom4.ordinal()]);
        locations[3][4].setVisited(false);
        locations[4][0].setScene(scenes[SceneType.giftShop.ordinal()]);
        locations[4][0].setVisited(false);
        locations[4][1].setScene(scenes[SceneType.basement.ordinal()]);
        locations[4][1].setVisited(false);
        locations[4][2].setScene(scenes[SceneType.hallway3.ordinal()]);
        locations[4][2].setVisited(false);
        locations[4][3].setScene(scenes[SceneType.vaseRoom.ordinal()]);
        locations[4][3].setVisited(false);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
        locations[4][4].setVisited(false);
        
    }
    

}

