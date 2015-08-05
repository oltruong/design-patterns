package com.oltruong.pattern.creational.prototype;

import java.lang.*;

/**
 * @author oltruong
 */
public class MainPrototype
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        Character bob = new Character();
        bob.setName( "Bob" );

        for ( int i = 0; i < 5; i++ )
        {
            System.out.println( "Clone " + i + "'s name: " + bob.clone().getName() );
        }
    }
}
