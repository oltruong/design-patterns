package fr.oltruong.pattern.factory.abstractfactory;

import fr.oltruong.pattern.factory.abstractfactory.object.HardDrive;
import fr.oltruong.pattern.factory.abstractfactory.object.Keyboard;
import fr.oltruong.pattern.factory.abstractfactory.object.Processor;

public abstract class ComputerFactory
{

    public abstract Processor getBigProcessor();

    public abstract Processor getSmallProcessor();

    public abstract Keyboard getKeyboard();

    public abstract HardDrive getHardDrive();
}
