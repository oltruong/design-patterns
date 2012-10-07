/*
 * @author oltruong
 */
package fr.oltruong.pattern.observer;

public interface ISubject {

	void registerObserver(IObserver observer);
	
	void removeObserver(IObserver observer);
	
	void notifyObserver();
	
}
