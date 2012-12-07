/*
 * @author oltruong
 */
package fr.oltruong.pattern.behavioral.strategy;

import fr.oltruong.pattern.behavioral.strategy.behavior.AircraftFlyingBehavior;

public class AirCraftFlyingMachine
    extends FlyingMachine
{

    public AirCraftFlyingMachine()
    {
        flyingBehavior = new AircraftFlyingBehavior();
    }

}
