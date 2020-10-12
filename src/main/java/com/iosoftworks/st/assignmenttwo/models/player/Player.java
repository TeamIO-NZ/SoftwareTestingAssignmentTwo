package com.iosoftworks.st.assignmenttwo.models.player;

import com.iosoftworks.st.assignmenttwo.Roller;

import java.util.List;

public abstract class Player {

    public String name;
    public List<Integer> score;
    public int totalScore;

    public abstract void turnLogic();

    Roller roller = new Roller();

    public void initialHand(){
        score.add(roller.roll());
        score.add(roller.roll());
        sumScore();
    }
    public void newRoll(){
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
