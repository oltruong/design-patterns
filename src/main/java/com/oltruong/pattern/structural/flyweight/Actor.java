package com.oltruong.pattern.structural.flyweight;

/**
 * @author oltruong
 */
public class Actor
{

    private String name;

    public Actor( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

}