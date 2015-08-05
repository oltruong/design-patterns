package com.oltruong.pattern.behavioral.memento;

/**
 * @author oltruong
 */
public class ObjectToSave
    implements Cloneable
{

    @Override
    public ObjectToSave clone()

    {

        ObjectToSave clone = new ObjectToSave();
        clone.setState( state );
        return clone;
    }

    private String state;

    public void setState( String state )
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }

}
