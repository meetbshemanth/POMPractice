package utils;

import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverSetUP;

public class WaitFunction

{
	
	WebDriver driver;
	DriverSetUP setUp;
	
	public WaitFunction(WebDriver driver)
	{
		this.driver=driver;
	
	}
	public void webDriverWaitfunction(WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(setUp.driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(element));		
	}
	
}
