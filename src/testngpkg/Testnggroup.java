package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnggroup {
	
	
	@Test(groups= {"smoke"})
	public void t1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"smoke","sanity"})
	public void t2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"smoke"})
	public void t3()
	{
		System.out.println("test3");
	}
	@Test(groups= {"sanity"})
	public void t4()
	{
		System.out.println("test4");
	}
	

}
