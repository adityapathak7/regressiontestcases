package Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class RetryAnalyzer implements IRetryAnalyzer 
//it can be implemented at class level and at runtime
//my retry class implenets interface iretryanalyzer
{
	int retryCount = 0;
	int maxRetryCount = 3;
	//retry count can be customized accordingly
 
	public boolean retry(ITestResult result)
	{
		if (retryCount < maxRetryCount) 
		{
			retryCount++;
			return true;
		}
    return false;
  }
}
