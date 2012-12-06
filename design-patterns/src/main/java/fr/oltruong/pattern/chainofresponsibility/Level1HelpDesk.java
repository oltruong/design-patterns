package fr.oltruong.pattern.chainofresponsibility;

/**
 * @author oltruong
 */
public class Level1HelpDesk
    extends HelpDesk
{

    public Level1HelpDesk( int severity )
    {
        super( severity );

    }

    @Override
    void doTheJob()
    {
        System.out.println( "Level1 will handle this" );

    }

}
