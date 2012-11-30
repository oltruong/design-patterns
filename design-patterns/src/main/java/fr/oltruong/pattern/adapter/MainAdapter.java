package fr.oltruong.pattern.adapter;

/**
 * Adapter pattern enables conversion without having to rewrite the existing class.
 * 
 * @author oltruong
 */
public class MainAdapter
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        ThermometerFarenheit thermometerF = new ThermometerFarenheit();
        System.out.println( "Temperature in Farenheit:" + thermometerF.getTemperatureFarenheit() );

        ThermometerAdapter adapter = new ThermometerAdapter( thermometerF );

        System.out.println( "Temperature in Celsius:" + adapter.getCelsius() );

    }

}
