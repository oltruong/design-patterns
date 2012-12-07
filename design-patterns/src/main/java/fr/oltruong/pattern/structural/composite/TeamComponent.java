package fr.oltruong.pattern.structural.composite;

public abstract class TeamComponent
{

    public void add( TeamComponent component )
    {
        throw new UnsupportedOperationException();
    }

    public void remove( TeamComponent component )
    {
        throw new UnsupportedOperationException();
    }

    public TeamComponent getChild( int i )
    {
        throw new UnsupportedOperationException();

    }

    public String getName()
    {
        throw new UnsupportedOperationException();

    }

    public void print()
    {
        throw new UnsupportedOperationException();

    }

}
