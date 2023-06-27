package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterprgrm {

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
	@Parameters({"email","pwd"})
	@Test
	public void test1(String s,String r)
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(s);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(r);
	}
}
