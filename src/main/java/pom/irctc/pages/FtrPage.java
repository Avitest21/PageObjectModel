package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers{
	
	public FtrServeletPage clickNewuser() {
		clickByXpath(prop.getProperty("FtrPage.clickNewuser.xpath"));
		return new FtrServeletPage();
	}
	public FtrPage switchToLastWindow2() {
		switchToLastWindow();
		return new FtrPage();
}
}
