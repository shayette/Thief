/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.model;

import java.io.Serializable;

/**
 *
 * @author Shayna
 */
public class Game implements Serializable{
    
    // class instance variables
    private double totalTurns;
    
    private ItemsToSteal[] itemList;
    private Player player;
    private String[] actors;
    private Map map;

    public Game() {
    }

    public double getTotalTurns() {
        return totalTurns;
    }

    public void setTotalTurns(double totalTurns) {
        this.totalTurns = totalTurns;
    }

    public ItemsToSteal[] getItemList() {
        return itemList;
    }

    public void setItemList(ItemsToSteal[] itemList) {
        this.itemList = itemList;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.totalTurns) ^ (Double.doubleToLongBits(this.totalTurns) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTurns=" + totalTurns + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTurns) != Double.doubleToLongBits(other.totalTurns)) {
            return false;
        }
        return true;
    }

    public void setItem(ItemsToSteal[] itemList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setItems(ItemsToSteal[] itemsToSteal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
