package fr.oltruong.pattern.bridge.abstraction;

import fr.oltruong.pattern.bridge.implementor.Reactor;

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
