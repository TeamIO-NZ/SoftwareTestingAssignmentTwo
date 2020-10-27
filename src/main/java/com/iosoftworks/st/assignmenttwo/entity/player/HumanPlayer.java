package com.iosoftworks.st.assignmenttwo.entity.player;

public class HumanPlayer extends Player {

    @Override
    public boolean turnLogic() {
        this.initialHand();
        //display numbers
        this.displayCurrentScore("Human");
        //roll or not
        while (promptForNewRoll()){
            newRoll();
            this.displayCurrentScore("Human");
        }
        //hold
        return true;
    }
    //prompt for new roll
    public boolean promptForNewRoll(){
        String input = "";
     //todo ask if you want to draw more cards. return true or false
        if (input.equals("n")){
            return false;
        }
        else {
            return true;

        }
    }
}
