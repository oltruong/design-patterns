package fr.oltruong.pattern.factory.method;

import fr.oltruong.pattern.factory.method.object.Computer;
import fr.oltruong.pattern.factory.method.object.FrenchDesktopComputer;
import fr.oltruong.pattern.factory.method.object.FrenchLaptopComputer;
import fr.oltruong.pattern.factory.method.object.FrenchNetbookComputer;

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
