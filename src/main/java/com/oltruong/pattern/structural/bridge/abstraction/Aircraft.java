package com.oltruong.pattern.structural.bridge.abstraction;

import com.oltruong.pattern.structural.bridge.implementor.Reactor;

public class Aircraft
    extends AbstractionAircraft
{

    public Aircraft( Reactor reactor )
    {
        super( reactor );

    }

    @Override
    public void takeOff()
    {
        System.out.println( "Taking off..." );
        super.takeOff();
    }

}
