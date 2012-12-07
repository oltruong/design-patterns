package fr.oltruong.pattern.behavioral.iterator;

/**
 * Iterator is a behavioral design pattern that accesses the elements of an object sequentially without exposing its
 * underlying representation
 * 
 * @author oltruong
 */
public class MainIterator
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
