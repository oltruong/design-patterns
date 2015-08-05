package com.oltruong.pattern.behavioral.visitor;

/**
 * @author oltruong
 */
public class Kitchen
    implements Element
{

    public void accept( Visitor visitor )
    {
        visitor.visit( this );

    }

    public void checkingKitchen()
    {
        System.out.println( "Checking the kitchen" );
    }

}
