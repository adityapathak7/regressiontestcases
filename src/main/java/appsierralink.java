import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class appsierralink 
{
	WebDriver driver;
  	@BeforeTest
  	public void setUp()
  	{
  		System.setProperty("webdriver.chrome.driver", "E:\\software\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
  		driver=new ChromeDriver();
  	}
	
	@Test
	public void linkheader() throws InterruptedException
	{
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String navbar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav")).getText();
		//subsequence for characters
		//substring for fetching strings
		
		if(navbar.contains("Input Forms Date pickers Table"))
		{
			System.out.println("all headings are present");
		}
		
		System.out.println(navbar.substring(9, 40));
		
		String str = "Input FormsDate pickersTable";
		
		String[] str1 = navbar.split("");
		
		System.out.println(str1);
		
		if(navbar.equalsIgnoreCase(str))
		{
			System.out.println(str);
		}
		driver.close();
		}
}