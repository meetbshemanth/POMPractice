//1187403710
package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Loginpage 
{
	WebDriver driver;
	
	
	@FindBy(xpath ="//input[@class='_2zrpKA _1dBPDZ']")    
	WebElement UserName;	
	
	@FindBy(xpath ="//input[@type='password']")
	WebElement userPassword;
	
	@FindBy(xpath ="//button//span[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Hemantha')]")
	WebElement profileName;
	
	

	public Loginpage(WebDriver driver) 
	{
		this.driver=driver;
    	PageFactory.initElements(driver, this);
	}

	public void enterUserNameAndPassWord(String uID ,String uPass)
	{
		webDriverWait(UserName);
		UserName.sendKeys(uID);
		webDriverWait(userPassword);
		userPassword.sendKeys(uPass);
		webDriverWait(loginBtn);
		loginBtn.click();
		
	}
	
	public void webDriverWait(WebElement we)
	{
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(we));
		we.click();
	}
	
	public String getprofileName()
	{
		
		webDriverWait(profileName);
		
	    String actualProfileName = profileName.getText();
	    
	    System.out.println("profile name is "+actualProfileName);
	    
		return actualProfileName; 
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @FindBy(xpath ="//span[contains(text(),'Forgot?')]")
	WebElement forgotBtn;
	
	@FindBy(xpath ="//button[contains(text(),'Request OTP')]")
	WebElement OTPBtn;
	
	@FindBy(xpath ="//a[contains(text(),'New to Flipkart? Create an account')]")
	WebElement createAccount;
		
	@FindBy(xpath ="//form[@autocomplete='on']")
	WebElement switchingForm;
	 * 
	 * 
	 * public boolean VerifyLoginOfAccountHolder()
	{
		boolean display;
		
		display= AccountHolder.isDisplayed();
		
	    return display;
	}
	
	public void forgotFunction()
	{
		forgotBtn.click();
				
	} 
	public void switchingToForm()
	{
		int NoofWindos=driver.getWindowHandles().size();
		
		Set<String> windows = driver.getWindowHandles();
		
		
	 for(String window:windows)
	 {
		 System.out.println("window="+window);
	 }
	}*/
	
	


