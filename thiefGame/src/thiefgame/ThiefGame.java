/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiefgame;

import byui.cit260.thiefGame.model.CurrentSupplies;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.ItemsStolen;
import byui.cit260.thiefGame.model.ItemsToSteal;
import byui.cit260.thiefGame.model.ListEquipment;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Player;
import lasers.Lasers;
import loadingDock.LoadingDock;
import location.Location;
import noItemsScenes.NoItemsScenes;
import openSafe.OpenSafe;
import stolenItemsScenes.StolenItemsScenes;
/**
 *
 * @author Shayna
 * @author Sierra
 */
public class ThiefGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Player Class
        Player playerOne = new Player();
        
        playerOne.setName("Heather Johnson");
        playerOne.setBestScore(10);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //OpenSafe Class
        OpenSafe openNow = new OpenSafe();
        
        openNow.setLength(5);
        openNow.setHeight(7);
        openNow.setWidth(6);
        
        String openSuccess = openNow.toString();
        System.out.println(openSuccess);
        
        //Location Class
        Location findLocation = new Location();
        
        findLocation.setRow(4);
        findLocation.setColumn(3);
        
        String myLocation = findLocation.toString();
        System.out.println(myLocation);
        
        //Lasers Class
        Lasers dodgeLasers = new Lasers();
        
        dodgeLasers.setBaseOne(15);
        dodgeLasers.setBaseTwo(12);
        dodgeLasers.setHeight(2);
        
        String lasersMiss = dodgeLasers.toString();
        System.out.println(lasersMiss);
        
        //StolenItemsScenes
        StolenItemsScenes stolenScenes = new StolenItemsScenes();
        
        stolenScenes.setDescription("You have reached a scene with an item to steal.");
        stolenScenes.setTurnTaken(4);
        stolenScenes.setItemStolen("diamond");
        
        String stealItem = stolenScenes.toString();
        System.out.println(stealItem);
        
        //NoItemsScenes
        NoItemsScenes nothingScenes = new NoItemsScenes();
        
        nothingScenes.setDescriptionOfScene("There are no items here to steal.");
        nothingScenes.setTurnTaken(6);
        
        String nothingToSteal = nothingScenes.toString();
        System.out.println(nothingToSteal);
        
        //Loading Dock
        LoadingDock getPasscode = new LoadingDock();
        
        getPasscode.setHeight(5);
        getPasscode.setLength(10);
        getPasscode.setWidth(7);
        
        String getOut = getPasscode.toString();
        System.out.println(getOut);
      TestShaynasModules();
 
    }
    static void TestShaynasModules(){
        Game game = new Game();
        
        game.setTotalTurns(30);
        
        String gameInfo = game.toString();
        System.out.println(gameInfo);
        
        Map map = new Map();
        
        map.setRowCount(2);
        map.setColumnCount(3);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        ListEquipment listEquipment = new ListEquipment();
        
        listEquipment.setEquipmentType("Rope");
        
        String listEquipmentInfo = listEquipment.toString();
        System.out.println(listEquipmentInfo);
        
        CurrentSupplies currentSupplies = new CurrentSupplies();
        
        currentSupplies.setSupplyType("Measuring Tape");
        
        String currentSuppliesInfo = currentSupplies.toString();
        System.out.println(currentSuppliesInfo);
        
        ItemsToSteal itemsToSteal = new ItemsToSteal();
        
        itemsToSteal.setItemType("Diamonds");
        
        String itemsToStealInfo = itemsToSteal.toString();
        System.out.println(itemsToStealInfo);
        
        ItemsStolen itemsStolen = new ItemsStolen();
        
        itemsStolen.setStolenType("Painting");
        itemsStolen.setQuantityStolen(2);
        
        String itemsStolenInfo = itemsStolen.toString();
        System.out.println(itemsStolenInfo);
        
        
    }
}
