package fr.oltruong.pattern.bridge;

import fr.oltruong.pattern.bridge.abstraction.AbstractionAircraft;
import fr.oltruong.pattern.bridge.abstraction.Aircraft;
import fr.oltruong.pattern.bridge.implementor.NewReactor;
import fr.oltruong.pattern.bridge.implementor.OldReactor;

/**
 * Bridge Pattern enables to vary implementations AND also abstractions
 * 
 * @author oltruong
 */
public class MainBridge
{

    public static void main( String[] args )
    {
        AbstractionAircraft aircraft = new Aircraft( new OldReactor() );
        aircraft.takeOff();

        // If reactor changes I don't have to rewrite AbstractionAircraft
        aircraft.setReactor( new NewReactor() );
        aircraft.takeOff();

    }

}
