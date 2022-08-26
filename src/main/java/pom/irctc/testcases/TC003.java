package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPages;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="TO verify saloon mandatory Page";
		author="Avinash";
		category="Regression";
		browserName="Chrome";
		url="https://www.irctc.co.in";
		sheetName="TC003";
	} 
	@Test(dataProvider="fetchData")
	public void saloonMandotrycheck(String name,	String organization	, String address, String	mobile, String	email	,
			String saloonCharter, String	originStation ,String	destnStation, String	date, String checkoutDate, String coachDetail, String	durationPeriod,
			 String	charterPurpose, String	services) {
		
		new CovidAlertPages()
		.clickOnOK()
		.mouseHoverholidays()
		.mouseHoverstays()
		.clickLounge()
		.switchToLastWindow1()
		.clickMenubutton()
		.clickCharter()
		.clickEnquiryform()
		.enterApplicantname(name)
		.enterOrganisationname(organization)
		.enterAddress(address)
		.enterMobileno(mobile)
		.enterEmailid(email)
		.selectSalooncharter(saloonCharter)
		.enterOrginstation(originStation)
		.destination(destnStation)
		.selectDate()
		.enterDate(date)
		.clickCheckoutDate()
		.enterCheckoutDate(checkoutDate)
		.enterCoachDetail(coachDetail)
		.enterDuration(durationPeriod)
		.enterPurposecharter(charterPurpose)
		.enterAdditionaservices(services)
		.clickSubmit()
		.verifyMobilefield();
		
		
		
	}

}
