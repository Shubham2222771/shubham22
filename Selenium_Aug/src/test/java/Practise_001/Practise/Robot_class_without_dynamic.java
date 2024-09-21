package Practise_001.Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class_without_dynamic {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ilovepdf.com/word_to_pdf");

		driver.findElement(By.xpath("//span[text()=\"Select WORD files\"]")).click();

		StringSelection ss= new StringSelection("\"C:\\Users\\HP\\Desktop\\Selenium java class notes.docx\"");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot r= new Robot();

		r.delay(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		

	}

}
