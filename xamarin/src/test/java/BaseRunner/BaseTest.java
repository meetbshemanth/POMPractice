package BaseRunner;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import driver.DriverSetUP;
import pages.ItemCategory;
import xamarin.Login.LoginFunctionalitycheck;

public class BaseTest
{
	DriverSetUP setUp;
	WebDriver driver;
	LoginFunctionalitycheck  loginFunCheck;
	ItemCategory itemCategory;
		
	
		
	
  @Test
  public void completeRunner() throws Throwable 
  {	  
	  setUp = new DriverSetUP("https://www.flipkart.com");
	  
	  System.out.println("URL opened successfuly and login  starts");  
	  
	  itemCategory.sectionUnderyCategory();
	    
  }
  
}
