package fr.oltruong.pattern.factory.method;

import fr.oltruong.pattern.factory.method.object.Computer;

public abstract class ComputerStore
{

    public static final int DESKTOP_TYPE = 0;

    public static final int LAPTOP_TYPE = 1;

    public static final int NETBOOK_TYPE = 2;

    public Computer buyComputer( int type )
    {

        // Encapsulate what varies
        Computer computer = createComputer( type );

        // Same code regardless of computer type
        computer.prepare();
        computer.assemble();
        computer.test();
        computer.packageAll();

        return computer;
    }

    abstract Computer createComputer( int type );

}
