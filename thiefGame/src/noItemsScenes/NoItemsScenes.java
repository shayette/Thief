/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noItemsScenes;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author sierrajane
 */
public class NoItemsScenes implements Serializable{
    //class instances
   private String descriptionOfScene;
   private double turnTaken;

    public NoItemsScenes() {
    }

    public String getDescriptionOfScene() {
        return descriptionOfScene;
    }

    public void setDescriptionOfScene(String descriptionOfScene) {
        this.descriptionOfScene = descriptionOfScene;
    }

    public double getTurnTaken() {
        return turnTaken;
    }

    public void setTurnTaken(double turnTaken) {
        this.turnTaken = turnTaken;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.descriptionOfScene);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.turnTaken) ^ (Double.doubleToLongBits(this.turnTaken) >>> 32));
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
        final NoItemsScenes other = (NoItemsScenes) obj;
        if (Double.doubleToLongBits(this.turnTaken) != Double.doubleToLongBits(other.turnTaken)) {
            return false;
        }
        if (!Objects.equals(this.descriptionOfScene, other.descriptionOfScene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NoItemsScenes{" + "descriptionOfScene=" + descriptionOfScene + ", turnTaken=" + turnTaken + '}';
    }
   
   
}
