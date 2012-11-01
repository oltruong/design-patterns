package fr.oltruong.pattern.factory.abstractfactory;

import fr.oltruong.pattern.factory.abstractfactory.object.Computer;
import fr.oltruong.pattern.factory.abstractfactory.object.DesktopComputer;
import fr.oltruong.pattern.factory.abstractfactory.object.LaptopComputer;

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
