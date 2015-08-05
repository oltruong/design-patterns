package com.oltruong.pattern.creational.singleton;

/**
 * Singleton secure with synchronized. OK if no performance issue
 * 
 * @author oltruong
 */
public class SingletonSynchronized
{
    private static SingletonSynchronized myUniqueInstance;

    /**
     * Private constructor
     */
    private SingletonSynchronized()
    {

    }

    /**
     * Use of synchronized
     * 
     * @return
     */
    public static synchronized SingletonSynchronized getInstance()
    {
        if ( myUniqueInstance == null )
        {
            myUniqueInstance = new SingletonSynchronized();
        }
        return myUniqueInstance;
    }

}
