package fr.oltruong.pattern.templatemethod;

/**
 * @author oltruong
 */
public class ClassyRestaurant
    extends AbstractRestaurant
{

    @Override
    void orderFood()
    {
        System.out.println( "Talking to the waitress." );

    }

    @Override
    void haveFoodDelivered()
    {
        System.out.println( "The waitress brings the dishes." );

    }

    @Override
    void leave()
    {
        System.out.println( "The waitress says: 'Thank you! Please come back again!'" );

    }

    @Override
    protected boolean hypeRestaurant()
    {
        return true;
    }

    @Override
    protected void enjoyApetizers()
    {
        System.out.println( "Enjoying some nice apetizers." );
    }

}
