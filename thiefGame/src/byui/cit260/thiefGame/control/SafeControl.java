package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.exceptions.SafeControlException;

/**
 *
 * @author Sierra
 */
public class SafeControl {
    
    public static double calcSurfaceArea(double length, double height, double width) 
        throws SafeControlException {
        
        if (length <= 0 || length >= 4)
                throw new SafeControlException("You must enter a number between 1 and 4.");
        
        if (height <= 0 || height >= 9) {
		throw new SafeControlException("You must enter a number between 1 and 9.");
        }
	if (width <= 0 || width >= 6) {
		throw new SafeControlException("You must enter a number between 1 and 6.");
        }
	
	double surfaceArea = (2 * length * height) + (2 * height * width) + (2 * width * length);

	return surfaceArea;

    }
    
}