package fr.oltruong.pattern.factory.abstractfactory.object;

import fr.oltruong.pattern.factory.abstractfactory.ComputerFactory;

/**
 * @author oltruong
 */
public class LaptopComputer
    extends Computer
{

    ComputerFactory factory;

    public LaptopComputer( ComputerFactory factory )
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
