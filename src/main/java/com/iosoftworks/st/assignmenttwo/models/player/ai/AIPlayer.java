package com.iosoftworks.st.assignmenttwo.models.player.ai;

import com.iosoftworks.st.assignmenttwo.models.player.Player;

import javax.management.relation.Role;

public class AIPlayer extends Player {

    @Override
    public void turnLogic() {
        while(totalScore < 15){
            newRoll();
        }
    }
}
