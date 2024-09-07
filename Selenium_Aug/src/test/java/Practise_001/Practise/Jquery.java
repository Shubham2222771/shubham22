package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Jquery extends Dynamic_code3 {

	public static void main(String[] args) {

		
launch_browser("chrome");
		
		hiturl("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
		
		slider.click();
		slider(slider, 400, 0);
		
		slider(slider, -300, 0);
		driver.switchTo().defaultContent();
		
		WebElement dragaable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
	
		doubleclick(dragaable);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame1);
		
		WebElement drag_and_around = driver.findElement(By.cssSelector("div#draggable"));
		slider(drag_and_around, 400, 10);
		
		driver.switchTo().defaultContent();
		
		//Scroll_page(0, 100);
		
		WebElement check = driver.findElement(By.xpath("//a[text()=\"Accordion\"]"));
		
	
	move_to_element(check);
	
	WebElement frame2 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	driver.switchTo().frame(frame2);
	
	WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Mauris mauris ante, blandit et, ultrices a, suscip')]"));
	
	
	text.click();
	
	
	
	driver.switchTo().defaultContent();
	
	WebElement button = driver.findElement(By.xpath("//a[text()=\"Button\"]"));
move_to_element(button);
	
	}

}
