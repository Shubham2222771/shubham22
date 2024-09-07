package Practise_001.Practise;


import java.io.File;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jeevansathi {

	public static void main(String[] args) throws Throwable { 

WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.jeevansathi.com/");





System.out.println(driver.getTitle());

TakesScreenshot ts= (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType .FILE);
File target = new File("./screenshot/jvansathi.png");
org.openqa.selenium.io.FileHandler.copy(source, target);


driver.navigate().back();
driver.navigate().refresh();
driver.close();

		
	}

}
