package Practise_001.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_code4 {
	
	public static WebDriver driver;
	public static void launche_browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 driver= new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		
		System.out.println("launched browser: "+ browser);
		
	}
	
	

}
