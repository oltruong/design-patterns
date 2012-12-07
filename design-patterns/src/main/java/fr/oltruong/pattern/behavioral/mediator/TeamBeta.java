package fr.oltruong.pattern.behavioral.mediator;

/**
 * @author oltruong
 */
public class TeamBeta
{

    private Mediator mediator;

    public TeamBeta( Mediator mediator )
    {
        this.mediator = mediator;
    }

    public void sendAlarm( int priority )
    {
        System.out.println( "Sending alarm from team beta" );
        mediator.sendAlarm( priority );
    }

    public void alertTeamBeta()
    {
        System.out.println( "Alert team beta!" );
    }

}
