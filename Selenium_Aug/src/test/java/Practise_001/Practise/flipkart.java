package Practise_001.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(208));

driver.get("https://www.flipkart.com/");

System.out.println(driver.getTitle());

WebElement searchbox = driver.findElement(By.cssSelector("input[class=\"Pke_EE\"]"));
searchbox.sendKeys("books");
searchbox.click();


WebElement login = driver.findElement(By.cssSelector("div[class=\"H6-NpN _3N4_BX\"]"));

login.click();
login.sendKeys("ssssss");
System.out.println(driver.getTitle());






}
}