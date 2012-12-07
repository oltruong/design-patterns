package fr.oltruong.pattern.creational.singleton;

/**
 * Singleton eagerly created. Using the JVM to ensure uniqueness
 * 
 * @author oltruong
 */
public class SingletonEagerlyCreated
{
    private static SingletonEagerlyCreated myUniqueInstance = new SingletonEagerlyCreated();

    /**
     * Private constructor
     */
    private SingletonEagerlyCreated()
    {

    }

    /**
     * Use of synchronized
     * 
     * @return
     */
    public static SingletonEagerlyCreated getInstance()
    {
        return myUniqueInstance;
    }

}
