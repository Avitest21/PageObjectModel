package utilis;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
@Test
public class Sample {

	public void generateReport() {

		ExtentReports report = new ExtentReports("./reports/Result.html",false);
		


		ExtentTest test=	report.startTest("TC001", "To veryfy IRCTC Registration");
		test.assignAuthor("Avi");
		test.assignCategory("Smoke");
		test.log(LogStatus.PASS, "The application launched with given url Successfully");
		test.log(LogStatus.PASS, "The application launched with given url Successfully");
		test.log(LogStatus.PASS, "The application launched with given url Successfully");
		test.log(LogStatus.PASS, "The application launched with given url Successfully");
		test.log(LogStatus.PASS, "The application launched with given url Successfully");
		report.endTest(test);
		report.flush();



	}

}
