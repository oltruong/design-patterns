package com.oltruong.pattern.creational.builder;

/**
 * @author oltruong
 */
public class FrenchCarBuilder
    extends CarBuilder
{

    public FrenchCarBuilder()
    {
    }

    @Override
    void putWheels()
    {
        car.setWheels( "Michelin" );

    }

    @Override
    void putMotor()
    {
        car.setMotor( "French" );

    }

    @Override
    void paint()
    {
        car.setMotor( " Blue, White, Red" );

    }

}
