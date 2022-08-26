package pom.promptalert.pages;

import pom.confirmationalert.pages.HomePAge;
import pom.irctc.pages.HotelDetailsPage;
import wrappers.GenericWrappers;

public class promptAlertPages extends GenericWrappers {
	
	
public promptAlertPages switchToframe() {
	
	SwitchToFramebyXpath(prop.getProperty("promptAlertPages.switchToframe.xpath"));
	return this;
	
}
public promptAlertPages clickTryit() {
	clickByXpathNoSnap(prop.getProperty("promptAlertPages.clickTryit.xpath"));
	return this;
}
public promptAlertPages enterYourname(String Name) {
	enterTextAlert(Name);
	return this;
	
}
public promptAlertPages getAlerttext() {
	
	getAlertText();
	return this;
}
public promptAlertPages pageRefresh() {
	refresh();
	return this;
}
public promptAlertPages acceptAlert2() {
	acceptAlert();
	return this;
}
public promptAlertPages verifyName() {
	verifyTextByXpath(prop.getProperty("promptAlertPages.verifyName.xpath"), "Hello Avinash! How are you today?");
	return this;
}


public promptAlertPages dismissAlert1() {
	dismissAlert();
	return this;
	
}

public promptAlertPages verifyName2() {
	verifyTextByXpath(prop.getProperty("promptAlertPages.verifyName2.xpath"), "User cancelled the prompt.");
	return this;
}

public promptAlertPages defaultconten1() {
	defaultContent();
	return this;
}
public promptAlertPages clickHome() {
	clickByXpath(prop.getProperty("promptAlertPages.clickHomebutton.xpath"));
	return this;
}
public promptAlertPages wait1(long millis) {
	waitProperty(millis);
	return this;
}
}
