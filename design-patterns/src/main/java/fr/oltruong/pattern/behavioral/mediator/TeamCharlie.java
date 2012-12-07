package fr.oltruong.pattern.behavioral.mediator;

/**
 * @author oltruong
 */
public class TeamCharlie
{

    private Mediator mediator;

    public TeamCharlie( Mediator mediator )
    {
        this.mediator = mediator;
    }

    public void sendAlarm( int priority )
    {
        System.out.println( "Sending alarm from team charlie" );
        mediator.sendAlarm( priority );
    }

    public void redalert()
    {
        System.out.println( "Red alert for team charlie" );
    }

}
