package com.oltruong.pattern.creational.factorymethod;

import com.oltruong.pattern.creational.factorymethod.object.Computer;
import com.oltruong.pattern.creational.factorymethod.object.FrenchDesktopComputer;
import com.oltruong.pattern.creational.factorymethod.object.FrenchNetbookComputer;
import com.oltruong.pattern.creational.factorymethod.object.FrenchLaptopComputer;

public class FrenchComputerStore
    extends ComputerStore
{

    @Override
    Computer createComputer( int type )
    {
        Computer computer = null;

        switch ( type )
        {
            case DESKTOP_TYPE:
                computer = new FrenchDesktopComputer();
                break;
            case LAPTOP_TYPE:
                computer = new FrenchLaptopComputer();
                break;
            case NETBOOK_TYPE:
                computer = new FrenchNetbookComputer();
                break;
            default:
                throw new IllegalArgumentException( "Invalid type: " + type );

        }

        return computer;
    }

}
