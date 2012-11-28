package fr.oltruong.pattern.iterator;

import java.util.Iterator;

/**
 * @author oltruong
 */
public interface Aggregate
{

    public Iterator<Item> createIterator();
}
