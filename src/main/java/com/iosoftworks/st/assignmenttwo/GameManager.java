package com.iosoftworks.st.assignmenttwo;

import com.iosoftworks.st.assignmenttwo.models.player.Player;
import com.iosoftworks.st.assignmenttwo.models.player.ai.AIPlayer;
import com.iosoftworks.st.assignmenttwo.models.player.human.HumanPlayer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GameManager {
    private final List<Player> players = new ArrayList<>();
    private static GameManager instance;


    private GameManager() {
        Roller roller = new Roller();
        Player human = new HumanPlayer();
        Player ai = new AIPlayer();
        players.add(human);
        players.add(ai);

        human.initialHand();
        ai.initialHand();

        //todo middle steps. actual game logic bit


        checkVictor();

    }

    public static GameManager getInstance() {
        if(instance == null) instance = new GameManager();
        return instance;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void checkVictor(){
        if(players.get(0).totalScore > 21){
            if(players.get(1).totalScore > 21){
                //todo neither wins
                System.out.println("neither wins");
            }
            else{
                //todo human wins
                System.out.println("human wins");
            }
        }
       else if(players.get(1).totalScore > 21){
            if(players.get(0).totalScore > 21){
                //todo neither wins
                System.out.println("neither wins");
            }
            else{
                //todo ai wins
                System.out.println("ai wins");
            }
        }
       if (players.get(0).totalScore > players.get(1).totalScore){
           System.out.println("human wins");
       }else if (players.get(1).totalScore > players.get(0).totalScore){
           System.out.println("ai wins");
       }
    }
}
