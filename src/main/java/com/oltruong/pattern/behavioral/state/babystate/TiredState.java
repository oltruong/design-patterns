package com.oltruong.pattern.behavioral.state.babystate;

import com.oltruong.pattern.behavioral.state.Baby;

/**
 * @author oltruong
 */
public class TiredState
    extends BabyState
{

    public TiredState( Baby baby )
    {
        this.baby = baby;
    }

    public void feed()
    {
        System.out.println( "I'm not hungry, I'm tired!" );
    }

    public void play()
    {
        System.out.println( "I don't want to play, I'm tired!" );

    }

    public void goToSleep()
    {
        System.out.println( "Great! I'll wake up hungry" );
        baby.setState( baby.getHungryState() );

    }

}
