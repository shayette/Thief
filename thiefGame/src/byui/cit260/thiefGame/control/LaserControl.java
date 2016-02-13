/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.control;

/**
 *
 * @author Shayna
 */
public class LaserControl {
    
    public double calcAreaOfLasers(double baseOne, double baseTwo, double height) {
        
        if(baseOne < 4 || baseOne > 4){
		return -1;
        }
	if(baseTwo < 10 || baseTwo > 10){
		return -1;	
        }
	if(height < 6 || height > 6){
		return -1;
        }
        
	double area = ((baseOne + baseTwo) / 2) * height;

	return area;

    }
    
}
