/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.model;

import java.io.Serializable;

/**
 *
 * @author Shayna & Sierra
 */
public enum ItemsToSteal implements Serializable {
    
    Painting("Van Gogh's Peasant Women Against a Background of Wheat Painting "
            + "from 1890 worth $63.1 Million."),
    Diamonds("Allnatt Diamond from South Africa worth $3 Million."),
    Sculpture("The Chariot Sculpture worth $101 Million."),
    Gold("Multiple Gold Bars worth $2 Million."),
    Vase("A rare Arequipa Art Pottery Vase worth $10,000.");
        
    
    
    private final String description;
    private final Point coordinates;

    ItemsToSteal(String description) {
        this.description = description;
        coordinates = new Point(1,1);
}

    public String getDescription() {
        return description;
}
    public Point getCoordinates() {
        return coordinates;
}

    public static class Point {

        public Point() {
            System.out.println("*** called Point() in ItemsToSteal ***");
        }

        private Point(int i, int i0) {
            System.out.println("*** called PointFunction() in ItemsToSteal ***");
        }
    }


    }
    
    

