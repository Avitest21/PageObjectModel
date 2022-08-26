package pom.irctc.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AccomodationPage;
import pom.irctc.pages.CovidAlertPages;
import pom.irctc.pages.FtrPage;
import pom.irctc.pages.FtrServeletPage;
import pom.irctc.pages.IRCTCHomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="TO verify IRCTC Book your coach site";
		author="Avinash";
		category="Regression";
		browserName="Chrome";
		url="https://www.irctc.co.in";
		sheetName="TC002"
;	} 	
	@Test(dataProvider="fetchData")
	public void bookYourcoach(String userId,String password,String cnfPassword,String value,String secAnswer,
			String enterGender,String Maritial,String email, String Occupation,String fname,String nationality ,
			String flatNo , String street,String area,String country,String mobile,String pincode,  String postoffice,
			String offAdd, String offCountry, String offNumber,String offpincode,String offPost) {

		new CovidAlertPages()
		.clickOnOK()
		.mouseHoverholidays()
		.mouseHoverstays()
		.clickLounge()
		.switchToLastWindow1()
		.clickMenubutton()
		.bookYourCoach()
		.switchToLastWindow2()
		.clickNewuser()
		
		.enterUserid(userId)
		.enterPassword(password)
		.enterConfirmPassword(cnfPassword)
		.selectSecurityQuestion(value)
		.securityAnswer(secAnswer)
		.clickGender(enterGender)
		.clickMaritial(Maritial)
		.enterEmail(email)
		.selectOccuppation(Occupation)
		.enterPanmname(fname)
		.selectNationality(nationality)
		.enterAddress(flatNo)
		.enterStreet(street)
		.enterArea(area)
		.selectCountry(country)		
		.enterMObile(mobile)
		.enterPincode(pincode+Keys.TAB)
		
		.selectPostoffice(postoffice)
		.pagedown()
		
		.clickCommunicationAddress()
		.enterOfficeaddress(offAdd)
		.selectOfficeCountry(offCountry)
		.enteroffphone(offNumber)
		.enteroffPincode(offpincode)
		.selectPostoffice1(offPost);
		//.clickCreateprofile();
		
		
		
		
		



	}

}
