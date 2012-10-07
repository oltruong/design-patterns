/*
 * @author oltruong
 */
package fr.oltruong.pattern.observer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VIPSubject vip = new VIPSubject();
		
		FanFollower fanFollower = new FanFollower(vip);
		new JournalistFollower(vip);
		
		
		vip.notifyObserver();
		vip.removeObserver(fanFollower);
		

	}

}
