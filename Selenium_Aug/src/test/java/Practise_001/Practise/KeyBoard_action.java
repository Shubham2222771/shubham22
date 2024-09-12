package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_action extends Dynamic_code01 {

	public static void main(String[] args) {
		
		launche_browser("chrome");
		
		hiturl("https://www.jeevansathi.com/");

		WebElement select = driver.findElement(By.cssSelector("div#relationshipBlock"));
		select.click();
		
		
		driver.findElement(By.xpath("//li[normalize-space()='Self']")).click();
		
	
		driver.findElement(By.cssSelector("div#gender")).click();
		
		driver.findElement(By.xpath("//li[text()=\"Male\"]")).click();
		Actions act= new Actions(driver);

		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("shubhamnishane@gmail.com");
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		//act.keyDown(Keys.TAB)
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		
		
	}

}
