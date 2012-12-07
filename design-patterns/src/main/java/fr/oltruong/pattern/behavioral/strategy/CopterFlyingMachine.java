/*
 * @author oltruong
 */
package fr.oltruong.pattern.behavioral.strategy;

import fr.oltruong.pattern.behavioral.strategy.behavior.CopterFlyingBehavior;

public class CopterFlyingMachine
    extends FlyingMachine
{

    public CopterFlyingMachine()
    {
        flyingBehavior = new CopterFlyingBehavior();
    }
}
