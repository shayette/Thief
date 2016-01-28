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
public class CurrentSupplies implements Serializable{
    
    // class instance variable
    private String supplyType;

    public CurrentSupplies() {
    }
    

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.supplyType);
        return hash;
    }

    @Override
    public String toString() {
        return "CurrentSupplies{" + "supplyType=" + supplyType + '}';
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
        final CurrentSupplies other = (CurrentSupplies) obj;
        if (!Objects.equals(this.supplyType, other.supplyType)) {
            return false;
        }
        return true;
    }
    
    
    
}
