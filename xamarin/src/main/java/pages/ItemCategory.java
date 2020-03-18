package pages;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driver.DriverSetUP;

public class ItemCategory 

{
	WebDriver driver;
	Loginpage loginpage;
	DriverSetUP driversetup;
	
	@FindBy(xpath ="//ul[@class='_114Zhd']")
	List<WebElement> categoryBar;
	
	 public  ItemCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sectionUnderyCategory()
	{   
     	int count=categoryBar.size();     	
	    System.out.println("The Size of List is  "+ count);
		int actualcount=0;
	
	    for(WebElement section:categoryBar)
	    {
	    	String sectionName = section.getText();	    	
	       	System.out.println(sectionName);
	       	actualcount++;
	       	System.out.println("The actual length= "+ actualcount);
	    }
	    	    
	    Assert.assertEquals(actualcount, count);	    
	    System.out.println("The actual length= "+ actualcount);  
	}
	
}

