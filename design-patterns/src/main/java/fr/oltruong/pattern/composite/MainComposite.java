package fr.oltruong.pattern.composite;

/**
 * Composite pattern describes that a group of objects are to be treated in the same way as a single instance of an
 * object
 * 
 * @author oltruong
 */
public class MainComposite
{

    public static void main( String[] args )
    {
        TeamMember member = new TeamMember( "Bob" );
        TeamMember member2 = new TeamMember( "Joe" );
        TeamMember member3 = new TeamMember( "Bill" );

        TeamMember member4 = new TeamMember( "Helmut" );
        TeamMember member5 = new TeamMember( "Klaus" );
        TeamMember member6 = new TeamMember( "Pedro" );
        TeamMember member7 = new TeamMember( "Dimitri" );

        Team team1 = new Team( "Winner team" );

        Team team2 = new Team( "Happy team" );

        Team team3 = new Team( "Crazy team" );

        team3.add( member6 );
        team3.add( member7 );
        team2.add( member5 );
        team2.add( team3 );
        team1.add( member );
        team1.add( team2 );
        team1.add( member2 );
        team1.add( member3 );
        team1.add( member4 );

        team1.print();

    }
}
