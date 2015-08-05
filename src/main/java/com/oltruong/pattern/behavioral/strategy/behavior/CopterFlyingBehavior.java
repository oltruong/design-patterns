/*
 * @author oltruong
 */
package com.oltruong.pattern.behavioral.strategy.behavior;

public class CopterFlyingBehavior
    implements FlyingBehavior
{

    public void fly()
    {

        System.out.println( "I'm using propellers!" );
    }

}
