/*
 * @author oltruong
 */
package com.oltruong.pattern.behavioral.strategy;

import com.oltruong.pattern.behavioral.strategy.behavior.FlyingBehavior;

public abstract class FlyingMachine
{

    protected FlyingBehavior flyingBehavior;

    public void performFly()
    {

        flyingBehavior.fly();
    }

    public void setFlyingBehavior( FlyingBehavior flyingBehavior )
    {
        this.flyingBehavior = flyingBehavior;
    }

}
