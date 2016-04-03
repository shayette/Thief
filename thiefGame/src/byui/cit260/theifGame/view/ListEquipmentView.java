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
            + "\nM - Measuring tape"
            + "\nL - Lock pick" 
            + "\nB - Crowbar" 
            + "\nF - Flashlight"
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
            case 'S': // smoke bombs
                this.smokeBombs();
                break;
            case 'E': // Exit
                return true;
            default:
                ErrorView.display("ListEquipmentView",
                        "\n*** Invalid Selection *** Try again");
                break;
              
        }
        return false;
    }

    private void explosives() {
        System.out.println("*** explosives function called ***");
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

    private void smokeBombs() {
        System.out.println("*** smokeBombs function called ***");
    }
}
