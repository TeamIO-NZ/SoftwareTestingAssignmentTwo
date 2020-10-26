package com.iosoftworks.st.assignmenttwo.entity.player;

import com.iosoftworks.st.assignmenttwo.Roller;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    public String name;
    public List<Integer> score = new ArrayList<>(); // found fix via testing "= new ArrayList<>();"
    public int totalScore;

    public abstract void turnLogic();

    Roller roller = new Roller();

    public void initialHand(){
        this.score.add(roller.roll());
        this.score.add(roller.roll());
    }

    public void newRoll(){
        int roll = roller.roll();
        score.add(roll);
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
