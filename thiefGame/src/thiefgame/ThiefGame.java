/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiefgame;

import byui.cit260.theifGame.view.StartProgramView;
import byui.cit260.thiefGame.model.CurrentSupplies;
import byui.cit260.thiefGame.model.OpenSafe;
import byui.cit260.thiefGame.model.LoadingDock;
import byui.cit260.thiefGame.model.Player;
import byui.cit260.thiefGame.model.Game;
import byui.cit260.thiefGame.model.Map;
import byui.cit260.thiefGame.model.Lasers;
import byui.cit260.thiefGame.model.NoItemsScenes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shayna
 * @author Sierra
 */
public class ThiefGame {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
 
    public static void main(String[] args){
        
        try {
            
            //open character stream files for end user input and output
            ThiefGame.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            ThiefGame.outFile = new PrintWriter(System.out, true);
            
            //Open log file
            String filePath = "log.txt";
            ThiefGame.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
    } catch (Throwable e) {
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
        e.printStackTrace();
        
    }
        finally{
            try {
                if (ThiefGame.inFile != null)
                    ThiefGame.inFile.close();
                
                if (ThiefGame.outFile != null)
                    ThiefGame.outFile.close();
                
                if (ThiefGame.logFile != null)
                    ThiefGame.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ThiefGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThiefGame.player = player;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ThiefGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ThiefGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ThiefGame.logFile = logFile;
    }
    
    

    }
    

