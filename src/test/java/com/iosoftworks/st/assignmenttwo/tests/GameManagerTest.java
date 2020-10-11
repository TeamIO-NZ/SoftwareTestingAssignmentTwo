package com.iosoftworks.st.assignmenttwo.tests;

import com.iosoftworks.st.assignmenttwo.GameManager;
import com.iosoftworks.st.assignmenttwo.models.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class GameManagerTest {

    @Before
    public void init(){
        GameManager.players.add(new Player());
        GameManager.players.add(new Player());
    }
    @Test
    public void CheckPlayerCount_ExpectingTwo(){
        Assert.assertEquals(GameManager.players.size(), 2);
    }
    @Test
    public void CheckPlayersExist_ExpectingTrue(){
        for (int i = 0; i < GameManager.players.size(); i++){
            if (GameManager.players.get(i) == null){
                Assert.fail();
                break;
            }
        }
        Assert.assertTrue(true);
    }


}
