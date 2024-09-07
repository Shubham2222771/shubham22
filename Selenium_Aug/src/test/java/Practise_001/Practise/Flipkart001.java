package Practise_001.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart001 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("https://www.amazon.in/");

		System.out.println(driver.getTitle());

		WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

		mobile.click();

		mobile.sendKeys("pant");


		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();

		driver.navigate().back();



		WebElement t = driver.findElement(By.xpath("//span[@role='button']"));

		t.click();

		WebElement r = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

		r.click();

		r.sendKeys("shirt white");


		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();

		driver.navigate().back();


		Thread.sleep(2000);

		WebElement y = driver.findElement(By.xpath("//span[normalize-space()='Login']"));

		y.click();


		WebElement q = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));

		q.click();
		q.sendKeys("9561331990");


		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		WebElement p = driver.findElement(By.xpath("//div[@class='XDRRi5']//div[1]//input[1]"));

		p.click();
		p.sendKeys("584985");

		System.out.println(driver.getTitle());

	}
}