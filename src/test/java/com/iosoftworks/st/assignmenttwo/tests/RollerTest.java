package com.iosoftworks.st.assignmenttwo.tests;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RollerTest {
    @Test
    public void rollMins_shouldFail(){
        int high = 0;
        assertTrue("Error, random is too low",  high  <= Roller.roll());    }

}
