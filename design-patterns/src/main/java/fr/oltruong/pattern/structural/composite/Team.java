package fr.oltruong.pattern.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team
    extends TeamComponent
{

    private List<TeamComponent> teamComponents = new ArrayList<TeamComponent>();

    private String teamName;

    public Team( String teamName )
    {
        this.teamName = teamName;
    }

    @Override
    public void add( TeamComponent component )
    {
        teamComponents.add( component );
    }

    @Override
    public void remove( TeamComponent component )
    {
        teamComponents.remove( component );
    }

    @Override
    public TeamComponent getChild( int i )
    {
        return teamComponents.get( i );
    }

    @Override
    public String getName()
    {
        return teamName;
    }

    @Override
    public void print()
    {
        System.out.println( "TeamName: " + getName() );
        Iterator<TeamComponent> iterator = teamComponents.iterator();
        while ( iterator.hasNext() )
        {
            iterator.next().print();
        }
        System.out.println( "-----" );
    }

}
