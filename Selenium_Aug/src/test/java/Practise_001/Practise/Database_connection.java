package Practise_001.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

public class Database_connection extends Dynamic_code {

	public static void main(String[] args) throws SQLException {

		
		launch_browser("chrome");
		
		hiturl("https://www.facebook.com/");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root","SHU2210");

		Statement cs = connect.createStatement();
		
		ResultSet r = cs.executeQuery("select email, passwor from login where sr_no=2;");
		r.next();
		
		System.out.println(r.getString("email"));
		System.out.println(r.getString("passwor"));
		
		driver.findElement(By.cssSelector("input#email")).sendKeys(r.getString("email"));
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(r.getString("passwor"));
		
		driver.findElement(By.cssSelector("div._9lsa")).click();
		
	}

}
