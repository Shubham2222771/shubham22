package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Calender extends Dynamic_code {

	public static void main(String[] args) {

		
		launch_browser("chrome");
		
		hiturl("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		
		Actions act= new Actions(driver);
		
		WebElement from = driver.findElement(By.xpath("(//p[text()=\"Enter city or airport\"])[1]"));
		
		act.moveToElement(from).click().sendKeys("nagpur").build().perform();


		WebElement to = driver.findElement(By.xpath("(//p[text()=\"Enter city or airport\"])[2]"));
		to.click();
		to.sendKeys("pune");
		
		
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		//driver.findElement(By.xpath("(//p[text()=\"14\"])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@role=\"button\"])[2]")).click();
		driver.findElement(By.xpath("(//span[@role=\"button\"])[2]")).click();
		
		driver.findElement(By.xpath("//div[@aria-label=\"Sat Nov 09 2024\"]")).click();
	}

}
