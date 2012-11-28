package fr.oltruong.pattern.abstractfactory;

/**
 * Illustration of abstract factory design pattern
 * 
 * @author oltruong
 */
public class Main
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        ComputerStore frenchStore = new FrenchComputerStore();

        ComputerStore usStore = new USComputerStore();

        System.out.println( "Buying a french laptop" );
        frenchStore.buyComputer( ComputerStore.LAPTOP_TYPE );

        System.out.println( "Buying a US desktop" );
        usStore.buyComputer( ComputerStore.DESKTOP_TYPE );

    }

}
