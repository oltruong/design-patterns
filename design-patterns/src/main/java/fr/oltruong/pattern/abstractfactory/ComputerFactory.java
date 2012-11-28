package fr.oltruong.pattern.abstractfactory;

import fr.oltruong.pattern.abstractfactory.object.HardDrive;
import fr.oltruong.pattern.abstractfactory.object.Keyboard;
import fr.oltruong.pattern.abstractfactory.object.Processor;

public abstract class ComputerFactory
{

    public abstract Processor getBigProcessor();

    public abstract Processor getSmallProcessor();

    public abstract Keyboard getKeyboard();

    public abstract HardDrive getHardDrive();
}
