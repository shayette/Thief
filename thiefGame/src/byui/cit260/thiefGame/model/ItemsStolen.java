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
 * @author Shayna
 */
public class ItemsStolen implements Serializable{
    
    // class instance variables
    private String stolenType;
    private double quantityStolen;

    public ItemsStolen() {
    }
    

    public String getStolenType() {
        return stolenType;
    }

    public void setStolenType(String stolenType) {
        this.stolenType = stolenType;
    }

    public double getQuantityStolen() {
        return quantityStolen;
    }

    public void setQuantityStolen(double quantityStolen) {
        this.quantityStolen = quantityStolen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.stolenType);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.quantityStolen) ^ (Double.doubleToLongBits(this.quantityStolen) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "ItemsStolen{" + "stolenType=" + stolenType + ", quantityStolen=" + quantityStolen + '}';
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
        final ItemsStolen other = (ItemsStolen) obj;
        if (Double.doubleToLongBits(this.quantityStolen) != Double.doubleToLongBits(other.quantityStolen)) {
            return false;
        }
        if (!Objects.equals(this.stolenType, other.stolenType)) {
            return false;
        }
        return true;
    }
    
    
    
}
