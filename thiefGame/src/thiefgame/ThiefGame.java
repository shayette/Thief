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

/**
 *
 * @author Shayna
 */
public class ThiefGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Heather Johnson");
        playerOne.setBestScore(10);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
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
