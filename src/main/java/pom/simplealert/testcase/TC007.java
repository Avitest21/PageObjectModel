package pom.simplealert.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.simplealert.pages.HomePage;
import pom.simplealert.pages.SimpleAlertpage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers  {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="TO verify Simple Alert";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	} 
	@Test
	public void simpleAlert() {

		new SimpleAlertpage()
		.switchToframe()
		
		.clickTryit()
		
		.getAlerttext()
		
		.acceptAlert1()
		.waitProperty1(2000)
		.switchToDefault()
		.waitProperty1(2000)
		.clickHomebutton();
		
	}
	

}
