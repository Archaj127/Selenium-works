package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprgrm1 {
	
	ChromeDriver d;
	@BeforeTest(alwaysRun=true)
	public void Setup()
	{
		d=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun=true)
	public void Urlload()
	{
		d.get("https://www.google.com");
	}
	@Test(groups= {"smoke"})
	public void titlever()
	{
		String s=d.getTitle();
		String s1="Google";
		if(s.equals(s1))
		{
			System.out.println("title correct");
		}
		else
		{
			System.out.println("title incorrect");
		}
	}
	@Test(groups= {"smoke"})
	public void contentver()
	{
		String a=d.getPageSource();
		if(a.contains("Gmail"))
		{
			System.out.println("Gmail present");
		}
		else 
		{
			System.out.println("Gmail not present");
		}
	}
	@Test(groups= {"sanity"})
	public void logo()
	{
		Boolean b=d.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		if(b)
		{
			System.out.println("logo present");
		}
		else
		{
			System.out.println("logo not present");
		}
	}
	/*@AfterMethod
	public void after1()
	{
		System.out.println("All verified");
	}*/
	
	
	@AfterTest
	public void teardown()
	{
		System.out.println("test completed");
	}
}
