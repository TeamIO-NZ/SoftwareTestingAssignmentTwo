package com.iosoftworks.st.assignmenttwo.models.player;

import com.iosoftworks.st.assignmenttwo.Roller;

import java.util.List;

public abstract class Player {

    public String name;
    public List<Integer> score;
    public int totalScore;

    public abstract void fold();
    public abstract void hold();



    public void initialHand(Roller roller){
        score.add(roller.roll());
        score.add(roller.roll());
        sumScore();
    }
    public void newRoll(Roller roller){
        score.add(roller.roll());
        sumScore();
    }
    public void sumScore(){
        totalScore = 0;
        for (int num :
                score) {
            totalScore += num;
        }
    }
}
