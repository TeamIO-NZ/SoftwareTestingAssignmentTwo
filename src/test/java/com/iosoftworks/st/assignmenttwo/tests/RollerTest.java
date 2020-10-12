package com.iosoftworks.st.assignmenttwo.tests;

import com.iosoftworks.st.assignmenttwo.Roller;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollerTest {
    Roller roller;
    @Before
    public void init(){
        roller = new Roller();
    }

    @Test
    public void rollMins_shouldFail(){
        assertFalse("Error, Fails if the rollers rolls are below zero",  roller.roll()  <= 0);
    }
    @Test
    public void rollValidValue_shouldTrue(){
        int value = roller.roll();
        assertTrue("Rolled Correct Number",  value  >= 1 && value <= 13);
    }
    @Test
    public void rollMaxs_shouldFail(){
        int zero = 0;
        assertFalse("Error, Fails if the rollers rolls are above thirteen",  roller.roll()  >= 13);
    }
    @Test
    public void rollEdgeCase_checkZero_shouldFail(){
        int zero = 0;
        assertFalse("Error, Fails if the rollers rolls are above thirteen",  roller.roll() == 0);
    }
    @Test
    public void rollBaseCases_checkOneHundredPositiveNumbers_shouldPass(){
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = roller.roll();
        }
        for (int num :
                numbers) {
            if (num < 1 || num > 13){
                fail("Numbers out of bounds. Number: " + num);
            }
        }
    }
}
