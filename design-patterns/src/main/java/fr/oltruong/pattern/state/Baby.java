package fr.oltruong.pattern.state;

import fr.oltruong.pattern.state.babystate.AwakeState;
import fr.oltruong.pattern.state.babystate.BabyState;
import fr.oltruong.pattern.state.babystate.HungryState;
import fr.oltruong.pattern.state.babystate.TiredState;

/**
 * This a baby robot
 * 
 * @author oltruong
 */
public class Baby
{

    private BabyState awakeState;

    private BabyState hungryState;

    private BabyState tiredState;

    private BabyState state;

    public Baby()
    {

        awakeState = new AwakeState( this );
        hungryState = new HungryState( this );
        tiredState = new TiredState( this );
        state = awakeState;

    }

    public void feed()
    {
        state.feed();
    }

    public void goToSleep()
    {
        state.goToSleep();
    }

    public void play()
    {
        state.play();
    }

    public void setState( BabyState state )
    {
        this.state = state;
    }

    public BabyState getAwakeState()
    {
        return awakeState;
    }

    public BabyState getHungryState()
    {
        return hungryState;
    }

    public BabyState getTiredState()
    {
        return tiredState;
    }

}
