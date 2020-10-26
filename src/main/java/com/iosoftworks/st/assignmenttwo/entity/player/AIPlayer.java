package com.iosoftworks.st.assignmenttwo.entity.player;

public class AIPlayer extends Player {

    @Override
    public void turnLogic() {
        //todo check this is what we actually want
        while(totalScore < 15){
            newRoll();
        }
    }
}
