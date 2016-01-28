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
public class ItemsToSteal implements Serializable{
    
    // class instance variable
    private String itemType;

    public ItemsToSteal() {
    }
    

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.itemType);
        return hash;
    }

    @Override
    public String toString() {
        return "ItemsToSteal{" + "itemType=" + itemType + '}';
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
        final ItemsToSteal other = (ItemsToSteal) obj;
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
    
    
    
}
