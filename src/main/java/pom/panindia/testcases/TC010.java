package pom.panindia.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.pages.PanNewPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="TO verify panindia Signup for new user registration";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="https://panind.com/india/new_pan/";
	} 
	
	@Test
	public void panIndia() {
		
		new PanNewPage()
		.selectTitle("MR.")
		.enterFirstname("Avinash")
		.enterMiddlename("Panneer")
		.enterLastname("Selvam")
		.enterFathername("PAnner")
		.enterFathermidleName("Selvam")
		.enterFatherlastName("Alagu")
		.enterMobileno("9786756665")
		.enterEmailid("avi@gmail.com")
		.selectSource("Salary")
		.clickCommunication()
		.enterDob("21041990")
		.enterAddresshouseNo("37/2")
		.enterAddressline2("80 ft road")
		.enterCityname("madurai")
		.selectState("Tamil Nadu")
		.enterPincode("625020")
		.selectCOuntry("INDIA")
		.selectIDproof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddressproof("PASSPORT (In Copy)")
		.selectDobprrof("Matriculation certificate or mark sheet of recognised board (In Copy)")
		.aadharProof("Aadhar Card issued by UIDAI(In Copy)")
		.clickAgree()
		.clickNext();
	}

}
