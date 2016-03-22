/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

import java.io.PrintWriter;
import java.io.Serializable;
import thiefgame.ThiefGame;

/**
 *
 * @author Shayna
 */
public class ErrorView implements Serializable {
    
    
    private static final PrintWriter errorFile = ThiefGame.getOutFile();
    private static final PrintWriter logFile = ThiefGame.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "------------------------------------------------"
                            + "\n- ERROR - " + errorMessage
                    + "\n------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
        
        }  
}
