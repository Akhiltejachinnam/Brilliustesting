package Testcases;

import java.io.IOException;

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
	    @Test
	    public static void isusersession() throws InterruptedException, IOException
	    {
	    	driver.findElement(By.xpath("Audio_Session")).click();
	    	driver.findElement(By.xpath("Practice_Session")).click();
	    	driver.findElement(By.xpath("Start_Session")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("Get_Earphone")).click();
	    	/*driver.findElement(By.xpath("Start")).click();
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("Stop")).click();
	    	Thread.sleep(2000);
	    	System.out.println(driver.findElement(By.xpath("Question")).getText());
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("feedback")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("Next_button")).click();
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("Start")).click();
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("Stop")).click();
	    	Thread.sleep(2000);*/
	    	
	    	try {
	            while (true) {
	            	
	            	// Click on the "Start" button
	                WebElement startButton = driver.findElement(By.xpath("Start"));
	                startButton.click();
	                Thread.sleep(2000);
	                
	             // Click on the "Feedback" button
	                WebElement feedbackButton = driver.findElement(By.xpath("Feedback"));
	                feedbackButton.click();
	                Thread.sleep(2000);
	                
	             // Click on the "Stop" button
	                WebElement stopButton = driver.findElement(By.xpath("Stop"));
	                stopButton.click();
	                
	                // Click on the "Next" button
	                WebElement nextButton = driver.findElement(By.xpath("Next_button"));
	                nextButton.click();
	                Thread.sleep(2000);	                
	                
	                // Check if the "Finish" button is present
	                WebElement finishButton = driver.findElement(By.xpath("Finish"));

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

}
