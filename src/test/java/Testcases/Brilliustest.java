package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ReadXLSdata;

public class Brilliustest extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="Brilliusdata")
	public static void LoginTest(String username, String password) throws InterruptedException {
		
		System.out.println("Clicked successfully");
		driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(2000);
		
		WebElement userPageElement = driver.findElement(By.xpath(loc.getProperty("userPage_Identifier"))); 

	    if (userPageElement.isDisplayed()) {
	        System.out.println("User page is visible. Login successful!");
	        
	    } else {
	        System.out.println("User page is not visible. Login failed!");
	        
	    }
		
	}
	
	
}
