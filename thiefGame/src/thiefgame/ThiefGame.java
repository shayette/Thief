/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiefgame;

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
    }
    
}
