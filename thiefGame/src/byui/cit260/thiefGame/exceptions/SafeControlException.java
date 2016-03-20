/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thiefGame.exceptions;

/**
 *
 * @author sierrajane
 */
public class SafeControlException extends Exception {

    public SafeControlException() {
    }

    public SafeControlException(String message) {
        super(message);
    }

    public SafeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public SafeControlException(Throwable cause) {
        super(cause);
    }

    public SafeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}

