package fr.oltruong.pattern.behavioral.chainofresponsibility;

/**
 * @author oltruong
 */
public class Level2HelpDesk
    extends HelpDesk
{

    public Level2HelpDesk( int severity )
    {
        super( severity );
    }

    @Override
    void doTheJob()
    {
        System.out.println( "This is a level2 situation" );

    }

}
