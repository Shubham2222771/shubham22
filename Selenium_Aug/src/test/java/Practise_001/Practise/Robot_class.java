package Practise_001.Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class Robot_class extends Dynamic_code {

	public static void main(String[] args) throws AWTException {

		launch_browser("edge");

		hiturl("https://www.ilovepdf.com/pdf_to_word");

		driver.findElement(By.xpath("//span[text()=\"Select PDF file\"]")).click();

		StringSelection ss= new StringSelection("\"C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAM INSTITUTION NOTES final (1).pdf\"");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r= new Robot();
		r.delay(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


	}

}
