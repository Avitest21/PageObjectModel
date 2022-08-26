package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers {
	
	public FormCandS clickSignup() {
		clickByXpath(prop.getProperty("UserRegistrationPage.clickSignup.xpath"));
		return new FormCandS();
	}

}
