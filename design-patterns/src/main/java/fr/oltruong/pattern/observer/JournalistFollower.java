/*
 * @author oltruong
 */
package fr.oltruong.pattern.observer;

public class JournalistFollower implements IObserver {

	
	
	private ISubject subject;
	
	public JournalistFollower(ISubject mySubject){
		subject = mySubject;
		subject.registerObserver(this);
	}
	
	
	public void update() {

		System.out.println("J'écris une mise à jour !!!");
	}

}
