package fr.oltruong.pattern.builder;

/**
 * @author oltruong
 */
public class Car
{

    public void setWheels( String wheels )
    {
        System.out.println( "Adding wheels " + wheels );
    }

    public void paint( String color )
    {
        System.out.println( "Painting in " + color );

    }

    public void setMotor( String motor )
    {
        System.out.println( "Setting a motor " + motor );

    }

}
