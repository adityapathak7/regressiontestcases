package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects {
	
	WebDriver driver; //initialize webdriver so it can be used in below mention code
	
	public homepageobjects(WebDriver driver) // creating the constructor 
	{
		this.driver=driver; //this represent local driver
		//initialize page objects using initElements() method from PageFactory Class as below: 	
		
		PageFactory.initElements(driver, this);
				
		//Once we call initElements() method, all elements will get initialized
	}

	@FindBy(xpath="//img[contains(@class,'log')]") WebElement Logout;
	
	public WebElement Logout()
	{
		return Logout;
	}
}
