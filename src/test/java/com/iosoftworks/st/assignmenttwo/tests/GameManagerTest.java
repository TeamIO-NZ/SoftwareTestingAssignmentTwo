package com.iosoftworks.st.assignmenttwo.tests;

import com.iosoftworks.st.assignmenttwo.GameManager;
import com.iosoftworks.st.assignmenttwo.models.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameManagerTest {

    @Before
    public void init(){
        GameManager.getInstance().getPlayers().add(new Player() {});
        GameManager.getInstance().getPlayers().add(new Player() {});
    }
    @Test
    public void CheckPlayerCount_ExpectingTwo(){
        Assert.assertEquals(GameManager.getInstance().getPlayers().size(), 2);
    }
    @Test
    public void CheckPlayersExist_ExpectingTrue(){
        for (int i = 0; i < GameManager.getInstance().getPlayers().size(); i++){
            if (GameManager.getInstance().getPlayers().get(i) == null){
                Assert.fail();
                break;
            }
        }
        Assert.assertTrue(true);
    }


}
