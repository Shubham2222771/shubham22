package Practise_001.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Jeevansathi_registration extends Dynamic_code3 {

	public static void main(String[] args) {
		
		
		launch_browser("chrome");

		
		
	hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Jeevansathi_Registration&utm_term=jeevansathi%20registration&gad_source=1&gclid=CjwKCAjw59q2BhBOEiwAKc0ijbiMXXrK-Skb7ry9xMYY34c5_4uGheaGXxqoM9W1LuB7XON0-GPvZhoCSj0QAvD_BwE");
	
	WebElement email = driver.findElement(By.cssSelector("input#reg_email"));
	
	email.click();
	enter_text(email, "shubhamnishane@gmail.com");
	
	WebElement password = driver.findElement(By.cssSelector("input#reg_password"));
	
	enter_text(password, "1234567");
	
	WebElement create_profile_for = driver.findElement(By.cssSelector("select#reg_relationship"));
	
	
	
	Select st= new Select(create_profile_for);
	
	st.selectByVisibleText("Self");
	
	WebElement gender = driver.findElement(By.cssSelector("input#reg_gender_M"));
	gender.click();
	
	WebElement day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
	Select sd= new Select(day);
	sd.selectByVisibleText("22");
	
	tab();
	WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
	Select sm= new Select(month);
	
	sm.selectByVisibleText("Oct");
	tab();
	
	
	WebElement year = driver.findElement(By.cssSelector("select#reg_dtofbirth_year"));
	
	Select sy= new Select(year);
	sy.selectByVisibleText("1994");
	
	tab();
	
	WebElement height = driver.findElement(By.cssSelector("select#reg_height"));
	
	Select sh= new Select(height);
	sh.selectByVisibleText("6' 0\" (1.83 mts)");
	
	WebElement martial_status = driver.findElement(By.cssSelector("select#reg_mstatus"));
	
	Select ss =new Select(martial_status);
	ss.selectByVisibleText("Never Married");
	
	WebElement mother_tongue = driver.findElement(By.cssSelector("select#reg_mtongue"));
	
	Select st2= new Select(mother_tongue);
	st2.selectByVisibleText("Marathi");
	doubleclick(mother_tongue);
	//tab();
	//Scroll_page(0, 300);
	
	
	
	
	//WebElement religion = driver.findElement(By.cssSelector("select#reg_religion"));
	
	
	//Select su= new Select(religion);
	//
	//su.selectByVisibleText("Hindu");
	
	//driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
	
	

WebElement pincode = driver.findElement(By.xpath("//input[@id='reg_pincode']"));

enter_text(pincode, "442001");

	//Actions act= new Actions(driver);
	//act.keyDown(Keys.ENTER).build().perform();
	
	//WebElement select_city = driver.findElement(By.cssSelector("select#reg_city_res"));
	
	//Select sc= new Select(select_city);
	//sc.selectByVisibleText("Wardha");
	
	
	//WebElement pincode = driver.findElement(By.cssSelector("input#reg_pincode"));
	
	//enter_text(pincode, "442001");
	
	tab();
	//tab();
	WebElement mobile_no = driver.findElement(By.cssSelector("input#reg_phone_mob_mobile"));
	
	enter_text(mobile_no, "9561331880");
	driver.close();
	
	}
	

}
