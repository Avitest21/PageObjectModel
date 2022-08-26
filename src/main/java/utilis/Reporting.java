package utilis;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {

	public static ExtentReports report;
	public static ExtentTest test;

	public String testCaseName,testCaseDescription;
	public String author,category;



	public void startReport() {

		report = new ExtentReports("./reports/Result2.html",false);
	}

	public void startTest(String testName, String description) {

		test = report.startTest(testName, description);
		test.assignAuthor(author);
		test.assignCategory(category);

	}
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	public abstract long takeSnap();


	public void reportStep(String details, String Status) {

		long snapNumber =takeSnap();

		if (Status.equalsIgnoreCase("Pass")) {
			test.log(LogStatus.PASS, details   +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		}else if (Status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details  +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		}else if (Status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details  +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		}else if (Status.equalsIgnoreCase("Warning")) {
			test.log(LogStatus.WARNING, details  +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));

		}
	}



	public void reportStep(String details, String Status, boolean snap) {

		if(!snap) {
			if (Status.equalsIgnoreCase("Pass")) {
				test.log(LogStatus.PASS, details  );
			}else if (Status.equalsIgnoreCase("fail")) {
				test.log(LogStatus.FAIL, details  );
			}else if (Status.equalsIgnoreCase("info")) {
				test.log(LogStatus.INFO, details );
			}else if (Status.equalsIgnoreCase("Warning")) {
				test.log(LogStatus.WARNING, details  );

			}
		}
	}
	public void endTest() {
		report.endTest(test);
	}
	public void endReport() {
		report.flush();

	}

}

