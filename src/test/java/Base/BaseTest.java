package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver==null) {
			//System.out.println("The path is: "+ System.getProperty("user.dir"));
			fr = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\config.properties");
			fr1 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\locators.properties");
	        prop.load(fr);
	        loc.load(fr1);
	        
	        	
		}
		  if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			  
			  WebDriverManager.chromedriver().setup();
			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("--use-fake-ui-for-media-stream=1");
			  driver = new ChromeDriver(options);
			  driver.get(prop.getProperty("testurl"));
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  }
		  else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			  
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			  driver.get(prop.getProperty("testurl"));
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  }
			  
		
	}
	
	@AfterMethod
    public void tearDown() {
    	
    	driver.close();
		
	}

}
