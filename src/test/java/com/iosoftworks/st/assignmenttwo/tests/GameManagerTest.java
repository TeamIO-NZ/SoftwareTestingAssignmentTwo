package com.iosoftworks.st.assignmenttwo.tests;

import com.iosoftworks.st.assignmenttwo.GameManager;
import com.iosoftworks.st.assignmenttwo.models.player.ai.AIPlayer;
import com.iosoftworks.st.assignmenttwo.models.player.human.HumanPlayer;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameManagerTest {

    @BeforeClass
    public static void init(){
        //don't need these because we init them in the game manager.
       //GameManager.getInstance().getPlayers().add(new HumanPlayer());
       //GameManager.getInstance().getPlayers().add(new AIPlayer());
    }


    @Test
    public void CheckPlayerCount_ExpectingTwo(){
        Assert.assertEquals(2, GameManager.getInstance().getPlayers().size());
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


    @Test
    public void initialHumanHand_testCount_expectsTwo(){
       Assert.assertEquals(2,GameManager.getInstance().getPlayers().get(0).score.size());
    }
    @Test
    public void initialAIHand_testCount_expectsTwo(){
        Assert.assertEquals(2,GameManager.getInstance().getPlayers().get(1).score.size());
    }

    @Test
    public void sumScoreHuman_testChange_expectsNotZero(){
        GameManager.getInstance().getPlayers().get(0).sumScore();
        Assert.assertTrue(GameManager.getInstance().getPlayers().get(0).totalScore >= 0);
    }
    @Test
    public void sumScoreAI_testChange_expectsNotZero(){
        GameManager.getInstance().getPlayers().get(1).sumScore();
        Assert.assertTrue(GameManager.getInstance().getPlayers().get(1).totalScore >= 0);
    }
    //TODO
    @Test
    public void CheckWinnerHuman_ExpectingTrue(){

    }
    //TODO
    @Test
    public void CheckWinnerAI_ExpectingTrue(){

    }
    //TODO
    @Test
    public void CheckWinnerDraw_ExpectingTrue(){

    }
    //TODO
    @Test
    public void CheckWinnerNotNull_ExpectingTrue(){

    }
}
