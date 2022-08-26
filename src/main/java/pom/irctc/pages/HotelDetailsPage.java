package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers {

	
	public HotelDetailsPage getHotelname() {
		getTextByXpath(prop.getProperty("HotelDetailsPage.getHotelname.xpath"));
		return this;
	}
public HotelDetailsPage switchtoHotelDetailPage() {
	
switchToLastWindow();
	return this;
}
	public HotelDetailsPage getHotelprice() {
		
		getTextByXpath(prop.getProperty("HotelDetailsPage.getHotelprice.xpath"));
		return this;
	
		
	}
	
	public PassengerDetailsPage clickOnbook() {
		clickByXpath(prop.getProperty("HotelDetailsPage.clickOnbook.xpath"));
		return new PassengerDetailsPage();
	}
	
	public HotelDetailsPage wait1(long millis) {
		waitProperty(millis);
		return this;
}
}
