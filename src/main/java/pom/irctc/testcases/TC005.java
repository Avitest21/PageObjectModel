package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPages;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="TO verify  GST validation Page";
		author="Avinash";
		category="Regression";
		browserName="Chrome";
		url="https://www.irctc.co.in";
		sheetName="TC005";
	} 
	@Test(dataProvider="fetchData")
	public void gstValidation(String email,	String mobileNo, String filterText, String Hotelname,
			String enterYear, String enterMonth,String enterDate,String checkOutYear, String checkOutenterMonth, String checkOutenterDate, String adult,	String title, String firstName,	String lastName,	
			String Country, 	String state,	String gst, String	gstNumber,
			String companyName, String	companyAddress) {
		
		new CovidAlertPages()
		.clickOnOK()
		.mouseHoverholidays()
		.mouseHoverstays()
		.clickLounge()
		.switchToLastWindow1()
		.clickHotelsbutton()
		.switchtoHotelPage()
		.clickOnLogin()
		.clickOnguest()
		.enterEmail(email)
		.enterMobileno(mobileNo)
		.clickonLogin3()
		.wait1(2000)
		.enterCityhotelName(filterText)
		.wait1(2000)
		.clickHotelname(Hotelname)
		.wait1(2000)
		.clickDate()
		.wait1(2000)
		.clickDatemonthyear()
		.wait1(2000)
		.enterYear(enterYear)
		.wait1(2000)
		.enterMonth(enterMonth)
		.wait1(2000)
		.enterDate(enterDate)
		.clickCheckoutDate()
		.wait1(2000)
		.clickCheckoutdmy()
		.wait1(2000)
		.enterCheckoutYear(checkOutYear)
		.wait1(2000)
		.enterCheckoutMonth(checkOutenterMonth)
		.wait1(2000)
		.enterCheckoutDate(checkOutenterDate)
	
		.wait1(2000)
		.userDatawrapper()
		.wait1(2000)
		.selectGuest(adult)
		.wait1(2000)
		.clickFindhotel()
		.switchtoLast1()
		.clickOnfirstHotelnameDisplayed()
		.switchtoHotelDetailPage()
		.getHotelname()
		.getHotelprice()
		.clickOnbook()
		.switchtoPassengerdetailPage()
		.selectTitle(title)
		.enterFirstname(firstName)
		.enterLastname(lastName)
		.selectCountry(Country)
		.selectState(state)
		.selectGST(gst)
		.enterGstno(gstNumber)
		.enterCompanyname(companyName)
		.enterCompanyadress(companyAddress)
		.wait1(2000)
		.clickContinuePassenger()
		.verifyGstmessage();
	}

}
