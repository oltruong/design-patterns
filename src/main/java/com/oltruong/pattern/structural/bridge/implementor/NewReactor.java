package com.oltruong.pattern.structural.bridge.implementor;

/**
 * @author oltruong
 */
public class NewReactor
    implements Reactor
{

    public void push()
    {
        System.out.println( "Full power from a new reactor!" );

    }

}
