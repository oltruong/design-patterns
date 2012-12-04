package fr.oltruong.pattern.bridge.implementor;

/**
 * @author oltruong
 */
public class OldReactor
    implements Reactor
{

    public void push()
    {
        System.out.println( "It's hard for an old reactor..." );

    }

}
