package fr.oltruong.pattern.factorymethod;

import fr.oltruong.pattern.factorymethod.object.Computer;
import fr.oltruong.pattern.factorymethod.object.USDesktopComputer;
import fr.oltruong.pattern.factorymethod.object.USLaptopComputer;
import fr.oltruong.pattern.factorymethod.object.USNetbookComputer;

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
