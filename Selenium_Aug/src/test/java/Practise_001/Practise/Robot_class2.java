package Practise_001.Practise;

import java.awt.AWTException;

public class Robot_class2 extends Dynamic_code{

	public static void main(String[] args) throws AWTException {
		
		
		launch_browser("chrome");
		hiturl("https://www.ilovepdf.com/word_to_pdf");
		
		upload_file("//span[text()=\"Select WORD files\"]", "\"C:\\Users\\HP\\Desktop\\API Testing using Postman with Practical Scenarios - by STP.docx\"");
	}

}
