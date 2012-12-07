package fr.oltruong.pattern.creational.abstractfactory;

import fr.oltruong.pattern.creational.abstractfactory.object.Computer;

public abstract class ComputerStore
{
    public static final int DESKTOP_TYPE = 0;

    public static final int LAPTOP_TYPE = 1;

    public Computer buyComputer( int type )
    {

        // Encapsulate what varies
        Computer computer = createComputer( type );

        computer.prepare();
        // Same code regardless of computer type
        computer.assemble();
        computer.test();
        computer.packageAll();

        return computer;
    }

    abstract Computer createComputer( int type );

}
