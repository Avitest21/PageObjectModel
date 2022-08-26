package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FBHomepage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers { 
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="TO verify facebook SIgnup for new user registration";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="http://www.facebook.com";
		sheetName="TC012";
	} 
	@Test(dataProvider="fetchData")
	public void facebookSignup(String fname, String sName, String mNumber, String mNumber1, String newPassword, String day, String month, String year,String Gender) {
		
		new FBHomepage()
		.clickCreateaccount()
		.enterFirstname(fname)
		.enterLastname(sName)
		.enterEmail(mNumber)
		.enterReconformEmail(mNumber1)
		.enterPassword(newPassword)
		.selectDate(day)
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender(Gender)
		.clickSignupbutton();
	}

}
