//
package xamarin.Login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.driverSetUP;
import pages.Login;

public class LoginFunctionalitycheck 
{
       driverSetUP setUp;
       Login login;

    @Test
	public void LoginFunction() throws Throwable
	{
      setUp = new  driverSetUP ("https://www.flipkart.com");
      login = new Login(setUp.driver);    	
      
        login.enterUserNameAndPassWord("meethemanthbs@gmail.com", "S0whemub5@");        
    	System.out.println("Login Successful");
    	
    	String actualProfileName = login.getprofileName();
    	
    	Assert.assertEquals(actualProfileName, "Hemantha");	
    	
    	System.out.println("Account verification is successful");
    	
    	
    	
	}
    
    @AfterMethod
    public void closeBrowser()
    {
    	//setUp.closeBrowser();
    	
    }
    
       
    
 }
