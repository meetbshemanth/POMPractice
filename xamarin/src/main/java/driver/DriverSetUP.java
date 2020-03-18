package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.WaitFunction;


public class DriverSetUP

{

	public static WebDriver driver;
	String url;
	WaitFunction wait;
	
	public DriverSetUP(String url) throws InterruptedException
	{
		
		this.url=url;
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentoutput","true");
		driver = new ChromeDriver();		
		driver.get(url);
		wait = new WaitFunction(driver);		
		System.out.println("URL opened successfuly and login  starts");
		
	}
	
	
	public void closeDriver()
	{

		driver.quit();
	}

	
	

}

