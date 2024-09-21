package Practise_001.Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Dynamic_code {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static ExtentReports er;
	public static ExtentTest etest;
	
	public static void launch_browser(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println("launched browser is: "+ browser);
	}

	public static void hiturl (String url) {

		driver.get(url);
		System.out.println(driver.getTitle());
	}

	public static void screenshot(String ss_name) throws Throwable {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target= new File("./Jeevansathi_ss/"+ss_name+".png");
		FileHandler.copy(source, target);

	}

	public static void Scroll_page(int x, int y) {

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy"+"("+x+","+y+")");
		System.out.println("Page scroll by: "+y);
	}



	public static void Scroll_to_bottom() {

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollby(0,document.body.scrollHeight)");
		System.out.println("scroll to bottom");
	}


	public static void back() {
		JavascriptExecutor js= (JavascriptExecutor) driver;

		js.executeAsyncScript("window.history.back()");
		System.out.println("page back");
	}

	public static void forward() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeAsyncScript("window.history.forward()");
		System.out.println("forward");
	}

	public static void refresh() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeAsyncScript("window.history.go()");
	}

	public static void enter_text(WebElement element, String text) {
		Actions act= new Actions(driver);
		act.sendKeys(element, text).build().perform();
		System.out.println("text enter in field");
		
	}
	
	public static void copy() {
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		System.out.println("text copy");
	}
	
public static void select() {
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	System.out.println("text selected");
}

public static void paste () {
	Actions act= new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
}

public static void rightclick(WebElement element) {
	Actions act= new Actions(driver);
	act.contextClick(element).build().perform();
}

public static void doubleclick(WebElement element) {
	Actions act= new Actions(driver);
	act.doubleClick(element).build().perform();
}

public static void drag_and_drop(WebElement source, WebElement target) {
	Actions act= new Actions(driver);
	act.dragAndDrop(source, target).build().perform();
} 
public static void slider(WebElement slider, int x, int y) {
	Actions act= new Actions(driver);
	act.dragAndDropBy(slider, x, y).build().perform();
}

public static void move_to_element(WebElement element) {
	Actions act= new Actions(driver);
	act.moveToElement(element).doubleClick().build().perform();
}

public static void tab() {
	Actions act = new Actions(driver);
	act.keyDown(Keys.TAB).build().perform();
	System.out.println("tab");
	
}
	public static void Reportss(String title, String report_name, String app ) {
	

	
	ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\Report\\report10");
	report.config().setTheme(Theme.DARK);
	report.config().setDocumentTitle(title);
	report.config().setReportName(report_name);
	
	 er= new ExtentReports();
	er.attachReporter(report);
	
	er.setSystemInfo("OS", "Windows");
	er.setSystemInfo("Browser", "Chrome");
	er.setSystemInfo("Application", app);
	er.setSystemInfo("QA", "Shubham Nishane");
	
	
	
	
	}
	
	public static void Test(String testname, String testinfo, String Screenshotname) {
		
		etest=er.createTest(testname);
		etest.log(Status.INFO, testinfo);
		etest.addScreenCaptureFromPath(projectpath+"\\amazon_ss\\"+Screenshotname+".png");
		
		
		
	}
	public static void upload_file(String locator, String path) throws AWTException {
		
		driver.findElement(By.xpath(locator)).click();
		
		StringSelection ss= new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r= new Robot();
		r.delay(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.delay(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
}


