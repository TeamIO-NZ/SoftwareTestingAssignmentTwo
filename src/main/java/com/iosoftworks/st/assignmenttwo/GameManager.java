package com.iosoftworks.st.assignmenttwo;

import com.iosoftworks.st.assignmenttwo.models.player.Player;
import com.iosoftworks.st.assignmenttwo.models.player.ai.AIPlayer;
import com.iosoftworks.st.assignmenttwo.models.player.human.HumanPlayer;

import java.util.ArrayList;
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

        human.score.add(roller.roll());
        human.score.add(roller.roll());
        ai.score.add(roller.roll());
        ai.score.add(roller.roll());



    }

    public static GameManager getInstance() {
        if(instance == null) instance = new GameManager();
        return instance;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
