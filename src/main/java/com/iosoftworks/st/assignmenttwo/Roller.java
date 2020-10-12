package com.iosoftworks.st.assignmenttwo;

import java.util.Random;

public class Roller {
    Random rand = new Random();
    public int roll(){
       return rand.nextInt(13);
    }
}
