package Practise_001.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart002 {

	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[@href=\"/viewcart?exploreMode=true&preference=FLIPKART\"][1]")).click();
		
	}
	

}
