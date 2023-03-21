package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Listeners.RetryAnalyzer;

public class CrossBrowserTestingScript
{
	public WebDriver driver;
	public String path = "C:\\Users\\patha\\Desktop\\Selenium\\chromedriver.exe";

	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeTest

	public void setup(String browsername) throws Exception
	{
		System.out.println("Browser name is: "+browsername);
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","path");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","path");
			driver=new InternetExplorerDriver();	
		}
		else
			throw new Exception("Incorrect Browser");
	}
/*	
	@Parameters("url")
	@Test
	public void test1(String urlname) throws InterruptedException
	{
		System.out.println("URL name is: "+urlname);
		driver.get(urlname);
		Thread.sleep(3000);
		driver.close();
	}
*/
}
