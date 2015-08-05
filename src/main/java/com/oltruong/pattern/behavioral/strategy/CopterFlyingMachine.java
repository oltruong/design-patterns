/*
 * @author oltruong
 */
package com.oltruong.pattern.behavioral.strategy;

import com.oltruong.pattern.behavioral.strategy.behavior.CopterFlyingBehavior;

public class CopterFlyingMachine
    extends FlyingMachine
{

    public CopterFlyingMachine()
    {
        flyingBehavior = new CopterFlyingBehavior();
    }
}
