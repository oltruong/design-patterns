package com.oltruong.pattern.creational.abstractfactory.object;

import com.oltruong.pattern.creational.abstractfactory.ComputerFactory;

/**
 * @author oltruong
 */
public class DesktopComputer
    extends Computer
{

    ComputerFactory factory;

    public DesktopComputer( ComputerFactory factory )
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
