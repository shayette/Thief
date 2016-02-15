package byui.cit260.thiefGame.control;


/**
 *
 * @author Sierra
 */
public class SafeControl {
    
    public double calcSurfaceArea(double length, double height, double width) {
        
        if (length < 0 || length > 3)
                return -1;
        
        if (height < 0 || height > 8) {
		return -1;
        }
	if (width < 0 || width > 5) {
		return -1;
        }
	
	double surfaceArea = (2 * length * height) + (2 * height * width) + (2 * width * length);

	return surfaceArea;

    }
    
}