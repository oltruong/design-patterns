package fr.oltruong.pattern.abstractfactory.object;

import fr.oltruong.pattern.abstractfactory.ComputerFactory;

/**
 * @author oltruong
 */
public class DesktopComputer
    extends Computer
{

    ComputerFactory factory;

    public DesktopComputer( ComputerFactory factory )
    {
        this.factory = factory;
    }

    @Override
    public void prepare()
    {

        processor = factory.getSmallProcessor();
        keyboard = factory.getKeyboard();
        hardDrive = factory.getHardDrive();
    }
}
