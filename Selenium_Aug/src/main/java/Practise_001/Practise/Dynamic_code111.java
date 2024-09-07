package Practise_001.Practise;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_code111 {


	public static WebDriver driver;
	public static void launch_browser(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("launched  browser is: "+ browser);
	}

	public static void hiturl(String url) {

		driver.get(url);
		System.out.println(driver.getTitle());
	}

	public static void screenshot(String screenshot_name) throws Throwable {

		TakesScreenshot tt= (TakesScreenshot) driver;
		File source = tt.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshot/"+screenshot_name+".png");
		org.openqa.selenium.io.FileHandler.copy(source, target);
	}
	
	public static void page_scroll(int x , int y) throws Throwable {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+"("+x+","+y+")");

		System.out.println("page is scroll");
	}
	public static void Back() throws Throwable {
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.history.back()");
	}
	public static void Forward() throws Throwable {
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("window.history.forward()");
	}
	public static void Refresh() throws Throwable {
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("window.history.go(0)");
	}
	
	public static void scroll_end_of_the_page() throws Throwable {
		JavascriptExecutor js4=(JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
