package testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LoginPageObjects;
import PageObject.homepageobjects;

public class TestEndtoEndScenario1 
{
		WebDriver driver;
		
		@BeforeSuite
		public void runbeforesuite()
		{
			System.out.println("Before Suites");
		}
		@AfterSuite
		public void runaftersuite()
		{
			System.out.println("After Suites");
		}
		@BeforeClass
		public void runbeforetestcases()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\software\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://localhost/dolibarr-3.1.1/htdocs/index.php");	
			System.out.println("Before Class -- Executed");
		}
		@AfterClass 
		public void Aftrclass()
		{
			System.out.println("After Class");
		}
		@AfterMethod
		public void aftereverytestwait()
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("After Method -- Executed After Every Method");
		}
		@BeforeMethod
		public void Beformethod()
		{
			System.out.println("Before Method -- Executed BefoeEvery Method");
		}
		@AfterTest
		public void aftertestwait()
		{
			driver.close();
			System.out.println("AfterTest -- Successfully Executed All the Tests");
		}
		@BeforeTest
		public void Befortest()
		{
			System.out.println("Before Test -- Executed All the Tests before Test");
		}
		
		@Test(priority =1)
		public void username() throws IOException
		{
			LoginPageObjects log = new LoginPageObjects(driver);
			log.username().sendKeys("admin");
			System.out.println("Username Executed");
		}
		@Test(priority =2)
		public void password()
		{
			LoginPageObjects log = new LoginPageObjects(driver);
			log.password().sendKeys("admin");
			System.out.println("Password Executed");
		}
		@Test(priority =3)
		public void submit()
		{
			LoginPageObjects log = new LoginPageObjects(driver);
			log.submit().click();
			System.out.println("Connection Established");
		}
		@Test(priority =4)
		public void logout()
		{
			homepageobjects logout=new homepageobjects(driver);
			logout.Logout().click();
			System.out.println("Successfully Logged Out");
		}
	}
