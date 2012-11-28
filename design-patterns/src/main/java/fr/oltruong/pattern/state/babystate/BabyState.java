package fr.oltruong.pattern.state.babystate;

import fr.oltruong.pattern.state.Baby;

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
