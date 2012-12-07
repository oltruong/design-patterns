package fr.oltruong.pattern.structural.bridge.abstraction;

import fr.oltruong.pattern.structural.bridge.implementor.Reactor;

/**
 * @author oltruong
 */
public abstract class AbstractionAircraft
{

    // This 'Has A' relationship is the bridge
    protected Reactor reactor;

    public AbstractionAircraft( Reactor reactor )
    {
        this.reactor = reactor;
    }

    public void takeOff()
    {
        reactor.push();
    }

    public void setReactor( Reactor reactor )
    {
        this.reactor = reactor;
    }

}
