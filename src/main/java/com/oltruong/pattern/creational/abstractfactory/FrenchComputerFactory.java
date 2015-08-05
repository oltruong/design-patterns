package com.oltruong.pattern.creational.abstractfactory;

import com.oltruong.pattern.creational.abstractfactory.object.BigProcessor;
import com.oltruong.pattern.creational.abstractfactory.object.ClassicHardDrive;
import com.oltruong.pattern.creational.abstractfactory.object.HardDrive;
import com.oltruong.pattern.creational.abstractfactory.object.Processor;
import com.oltruong.pattern.creational.abstractfactory.object.AzertyKeyboard;
import com.oltruong.pattern.creational.abstractfactory.object.Keyboard;
import com.oltruong.pattern.creational.abstractfactory.object.SmallProcessor;

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
