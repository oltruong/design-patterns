/*
 * @author oltruong
 */
package fr.oltruong.pattern.structural.decorator;

public class SecondMobileOffer
    extends MobileOffer
{

    @Override
    public double cost()
    {
        return 2.2;
    }

    @Override
    public String getDescription()
    {
        return "my second offer";
    }

}
