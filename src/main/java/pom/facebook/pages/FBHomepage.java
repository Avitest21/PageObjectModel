package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FBHomepage extends GenericWrappers {
	
	public FBHomepage clickCreateaccount() {
		
		clickByXpath(prop.getProperty("FBHomepage.clickCreateaccount.xpath"));
		return this;
	}

	
	public FBHomepage enterFirstname(String firstname) {
		enterByXpath(prop.getProperty("FBHomepage.enterFirstname.xpath"), firstname);
		return this;
		
	}
	
	
	
	public FBHomepage enterLastname(String lastname) {
		enterByXpath(prop.getProperty("FBHomepage.enterLastname.xpath"), lastname);
		return this;
	}
	
	public FBHomepage enterEmail(String reg_email__) {
		enterByXpath(prop.getProperty("FBHomepage.enterEmail.xpath"), reg_email__);
		return this;
	}
	
	public FBHomepage  enterReconformEmail(String  reg_email_confirmation__) {
		enterByXpath(prop.getProperty("FBHomepage.enterReconformEmail.xpath"), reg_email_confirmation__);
		return this;
	}
	
	public FBHomepage enterPassword(String reg_passwd__) {
		enterByXpath(prop.getProperty("FBHomepage.enterPassword.xpath"), reg_passwd__);
		return this;
		
	}
	
	public FBHomepage selectDate(String birthday_day) {
		selectVisibileTextByXpath(prop.getProperty("FBHomepage.selectDate.xpath"), birthday_day);
		return this;
		
	}
	
	public FBHomepage selectMonth(String birthday_month) {
		selectVisibileTextByXpath(prop.getProperty("FBHomepage.selectMonth.xpath"), birthday_month);
		return this;
	}
	
	public FBHomepage selectYear(String year) {
		selectVisibileTextByXpath(prop.getProperty("FBHomepage.selectYear.xpath"), year);
		return this;
	}
	public FBHomepage clickOnGender(String Gender) {
	replaceString(prop.getProperty("FBHomepage.clickOnGender.xpath"),"\"+Gender+\"",Gender);
		return this;
	}
	
	public FBHomepage clickSignupbutton() {
		clickByXpath(prop.getProperty("FBHomepage.clickSignupbutton.xpath"));
		return this;
	}
}
