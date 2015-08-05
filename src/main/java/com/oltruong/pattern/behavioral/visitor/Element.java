package com.oltruong.pattern.behavioral.visitor;

/**
 * @author oltruong
 */
public interface Element
{
    public void accept( Visitor visitor );
}
