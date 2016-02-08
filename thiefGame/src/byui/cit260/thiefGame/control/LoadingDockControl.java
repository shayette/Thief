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
public class LoadingDockControl {
    
    public double calcBoxesPerimeter(double height, double width) {
        
        if (height < 4 || height > 4) {
		return -1;
        }
	if (width < 15 || width > 15) {
		return -1;
        }
	
	double perimeter = (2 * height) + (2 * width);

	return perimeter;

    }
    
}
