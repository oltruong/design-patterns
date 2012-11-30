package fr.oltruong.pattern.factorymethod;

/**
 * Illustration of abstract factory pattern
 * 
 * @author oltruong
 */
public class MainFactoryMethod
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {

        ComputerStore frenchStore = new FrenchComputerStore();

        ComputerStore usStore = new USComputerStore();

        System.out.println( "Buying a laptop" );
        frenchStore.buyComputer( ComputerStore.LAPTOP_TYPE );

        System.out.println( "Buying a desktop" );
        usStore.buyComputer( ComputerStore.DESKTOP_TYPE );

    }

}
