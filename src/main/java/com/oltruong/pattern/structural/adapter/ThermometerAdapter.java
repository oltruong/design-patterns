/*
 * @author oltruong
 */
package com.oltruong.pattern.structural.adapter;

public class ThermometerAdapter
    implements ThermometerCeliusInterface
{

    private ThermometerFarenheit thermometerFarenheit;

    public ThermometerAdapter( ThermometerFarenheit thermometerF )
    {
        thermometerFarenheit = thermometerF;

    }

    public double getCelsius()
    {

        // Apply conversion formula
        return ( 5d / 9 ) * ( thermometerFarenheit.getTemperatureFarenheit() - 32 );
    }

}
