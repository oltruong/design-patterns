package fr.oltruong.pattern.behavioral.mediator;

/**
 * @author oltruong
 */
public class ConcreteMediator
    implements Mediator
{

    private TeamAlpha alphaTeam;

    private TeamBeta betaTeam;

    private TeamCharlie charlieTeam;

    public void setAlphaTeam( TeamAlpha alphaTeam )
    {
        this.alphaTeam = alphaTeam;
    }

    public void setBetaTeam( TeamBeta betaTeam )
    {
        this.betaTeam = betaTeam;
    }

    public void setCharlieTeam( TeamCharlie charlieTeam )
    {
        this.charlieTeam = charlieTeam;
    }

    public void sendAlarm( int priority )
    {

        // Only the mediator knows what to do, others objects don't know

        if ( priority > 2 )
        {
            charlieTeam.redalert();
        }

        if ( priority > 1 )
        {
            betaTeam.alertTeamBeta();
        }

        if ( priority > 0 )
        {
            alphaTeam.wakeUp();
        }

    }

}
