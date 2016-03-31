package byui.cit260.thiefGame.control;

import byui.cit260.thiefGame.exceptions.LoadingDockControlException;



/**
 *
 * @author Shayna
 * @author Sierra
 */
public class LoadingDockControl {
    
    public static double calcBoxesPerimeter(double height, double width) 
                throws LoadingDockControlException {
        
        if (height < 1 || height > 4) {
		throw new LoadingDockControlException("You must enter a number between 1 and 4.");
        }
	if (width < 1 || width > 15) {
		throw new LoadingDockControlException("You must enter a number between 1 and 15.");
        }
	
	double perimeter = (2 * height) + (2 * width);

	return perimeter;

    }
    
}