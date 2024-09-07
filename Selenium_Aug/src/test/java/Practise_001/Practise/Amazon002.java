package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Amazon002 extends Dynamic_code01 {

	public static void main(String[] args) throws Throwable {

	
		launche_browser("chrome");
		screenshot("browser");
		
		hiturl("https://www.jeevansathi.com/");
		screenshot("amazond");
		
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.click();
	
		enter_text("shubhamnishane@gmail.com");
		
		select();
		copy();
		
		tab();
		tab();
		tab();
	
		paste();
		tab();
		double_click();
		
		
		
	}

}
