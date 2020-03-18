package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSetUP;
import utils.WaitFunction;

public class SearchPage 

{
	
	WebDriver driver;
	WaitFunction wait;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement searchbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;
	
    @FindBy(xpath = "//div[contains(text(),'Relevance')]")
    WebElement relavence;

	
	public String verifysearchbox(String enterTheItemToSearch)
	{  
		
		wait = new WaitFunction(driver);
		wait.webDriverWaitfunction(searchbox);
		searchbox.click();
		searchbox.sendKeys(enterTheItemToSearch);
		searchButton.click();
		wait.webDriverWaitfunction(relavence);
		relavence.click();
		;
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("The current url is :"+CurrentURL);
		
		return CurrentURL;
	
	}	

}
