/*
 * @author oltruong
 */
package fr.oltruong.pattern.decorator;

public class MinuteReportOption extends MobileOptionDecorator {

	MobileOffer mobileOffer;
	
	public MinuteReportOption (MobileOffer myMobileOffer){
		this.mobileOffer = myMobileOffer;
	}
	
	
	@Override
	public double cost() {
		return 0.5+mobileOffer.cost();
	}

	@Override
	public String getDescription() {
		return mobileOffer.getDescription()+", with report minute option";
	}

}
