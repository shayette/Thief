/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.model;
import java.io.Serializable;
/**
 *
 * @author sierrajane
 */
public class Lasers implements Serializable{
    private double baseOne;
    private double baseTwo;
    private double height;

    public Lasers() {
    }

    public double getBaseOne() {
        return baseOne;
    }

    public void setBaseOne(double baseOne) {
        this.baseOne = baseOne;
    }

    public double getBaseTwo() {
        return baseTwo;
    }

    public void setBaseTwo(double baseTwo) {
        this.baseTwo = baseTwo;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.baseOne) ^ (Double.doubleToLongBits(this.baseOne) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.baseTwo) ^ (Double.doubleToLongBits(this.baseTwo) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
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
        final Lasers other = (Lasers) obj;
        if (Double.doubleToLongBits(this.baseOne) != Double.doubleToLongBits(other.baseOne)) {
            return false;
        }
        if (Double.doubleToLongBits(this.baseTwo) != Double.doubleToLongBits(other.baseTwo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lasers{" + "baseOne=" + baseOne + ", baseTwo=" + baseTwo + ", height=" + height + '}';
    }
    
    
}
