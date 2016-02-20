/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiefgame;

import byui.cit260.theifGame.view.StartProgramView;
import byui.cit260.thiefGame.model.CurrentSupplies;
import byui.cit260.thiefGame.model.OpenSafe;
import byui.cit260.thiefGame.model.LoadingDock;
import byui.cit260.thiefGame.model.Player;
import byui.cit260.thiefGame.model.ItemsToSteal;
import byui.cit260.thiefGame.model.ListEquipment;
import byui.cit260.thiefGame.model.ItemsStolen;
import byui.cit260.thiefGame.model.StolenItemsScenes;
import byui.cit260.thiefGame.model.Location;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Lasers;
import byui.cit260.thiefGame.model.NoItemsScenes;

/**
 *
 * @author Shayna
 * @author Sierra
 */
public class ThiefGame {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args){
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ThiefGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThiefGame.player = player;
    }

    }
    

