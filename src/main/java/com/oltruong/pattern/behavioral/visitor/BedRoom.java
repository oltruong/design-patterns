package com.oltruong.pattern.behavioral.visitor;

/**
 * @author oltruong
 */
public class BedRoom
    implements Element
{

    public void accept( Visitor visitor )
    {
        visitor.visit( this );

    }

}
