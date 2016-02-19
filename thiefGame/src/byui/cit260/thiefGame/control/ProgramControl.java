/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.model.Player;
import thiefgame.ThiefGame;

/**
 *
 * @author Shayna
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        ThiefGame.setPlayer(player); // save the player
        
        return player;
    }
    
}
