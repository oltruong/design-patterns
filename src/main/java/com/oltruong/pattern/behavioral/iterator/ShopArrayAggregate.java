package com.oltruong.pattern.behavioral.iterator;

import java.util.Iterator;

/**
 * @author oltruong
 */
public class ShopArrayAggregate
    implements Aggregate
{

    private Item[] items;

    public ShopArrayAggregate()
    {
        items = new Item[2];

        Item item1 = new Item( "chocolate", 0.75f );
        Item item2 = new Item( "cake", 3.25f );

        items[0] = item1;
        items[1] = item2;

    }

    public Iterator<Item> createIterator()
    {

        return new ArrayIterator( items );
    }

}
