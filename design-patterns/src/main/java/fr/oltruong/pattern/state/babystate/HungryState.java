package fr.oltruong.pattern.state.babystate;

import fr.oltruong.pattern.state.Baby;

/**
 * @author oltruong
 */
public class HungryState
    extends BabyState
{

    public HungryState( Baby baby )
    {
        this.baby = baby;
    }

    public void feed()
    {
        System.out.println( "Thank you I was hungry!!" );
        baby.setState( baby.getAwakeState() );
    }

    public void play()
    {
        System.out.println( "I don't want to play, I'm hungry!" );

    }

    public void goToSleep()
    {
        System.out.println( "I'm not tired, I'm hungry" );
    }

}
