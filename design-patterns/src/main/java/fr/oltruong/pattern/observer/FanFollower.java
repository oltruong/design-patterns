/*
 * @author oltruong
 */
package fr.oltruong.pattern.observer;

public class FanFollower implements IObserver {

	
	private ISubject subject;
	
	public FanFollower(ISubject mySubject){
		subject = mySubject;
		subject.registerObserver(this);
	}
	
	public void update() {

		System.out.println("Wooow il se passe quelque chose");
		
	}

	
	

}
