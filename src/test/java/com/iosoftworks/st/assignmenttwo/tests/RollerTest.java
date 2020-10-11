package com.iosoftworks.st.assignmenttwo.tests;

import org.junit.Assert;
import org.junit.Test;

public class RollerTest {
    @Test
    public void rollMins_expectZero_shouldFail(){
       Assert.assertEquals(Roller.roll(), 0);
    }
    @Test
    public void rollMins_expectNegativeOne_shouldFail(){
        Assert.assertEquals(Roller.roll(), -1);
    }
    @Test
    public void rollMins_expectNegativeOne_shouldFail(){
        Roller.roll(Integer.MIN_VALUE);
    }
}
