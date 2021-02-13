package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.LoginPageObjects;
import PageObject.homepageobjects;

public class TestUser1ThirdPartyNavigate
{
	@Test(priority = 2)
	public void User1_Navigate_NewThirdParty()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		LoginPageObjects log = new LoginPageObjects(driver);
		homepageobjects logout=new homepageobjects(driver);

		driver.get("http://localhost/dolibarr-3.1.1/htdocs/index.php");
		log.username().sendKeys("admin");
		log.password().sendKeys("admin");
		log.submit().click();
	
		driver.findElement(By.cssSelector("a#mainmenua_companies")).click();
		
		logout.Logout().click();
		driver.close();
	}
}
