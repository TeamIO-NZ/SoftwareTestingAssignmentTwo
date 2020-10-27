package com.iosoftworks.st.assignmenttwo.entity.player;

import com.iosoftworks.st.assignmenttwo.InputManager;

public class HumanPlayer extends Player {
    public HumanPlayer(String name){
        this.name = name;
    }
    @Override
    public boolean turnLogic() {
        this.initialHand();
        //display numbers
        this.displayCurrentScore();
        //roll or not
        while (promptForNewRoll()){
            newRoll();
            this.displayCurrentScore();
        }
        //hold
        return true;
    }
    //prompt for new roll
    public boolean promptForNewRoll(){
     //todo ask if you want to draw more cards. return true or false
        return InputManager.getInstance().promptBool("Do you want to draw more cards");
    }
}
