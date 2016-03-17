/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.exceptions.LaserControlException;

/**
 *
 * @author Shayna
 */
public class LaserControl {
    
    public static double calcAreaOfLasers(double baseOne, double baseTwo, double height) 
                            throws LaserControlException {
        
        if(baseOne < 1 || baseOne > 4){
		throw new LaserControlException("You must enter a number between 1 and 4.");
        }
	if(baseTwo < 1 || baseTwo > 10){
		throw new LaserControlException("You must enter a number between 1 and 10.");	
        }
	if(height < 1 || height > 6){
		throw new LaserControlException("You must enter a number between 1 and 6.");
        }
        
	double area = ((baseOne + baseTwo) / 2) * height;

	return area;

    }
    
}
