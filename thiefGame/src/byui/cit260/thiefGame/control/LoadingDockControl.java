package byui.cit260.thiefGame.control;


/**
 *
 * @author Shayna
 * @author Sierra
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