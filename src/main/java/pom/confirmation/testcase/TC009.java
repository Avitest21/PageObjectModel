package pom.confirmation.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.confirmationalert.pages.ConfirmationPages;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="TO verify Confirmation Alert";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	} 
	@Test
	public void confirmationAlert() {
		new ConfirmationPages()
		.switchToframe()
		.clickTryit()
		.getAlerttext()
		.acceptAlert1()
		.verifyText1()
		.refreshPage()
		.switchToframe()
		.clickTryit()
		.dismissAlert1()
		.clickTryit()
		.getAlerttext()
		.dismissAlert1()
		.verifytext2()
		.defaultContent1()
		.clickHomebutton();
		
		
	}

}
