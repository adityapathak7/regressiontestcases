package testscripts;

import org.testng.annotations.Test;

import Baseclass.CrossBrowserTestingScript;

public class browserTest extends CrossBrowserTestingScript
{
	@Test
	public void test() throws InterruptedException
	
	{
		driver.get("http://google.com");
		Thread.sleep(3000);
	
		driver.close();
	
	}
}