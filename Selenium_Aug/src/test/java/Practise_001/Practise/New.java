package Practise_001.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws SQLException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		// we need to create jdbc connnection here for fetching login detail 
		
		// how to create jdbc connection
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root","SHU2210");
		
		Statement cs = connect.createStatement();
		
		ResultSet r = cs.executeQuery("select email, passwor from login where sr_no=2;");
		
		r.next();
		
	System.out.println(r.getString("email"));
	
	System.out.println(r.getString("passwor"));
	
}
}