package fr.oltruong.pattern.behavioral.mediator;

/**
 * @author oltruong
 */
public class TeamAlpha
{

    private Mediator mediator;

    public TeamAlpha( Mediator mediator )
    {
        this.mediator = mediator;
    }

    public void sendAlarm( int priority )
    {
        System.out.println( "Sending alarm from team alpha" );
        mediator.sendAlarm( priority );
    }

    public void wakeUp()
    {
        System.out.println( "Wake up team alpha!" );
    }

}
