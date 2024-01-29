package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ReadXLSdata;

public class Brilliustest extends BaseTest{
	
	@Test
	public static void AdminLoginTest() throws InterruptedException {
	
		driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("Kumar");
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Brillius@AI");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(2000);
		
		WebElement adminPageElement = driver.findElement(By.xpath(loc.getProperty("AdminPage_Identifier"))); 

	    if (adminPageElement.isDisplayed()) {
	        System.out.println("Admin page is visible. Login successful!");
	        
	    } else {
	        System.out.println("Admin page is not visible. Login failed!");
	        
	    }
	}
	
	@Test
	public static void InvalidLoginTest() throws InterruptedException {
		
		
		driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("tyuugf");
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(2000);
		
		WebElement invalidmessage = driver.findElement(By.xpath(loc.getProperty("error_flashmessage"))); 

	    if (invalidmessage.isDisplayed()) {
	        System.out.println("error message is visible.successful!");
	        
	    } else {
	        System.out.println("error message is not visible.failed!");
	        
	    }
	  
	}
	
	@Test
	public static void EmptyfieldsLoginTest() throws InterruptedException {
		
		
		driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("");
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(2000);
		
		WebElement invalidmessage = driver.findElement(By.xpath(loc.getProperty("error_flashmessage"))); 

	    if (invalidmessage.isDisplayed()) {
	        System.out.println("error message is visible.successful!");
	        
	    } else {
	        System.out.println("error message is not visible.failed!");
	        
	    }
	  
	}
	
	@Test
	public static void UserLoginTest() throws InterruptedException {
		
		
		driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("akhilbrillius");
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Amma@143");
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
	    	@Test
	    	public void Admincreatnewuser() throws InterruptedException
	    	{
	    	driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("Kumar");
	    	driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Brillius@AI");
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath(loc.getProperty("user_management"))).click();
	    	driver.findElement(By.xpath(loc.getProperty("Register_button"))).click();
	    	driver.findElement(By.id(loc.getProperty("first_name"))).sendKeys("Akhil");
	    	driver.findElement(By.id(loc.getProperty("lastname"))).sendKeys("tejap");
	    	driver.findElement(By.id(loc.getProperty("email_address"))).sendKeys("Akhilp@gmail.com");
	    	driver.findElement(By.id(loc.getProperty("user_name"))).sendKeys("pAkhilteja");
	    	driver.findElement(By.id(loc.getProperty("pwd"))).sendKeys("Amma@143");
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath(loc.getProperty("contact_number"))).getAttribute("9063767656");
	   	      //driver.findElement(By.id("contactnumber")).sendKeys(cnumber);
	    	
	    	Select rolelist = new Select(driver.findElement(By.id(loc.getProperty("User_type"))));
	    	String role = "pAkhilteja";
			rolelist.selectByVisibleText(role);
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath(loc.getProperty("Registration_submit"))).click();
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath(loc.getProperty("Back_Homepage"))).click();
	    	Thread.sleep(2000);	
	    	}
			public boolean isAdminmoduledisplayed()
			{
				if(driver.findElement(By.xpath(loc.getProperty("Admin_homepage_vissible"))).isDisplayed())
						{
					      return true;
						}else
						{
							return false;
						}
			}
			
			@Test
			public static void UseraudiopracticeTest() throws InterruptedException {
				
				
				driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("akhilbrillius");
				driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Amma@143");
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("Audio_Session"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Practice_Session"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Start_Session"))).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath(loc.getProperty("Get_Earphone"))).click();
			
	}
			
			@Test
			public static void UseraudioassessmentTest() throws InterruptedException {
				
				System.out.println("Clicked successfully");
			    driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("akhilbrillius");
				driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Amma@143");
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("Audio_Session"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Assession"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Start_Session"))).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath(loc.getProperty("Get_Earphone"))).click();
			
			}
			
			@Test
			public static void UservideopracticeTest() throws InterruptedException {
				
				System.out.println("Clicked successfully");
			    driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("akhilbrillius");
				driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Amma@143");
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("Video_Session"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Practice_Session"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Start_Session"))).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath(loc.getProperty("Get_Earphone"))).click();
			
	}
			
			@Test
			public static void UservideoassessmentTest() throws InterruptedException {
				
				System.out.println("Clicked successfully");
			    driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("akhilbrillius");
				driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Amma@143");
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("Video_Session"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Assession"))).click();
			    driver.findElement(By.xpath(loc.getProperty("Start_Session"))).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath(loc.getProperty("Get_Earphone"))).click();
			
	}
			@Test
			public static void forgetpasswordTest() throws InterruptedException {
				
				driver.findElement(By.xpath(loc.getProperty("forgot_password"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(loc.getProperty("otp_emailaddress"))).sendKeys("Akhilp@gmail.com");
				WebElement otpInputField = driver.findElement(By.xpath(loc.getProperty("otp_input_field")));
				String otpValue = "yourOTP";				
				otpInputField.sendKeys(otpValue);
				
			
			}
			
}




