package pom.simplealert.pages;

import pom.irctc.pages.RegistrationPage;
import wrappers.GenericWrappers;

public class SimpleAlertpage extends GenericWrappers {

	public SimpleAlertpage switchToframe() {


		SwitchToFramebyXpath(prop.getProperty("SimpleAlertpage.switchToframe.xpath"));
		return this;

	}
	public SimpleAlertpage clickTryit() {
		clickByXpathNoSnap(prop.getProperty("SimpleAlertpage.clickTryit.xpath"));
		return this;

	}

	public SimpleAlertpage getAlerttext() {
		getAlertText();
		return this;

	}
	public SimpleAlertpage acceptAlert1(){
		acceptAlert();
				return this;
	}

	public SimpleAlertpage switchToDefault() {
		defaultContent();
		return this;
	}

	public HomePage clickHomebutton() {
		clickByXpath(prop.getProperty("SimpleAlertpage.clickHomebutton.xpath"));
		return new HomePage();
	}

	public SimpleAlertpage switchToalertAndaccept() {
		acceptAlert();
		return this;

	}
	
	public SimpleAlertpage waitProperty1(long Mills) {
		waitProperty(Mills);
		return this;
	}
}
