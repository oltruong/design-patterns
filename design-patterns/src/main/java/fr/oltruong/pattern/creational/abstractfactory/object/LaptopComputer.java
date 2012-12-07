package fr.oltruong.pattern.creational.abstractfactory.object;

import fr.oltruong.pattern.creational.abstractfactory.ComputerFactory;

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
