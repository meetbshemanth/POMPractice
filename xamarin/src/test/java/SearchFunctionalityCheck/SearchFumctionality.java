package SearchFunctionalityCheck;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import driver.DriverSetUP;
import pages.ItemCategory;
import pages.Loginpage;
import pages.SearchPage;
import utils.WaitFunction;


public class SearchFumctionality 

{
	Loginpage loginpage;
	DriverSetUP driversetup;
	SearchPage search;
	WaitFunction wait;
	
	@Test
	public void searchFunctionalitychaeck() throws Exception
	{
	
		loginpage.enterUserNameAndPassWord("meethemanthbs@gmail.com", "S0whemub5@");
		Assert.assertEquals(search.verifysearchbox("apple mobiles").endsWith("sort=relevance"), true);		
		System.out.println("The Relavence main is Hightlighted");
   }
	
	@BeforeSuite	
	public void initializedrivers() throws InterruptedException
	{   
		System.setProperty("webdriver.chrome.silentoutput","true");
		driversetup = new DriverSetUP("https://www.flipkart.com");	
		
		loginpage = new Loginpage(driversetup.driver);	
		search = new SearchPage(driversetup.driver);
	}
	
	
	@AfterMethod
	public void closeDriver()
	{
		driversetup.closeDriver();
	}
  
	
}
