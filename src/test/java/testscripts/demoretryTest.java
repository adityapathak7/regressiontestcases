package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Listeners.RetryAnalyzer;

public class demoretryTest
{
	//add retryanalyzer at the test level
	//execution of test happens in alphabetical order
	//so we prioritize testcases for proper testflow
	@Test(retryAnalyzer=RetryAnalyzer.class, priority=1)
	public void retrylogic()
	{
		System.out.println("passing the test without retry logic");
		//Assert.fail();
	}
	
	@Test(groups={"Smoke"},priority=2)
	public void demo1()
	{
		System.out.println("smoke test demo1");
	}
	
	@Test(groups={"Regression"},priority=3)
	public void demo2()
	{
		System.out.println("regression test demo2");
	}
	//defining multiple groups
	@Test(groups={"Smoke","Regression"},priority=4)
	public void demo3()
	{
		System.out.println("smoke+regression test demo3");
	}
	
	@Test(groups={"Regression"},priority=5)
	public void demo4()
	{
		System.out.println("regression test demo4");
	}
}
