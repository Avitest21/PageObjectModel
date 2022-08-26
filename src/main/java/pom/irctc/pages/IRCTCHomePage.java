package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IRCTCHomePage extends GenericWrappers {

	public RegistrationPage clickOnRegister() {

		clickByXpath(prop.getProperty("IRCTCHomePage.clickOnRegister.xpath"));
		return new RegistrationPage();

	}

	public IRCTCHomePage mouseHoverholidays() {
		mouseHover1(prop.getProperty("IRCTCHomePage.mouseHoverholidays.xpath"));
		return new IRCTCHomePage();
	}
	public IRCTCHomePage mouseHoverstays() {
		mouseHover1(prop.getProperty("IRCTCHomePage.mouseHoverstays.xpath"));
		return this;


	}

	public AccomodationPage clickLounge() {
		clickByXpath(prop.getProperty("IRCTCHomePage.clickLounge.xpath"));
		return new  AccomodationPage();
	}

	public AccomodationPage switchToLastWindow1() {
		switchToLastWindow();
		return new AccomodationPage();
	}
}
