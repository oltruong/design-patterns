package fr.oltruong.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author oltruong
 */
public class ShopListAggregate
    implements Aggregate
{
    private List<Item> items;

    public ShopListAggregate()
    {
        items = new ArrayList<Item>( 3 );

        Item item1 = new Item( "pen", 1.2f );
        Item item2 = new Item( "book", 15f );
        Item item3 = new Item( "laptop", 600f );

        items.add( item1 );
        items.add( item2 );
        items.add( item3 );

    }

    public Iterator<Item> createIterator()
    {
        return items.iterator();
    }

}
