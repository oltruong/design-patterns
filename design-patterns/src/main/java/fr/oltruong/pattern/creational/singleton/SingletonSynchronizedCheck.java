package fr.oltruong.pattern.creational.singleton;

/**
 * Singleton secure with synchronized only if singleton not instantiated
 * 
 * @author oltruong
 */
public class SingletonSynchronizedCheck
{
    private volatile static SingletonSynchronizedCheck myUniqueInstance;

    /**
     * Private constructor
     */
    private SingletonSynchronizedCheck()
    {

    }

    /**
     * Use of synchronized
     * 
     * @return
     */
    public static SingletonSynchronizedCheck getInstance()
    {
        if ( myUniqueInstance == null )
        {

            synchronized ( SingletonSynchronizedCheck.class )
            {
                if ( myUniqueInstance == null )
                {

                    myUniqueInstance = new SingletonSynchronizedCheck();

                }
            }
        }
        return myUniqueInstance;
    }

}
