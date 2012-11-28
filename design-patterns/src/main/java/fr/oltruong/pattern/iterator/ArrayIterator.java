package fr.oltruong.pattern.iterator;

import java.util.Iterator;

/**
 * @author oltruong
 */
public class ArrayIterator
    implements Iterator<Item>
{
    Item[] items;

    int currentPosition = 0;

    public ArrayIterator( Item[] items )
    {
        this.items = items;
    }

    public boolean hasNext()
    {
        return currentPosition < items.length && items[currentPosition] != null;
    }

    public Item next()
    {
        currentPosition++;
        return items[currentPosition - 1];
    }

    public void remove()
    {
        throw new UnsupportedOperationException( "Not implemented here" );
    }

}
