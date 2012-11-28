package fr.oltruong.pattern.composite;

public class TeamMember
    extends TeamComponent
{

    private String name;

    public TeamMember( String name )
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void print()
    {
        System.out.println( "Name: " + getName() );
    }
}
