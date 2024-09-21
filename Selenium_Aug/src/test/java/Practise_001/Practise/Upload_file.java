package Practise_001.Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class Upload_file extends Dynamic_code {

	public static void main(String[] args) throws AWTException {

		launch_browser("chrome");
		hiturl("https://www.ilovepdf.com/word_to_pdf");

		driver.findElement(By.xpath("//span[text()=\"Select WORD files\"]")).click();

		StringSelection ss1= new StringSelection("\"C:\\Users\\HP\\Desktop\\API Testing using Postman with Practical Scenarios - by STP.docx\"");


		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

		Robot r1= new Robot();

		r1.delay(4000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);

		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		

	}
}
