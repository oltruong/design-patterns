package fr.oltruong.pattern.behavioral.memento;

import java.util.ArrayList;

/**
 * Caretaker
 * 
 * @author oltruong
 */
public class TimeMachine
{
    private ArrayList<ObjectToSave> objects = new ArrayList<ObjectToSave>();

    public void addMemento( ObjectToSave object )
    {
        objects.add( object );
    }

    public ObjectToSave getMemento( int index )
    {
        return objects.get( index );
    }
}
