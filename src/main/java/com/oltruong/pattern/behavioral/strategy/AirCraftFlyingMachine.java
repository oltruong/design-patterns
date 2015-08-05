/*
 * @author oltruong
 */
package com.oltruong.pattern.behavioral.strategy;

import com.oltruong.pattern.behavioral.strategy.behavior.AircraftFlyingBehavior;

public class AirCraftFlyingMachine
    extends FlyingMachine
{

    public AirCraftFlyingMachine()
    {
        flyingBehavior = new AircraftFlyingBehavior();
    }

}
