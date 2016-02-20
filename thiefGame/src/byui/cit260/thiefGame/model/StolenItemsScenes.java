/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author sierrajane
 */
public class StolenItemsScenes implements Serializable{
    private String description;
    private double turnTaken;
    private String itemStolen;

    public StolenItemsScenes() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTurnTaken() {
        return turnTaken;
    }

    public void setTurnTaken(double turnTaken) {
        this.turnTaken = turnTaken;
    }

    public String getItemStolen() {
        return itemStolen;
    }

    public void setItemStolen(String itemStolen) {
        this.itemStolen = itemStolen;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.turnTaken) ^ (Double.doubleToLongBits(this.turnTaken) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.itemStolen);
        return hash;
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
        final StolenItemsScenes other = (StolenItemsScenes) obj;
        if (Double.doubleToLongBits(this.turnTaken) != Double.doubleToLongBits(other.turnTaken)) {
            return false;
        }
            
        if (!Objects.equals(this.itemStolen, other.itemStolen)) {
            return false;
        }
        
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StolenItemsScenes{" + "description=" + description + ", turnTaken=" + turnTaken + ", itemStolen=" + itemStolen + '}';
    }
    
    
    
}
