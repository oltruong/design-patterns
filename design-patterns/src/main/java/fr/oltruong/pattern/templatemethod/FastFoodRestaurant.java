package fr.oltruong.pattern.templatemethod;

/**
 * @author oltruong
 */
public class FastFoodRestaurant
    extends AbstractRestaurant
{

    @Override
    void orderFood()
    {
        System.out.println( "Going to the counter" );

    }

    @Override
    void haveFoodDelivered()
    {
        System.out.println( "Waiting at the counter" );
    }

    @Override
    void leave()
    {
        System.out.println( "Leaving as fast as I came" );

    }

}
