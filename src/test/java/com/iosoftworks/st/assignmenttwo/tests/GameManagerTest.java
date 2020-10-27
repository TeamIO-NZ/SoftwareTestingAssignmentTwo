package com.iosoftworks.st.assignmenttwo.tests;

import com.iosoftworks.st.assignmenttwo.GameManager;
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
    @Test
    public void CheckWinnerHuman_Score21bar2_ExpectingTrue(){
        GameManager.getInstance().getPlayers().get(0).totalScore = 21;
        GameManager.getInstance().getPlayers().get(1).totalScore = 2;
        Assert.assertEquals(GameManager.getInstance().getPlayers().get(0),GameManager.getInstance().checkVictor());
    }
    @Test
    public void CheckWinnerAI_Score2bar21_ExpectingTrue(){
        GameManager.getInstance().getPlayers().get(0).totalScore = 2;
        GameManager.getInstance().getPlayers().get(1).totalScore = 21;
        Assert.assertEquals(GameManager.getInstance().getPlayers().get(1),GameManager.getInstance().checkVictor());
    }
    @Test
    public void CheckWinnerDraw_Score22bar22_ExpectingTrue(){
        GameManager.getInstance().getPlayers().get(0).totalScore = 22;
        GameManager.getInstance().getPlayers().get(1).totalScore = 22;
        Assert.assertNull(GameManager.getInstance().checkVictor());
    }
    @Test
    public void CheckWinnerHuman_Score21bar20_ExpectingTrue(){
        GameManager.getInstance().getPlayers().get(0).totalScore = 21;
        GameManager.getInstance().getPlayers().get(1).totalScore = 20;
        Assert.assertEquals(GameManager.getInstance().getPlayers().get(0),GameManager.getInstance().checkVictor());
    }
    @Test
    public void CheckWinnerAI_Score21bar20_ExpectingTrue(){
        GameManager.getInstance().getPlayers().get(0).totalScore = 20;
        GameManager.getInstance().getPlayers().get(1).totalScore = 21;
        Assert.assertEquals(GameManager.getInstance().getPlayers().get(1),GameManager.getInstance().checkVictor());
    }
}
