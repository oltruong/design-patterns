package com.oltruong.pattern.behavioral.templatemethod;

/**
 * @author oltruong
 */
public abstract class AbstractRestaurant
{

    /**
     * My template method The algorithm of this method is final. Its decided by this class. However subclasses have to
     * implement some of the steps Method is final so that subclasses cannot change it
     */
    public final void haveDinner()

    {

        // abstract
        orderFood();

        // those 2 methods are hooks. Do nothing but can be used by subclasses
        if ( hypeRestaurant() )
        {
            enjoyApetizers();
        }

        // abstract
        haveFoodDelivered();

        enjoyDinner();
        pay();

        // abstract
        leave();
    }

    abstract void orderFood();

    protected boolean hypeRestaurant()
    {
        // Default value : false
        return false;
    }

    protected void enjoyApetizers()
    {
        // Default behavior : do nothing

    }

    abstract void haveFoodDelivered();

    /**
     * Method is final so that subclasses cannot change it
     */
    final void enjoyDinner()
    {
        System.out.println( "Enjoying my food with great company." );
    }

    final void pay()
    {
        System.out.println( "Paying with cash or credit card." );

    }

    abstract void leave();
}
