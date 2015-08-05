package com.oltruong.pattern.behavioral.visitor;

/**
 * @author oltruong
 */
public interface Visitor
{

    void visit( BedRoom bedRoom );

    void visit( Kitchen kitchen );

    void visit( Basement basement );

}
