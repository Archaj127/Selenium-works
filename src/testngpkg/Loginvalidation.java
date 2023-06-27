package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {

ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9747500679");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("impresario123");
		driver.findElement(By.name("login")).click();
		String s=driver.getCurrentUrl();
		String g="https://www.facebook.com/";
		if(s.equals(g))
		{
			System.out.println("login validated");
		}
		else
		{
			System.out.println("login not validated");
		}
	}
}
