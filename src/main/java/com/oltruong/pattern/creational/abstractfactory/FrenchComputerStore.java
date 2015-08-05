package com.oltruong.pattern.creational.abstractfactory;

import com.oltruong.pattern.creational.abstractfactory.object.Computer;
import com.oltruong.pattern.creational.abstractfactory.object.DesktopComputer;
import com.oltruong.pattern.creational.abstractfactory.object.LaptopComputer;

public class FrenchComputerStore
    extends ComputerStore
{

    @Override
    Computer createComputer( int type )
    {
        Computer computer = null;
        ComputerFactory frenchFactory = new FrenchComputerFactory();

        switch ( type )
        {
            case DESKTOP_TYPE:
                computer = new DesktopComputer( frenchFactory );
                break;
            case LAPTOP_TYPE:
                computer = new LaptopComputer( frenchFactory );
                break;
            default:
                throw new IllegalArgumentException( "Invalid type: " + type );

        }

        return computer;
    }

}
