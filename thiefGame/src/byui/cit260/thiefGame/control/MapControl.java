/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Map;
import javafx.scene.Scene;
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
        
        return map;
    }
    
    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                "\n***Start game description.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(50);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        startingScene.setDescription(
                "\n***finish game description.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }
        
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.loadingDock.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.exhibitRoom1.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.sculptureRoom.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.securityRoom.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.hallway1.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.hallway2.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.mainEntry.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.basementStairs.ordinal()]);
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
}

