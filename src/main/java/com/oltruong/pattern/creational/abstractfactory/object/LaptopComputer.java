package com.oltruong.pattern.creational.abstractfactory.object;

import com.oltruong.pattern.creational.abstractfactory.ComputerFactory;

/**
 * @author oltruong
 */
public class LaptopComputer
    extends Computer
{

    ComputerFactory factory;

    public LaptopComputer( ComputerFactory factory )
    {
        this.factory = factory;
    }

    @Override
    public void prepare()
    {

        processor = factory.getSmallProcessor();
        keyboard = factory.getKeyboard();
        hardDrive = factory.getHardDrive();
    }
}
