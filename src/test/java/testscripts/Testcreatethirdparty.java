package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Baseclass.CrossBrowserTestingScript;
import PageObject.LoginPageObjects;
import PageObject.homepageobjects;

public class Testcreatethirdparty extends CrossBrowserTestingScript
{
	@Test //(priority = 3)//(enabled=false)
	public void User1_CreateNewThirdParty()
		{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		LoginPageObjects log = new LoginPageObjects(driver);
		homepageobjects logout=new homepageobjects(driver);

		driver.get("http://localhost/dolibarr-3.1.1/htdocs/index.php");

		log.username().sendKeys("admin");
		log.password().sendKeys("admin");
		log.submit().click();
		
		//Navigate to New Third party
		driver.findElement(By.cssSelector("a#mainmenua_companies")).click();
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[1]/div/div[1]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='radioprivate']")).click();
				
		//Create New third Party
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Biotronics");
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Vikram");
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[2]/div/form/table/tbody/tr[3]/td[2]/select/option[3]")).click();
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[2]/div/form/table/tbody/tr[4]/td[2]/select/option[3]")).click();		
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[2]/div/form/table/tbody/tr[4]/td[4]/table/tbody/tr/td[1]/input")).sendKeys("0011");
		Select supplier = new Select(driver.findElement(By.xpath("//*[@id='fournisseur']")));
		supplier.selectByVisibleText("No");		
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[2]/div/form/table/tbody/tr[5]/td[4]/table/tbody/tr/td[1]/input")).sendKeys("1122");
		Select supplier1 = new Select(driver.findElement(By.xpath("//*[@id='status']")));
		supplier1.selectByIndex(0); //index starts from Zero
		driver.findElement(By.xpath("//*[@id='undertopmenu']/tbody/tr/td[2]/div/form/table/tbody/tr[7]/td[2]/textarea")).sendKeys("Bhopal");
		driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("112233");
		driver.findElement(By.xpath("//*[@id='town']")).sendKeys("Bhopal");
		Select supplier2 = new Select(driver.findElement(By.xpath("//*[@id='selectpays_id']")));
		supplier2.selectByValue("117");
		
		logout.Logout().click();
		driver.close();
	}
}
