package fr.oltruong.pattern.builder;

/**
 * Builder's purpose is to separate object's construction from its representation Can be useful if we have to build an
 * object not knowing everything right away...
 * 
 * @author oltruong
 */
public class MainBuilder
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        CarBuilder frenchCarBuilder = new FrenchCarBuilder();
        frenchCarBuilder.createCar();
        frenchCarBuilder.putWheels();
        frenchCarBuilder.putMotor();
        frenchCarBuilder.paint();

        CarBuilder germanCarBuilder = new GermanCarBuilder();
        germanCarBuilder.createCar();
        germanCarBuilder.putWheels();
        germanCarBuilder.putMotor();
        germanCarBuilder.paint();

    }

}
