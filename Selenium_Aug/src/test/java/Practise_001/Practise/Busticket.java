package Practise_001.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Busticket {

	
	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		driver.get("https://www.redbus.in/");
		
		System.out.println(driver.getTitle());
		
		
		WebElement from = driver.findElement(By.cssSelector("input#src"));
		
		from.click();
		from.sendKeys("wardha");
		
		WebElement to = driver.findElement(By.cssSelector("input#dest"));
		to.click();
		to.sendKeys("pune");
		
		
		driver.findElement(By.cssSelector("button#search_button")).click();
		
		
	}

}
