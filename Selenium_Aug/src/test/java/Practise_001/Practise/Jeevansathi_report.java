package Practise_001.Practise;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Jeevansathi_report extends Dynamic_code {

	public static void main(String[] args) throws Throwable {

		String porjectpath1 = System.getProperty("user.dir");
		System.out.println(porjectpath1);
		ExtentSparkReporter r= new ExtentSparkReporter(porjectpath1+"\\Jeevansathi_report\\Report");

		r.config().setTheme(Theme.STANDARD);
		r.config().setDocumentTitle("automation_testing");
		r.config().setReportName("Functional_testing");

		ExtentReports report= new ExtentReports();
		report.attachReporter(r);

		report.setSystemInfo("os", "windows");
		report.setSystemInfo("QA", "shubham nishane");

		ExtentTest test = report.createTest("url hit");
		test.log(Status.INFO, "chrome browser launched");


launch_browser("chrome");

		driver.get("https://www.jeevansathi.com/");
		screenshot("browser_launched");
		test.addScreenCaptureFromPath(porjectpath1+"\\Jeevansathi_ss\\browser_launched.png");


	}

}
