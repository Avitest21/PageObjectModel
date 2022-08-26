package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsSearchPage extends GenericWrappers {
	
	
	public HotelDetailsPage clickOnfirstHotelnameDisplayed() {
		clickByXpath(prop.getProperty("HotelsSearchPage.clickOnfirstHotelnameDisplayed.xpath"));
		return new HotelDetailsPage();
	}
	public HotelsSearchPage switchtoLast1() {
		
		switchToLastWindow();
		return this;
	}

}
