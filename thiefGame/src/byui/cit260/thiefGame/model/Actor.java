/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Shayna
 */
public enum Actor implements Serializable {
    
    Thief("Can steal just about any object with out getting caught."),
    Hacker("Can hack into almost any computer system, including security systems."),
    Grifter("Can get past almost any guard, the best actor.");
    
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
    
}
