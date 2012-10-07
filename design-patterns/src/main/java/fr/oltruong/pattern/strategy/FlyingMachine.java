/*
 * @author oltruong
 */
package fr.oltruong.pattern.strategy;

import fr.oltruong.pattern.strategy.behavior.FlyingBehavior;

public abstract class FlyingMachine {

	protected FlyingBehavior flyingBehavior;
	
	
	public void performFly() {
	
		flyingBehavior.fly();
	}


	public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
		this.flyingBehavior = flyingBehavior;
	}
	
	
}
