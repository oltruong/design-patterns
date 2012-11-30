/*
 * @author oltruong
 */
package fr.oltruong.pattern.decorator;

public class MainDecorator
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        MobileOffer offer = new FirstMobileOffer();

        offer = new MinuteReportOption( offer );

        System.out.println( offer.getDescription() );
        System.out.println( offer.cost() );

        offer = new OneIllimitedNumberOption( offer );

        System.out.println( offer.getDescription() );
        System.out.println( offer.cost() );

    }

}
