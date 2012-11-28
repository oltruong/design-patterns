package fr.oltruong.pattern.abstractfactory;

import fr.oltruong.pattern.abstractfactory.object.AzertyKeyboard;
import fr.oltruong.pattern.abstractfactory.object.BigProcessor;
import fr.oltruong.pattern.abstractfactory.object.ClassicHardDrive;
import fr.oltruong.pattern.abstractfactory.object.HardDrive;
import fr.oltruong.pattern.abstractfactory.object.Keyboard;
import fr.oltruong.pattern.abstractfactory.object.Processor;
import fr.oltruong.pattern.abstractfactory.object.SmallProcessor;

public class FrenchComputerFactory
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
        return new AzertyKeyboard();
    }

    @Override
    public HardDrive getHardDrive()
    {
        return new ClassicHardDrive();
    }

}
