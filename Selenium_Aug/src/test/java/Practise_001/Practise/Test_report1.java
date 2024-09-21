package Practise_001.Practise;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Test_report1 extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		String projectpath = System.getProperty("user.dir");

		System.out.println(projectpath); 

		ExtentSparkReporter reports= new ExtentSparkReporter(projectpath+"\\Report\\ft_report1");

		reports.config().setTheme(Theme.STANDARD);

		reports.config().setDocumentTitle("Automation_ft_report");
		reports.config().setReportName("functional testing report");

		// Extent Reports

		ExtentReports r= new ExtentReports();
		r.attachReporter(reports);

		r.setSystemInfo("os", "windows");
		r.setSystemInfo("browser", "chrome");
		r.setSystemInfo("qa", "shubham nishane");

		//Extent test
		ExtentTest test = r.createTest("Login functionality");

		test.log(Status.INFO,"chrome browser launched");

		launch_browser("chrome");
		screenshot("ft_chrome_browser");
		test.addScreenCaptureFromPath(projectpath+"\\Report_screenshot\\ft_chrome_browser.png");

		hiturl("https://www.facebook.com/");
		screenshot("ft_facebook");
		test.addScreenCaptureFromPath(projectpath+"\\Report_screenshot\\ft_facebook.png");

		driver.findElement(By.cssSelector("input#email")).sendKeys("shubhamnishane22@gmail.com");
		screenshot("ft_email");
		test.addScreenCaptureFromPath(projectpath+"\\Report_screenshot\\ft_email.png");

		r.flush();

	}

}
