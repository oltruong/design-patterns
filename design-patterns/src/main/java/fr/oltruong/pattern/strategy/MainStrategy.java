/**
 * @author oltruong
 */
package fr.oltruong.pattern.strategy;

import fr.oltruong.pattern.strategy.behavior.NoFlyingBehavior;

public class MainStrategy
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        FlyingMachine enginVolant = new CopterFlyingMachine();
        enginVolant.performFly();
        enginVolant.setFlyingBehavior( new NoFlyingBehavior() );
        enginVolant.performFly();

    }

}
