package catogary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverSetUP;
import pages.ItemCategory;
import pages.Loginpage;


public class ItemCategoryFunctionality
{ 
	
	ItemCategory itemCategory;	 
	Loginpage loginpage;
	DriverSetUP driversetup;
	
	@Test
	public void categoryFunctionality() throws InterruptedException
	{
		 
		loginpage.enterUserNameAndPassWord("meethemanthbs@gmail.com", "S0whemub5@");
		itemCategory.sectionUnderyCategory();
	}
	
	@BeforeSuite	
	public void initializedrivers() throws InterruptedException
	{
		driversetup = new DriverSetUP("https://www.flipkart.com");		
		loginpage = new Loginpage(driversetup.driver);
		itemCategory = new ItemCategory(driversetup.driver);			
	}
	

}
