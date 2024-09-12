package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert extends Dynamic_code3{

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		
		hiturl("https://demo.automationtesting.in/Alerts.html");
		// simple alert
		driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
		org.openqa.selenium.Alert simple_alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		simple_alert.accept();
		// confirmation alert
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();

		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
		org.openqa.selenium.Alert confrimation_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		confrimation_alert.accept();
		
WebElement title = driver.findElement(By.cssSelector("p#demo"));
		
		System.out.println(title.getText());
		
		//Propomt alert
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-info")).click();
		
		org.openqa.selenium.Alert prompt_alert = driver.switchTo().alert();
		System.out.println(prompt_alert.getText());
		
		Thread.sleep(2000);
		prompt_alert.sendKeys("hello world");
		prompt_alert.accept();
		
		WebElement msg = driver.findElement(By.cssSelector("p#demo1"));
System.out.println(msg.getText());
	
	}

}
