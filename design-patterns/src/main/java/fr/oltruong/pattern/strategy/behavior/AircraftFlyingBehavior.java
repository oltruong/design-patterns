/*
 * @author oltruong
 */
package fr.oltruong.pattern.strategy.behavior;

public class AircraftFlyingBehavior implements FlyingBehavior {

	public void fly() {
		System.out.println("J'utilise des réacteurs");
		
	}

}
