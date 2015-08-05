package com.oltruong.pattern.structural.bridge;

import com.oltruong.pattern.structural.bridge.abstraction.AbstractionAircraft;
import com.oltruong.pattern.structural.bridge.abstraction.Aircraft;
import com.oltruong.pattern.structural.bridge.implementor.NewReactor;
import com.oltruong.pattern.structural.bridge.implementor.OldReactor;

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
