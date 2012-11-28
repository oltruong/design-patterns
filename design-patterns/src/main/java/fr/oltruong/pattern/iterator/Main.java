package fr.oltruong.pattern.iterator;

/**
 * Iterator is a behavioral design pattern that accesses the elements of an object sequentially without exposing its
 * underlying representation
 * 
 * @author oltruong
 */
public class Main
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        Client client = new Client( new ShopArrayAggregate(), new ShopListAggregate() );

        client.printItems();

    }
}
