package com.oltruong.pattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * FlyWeight pattern enable to have multiple "virtual" instances from one instance to minimize memory. It shares as much
 * data as possible with siblings.
 * 
 * @author oltruong
 */
public class MainFlyWeight
{

    public static void main( String[] args )
    {

        System.out.println( "I need actors" );
        List<Actor> actors = new ArrayList<Actor>( 200 );
        ActorFactory factory = new ActorFactory();

        System.out.println( "I need 50 actors John" );
        for ( int i = 0; i < 50; i++ )
        {
            actors.add( factory.getActor( "John" ) );
        }

        System.out.println( "I need 150 actors Pamela" );
        for ( int i = 0; i < 50; i++ )
        {
            actors.add( factory.getActor( "Pamela" ) );
        }

        System.out.println( "OK so now I have " + actors.size() + " actors" );
        System.out.println( "But really we have instantiated only " + factory.getNumberOfActors() + " different actors" );

        /**
         * This way I can have a lot of instances without a lot of memory, but my objects are linked
         */

    }
}
