/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.exceptions.MapControlException;
import byui.cit260.thiefGame.model.Actor;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Scene;
import java.awt.Point;
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
    
    public static void moveActorsToStartingLocation(Actor actor, Point coordinates) 
                            throws MapControlException {
        
        Map map = ThiefGame.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
                newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location "
                                    + coordinates.x + ", " + coordinates.y
                                    + " because that location is outside "
                                    + " the bound of the map.");
        }
    }

    public static void moveActorsToStartingLocation(Map map) 
                            throws MapControlException {
        // for every actor
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorsToStartingLocation(actor, coordinates);
            }
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
        scene.setVisited(false);
        scenes[SceneType.sculptureRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** Be careful, this room will have security back in it in "
                        + "five minutes. Search the room for any information that"
                        + "may be helpful for you.");
        scene.setMapSymbol("SC");
        scene.setVisited(false);
        scenes[SceneType.securityRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have entered the restroom and there is a police officer "
                        + "in there, what are you going to do? Sneak out or "
                        + "confront them?");
        scene.setMapSymbol("BA");
        scene.setVisited(false);
        scenes[SceneType.bathroom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("H1");
        scene.setVisited(false);
        scenes[SceneType.hallway1.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("H2");
        scene.setVisited(false);
        scenes[SceneType.hallway2.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("ME");
        scene.setVisited(false);
        scenes[SceneType.mainEntry.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("BS");
        scene.setVisited(false);
        scenes[SceneType.basementStairs.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("E2");
        scene.setVisited(false);
        scenes[SceneType.exhibitRoom2.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("E3");
        scene.setVisited(false);
        scenes[SceneType.exhibitRoom3.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("LO");
        scene.setVisited(false);
        scenes[SceneType.lobby.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** add description here.");
        scene.setMapSymbol("CR");
        scene.setVisited(false);
        scenes[SceneType.controlRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have found the room that has the Allnatt Diamond from "
                        + "South Africa worth $3 Million, which you want to have "
                        + "as your own. Be careful not to sound any alarms!");
        scene.setMapSymbol("DR");
        scene.setVisited(false);
        scenes[SceneType.diamondRoom.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** Don't stay in her too long, the administrator does not "
                        + "stay away for too long.");
        scene.setMapSymbol("AD");
        scene.setVisited(false);
        scenes[SceneType.admin.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have entered the room with a safe. This safe is full "
                        + "of 2 million dollars worth of gold bars! You must "
                        + "complete an equation in order to blow open the safe "
                        + "to get the gold.");
        scene.setMapSymbol("SR");
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
                + "calculate the area of the trapezoid you will know that you "
                + "can make it past them without getting caught.");
        scene.setMapSymbol("LH");
        scene.setVisited(false);
        scenes[SceneType.laserHallway.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** This room has nothing that you are really interested in, "
                        + "however you hear a guard coming waht will you do?");
        scene.setMapSymbol("E4");
        scene.setVisited(false);
        scenes[SceneType.exhibitRoom4.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** There are so many things of little value here, but it is "
                        + "a great place to dodge the secrutiy guards making "
                        + "their rounds.");
        scene.setMapSymbol("GS");
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
                "\n*** You are in hallway3. Be extra careful the police are by "
                    + "all exits.");
        scene.setMapSymbol("H3");
        scene.setVisited(false);
        scenes[SceneType.hallway3.ordinal()] = scene;
        
        scene = new Scene();
        scene.setDescription(
                "\n*** You have found the room with the valuable vase that you"
                        + "are looking to steal. Be careful not to get caught "
                        + "but make sure that you get the vase and get out of "
                        + "the room carefully, it might be best to sneak out.");
        scene.setMapSymbol("BM");
        scene.setVisited(false);
        scenes[SceneType.vaseRoom.ordinal()] = scene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\n*** Congratulations! You made it out of the museum safely. "
                        + "Enjoy your treasures!");
        finishScene.setMapSymbol("FN");
        finishScene.setVisited(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }
        
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][0].setVisited(true);
        locations[0][1].setScene(scenes[SceneType.loadingDock.ordinal()]);
        locations[0][1].setVisited(true);
        locations[0][2].setScene(scenes[SceneType.exhibitRoom1.ordinal()]);
        locations[0][2].setVisited(true);
        locations[0][3].setScene(scenes[SceneType.sculptureRoom.ordinal()]);
        locations[0][3].setVisited(true);
        locations[0][4].setScene(scenes[SceneType.securityRoom.ordinal()]);
        locations[0][4].setVisited(true);
        locations[1][0].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[1][0].setVisited(true);
        locations[1][1].setScene(scenes[SceneType.hallway1.ordinal()]);
        locations[1][1].setVisited(true);
        locations[1][2].setScene(scenes[SceneType.hallway2.ordinal()]);
        locations[1][2].setVisited(true);
        locations[1][3].setScene(scenes[SceneType.mainEntry.ordinal()]);
        locations[1][3].setVisited(true);
        locations[1][4].setScene(scenes[SceneType.basementStairs.ordinal()]);
        locations[1][4].setVisited(true);
        locations[2][0].setScene(scenes[SceneType.exhibitRoom2.ordinal()]);
        locations[2][0].setVisited(true);
        locations[2][1].setScene(scenes[SceneType.exhibitRoom3.ordinal()]);
        locations[2][1].setVisited(true);
        locations[2][2].setScene(scenes[SceneType.lobby.ordinal()]);
        locations[2][2].setVisited(true);
        locations[2][3].setScene(scenes[SceneType.controlRoom.ordinal()]);
        locations[2][3].setVisited(true);
        locations[2][4].setScene(scenes[SceneType.diamondRoom.ordinal()]);
        locations[2][4].setVisited(true);
        locations[3][0].setScene(scenes[SceneType.admin.ordinal()]);
        locations[3][0].setVisited(true);
        locations[3][1].setScene(scenes[SceneType.safeRoom.ordinal()]);
        locations[3][1].setVisited(true);
        locations[3][2].setScene(scenes[SceneType.janitorCloset.ordinal()]);
        locations[3][2].setVisited(true);
        locations[3][3].setScene(scenes[SceneType.laserHallway.ordinal()]);
        locations[3][3].setVisited(true);
        locations[3][4].setScene(scenes[SceneType.exhibitRoom4.ordinal()]);
        locations[3][4].setVisited(true);
        locations[4][0].setScene(scenes[SceneType.giftShop.ordinal()]);
        locations[4][0].setVisited(true);
        locations[4][1].setScene(scenes[SceneType.basement.ordinal()]);
        locations[4][1].setVisited(true);
        locations[4][2].setScene(scenes[SceneType.hallway3.ordinal()]);
        locations[4][2].setVisited(true);
        locations[4][3].setScene(scenes[SceneType.vaseRoom.ordinal()]);
        locations[4][3].setVisited(true);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
        locations[4][4].setVisited(true);
        
    }
    

}

