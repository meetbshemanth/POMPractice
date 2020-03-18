
package xamarin.Login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.DriverSetUP;
import pages.Loginpage;

public class LoginFunctionalitycheck 
{
	
	Loginpage loginpage; 	
	DriverSetUP driversetup;
        
     @Test
	public void LoginFunction() throws Throwable
	{
    	driversetup = new DriverSetUP("https://www.flipkart.com");		
    	loginpage = new Loginpage(driversetup.driver);
    	
       loginpage.enterUserNameAndPassWord("meethemanthbs@gmail.com", "S0whemub5@");        
    	System.out.println("Login Successful");    	
    	String actualProfileName = loginpage.getprofileName();    	
    	Assert.assertEquals(actualProfileName, "Hemantha");    	
    	System.out.println("Account verification is successful");
    	
	}
     
     
    
}
    

