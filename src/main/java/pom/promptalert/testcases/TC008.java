package pom.promptalert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.promptalert.pages.promptAlertPages;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="TO verify Prompt Alert";
		author="Avinash";
		category="Smoke";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		sheetName="TC008";
	} 
	@Test(dataProvider="fetchData")
	public void PromptAlert(String Name) {
		
		new promptAlertPages()
		
		.switchToframe()
		.clickTryit()
	//	.getAlerttext()
		.wait1(2000)
		.enterYourname(Name)
		.acceptAlert2()
		.verifyName()
		.pageRefresh()
		.wait1(2000)
		.switchToframe()
		.wait1(2000)
		.clickTryit()
		.wait1(2000)
		.dismissAlert1()
		.verifyName2()
		.defaultconten1()
		.clickHome();
		
	}

}
