package com.oltruong.pattern.behavioral.visitor;

/**
 * @author oltruong
 */
public class BuyerVisitor
    implements Visitor
{

    public void visit( BedRoom bedRoom )
    {
        System.out.println( "Not visiting bedroom" );

    }

    public void visit( Kitchen kitchen )
    {
        System.out.println( "Double kitchen visit" );
        kitchen.checkingKitchen();
        kitchen.checkingKitchen();
    }

    public void visit( Basement basement )
    {

        basement.goingToTheBasement();
    }

}
