package com.oltruong.pattern.creational.builder;

/**
 * @author oltruong
 */
public class GermanCarBuilder
    extends CarBuilder
{

    public GermanCarBuilder()
    {

    }

    @Override
    void putWheels()
    {
        car.setWheels( "German" );

    }

    @Override
    void putMotor()
    {
        car.setMotor( "Motor" );

    }

    @Override
    void paint()
    {
        car.paint( "Black" );

    }

}
