package com.oltruong.pattern.behavioral.visitor;

/**
 * Visitor pattern enables the separation of an algorithm from an object structure on which it operates.
 * 
 * @author oltruong
 */
public class MainVisitor
{

    public static void main( String[] args )
    {

        House house = new House();

        house.accept( new SellerVisitor() );

        house.accept( new BuyerVisitor() );

    }

}
