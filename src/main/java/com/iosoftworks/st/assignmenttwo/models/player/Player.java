package com.iosoftworks.st.assignmenttwo.models.player;

import java.util.List;

public abstract class Player {
    public String name;
    public List<Integer> score;

    public abstract void fold();
    public abstract void hold();
}
