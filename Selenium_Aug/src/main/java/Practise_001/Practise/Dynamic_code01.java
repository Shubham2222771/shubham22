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

public class Dynamic_code01 {


	public static WebDriver driver;

	public static void launche_browser(String browser){

		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("launched browser is: "+ browser);

	}	

	public static void hiturl(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
	}

	public static void screenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./ss/"+screenshot_name+".png");
		FileHandler.copy(source, target);
	}

	public static void scroll_page(int x, int y) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+"("+x+","+y+")");

	}
	public static void scroll_to_bottom() throws Throwable {
		JavascriptExecutor js4=(JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public static void back() {
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("window.history.back()");
	}

	public static void forward() {
		JavascriptExecutor js2= (JavascriptExecutor) driver;
		js2.executeScript("window.history.forward()");
	}

	public static void refresh() {
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("window.history.go()");
	}

	public static void enter_text( String send_keys) {

		Actions act=new Actions(driver);

		act.sendKeys(send_keys).build().perform();

	}

	public static void copy() {

		Actions act=new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	}

	public static void select() {
		Actions act=new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	}

	public static void paste() {
		Actions act=new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

	public static void right_click() {
		Actions act=new Actions(driver);
		act.contextClick().build().perform();

	}
	public static void double_click() {
		Actions act=new Actions(driver);
		act.doubleClick().build().perform();

	}

	public static void slide(String obj, int x,int y) {
		Actions act=new Actions(driver);
		act.dragAndDropBy(null, x, y).build().perform();
	}

	public static void switch_to_frame(String frame) {

		driver.switchTo().frame(frame);

	}

	public static void back_to_window() {
		driver.switchTo().defaultContent();
	}

	public static void Page_up() {
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_UP).build().perform();

	}

	public static void page_down() {
		Actions act= new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
	}

	public static void tab() {

		Actions act= new Actions(driver);
		act.keyDown(Keys.TAB).build().perform();
	}
public static void drag_and_drop(WebElement source, WebElement target) {
	
	Actions act= new Actions(driver);
	
	act.dragAndDrop(source, target).build().perform();
}

}
