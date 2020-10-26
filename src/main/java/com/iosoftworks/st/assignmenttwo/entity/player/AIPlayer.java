package com.iosoftworks.st.assignmenttwo.entity.player;

public class AIPlayer extends Player {

    @Override
    public boolean turnLogic() {
        this.initialHand();
        displayCurrentScore();
        while(totalScore < 15){
            newRoll();
        }
        return true;
    }
    //todo move this to player?
    //todo make it draw to the write place
    public void displayCurrentScore(){
        int startingY = 6;
        for(int i = 0; i < this.score.size(); i++){
            //todo this is for when joes thing is pushed
            // terminal.writeString(score.get(i), 2,6+i, false);
        }
    }
}
