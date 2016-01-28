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
public class ListEquipment implements Serializable{
    
    // class instance variables
    private String equipmentType;

    public ListEquipment() {
    }
    

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.equipmentType);
        return hash;
    }

    @Override
    public String toString() {
        return "ListEquipment{" + "equipmentType=" + equipmentType + '}';
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
        final ListEquipment other = (ListEquipment) obj;
        if (!Objects.equals(this.equipmentType, other.equipmentType)) {
            return false;
        }
        return true;
    }
    
    
}
