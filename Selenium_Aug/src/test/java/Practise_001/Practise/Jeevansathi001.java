package Practise_001.Practise;

import org.openqa.selenium.By;

public class Jeevansathi001 extends Dynamic_code111 {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		screenshot("browser");


		hiturl("https://www.jeevansathi.com/");
		screenshot("jeevansathi");

		page_scroll(0, 700);
		screenshot("pagescroll by 700");

		scroll_end_of_the_page();
		screenshot("Endofthepage");

		driver.findElement(By.xpath("//a[text()=\"About Us\"]")).click();
		screenshot("About us ");

		Back();
		screenshot("backtothehomepage");

		driver.close();


	}

}
