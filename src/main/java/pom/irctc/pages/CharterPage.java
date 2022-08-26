package pom.irctc.pages;

import java.awt.image.ReplicateScaleFilter;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage clickEnquiryform() {
		clickByXpath(prop.getProperty("CharterPage.clickEnquiryform.xpath"));
		
		return this;
		
	}

	public CharterPage enterApplicantname(String name) {
		enterByXpath(prop.getProperty("CharterPage.enterApplicantname.xpath"), name);
		return this;
	}
	public CharterPage enterOrganisationname(String organization) {
		enterByXpath(prop.getProperty("CharterPage.enterOrganisationname.xpath"), organization);
		return this;
	}
	
	public CharterPage enterAddress(String address) {
		enterByXpath(prop.getProperty("CharterPage.enterAddress.xpath"), address);
		return this;
}
	
	public CharterPage enterMobileno(String mobile) {
		enterByXpath(prop.getProperty("CharterPage.enterMobileno.xpath"), mobile);
		return this;
	}
	
	
	
	public CharterPage enterEmailid(String email) {
		enterByXpath(prop.getProperty("CharterPage.enterEmailid.xpath"), email);
		return this;
		
	}
	
	public CharterPage selectSalooncharter(String Saloon) {
		selectVisibileTextByXpath(prop.getProperty("CharterPage.selectSalooncharter.xpath"), Saloon);
		return this;
	}
	
	public CharterPage enterOrginstation(String originStation ) {
		enterByXpath(prop.getProperty("CharterPage.enterOrginstation.xpath"), originStation);
		return this;
	}
	
	public CharterPage destination(String destnStation ) {
		enterByXpath(prop.getProperty("CharterPage.destination.xpath"), destnStation);
		return this;
	
}
	public CharterPage selectDate() {
		
		clickByXpath(prop.getProperty("CharterPage.selectDate.xpath"));
		
		return this;
	}
	

	public CharterPage enterDate(String date) {
		replaceString(prop.getProperty("CharterPage.enterDate.xpath"),"\"+date+\"",date);
		return this;
	}
	
	public CharterPage enterDuration(String days) {
		enterByXpath(prop.getProperty("CharterPage.enterDuration.xpath"), days);
		return this;
	}
	
	public CharterPage clickCheckoutDate() {
		clickByXpath(prop.getProperty("CharterPage.clickCheckoutDate"));
		return this;
	}
	
	public CharterPage enterCheckoutDate(String checkoutDate) {
		replaceString(prop.getProperty("CharterPage.enterCheckoutDate.xpath"),"\"+Date+\"",checkoutDate);
		return this;
	
	}
	
	public CharterPage enterCoachDetail(String coachDetail) {
		enterByXpath(prop.getProperty("CharterPage.enterCoachDetail.xpath"), coachDetail);
		return this;
	}
	
	public CharterPage enterPurposecharter(String charterPurpose) {
	enterByXpath(prop.getProperty("CharterPage.enterPurposecharter.xpath"), charterPurpose);
	return this;
	}
	
	public CharterPage enterAdditionaservices(String services) {
		
		enterByXpath(prop.getProperty("CharterPage.enterAdditionaservices.xpath"), services);
		return this;
	}
	
	
	
	public CharterPage clickSubmit() {
		clickByXpath(prop.getProperty("CharterPage.clickSubmit.xpath"));
		return this;
	}
	
	
	public CharterPage verifyMobilefield() {
		verifyTextByXpath(prop.getProperty("CharterPage.verifyMobilefield.xpath"), "Mobile no. not valid");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}