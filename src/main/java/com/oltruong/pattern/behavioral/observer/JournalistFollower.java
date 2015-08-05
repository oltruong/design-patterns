/*
 * @author oltruong
 */
package com.oltruong.pattern.behavioral.observer;

public class JournalistFollower
    implements IObserver
{

    private ISubject subject;

    public JournalistFollower( ISubject mySubject )
    {
        subject = mySubject;
        subject.registerObserver( this );
    }

    public void update()
    {

        System.out.println( "Observer: Cool, having an update!" );
    }

}
