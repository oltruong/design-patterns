package fr.oltruong.pattern.behavioral.iterator;

import java.util.Iterator;

/**
 * @author oltruong
 */
public interface Aggregate
{

    public Iterator<Item> createIterator();
}
