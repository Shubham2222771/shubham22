package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Snapdeal_code3 extends Dynamic_code3 {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

hiturl("https://snapdeal.com/");

WebElement mens_fashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
doubleclick(mens_fashion);

WebElement sandal_and_floaters = driver.findElement(By.xpath("//span[text()=\"Sandals & Floaters\"]"));

doubleclick(sandal_and_floaters);



WebElement enter_code = driver.findElement(By.xpath("(//input[@class=\"sd-input\"])[2]"));

enter_code.click();
enter_code.sendKeys("442001");

WebElement check_button = driver.findElement(By.xpath("//button[text()=\"Check\"]"));

check_button.click();

driver.findElement(By.xpath("//a[text()=\"kitchen product\"]")).click();


driver.navigate().back();

driver.navigate().back();

// back();
 
 
WebElement women = driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
 doubleclick(women);
 
 Thread.sleep(2000);
 
 WebElement kurtas = driver.findElement(By.xpath("//span[normalize-space()='Kurtas & Kurtis']"));
doubleclick(kurtas);
System.out.println("window close by driver");
driver.close();
	}

}
