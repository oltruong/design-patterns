package com.oltruong.pattern.behavioral.state.babystate;

import com.oltruong.pattern.behavioral.state.Baby;

/**
 * @author oltruong
 */
public abstract class BabyState
{

    protected Baby baby;

    public abstract void feed();

    public abstract void play();

    public abstract void goToSleep();
}
