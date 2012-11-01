/*
 * @author oltruong
 */
package fr.oltruong.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class VIPSubject
    implements ISubject
{

    private List<IObserver> followers = new ArrayList<IObserver>();

    public void notifyObserver()
    {

        for ( IObserver observer : followers )
        {
            observer.update();
        }

    }

    public void registerObserver( IObserver observer )
    {
        followers.add( observer );

    }

    public void removeObserver( IObserver observer )
    {

        if ( followers.contains( observer ) )
        {
            followers.remove( observer );
        }

    }

}
