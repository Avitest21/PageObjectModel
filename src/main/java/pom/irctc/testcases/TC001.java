package pom.irctc.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPages;
import wrappers.ProjectWrappers;
import pom.irctc.pages.IRCTCHomePage;
import pom.irctc.pages.RegistrationPage;




public class TC001 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="TO verify IRCTC SIgnup for new user registration";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="https://www.irctc.co.in";
		sheetName="TC001";
	} 
	@Test(dataProvider="fetchData")
	public void irctRegistration(String userName,	String password,	String confirmpassword, String	securityanswer,
			String firstName, String	middleName, String	lastName,String DOB,String gender, String maritia, 
			String country,String	emailId,	String mobileNumber,	String nationality,	String enterFlatno, String	enterStreet,
			String enterAreay, String	pinCode	, String state	, String selectCity	, String postOffice,
			String enterphone, String residenceSelection , String enterFlatno1, String street, String area1,
			String pinCode1	,String state1, String city1, String	postOffice1,	String phone
) {

		new CovidAlertPages()
		.clickOnOK()
		.clickOnRegister()
		.waitProperty1(2000)
		.enterUSerName(userName)
		.enterUserPassword(password)
		.enterConformUserPassword(confirmpassword)
		.waitProperty1(3000)
		.clickPreferdLanguage()
		.selectPreferdLanguage()
		.waitProperty1(3000)
		.clickSecurityQuestion()
		.selectSecurityquestion()
		.securityAnswer(securityanswer)
		.clickContinue()
		.enterfirstname(firstName)
		.enterMiddlename(middleName)
		.enterLastname(lastName)
		.waitProperty1(3000)
		.clickOccupation()
		.waitProperty1(2000)
		.selectOccupation()
		.clickOnGender(gender)
		.enterDob(DOB)
		//.clickDateofBirth()
		//.selectMonth(month)
	//	.selectYear(year)
	//	.clickDate(date)
		.clickOnmaritialButton(maritia)
		
		.clickOnCountry(country)
		.enterEmailid(emailId)
		.enterPhoneNUmber(mobileNumber)

		.selectNationality(nationality)
		.clickContinue()
		.enterBlockNo(enterFlatno)
		.enterArea(enterAreay)
		.enterPincode(pinCode)
		.enterState(state)
		.selectCityname(selectCity)
		.enterPostOffice(postOffice)
		.enterResidentno(enterphone)
		.copyOfresidence(residenceSelection)
		.enterOfficeflatNo(enterFlatno1)
		.enterOfficestreet(street)
		.enterOfficeArea(area1)
		.waitProperty1(3000)
		.clickCountry()
		.waitProperty1(3000)
		.clickcountry1()
		.enterOfficepinCOde(pinCode1)
		.enterState1(state1)
		.pageDown1()
		.entercity1(city1)

		.enterPostofficeName(postOffice1)
		.enterOffphoneNo(phone)

		.clickRegisterbutton();





	}

}

