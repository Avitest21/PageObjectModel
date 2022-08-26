package pom.indianfrro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.UserRegistrationPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="TO verify Form C registration Page";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
	} 
	@Test(dataProvider="fetchData")
	public void formCregistration(String u_id, String u_pwd,	String confirmPassword, String securityQuestion,String Answer,	
			String Name1,	String gender,	String DOB, String Designation, String emailId, String	mobileNumber,String	 phoneNumber,String	nationality,
			String name2,	String capacity,	String address,	String state,	String city, String	FRRODescription,String Accomodation, 
			String  Grade,	 String emailId1, String mobileNumber1,String	phoneNumber1, String name3, String address1,String	state1,
			String city1, String emailID,	String phoneNo, String	Mobile) {
		
		
		new UserRegistrationPage()
		.clickSignup()
		.enterUserid(u_id)
		.enterpassword(u_pwd)
		.enterConformpassword(confirmPassword)
		.selectSecurityqn(securityQuestion)
		.entersecurityAnswer(Answer)
		.enterName(Name1)
		.selectGender(gender)
		.enterDob(DOB)
		.enterdesignation(Designation)
		.enterEmail(emailId)
		.enterMobileNo(mobileNumber)
		.enterPhoneNo(phoneNumber)
		.selectNationality(nationality)
		.enterHotelDetail(name2)
		.enterCapacity(capacity)
		.enterAddress(address)
		.waitProperty1(6000)
		.selectState1(state)
		//.pagedown1()
		.waitProperty1(6000)
		.selectCity(city)
		.waitProperty1(6000)
		.selectFrro(FRRODescription)
		.selectAccotype(Accomodation)
		.selectAccograde(Grade)
		.enterEmailid(emailId1)
		.enterMobileNo1(mobileNumber1)
		.enterPhoneNo1(phoneNumber1)

		.enterOwnerDetail(name3)
		.enterAddress1(address1)
		.selectState(state1)
		.waitProperty1(5000)
		.selectDidtrict(city1)
		.enterEmailid2(emailID)
		.enterMobileNo2(phoneNo)
		.enterPhoneNo2(Mobile)
		.clickSubmit();
		
			
	}

}
