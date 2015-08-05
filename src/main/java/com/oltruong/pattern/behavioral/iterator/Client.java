package com.oltruong.pattern.behavioral.iterator;

import java.util.Iterator;

/**
 * @author oltruong
 */
public class Client
{

    private Aggregate agreggate1;

    private Aggregate agreggate2;

    public Client( Aggregate agreggate1, Aggregate agreggate2 )
    {
        this.agreggate1 = agreggate1;
        this.agreggate2 = agreggate2;
    }

    public void printItems()
    {
        System.out.println( "Agreggate1" );
        printItems( agreggate1 );
        System.out.println( "Agreggate2" );
        printItems( agreggate2 );
    }

    /**
     * Client doesn't know how agreggates are made
     * 
     * @param agreggate
     */
    public void printItems( Aggregate agreggate )
    {
        Iterator<Item> iterator = agreggate.createIterator();
        while ( iterator.hasNext() )
        {
            Item myItem = iterator.next();
            System.out.println( "Name " + myItem.getName() );
            System.out.println( "Price " + myItem.getPrice() );
        }
    }

}
