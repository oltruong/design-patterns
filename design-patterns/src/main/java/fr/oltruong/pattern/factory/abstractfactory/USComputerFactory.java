package fr.oltruong.pattern.factory.abstractfactory;

import fr.oltruong.pattern.factory.abstractfactory.object.BigProcessor;
import fr.oltruong.pattern.factory.abstractfactory.object.HardDrive;
import fr.oltruong.pattern.factory.abstractfactory.object.Keyboard;
import fr.oltruong.pattern.factory.abstractfactory.object.Processor;
import fr.oltruong.pattern.factory.abstractfactory.object.Qwertykeyboard;
import fr.oltruong.pattern.factory.abstractfactory.object.SSDHardDrive;
import fr.oltruong.pattern.factory.abstractfactory.object.SmallProcessor;

public class USComputerFactory
    extends ComputerFactory
{

    @Override
    public Processor getBigProcessor()
    {
        return new BigProcessor();
    }

    @Override
    public Processor getSmallProcessor()
    {
        return new SmallProcessor();
    }

    @Override
    public Keyboard getKeyboard()
    {
        return new Qwertykeyboard();
    }

    @Override
    public HardDrive getHardDrive()
    {
        return new SSDHardDrive();
    }

}
