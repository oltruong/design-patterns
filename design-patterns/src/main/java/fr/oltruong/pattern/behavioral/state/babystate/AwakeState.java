package fr.oltruong.pattern.behavioral.state.babystate;

import fr.oltruong.pattern.behavioral.state.Baby;

/**
 * @author oltruong
 */
public class AwakeState
    extends BabyState
{

    public AwakeState( Baby baby )
    {
        this.baby = baby;
    }

    public void feed()
    {
        System.out.println( "I'm not hungry, I want to play!" );
    }

    public void play()
    {
        System.out.println( "I like to play" );
        baby.setState( baby.getTiredState() );

    }

    public void goToSleep()
    {
        System.out.println( "I'm not tired, I want to play!" );

    }

}
