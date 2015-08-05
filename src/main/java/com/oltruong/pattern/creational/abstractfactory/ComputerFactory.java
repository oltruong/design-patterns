package com.oltruong.pattern.creational.abstractfactory;

import com.oltruong.pattern.creational.abstractfactory.object.HardDrive;
import com.oltruong.pattern.creational.abstractfactory.object.Processor;
import com.oltruong.pattern.creational.abstractfactory.object.Keyboard;

public abstract class ComputerFactory
{

    public abstract Processor getBigProcessor();

    public abstract Processor getSmallProcessor();

    public abstract Keyboard getKeyboard();

    public abstract HardDrive getHardDrive();
}
