package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class amazon1 extends Dynamic_code {

	public static void main(String[] args) {
		
		
		launch_browser("chrome");
		
		hiturl("https://www.amazon.in/");
		
		WebElement searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		searchbox.click();
		
		enter_text(searchbox, "ganpati decoration");
		
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Get It by Tomorrow')]")).click();
	}

}
