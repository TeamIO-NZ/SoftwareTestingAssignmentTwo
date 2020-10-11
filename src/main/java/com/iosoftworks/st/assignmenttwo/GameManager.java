package com.iosoftworks.st.assignmenttwo;

import com.iosoftworks.st.assignmenttwo.models.player.Player;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private List<Player> players = new ArrayList<>();
    private static GameManager instance;

    private GameManager() {
        // do init here
    }

    public static GameManager getInstance() {
        if(instance == null) instance = new GameManager();
        return instance;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
