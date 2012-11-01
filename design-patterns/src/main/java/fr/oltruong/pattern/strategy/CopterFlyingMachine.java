/*
 * @author oltruong
 */
package fr.oltruong.pattern.strategy;

import fr.oltruong.pattern.strategy.behavior.CopterFlyingBehavior;

public class CopterFlyingMachine
    extends FlyingMachine
{

    public CopterFlyingMachine()
    {
        flyingBehavior = new CopterFlyingBehavior();
    }
}
