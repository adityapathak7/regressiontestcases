package testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseclass.CrossBrowserTestingScript;

public class browserTest extends CrossBrowserTestingScript
{
	@Test
	public void test() throws InterruptedException
	
	{
		driver.get("http://localhost/dolibarr-3.1.1/htdocs/index.php");
		Thread.sleep(3000);
	
		driver.close();
	
	}
}