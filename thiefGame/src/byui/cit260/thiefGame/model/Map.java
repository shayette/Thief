/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.model;

import java.io.Serializable;

/**
 *
 * @author Shayna
 */
public class Map implements Serializable{
    
    // class instance variables
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("Then number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            // create and initialize new Location object instance
            Location location = new Location();
            int column = 0;
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            // assign the Location object to the current position in array
            locations[row][column] = location;
        }
       
        }

    
    public double getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public double getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.noOfRows) ^ (Double.doubleToLongBits(this.noOfRows) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.noOfColumns) ^ (Double.doubleToLongBits(this.noOfColumns) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + noOfRows + ", columnCount=" + noOfColumns + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.noOfRows) != Double.doubleToLongBits(other.noOfRows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noOfColumns) != Double.doubleToLongBits(other.noOfColumns)) {
            return false;
        }
        return true;
    }
    
    public Location[][] getLocations() {
        return locations;
    }
}

