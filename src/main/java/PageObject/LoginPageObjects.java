package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	WebDriver driver; //initialize webdriver so it can be used in below me
	
	public LoginPageObjects(WebDriver driver) // creating the constructor 
	{
		this.driver=driver; //this represent local driver
		PageFactory.initElements(driver, this);
	}
	
//Normal page object mechanism to Page object Factory	
	
	@FindBy(xpath="//*[@id='username']") WebElement username;
	@FindBy(xpath="//*[@id='password']") WebElement password;	
	@FindBy(xpath="//input[contains(@class,'button')]") WebElement submit;
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement submit()
	{
		return submit;
	}
}
