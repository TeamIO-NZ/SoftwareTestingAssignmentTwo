package com.iosoftworks.st.assignmenttwo.tests;

import com.iosoftworks.st.assignmenttwo.Roller;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RollerTest {
    Roller roller;
    @Before
    public void init(){
        roller = new Roller();
    }

    @Test
    public void rollMins_shouldFail(){
        int zero = 0;
        assertFalse("Error, Rolled number to low",  roller.roll()  <= zero);
    }

}
