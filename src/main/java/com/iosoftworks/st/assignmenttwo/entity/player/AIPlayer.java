package com.iosoftworks.st.assignmenttwo.entity.player;

public class AIPlayer extends Player {

    @Override
    public boolean turnLogic() {
        this.initialHand();
        this.displayCurrentScore("Ai");
        while(totalScore < 15){
            newRoll();
            this.displayCurrentScore("Ai");
        }
        return true;
    }

}
