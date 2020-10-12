package com.iosoftworks.st.assignmenttwo;

import java.util.Random;

public class Roller {
    Random rand = new Random();
    public int roll(){
        //this was found from a test failing
       return rand.nextInt(12) + 1;
    }
}
