package fr.oltruong.pattern.mediator;

/**
 * Mediator enables the centralization of communications into one object. All objects don't have to know each other
 * 
 * @author oltruong
 */
public class MainMediator
{

    public static void main( String[] args )
    {
        ConcreteMediator mediator = new ConcreteMediator();

        TeamAlpha alphaTeam = new TeamAlpha( mediator );
        TeamBeta betaTeam = new TeamBeta( mediator );
        TeamCharlie charlieTeam = new TeamCharlie( mediator );

        mediator.setAlphaTeam( alphaTeam );
        mediator.setBetaTeam( betaTeam );

        mediator.setCharlieTeam( charlieTeam );

        alphaTeam.sendAlarm( 0 );

        betaTeam.sendAlarm( 3 );

        charlieTeam.sendAlarm( 1 );
    }

}
