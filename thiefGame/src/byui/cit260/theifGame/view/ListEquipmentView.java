/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

/**
 *
 * @author Shayna
 */
public class ListEquipmentView extends View {
    
    public ListEquipmentView() {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| List of Equipment                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nC - C4 Explosives"
            + "\nN - Night vision goggles"
            + "\nM - Measuring tape"
            + "\nL - Lock pick" 
            + "\nB - Crowbar" 
            + "\nF - Flashlight" 
            + "\nG - Gun" 
            + "\nT - Glass cutter"
            + "\nR - Rope"
            + "\nC - Calculator"
            + "\nP - Phone"
            + "\nO - Laptop"
            + "\nI - Fiber optic splitter"
            + "\nS - Smoke bombs"
            + "\nE - Exit"
            + "\n--------------------------------------------------------------");
    }
    
    
    @Override
     public boolean doAction(String value) {
        char selection = value.toUpperCase().charAt(0);
        switch (selection) {
            case 'X': // c4 explosives
                this.explosives();
                break;
            case 'N': // night vision goggles
                this.nightVisionGoggles();
                break;
            case 'M': // measuring tape
                this.measuringTape();
                break;
            case 'L': // lock pick
                this.lockPick();
                break;
            case 'B': // crowbar
                this.crowbar();
                break;
            case 'F': // flashlight
                this.flashlight();
                break;
            case 'G': // gun
                this.gun();
                break;
            case 'T': // glass cutter
                this.glassCutter();
                break;
            case 'R': // rope
                this.rope();
                break;
            case 'C': // calculator
                this.calculator();
                break;
            case 'P': // phone
                this.phone();
                break;
            case 'O': // laptop
                this.laptop();
                break;
            case 'I': // fiber optic splitter
                this.fiberOpticSplitter();
                break;
            case 'S': // smoke bombs
                this.smokeBombs();
                break;
            case 'E': // Exit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        return false;
    }

    private void explosives() {
        System.out.println("*** explosives function called ***");
    }

    private void nightVisionGoggles() {
        System.out.println("*** nightVisionGoggles function called ***");
    }

    private void measuringTape() {
        System.out.println("*** measuringTape function called ***");
    }

    private void lockPick() {
        System.out.println("*** lockPick function called ***");
    }

    private void crowbar() {
        System.out.println("*** crowbar function called ***");
    }

    private void flashlight() {
        System.out.println("*** flashlight function called ***");
    }

    private void gun() {
        System.out.println("*** gun function called ***");
    }

    private void glassCutter() {
        System.out.println("*** glassCutter function called ***");
    }

    private void rope() {
        System.out.println("*** rope function called ***");
    }

    private void calculator() {
        System.out.println("*** calculator function called ***");
    }

    private void phone() {
        System.out.println("*** phone function called ***");
    }

    private void laptop() {
        System.out.println("*** laptop function called ***");
    }

    private void fiberOpticSplitter() {
        System.out.println("*** fiberOpticSplitter function called ***");
    }

    private void smokeBombs() {
        System.out.println("*** smokeBombs function called ***");
    }
}
