/*
 * @author oltruong
 */
package fr.oltruong.pattern.decorator;

public class OneIllimitedNumberOption
    extends MobileOptionDecorator
{

    MobileOffer mobileOffer;

    public OneIllimitedNumberOption( MobileOffer myMobileOffer )
    {
        this.mobileOffer = myMobileOffer;
    }

    @Override
    public double cost()
    {
        return 0.7 + mobileOffer.cost();
    }

    @Override
    public String getDescription()
    {
        return mobileOffer.getDescription() + ", with one illimited number";
    }

}
