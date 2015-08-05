package com.oltruong.pattern.behavioral.memento;

/**
 * Memento pattern enables to restore an object to one of its previous states
 * 
 * @author oltruong
 */
public class MainMemento
{

    public static void main( String[] args )
    {
        ObjectToSave myObject = new ObjectToSave();
        TimeMachine timeMachine = new TimeMachine();

        myObject.setState( "state1" );
        myObject.setState( "state2" );

        Memento memento = new Memento( myObject );
        timeMachine.addMemento( memento.getSavedState() );

        myObject.setState( "state3" );

        Memento memento2 = new Memento( myObject );
        timeMachine.addMemento( memento2.getSavedState() );

        myObject.setState( "state4" );

        ObjectToSave myOldObject = timeMachine.getMemento( 0 );

        System.out.println( myOldObject.getState() );

    }
}
