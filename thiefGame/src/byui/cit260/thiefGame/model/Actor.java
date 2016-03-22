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
    
    SecurityGuard("One near all high value exhibits."),
    PoliceOfficer("One near any exit."),
    MuseumDirector("In charge of all exhibits at the museum.");
    
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
