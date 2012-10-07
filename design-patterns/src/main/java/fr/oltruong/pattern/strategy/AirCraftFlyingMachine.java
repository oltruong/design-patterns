/*
 * @author oltruong
 */
package fr.oltruong.pattern.strategy;

import fr.oltruong.pattern.strategy.behavior.AircraftFlyingBehavior;


public class AirCraftFlyingMachine extends FlyingMachine {

	public AirCraftFlyingMachine(){
		flyingBehavior = new AircraftFlyingBehavior();
	}

}
