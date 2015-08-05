package com.oltruong.pattern.creational.builder;

/**
 * @author oltruong
 */
public abstract class CarBuilder
{

    protected Car car;

    public void createCar()
    {
        car = new Car();
    }

    abstract void putWheels();

    abstract void putMotor();

    abstract void paint();

}
