package com.oltruong.pattern.creational.abstractfactory;

import com.oltruong.pattern.creational.abstractfactory.object.DesktopComputer;
import com.oltruong.pattern.creational.abstractfactory.object.Computer;
import com.oltruong.pattern.creational.abstractfactory.object.LaptopComputer;

public class USComputerStore
    extends ComputerStore
{

    @Override
    Computer createComputer( int type )
    {
        Computer computer = null;
        ComputerFactory usFactory = new USComputerFactory();

        switch ( type )
        {
            case DESKTOP_TYPE:
                computer = new DesktopComputer( usFactory );
                break;
            case LAPTOP_TYPE:
                computer = new LaptopComputer( usFactory );
                break;
            default:
                throw new IllegalArgumentException( "Invalid type: " + type );

        }

        return computer;
    }

}
