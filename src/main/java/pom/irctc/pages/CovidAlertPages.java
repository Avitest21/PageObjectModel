package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPages extends GenericWrappers {
	
	
	public IRCTCHomePage clickOnOK() {
		clickByXpath(prop.getProperty("CovidAlertPages.clickOnOK.xpath"));
		return new IRCTCHomePage();
		
		
	}

}
