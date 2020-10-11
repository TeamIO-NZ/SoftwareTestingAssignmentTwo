package com.iosoftworks.st.assignmenttwo.models.player;

public abstract class Player {
    public String name;
    public int score;

    public abstract void fold();
    public abstract void hold();
}
