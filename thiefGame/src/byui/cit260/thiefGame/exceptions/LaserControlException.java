/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.exceptions;

/**
 *
 * @author Shayna
 */
public class LaserControlException extends Exception {

    public LaserControlException() {
    }

    public LaserControlException(String message) {
        super(message);
    }

    public LaserControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public LaserControlException(Throwable cause) {
        super(cause);
    }

    public LaserControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
