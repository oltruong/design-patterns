/*
 * @author oltruong
 */
package com.oltruong.pattern.structural.decorator;

public class FirstMobileOffer
    extends MobileOffer
{

    @Override
    public double cost()
    {
        return 1.1;
    }

    @Override
    public String getDescription()
    {
        return "my first mobile offer";
    }

}
