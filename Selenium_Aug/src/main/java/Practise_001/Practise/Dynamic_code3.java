package Practise_001.Practise;

import java.io.File;
import java.time.Duration;

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

public class Dynamic_code3 {

	public static WebDriver driver;
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
		File target= new File("./ss_3/"+ss_name+".png");
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
}
