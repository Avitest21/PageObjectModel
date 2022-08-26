package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelPages;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="TO verify PHP travel Signup for new user registration";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="https://phptravels.org/register.php";
		sheetName = "TC011";
	} 
	
	@Test(dataProvider="fetchData")
	
	public void phpRegistration(String firstName,	String lastName, String	email,	String phone,	String companyName, String	address1, 
			String city, String	state,	String postcode, String	country	, String customfield2
) {
		
		
		new PhpTravelPages()
		.enterFirstname(firstName)
		.enterLAstname(lastName)
		.enterEmail(email)
	
	
		.enterPhoen(phone)
		.enterCompanyname(companyName)
		.enterStreetadress(address1)
		.enterCity(city)
		.enterState(state)
		.enterPostcode(postcode)
		.selectCountry(country)
		
		.enterMobile(customfield2)
		.clickGeneratepassword()
		.clickCopy()
		.pageDown1();
	
		//.clickRegister();
	}

}
