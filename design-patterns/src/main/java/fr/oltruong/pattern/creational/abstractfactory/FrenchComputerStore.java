package fr.oltruong.pattern.creational.abstractfactory;

import fr.oltruong.pattern.creational.abstractfactory.object.Computer;
import fr.oltruong.pattern.creational.abstractfactory.object.DesktopComputer;
import fr.oltruong.pattern.creational.abstractfactory.object.LaptopComputer;

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
