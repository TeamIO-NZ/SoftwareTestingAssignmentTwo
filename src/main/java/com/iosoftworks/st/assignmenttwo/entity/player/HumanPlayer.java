package com.iosoftworks.st.assignmenttwo.entity.player;

public class HumanPlayer extends Player {

    @Override
    public void turnLogic() {
        //todo add logic here so players can choose to roll again or hold.
        //display numbers
        //roll or not
        //hold

    }
    public void displayCurrentScore(){
        int startingY = 6;
        for(int i = 0; i < this.score.size(); i++){
            //todo this is for when joes thing is pushed
           // terminal.writeString(score.get(i), 2,6+i, false);
        }

    }
    //new roll already exists


    //end of turn function that we dont know how to do yet

}
