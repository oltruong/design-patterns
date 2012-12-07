package fr.oltruong.pattern.behavioral.visitor;

/**
 * @author oltruong
 */
public class SellerVisitor
    implements Visitor
{

    public void visit( BedRoom bedRoom )
    {
        System.out.println( "Visiting bedroom" );

    }

    public void visit( Kitchen kitchen )
    {
        kitchen.checkingKitchen();
    }

    public void visit( Basement basement )
    {

        basement.goingToTheBasement();
    }

}
