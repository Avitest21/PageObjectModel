package pom.confirmationalert.pages;

import pom.simplealert.pages.HomePage;
import wrappers.GenericWrappers;

public class ConfirmationPages extends GenericWrappers {

	public ConfirmationPages  switchToframe() {

		SwitchToFramebyXpath(prop.getProperty("ConfirmationPages.switchToframe.xpath"));
		return this;
	}
	public ConfirmationPages clickTryit() {
		clickByXpathNoSnap(prop.getProperty("ConfirmationPages.clickTryit.xpath"));
		return this;
	}
	
	public ConfirmationPages getAlerttext() {
		
		getAlertText();
		return this;
	}


	public ConfirmationPages acceptAlert1() {
		acceptAlert();
		return this;
	}

	public ConfirmationPages getText() {

		getAlertText();
		return this;
	}

	public ConfirmationPages verifyText1() {
		verifyTextByXpath(prop.getProperty("ConfirmationPages.verifyText1.xpath"), "You pressed OK!");
		
		return this;
	}
	public ConfirmationPages refreshPage() {
		refresh();
		return this;
	}
	public ConfirmationPages dismissAlert1() {
		dismissAlert();


		return this;
	}

	public ConfirmationPages verifytext2() {
		verifyTextByXpath(prop.getProperty("ConfirmationPages.verifytext2.xpath"), "You pressed Cancel!");
		return this;
	}
	public ConfirmationPages defaultContent1() {
		defaultContent();
		return this;
		


	}

	public HomePAge clickHomebutton() {
		clickByXpath(prop.getProperty("ConfirmationPages.clickHomebutton.xpath"));
		return new HomePAge();
}
}