package com.iosoftworks.st.assignmenttwo.models.player.ai;

import com.iosoftworks.st.assignmenttwo.models.player.Player;

public class AIPlayer extends Player {

    @Override
    public void turnLogic() {
        //todo check this is what we actually want
        while(totalScore < 15){
            newRoll();
        }
    }
}
