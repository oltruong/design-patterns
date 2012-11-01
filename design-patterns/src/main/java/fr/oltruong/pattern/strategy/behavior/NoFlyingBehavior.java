package fr.oltruong.pattern.strategy.behavior;

public class NoFlyingBehavior
    implements FlyingBehavior
{

    public void fly()
    {
        System.out.println( "I don't know how to fly!" );

    }

}
