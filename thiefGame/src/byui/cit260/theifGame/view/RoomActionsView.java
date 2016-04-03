/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theifGame.view;

/**
 *
 * @author sierrajane
 */
public class RoomActionsView extends View {
    
    public RoomActionsView() {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Actions Available                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nA - Attempt to Steal"
            + "\nS - Sneak"
            + "\nR - Search Room" 
            + "\nM - Move to New Room" 
            + "\nC - Crawl on Floor" 
            + "\nI - Use Item"
            + "\nE - Exit"
            + "\n--------------------------------------------------------------");
    }
    
    @Override
     public boolean doAction(String value) {
        char selection = value.toUpperCase().charAt(0);
        switch (selection) {
            case 'A': // attempt to steal
                this.steal();
                break;
            case 'S': // sneak
                this.sneak();
                break;
            case 'R': // search room
                this.searchRoom();
                break;
            case 'M': // move rooms
                this.moveRooms();
                break;
            case 'C': // crawl
                this.crawl();
                break;
            case 'I': //Use Item
                ListEquipmentView listEquipmentView = new ListEquipmentView();
                listEquipmentView.display();
            case 'E': // Exit
                return true;
            default:
                ErrorView.display("RoomActionsView",
                        "\n*** Invalid Selection *** Try again");
                break;       
        }
        return false;
     }
        
        private void steal() {
        System.out.println("*** steal function called ***");
    }
    
        private void sneak() {
        System.out.println("*** sneak function called ***");
    }
        private void searchRoom() {
        System.out.println("*** searchRoom function called ***");
    }
        private void moveRooms() {
        System.out.println("*** moveRooms function called ***");
    }
        private void crawl() {
        System.out.println("*** crawl function called ***");
    }
        private void explosives() {
        System.out.println("*** explosives function called ***");
    }
}
