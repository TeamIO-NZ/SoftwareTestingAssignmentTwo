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
            add(new HumanPlayer("Human"));
            add(new AIPlayer("Ai"));
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

    public Player checkVictor(){
        //easy reference for players
        Player humanPlayer = players.get(0);
        Player aiPlayer = players.get(1);
        if (humanPlayer.totalScore > 21 && aiPlayer.totalScore > 21){
            System.out.println("neither wins");
            return null;
        }
        else if (humanPlayer.totalScore == 21 && aiPlayer.totalScore == 21){
            System.out.println("its a draw");
            return null;
        }
        else if (humanPlayer.totalScore == 21 && aiPlayer.totalScore < 21){
            System.out.println("human wins");
            return humanPlayer;
        }
        else if (humanPlayer.totalScore < 21 && aiPlayer.totalScore == 21){
            System.out.println("ai wins");
            return aiPlayer;
        }
        else if (humanPlayer.totalScore > 21 && aiPlayer.totalScore < 21){
            System.out.println("ai wins");
            return aiPlayer;
        }
        else if (humanPlayer.totalScore < 21 && aiPlayer.totalScore > 21){
            System.out.println("human wins");
            return aiPlayer;
        }
        else{
            if (humanPlayer.totalScore < aiPlayer.totalScore){
                System.out.println("ai wins");
                return aiPlayer;
            }
            else{
                System.out.println("human wins");
                return humanPlayer;
            }
        }
    }

    public void beginLoop() {
        boolean shouldExit = false;


        while(!shouldExit) {
            // player turn
            boolean isPlayerDone = players.get(0).turnLogic();
            // ai turn
            boolean isAIDone =players.get(1).turnLogic();
            // check victor
            Player victor = checkVictor();
            // prompt continue?
            // if !continue: shouldExit = true;

            shouldExit = !InputManager.getInstance().promptBool("Play Again?");
        }
    }
}
