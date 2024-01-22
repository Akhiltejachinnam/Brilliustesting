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
	public static void UserLoginTest() throws InterruptedException {
		
		System.out.println("Clicked successfully");
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
	    driver.findElement(By.xpath(loc.getProperty("Audio_Session"))).click();
	    driver.findElement(By.xpath(loc.getProperty("Practice_Session"))).click();
	    driver.findElement(By.xpath(loc.getProperty("Start_Session"))).click();
	    	//Thread.sleep(2000);
	    driver.findElement(By.xpath(loc.getProperty("Get_Earphone"))).click();

	    	try {
	            while (true) {
	            	
	            	// Click on the "Start" button
	                WebElement startButton = driver.findElement(By.xpath(loc.getProperty("Start")));
	                startButton.click();
	                Thread.sleep(2000);
	                
	             // Click on the "Feedback" button
	                WebElement feedbackButton = driver.findElement(By.xpath(loc.getProperty("Feedback")));
	                feedbackButton.click();
	                Thread.sleep(2000);
	                
	             // Click on the "Stop" button
	                WebElement stopButton = driver.findElement(By.xpath(loc.getProperty("Stop")));
	                stopButton.click();
	                
	                // Click on the "Next" button
	                WebElement nextButton = driver.findElement(By.xpath(loc.getProperty("Next_button")));
	                nextButton.click();
	                Thread.sleep(2000);	                
	                
	                // Check if the "Finish" button is present
	                WebElement finishButton = driver.findElement(By.xpath(loc.getProperty("Finish")));

	                // If the "Finish" button is found, break the loop
	                if (finishButton.isDisplayed()) {
	                    break;
	                }
	            }
	        } catch (Exception e) {
	            // Handle exceptions as needed
	            e.printStackTrace();
	        }
	}
	    	@Test
	    	public boolean Adduser(String fname, String lname, String emailadd, String uname,String pword, String cnumber, String role) throws InterruptedException
	    	{
	    	driver.findElement(By.xpath("Register_button")).click();
	    	driver.findElement(By.id("first_name")).sendKeys(fname);
	    	driver.findElement(By.id("lastname")).sendKeys(lname);
	    	driver.findElement(By.id("email_address")).sendKeys(emailadd);
	    	driver.findElement(By.id("user_name")).sendKeys(uname);
	    	driver.findElement(By.id("pwd")).sendKeys(pword);
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("contact_number")).getAttribute(cnumber);
	   	      //driver.findElement(By.id("contactnumber")).sendKeys(cnumber);
	    	
	    	Select rolelist = new Select(driver.findElement(By.id("User_type")));
	    	rolelist.selectByVisibleText(role);
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("Registration_submit")).click();
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("Back_Homepage")).click();
	    	Thread.sleep(2000);
			return false;	
	    	}
			public boolean isAdminmoduledisplayed()
			{
				if(driver.findElement(By.xpath("Admin_homepage_vissible")).isDisplayed())
						{
					      return true;
						}else
						{
							return false;
						}
			}
	    	
	}



