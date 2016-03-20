/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.model.Player;
import thiefgame.ThiefGame;
import byui.cit260.thiefGame.exceptions.ProgramControlException;
/**
 *
 * @author Shayna & Sierra
 */
public class ProgramControl {

    public static Player createPlayer(String name) 
        throws ProgramControlException {
        
        if (name == null){
            throw new ProgramControlException("Must enter a name");
        }
        
        Player player = new Player();
        player.setName(name);
        
        ThiefGame.setPlayer(player); // save the player
        
        return player;
    }
    
}
