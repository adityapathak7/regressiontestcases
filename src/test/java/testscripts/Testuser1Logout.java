package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.LoginPageObjects;
import PageObject.homepageobjects;

public class Testuser1Logout {
	
	@Test(priority = 1)
	public void User1_Logout_Test() throws IOException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patha\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/dolibarr-3.1.1/htdocs/index.php");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPageObjects log = new LoginPageObjects(driver);
		homepageobjects logout=new homepageobjects(driver);	
		
		log.username().sendKeys("admin");
		log.password().sendKeys("admin");
		log.submit().click();
		logout.Logout().click();
		driver.close();
	}
}
