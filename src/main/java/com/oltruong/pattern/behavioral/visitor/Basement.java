package com.oltruong.pattern.behavioral.visitor;

/**
 * @author oltruong
 */
public class Basement
    implements Element

{

    public void accept( Visitor visitor )
    {
        visitor.visit( this );

    }

    public void goingToTheBasement()
    {
        System.out.println( "Going to the basement" );
    }

}
