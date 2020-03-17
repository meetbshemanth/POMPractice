package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class driverSetUP

{

	public WebDriver driver;
	String url;

	
	public driverSetUP(String url) throws InterruptedException
	{
	
		this.url=url;
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);

	}

	
	public void closeBrowser() 
	{
		driver.quit();

	}


}

