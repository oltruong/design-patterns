package com.oltruong.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight factory
 * 
 * @author oltruong
 */
public class ActorFactory
{

    private Map<String, Actor> actors = new HashMap<String, Actor>();

    public Actor getActor( String name )
    {

        Actor actor = actors.get( name );
        if ( actor == null )
        {
            actor = new Actor( name );
            actors.put( name, actor );
        }
        return actor;
    }

    public int getNumberOfActors()
    {
        return actors.size();
    }

}
