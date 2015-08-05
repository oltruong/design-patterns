package com.oltruong.pattern.behavioral.memento;

/**
 * @author oltruong
 */
public class Memento
{

    private ObjectToSave object;

    public Memento( ObjectToSave objectToSave )
    {
        object = objectToSave.clone();
    }

    public ObjectToSave getSavedState()
    {
        return object;
    }

}
