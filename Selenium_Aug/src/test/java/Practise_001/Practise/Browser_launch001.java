package Practise_001.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch001 {

	public static void main(String[] args) {
		
		// web driver reference variable can hold driver class object
		// here we use third property of inheritance 
		// we create indirect object of interface using third property of inheritance
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// we can hit url using get method 
		
		driver.get("https://web.whatsapp.com/");
		
		//we can close the window using close() method
		
		
		//driver.close();
		
	}

}
