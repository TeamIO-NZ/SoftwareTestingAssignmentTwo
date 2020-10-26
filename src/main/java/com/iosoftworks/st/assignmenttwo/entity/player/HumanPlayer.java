package com.iosoftworks.st.assignmenttwo.entity.player;

public class HumanPlayer extends Player {

    @Override
    public boolean turnLogic() {
        this.initialHand();
        //display numbers
        displayCurrentScore();
        //roll or not
        while (promptForNewRoll()){
            newRoll();
        }
        //hold
        return true;
    }
    //todo move this to player for better code practises?
    //would need math for the terminal but thats all
    public void displayCurrentScore(){
        int startingY = 6;
        for(int i = 0; i < this.score.size(); i++){
            //todo this is for when joes thing is pushed
           // terminal.writeString(score.get(i), 2,6+i, false);
        }
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
