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
    public void rollEdgeCase_checkZero_shouldPass(){
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = roller.roll();
        }
        for (int num :
                numbers) {
            if (num == 0){
                fail("Numbers equals 0 ");
            }
        }
    }
    @Test
    public void rollEdgeCase_checkOne_shouldPass(){
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = roller.roll();
        }
        for (int num :
                numbers) {
            if(num == 1){
                assertEquals(1,num);
            }
        }
    }
    @Test
    public void rollEdgeCase_checkTwo_shouldPass(){
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = roller.roll();
        }
        for (int num :
                numbers) {
            if(num == 2){
                assertEquals(2,num);            }
        }
    }
    @Test
    public void rollEdgeCase_checkTwelve_shouldPass(){
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = roller.roll();
        }
        for (int num :
                numbers) {
            if(num == 12){
                assertEquals(12,num);            }
        }
    }
    @Test
    public void rollEdgeCase_checkThirteen_shouldPass(){
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = roller.roll();
        }
        for (int num :
                numbers) {
            if(num == 13){
                assertEquals(13,num);            }
        }
    }
    @Test
    public void rollEdgeCase_checkFourteen_shouldFail(){
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = roller.roll();
        }
        for (int num :
                numbers) {
            if(num == 14){
                fail("Number out of bounds. Number: " + num);            }
        }
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

    @Test
    public void sumNumbers_checkEightPlusTwo_equalsTen(){
        assertEquals(10, roller.sum(8,2));
    }
}
