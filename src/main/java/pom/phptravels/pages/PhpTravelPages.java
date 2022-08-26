package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpTravelPages extends GenericWrappers {
	
	public PhpTravelPages enterFirstname(String inputFirstName) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterFirstname.xpath"), inputFirstName);
	return this;
	}

	public PhpTravelPages enterLAstname(String inputLastName) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterLAstname.xpath"), inputLastName);
		return this;
	}
	
	public PhpTravelPages enterEmail(String inputEmail) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterEmail.xpath"), inputEmail);
		return this;
	}
	
	public PhpTravelPages clickCode() {
		clickByXpath(prop.getProperty("PhpTravelPages.clickCode.xpath"));
		return this;
	}
	
	//public PhpTravelPages clickCode1() {
	//	clickByXpath("//span[text()='India (भारत)']");
	//	return this;
//	}
	public PhpTravelPages enterPhoen(String inputPhone) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterPhoen.xpath"), inputPhone);
		return this;
	}
	
	
	public PhpTravelPages enterCompanyname(String inputCompanyName ) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterCompanyname.xpath"), inputCompanyName);
		return this;
	}
	public PhpTravelPages enterStreetadress(String inputAddress1) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterStreetadress.xpath"), inputAddress1);
		return this;
	}
	public PhpTravelPages enterCity(String inputCity) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterCity.xpath"), inputCity);
		return this;
		
	}
	public PhpTravelPages enterState(String stateinput) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterState.xpath"), stateinput);
		return this;
	}
	public PhpTravelPages enterPostcode(String inputPostcode) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterPostcode.xpath"), inputPostcode);
		return this;
		
	}
	public PhpTravelPages selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("PhpTravelPages.selectCountry.xpath"), country);
		return this;
		
	}
	public PhpTravelPages enterMobile(String customfield2) {
		enterByXpath(prop.getProperty("PhpTravelPages.enterMobile.xpath"), customfield2);
		
		return this;
	}
	
	public PhpTravelPages clickGeneratepassword() {
		clickByXpath(prop.getProperty("PhpTravelPages.clickGeneratepassword.xpath"));
		return this;
	}
	
	public PhpTravelPages clickCopy() {
		clickByXpath(prop.getProperty("PhpTravelPages.clickCopy.xpath"));
		return this;
	}
	
	public PhpTravelPages clickClose() {
		clickByXpath(prop.getProperty("PhpTravelPages.clickClose.xpath"));
		return this;
	}
	public PhpTravelPages pageDown1() {
		pageDown();
		return this;
	}
	
	
	
	public PhpTravelPages clickRegister() {
		clickByXpath(prop.getProperty("PhpTravelPages.clickRegister.xpath"));
		return this;
	}
	
}
