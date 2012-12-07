package fr.oltruong.pattern.creational.abstractfactory;

import fr.oltruong.pattern.creational.abstractfactory.object.HardDrive;
import fr.oltruong.pattern.creational.abstractfactory.object.Keyboard;
import fr.oltruong.pattern.creational.abstractfactory.object.Processor;

public abstract class ComputerFactory
{

    public abstract Processor getBigProcessor();

    public abstract Processor getSmallProcessor();

    public abstract Keyboard getKeyboard();

    public abstract HardDrive getHardDrive();
}
