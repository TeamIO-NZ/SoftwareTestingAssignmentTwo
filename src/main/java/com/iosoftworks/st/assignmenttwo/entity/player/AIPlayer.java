package com.iosoftworks.st.assignmenttwo.entity.player;

public class AIPlayer extends Player {
    public AIPlayer(String name){
        this.name = name;
    }
    @Override
    public boolean turnLogic() {
        this.initialHand();
        this.displayCurrentScore();
        while(totalScore < 15){
            newRoll();
            this.displayCurrentScore();
        }
        return true;
    }

}
