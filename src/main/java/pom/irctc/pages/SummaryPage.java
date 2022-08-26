package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SummaryPage extends GenericWrappers {

	
	public SummaryPage clickIagree() {
		
		clickByXpath(prop.getProperty("SummaryPage.clickIagree.xpath"));
		return this;
		
	}
	
	public SummaryPage clickMakepayment() {
		
		clickByXpath(prop.getProperty("SummaryPage.clickMakepayment.xpath"));
		return this;
		
	}
	
	public SummaryPage clickVerify() {
		
		clickByXpath(prop.getProperty("SummaryPage.clickVerify.xpath"));
		return this;
	}
	
	public SummaryPage veryfyOtptext() {
		verifyTextByXpath(prop.getProperty("SummaryPage.veryfyOtptext.xpath"), "otp is required.");
		return this;
	}
}
