package com.oltruong.pattern.creational.factorymethod;

import com.oltruong.pattern.creational.factorymethod.object.Computer;
import com.oltruong.pattern.creational.factorymethod.object.USDesktopComputer;
import com.oltruong.pattern.creational.factorymethod.object.USLaptopComputer;
import com.oltruong.pattern.creational.factorymethod.object.USNetbookComputer;

public class USComputerStore
    extends ComputerStore
{

    @Override
    Computer createComputer( int type )
    {
        Computer computer = null;

        switch ( type )
        {
            case DESKTOP_TYPE:
                computer = new USDesktopComputer();
                break;
            case LAPTOP_TYPE:
                computer = new USLaptopComputer();
                break;
            case NETBOOK_TYPE:
                computer = new USNetbookComputer();
                break;
            default:
                throw new IllegalArgumentException( "Invalid type: " + type );

        }

        return computer;
    }

}
