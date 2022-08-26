package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {
	
	public AccomodationPage clickMenubutton() {
		clickByXpath(prop.getProperty("AccomodationPage.clickMenubutton.xpath"));
		return this;
		
	}
	public CharterPage clickCharter() {
		clickByXpath(prop.getProperty("AccomodationPage.clickCharter.xpath"));
		return new CharterPage();
	}

	public FtrPage bookYourCoach() {
		clickByXpath(prop.getProperty("AccomodationPage.bookYourCoach.xpath"));
		return new FtrPage();
	}
	
	
	public HotelsPage clickHotelsbutton() {
		clickByXpath(prop.getProperty("AccomodationPage.clickHotelsbutton"));
		return new HotelsPage();
	}
	
	public AccomodationPage switchToLastWindow1() {
		switchToLastWindow();
		return new AccomodationPage();
}
}