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
	public void User1_Navigate_NewThirdParty() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patha\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		LoginPageObjects log = new LoginPageObjects(driver);
		homepageobjects logout=new homepageobjects(driver);

		driver.get("http://localhost/dolibarr-3.1.1/htdocs/index.php");
		Thread.sleep(2000);
		log.username().sendKeys("admin");
		Thread.sleep(2000);
		log.password().sendKeys("admin");
		Thread.sleep(2000);
		log.submit().click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#mainmenua_companies")).click();
		Thread.sleep(3000);
		logout.Logout().click();
		Thread.sleep(3000);
		driver.close();
	}
}
