package com.iosoftworks.st.assignmenttwo;

import com.iosoftworks.st.assignmenttwo.entity.player.Player;
import com.iosoftworks.st.assignmenttwo.entity.player.AIPlayer;
import com.iosoftworks.st.assignmenttwo.entity.player.HumanPlayer;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private final List<Player> players = new ArrayList<>();
    private static GameManager instance;


    private GameManager() {
        Roller roller = new Roller();
        this.players.addAll(new ArrayList<Player>() {{
            add(new HumanPlayer());
            add(new AIPlayer());
        }});
        players.forEach(Player::initialHand);
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


    public void beginLoop() {
        boolean shouldExit = false;


        while(!shouldExit) {
            // player turn
            players.get(0).turnLogic();
            // ai turn
            players.get(1).turnLogic();

            // check victor
            checkVictor();
            // prompt continue?
            // if !continue: shouldExit = true;

        }
    }
}
