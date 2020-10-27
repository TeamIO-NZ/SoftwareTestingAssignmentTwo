package com.iosoftworks.st.assignmenttwo.entity.player;

import com.iosoftworks.st.assignmenttwo.Roller;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    public String name;
    public List<Integer> score = new ArrayList<>(); // found fix via testing "= new ArrayList<>();"
    public int totalScore;

    //returns true when turn is complete
    public abstract boolean turnLogic();

    Roller roller = new Roller();

    public void initialHand(){
        score.clear();
        this.score.add(roller.roll());
        this.score.add(roller.roll());
        sumScore();
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
    public void displayCurrentScore(){
        int startingY = 6;
        for(int i = 0; i < this.score.size(); i++){
            System.out.println(this.name + " num # " + this.score.get(i));
        }
        System.out.println("Total Score: " + this.totalScore);
    }
}
