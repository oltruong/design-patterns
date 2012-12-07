package fr.oltruong.pattern.behavioral.state.babystate;

import fr.oltruong.pattern.behavioral.state.Baby;

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
