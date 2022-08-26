package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utilis.DataInputProvider;

public class ProjectWrappers extends GenericWrappers{
	
	public String browserName;
	public String url;
	public String sheetName;
	
	@BeforeSuite
	public void beforeSuit() {
		startReport();
	}

	@BeforeTest
	public void beforeTest() {
	
	loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		invokeApp(browserName, url);
	
	} 
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	@AfterClass
	public void afterClass() {
		endTest();
	}
	@AfterTest
	public void afterTest() {
	unloadObjects();
	}
	@AfterSuite
	public void afterSuit() {
		endReport();
	}
	@DataProvider(name = "fetchData")
	public String[][] getTestData() {
		return DataInputProvider.getData(sheetName);
	}
}
